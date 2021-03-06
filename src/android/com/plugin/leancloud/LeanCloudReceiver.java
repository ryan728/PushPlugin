package com.plugin.leancloud;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avos.avoscloud.AVOSCloud;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
import com.plugin.leancloud.Localization;
import com.plugin.leancloud.PushPlugin;

import android.support.v4.app.NotificationCompat;

import java.util.Arrays;
import java.util.List;

import com.wisdomgarden.tr.R;


/**
 * Created by leizhang on 4/22/15.
 */
public class LeanCloudReceiver extends BroadcastReceiver {

    private static final String TAG = "LeanCloudReceiver";

    private static final List<String> SUPPORTED_EVENTS = Arrays.asList(
            "CLASSROOM_STARTED", "CLASSROOM_FINISHED",
            "QUIZ_SUBJECT_OPENED", "QUIZ_SUBJECT_CLOSED", "QUIZ_OPENED", "QUIZ_CLOSED",
            "BULLETIN_PUBLISHED", "BULLETIN_UPDATED",
            "SCORE_PUBLISH_CLOSING", "SCORE_PUBLISHED",
            "HOMEWORK_OPENING", "HOMEWORK_OPENED", "HOMEWORK_EXPIRING", "HOMEWORK_ENDED", "HOMEWORK_SUBMITTED",
            "ACTIVITY_OPENING", "ACTIVITY_OPENED", "ACTIVITY_EXPIRING",
            "COURSE_OPENING", "COURSE_STARTED", "COURSE_OUTLINE", "NEW_MEMBER",
            "INTER_SCORE_HOMEWORK_SUBMISSION", "INTER_SCORE_EXPIRING", "INTER_SCORE_ENDED",
            "HOMEWORK_RECOMMENDED", "RECOMMEND_HOMEWORK_REMOVED", 
            "TOPIC_REPLIED", "RADAR_ROLLCALL", "MESSAGE"
    );

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "lean cloud receiver");
        Bundle extras = intent.getExtras();
        if (PushPlugin.isInForeground()) {
            if (extras == null) {
                return;
            }
            extras.putBoolean("foreground", true);
            PushPlugin.sendExtras(extras);
            return;
        }
        try {
            if (intent.getAction().equals("com.wisdomgarden.tr.action")) {
                JSONObject json = new JSONObject(intent.getExtras().getString("com.avos.avoscloud.Data"));
                final String message = json.getString("alert");
                final String title = json.getString("title");

                JSONArray jsonArray = json.getJSONArray("loc-args");
                String[] argsArray = new String[jsonArray.length()];
                try {
                    for (int i = 0, count = jsonArray.length(); i < count; i++) {
                        argsArray[i] = jsonArray.getString(i);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                if (!SUPPORTED_EVENTS.contains(title)) {
                    return;
                }

                String translatedMessage = Localization.translate(message, argsArray);
                String translatedTitle = Localization.translate(title);
                notify(context, intent, translatedMessage, translatedTitle);
            }
        } catch (Exception e) {
            Log.e(TAG, "error : " + e.getMessage(), e);
        }
    }

    private void notify(Context context, Intent intent, String translatedMessage, String translatedTitle) {
        Intent resultIntent = new Intent(AVOSCloud.applicationContext, PushHandlerActivity.class);
        resultIntent.putExtras(intent.getExtras());
        PendingIntent pendingIntent =
                PendingIntent.getActivity(AVOSCloud.applicationContext, 0, resultIntent,
                        PendingIntent.FLAG_UPDATE_CURRENT);

        // Puts the PendingIntent into the notification builder
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(AVOSCloud.applicationContext)
                        .setSmallIcon(R.drawable.ic_notification)
                        .setContentTitle(translatedTitle)
                        .setContentText(translatedMessage)
                        .setDefaults(Notification.DEFAULT_ALL)
                        .setTicker(translatedMessage);
        mBuilder.setContentIntent(pendingIntent);
        mBuilder.setAutoCancel(true);

        NotificationManager mNotifyMgr =
                (NotificationManager) AVOSCloud.applicationContext
                        .getSystemService(
                                Context.NOTIFICATION_SERVICE);
        mNotifyMgr.notify(88737055, mBuilder.build());
    }
}
