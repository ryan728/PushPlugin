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


/**
 * Created by leizhang on 4/22/15.
 */
public class LeanCloudReceiver extends BroadcastReceiver {

    private static final String TAG = "LeanCloudReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.w(TAG, "lean cloud receiver");
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

                if ("QUIZ_SUBJECT_OPENED".equals(title) || "QUIZ_SUBJECT_CLOSED".equals(title)) {
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
                        .setSmallIcon(context.getApplicationInfo().icon)
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
