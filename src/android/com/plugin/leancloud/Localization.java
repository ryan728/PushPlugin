package com.plugin.leancloud;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by leizhang on 5/5/15.
 */
public class Localization {
    private static final Map<String, Map<String, String>> TRANSLATION = new HashMap<String, Map<String, String>>();

    static {
        HashMap<String, String> en = new HashMap<String, String>();

        en.put("CLASSROOM_STARTED", "Classroom Started");
        en.put("CLASSROOM_FINISHED", "Classroom Finished");
        en.put("CLASSROOM_STARTED_WITH_COURSE_NAME", "Classroom of course %s has started");
        en.put("CLASSROOM_FINISHED_WITH_COURSE_NAME", "Classroom of course %s has finished");
        en.put("BULLETIN_PUBLISHED", "Bulletin Published");
        en.put("COURSE_BULLETIN_PUBLISHED", "Bulletin %2$s of course %1$s is published");
        en.put("COURSE_OPENING", "Course Opening");
        en.put("COURSE_OPENING_WITH_TITLE", "Course %s is going to be open at %s");
        en.put("COURSE_OUTLINE", "Course Outline");
        en.put("COURSE_OUTLINE_EDITING", "Education admin %s remind you to finish editing the outline of course %s");
        en.put("COURSE_OUTLINE_CLOSING_EDITING", "Outline edition of course %s is going to be ended at %s");
        en.put("TOPIC_REPLIED", "Topic Replied");
        en.put("TOPIC_REPLIED_FIRST_LEVEL", "%s replied to your topic %s");
        en.put("TOPIC_REPLIED_SECOND_LEVEL", "%s replied to your comment on topic %s");
        en.put("SCORE_PUBLISHED", "Score Published");
        en.put("SCORE_PUBLISHED_WITH_COURSE", "Score of course %s is published");
        en.put("HOMEWORK_SUBMITTED", "Homework Submitted");
        en.put("HOMEWORK_SUBMITTED_WITH_TITLE", "%s submitted homework %s");
        en.put("HOMEWORK_SUBMITTED_WITH_GROUP", "Group %s submitted homework %s");
        en.put("NEW_MEMBER", "New Member");
        en.put("NEW_MEMBER_WITH_COURSE", "New Member %s joined course %s");
        en.put("HOMEWORK_ENDED", "Homework Ended");
        en.put("HOMEWORK_ENDED_WITH_TITLE", "Homework %2$s of course %1$s is ended");
        en.put("HOMEWORK_EXPIRING", "Homework Submission Expiring");
        en.put("HOMEWORK_EXPIRING_WITH_TITLE", "Homework %2$s of course %1$s is going to end");
        en.put("HOMEWORK_OPENED", "Homework Submission Opened");
        en.put("HOMEWORK_OPENED_WITH_TITLE", "Homework %2$s of course %1$s is opened for submission");
        en.put("HOMEWORK_OPENING", "Homework Submission Opening");
        en.put("HOMEWORK_OPENING_WITH_TITLE", "Homework %2$s of course %1$s will be open for submission");

        en.put("ACTIVITY_OPENED", "Activity Opened");
        en.put("ACTIVITY_OPENED_ONLINE_VIDEO", "Video %2$s of course %1$s is opened");
        en.put("ACTIVITY_OPENED_FORUM", "Forum %2$s of course %1$s is opened");
        en.put("ACTIVITY_OPENED_WEB_LINK", "Link %2$s of course %1$s is opened");
        en.put("ACTIVITY_OPENED_MATERIAL", "Material %2$s of course %1$s is opened");
        en.put("ACTIVITY_OPENED_HOMEWORK", "Homework %2$s of course %1$s is opened");
        en.put("ACTIVITY_OPENED_SLIDE", "Video slide %2$s of course %1$s is opened");
        en.put("ACTIVITY_OPENED_LESSON", "Record lesson %2$s of course %1$s is opened");
        en.put("ACTIVITY_OPENED_EXAM", "Exam %2$s of course %1$s is opened");

        en.put("ACTIVITY_OPENING", "Activity Opening");
        en.put("ACTIVITY_OPENING_ONLINE_VIDEO", "Video %2$s of course %1$s is going to be open");
        en.put("ACTIVITY_OPENING_FORUM", "Forum %2$s of course %1$s is going to be open");
        en.put("ACTIVITY_OPENING_WEB_LINK", "Link %2$s of course %1$s is going to be open");
        en.put("ACTIVITY_OPENING_MATERIAL", "Material %2$s of course %1$s is going to be open");
        en.put("ACTIVITY_OPENING_HOMEWORK", "Homework %2$s of course %1$s is going to be open");
        en.put("ACTIVITY_OPENING_SLIDE", "Video slide %2$s of course %1$s is going to be open");
        en.put("ACTIVITY_OPENING_LESSON", "Record lesson %2$s of course %1$s is going to be open");
        en.put("ACTIVITY_OPENING_EXAM", "Exam %2$s of course %1$s is going to be open");

        en.put("ACTIVITY_EXPIRING", "Activity Expiring");
        en.put("ACTIVITY_EXPIRING_ONLINE_VIDEO", "Video %2$s of course %1$s is going to be end");
        en.put("ACTIVITY_EXPIRING_FORUM", "Forum %2$s of course %1$s is going to be end");
        en.put("ACTIVITY_EXPIRING_WEB_LINK", "Link %2$s of course %1$s is going to be end");
        en.put("ACTIVITY_EXPIRING_MATERIAL", "Material %2$s of course %1$s is going to be end");
        en.put("ACTIVITY_EXPIRING_HOMEWORK", "Homework %2$s of course %1$s is going to be end");
        en.put("ACTIVITY_EXPIRING_SLIDE", "Video slide %2$s of course %1$s is going to be end");
        en.put("ACTIVITY_EXPIRING_LESSON", "Record lesson %2$s of course %1$s is going to be end");
        en.put("ACTIVITY_EXPIRING_EXAM", "Exam %2$s of course %1$s is going to be end");

        en.put("QUIZ_SUBJECT_OPENED", "Quiz Started");
        en.put("QUIZ_SUBJECT_OPENED_WITH_TITLE", "Quiz %@ started");
        en.put("QUIZ_SUBJECT_CLOSED", "Quiz finished");
        en.put("QUIZ_SUBJECT_CLOSED_WITH_TITLE", "Quiz %@ finished");

        HashMap<String, String> zhHans = new HashMap<String, String>();

        zhHans.put("CLASSROOM_STARTED", "课堂已开启");
        zhHans.put("CLASSROOM_FINISHED", "课堂已结束");
        zhHans.put("CLASSROOM_STARTED_WITH_COURSE_NAME", "课程 %s 的课堂互动已经开启");
        zhHans.put("CLASSROOM_FINISHED_WITH_COURSE_NAME", "课程 %s 的课堂互动已经结束");
        zhHans.put("BULLETIN_PUBLISHED", "公告发布");
        zhHans.put("COURSE_BULLETIN_PUBLISHED", "课程 %s 发布公告 %s");
        zhHans.put("COURSE_OPENING", "课程即将开始");
        zhHans.put("COURSE_OPENING_WITH_TITLE", "课程 %s 即将于 %s 开始");
        zhHans.put("COURSE_OUTLINE", "课程大纲");
        zhHans.put("COURSE_OUTLINE_EDITING", "教务 %s 提醒您完成课程 %s 的大纲制定");
        zhHans.put("COURSE_OUTLINE_CLOSING_EDITING", "课程 %s 的大纲制定即将于 %s 截止");
        zhHans.put("TOPIC_REPLIED", "讨论回复");
        zhHans.put("TOPIC_REPLIED_FIRST_LEVEL", "%s 回复了您发表的帖子 %s");
        zhHans.put("TOPIC_REPLIED_SECOND_LEVEL", "%s 回复了您在帖子 %s 的发言");
        zhHans.put("SCORE_PUBLISHED", "成绩公布");
        zhHans.put("SCORE_PUBLISHED_WITH_COURSE", "课程 %s 的成绩已公布");
        zhHans.put("HOMEWORK_SUBMITTED", "作业提交");
        zhHans.put("HOMEWORK_SUBMITTED_WITH_TITLE", "%s 提交了作业 %s");
        zhHans.put("HOMEWORK_SUBMITTED_WITH_GROUP", "小组 %s 提交了作业 %s");
        zhHans.put("NEW_MEMBER", "新成员加入");
        zhHans.put("NEW_MEMBER_WITH_COURSE", "新的班级成员 %s 加入了课程 %s");
        zhHans.put("HOMEWORK_ENDED", "作业交付截止");
        zhHans.put("HOMEWORK_ENDED_WITH_TITLE", "课程 %s 的作业 %s 提交已经截止");
        zhHans.put("HOMEWORK_EXPIRING", "作业提交即将截止");
        zhHans.put("HOMEWORK_EXPIRING_WITH_TITLE", "课程 %s 的作业 %s 提交即将截止");
        zhHans.put("HOMEWORK_OPENED", "作业开放交付");
        zhHans.put("HOMEWORK_OPENED_WITH_TITLE", "课程 %s 的作业 %s 已经开放交付");
        zhHans.put("HOMEWORK_OPENING", "作业即将开放交付");
        zhHans.put("HOMEWORK_OPENING_WITH_TITLE", "课程 %s 的作业 %s 即将开放交付");

        zhHans.put("ACTIVITY_OPENED", "学习活动开放");
        zhHans.put("ACTIVITY_OPENED_ONLINE_VIDEO", "课程 %s 的影音教材 %s 已经开放");
        zhHans.put("ACTIVITY_OPENED_FORUM", "课程 %s 的讨论 %s 已经开放");
        zhHans.put("ACTIVITY_OPENED_WEB_LINK", "课程 %s 的线上链接 %s 已经开放");
        zhHans.put("ACTIVITY_OPENED_MATERIAL", "课程 %s 的参考档案 %s 已经开放");
        zhHans.put("ACTIVITY_OPENED_HOMEWORK", "课程 %s 的作业 %s 已经开放");
        zhHans.put("ACTIVITY_OPENED_SLIDE", "课程 %s 的微课 %s 已经开放");
        zhHans.put("ACTIVITY_OPENED_LESSON", "课程 %s 的录影教材 %s 已经开放");
        zhHans.put("ACTIVITY_OPENED_EXAM", "课程 %s 的即测即评 %s 已经开放");

        zhHans.put("ACTIVITY_OPENING", "学习活动即将开放");
        zhHans.put("ACTIVITY_OPENING_ONLINE_VIDEO", "课程 %s 的影音教材 %s 即将开放");
        zhHans.put("ACTIVITY_OPENING_FORUM", "课程 %s 的讨论 %s 即将开放");
        zhHans.put("ACTIVITY_OPENING_WEB_LINK", "课程 %s 的线上链接 %s 即将开放");
        zhHans.put("ACTIVITY_OPENING_MATERIAL", "课程 %s 的参考档案 %s 即将开放");
        zhHans.put("ACTIVITY_OPENING_HOMEWORK", "课程 %s 的作业 %s 即将开放");
        zhHans.put("ACTIVITY_OPENING_SLIDE", "课程 %s 的微课 %s 即将开放");
        zhHans.put("ACTIVITY_OPENING_LESSON", "课程 %s 的录影教材 %s 即将开放");
        zhHans.put("ACTIVITY_OPENING_EXAM", "课程 %s 的即测即评 %s 即将开放");

        zhHans.put("ACTIVITY_EXPIRING", "学习活动即将截止");
        zhHans.put("ACTIVITY_EXPIRING_ONLINE_VIDEO", "课程 %s 的影音教材 %s 即将截止");
        zhHans.put("ACTIVITY_EXPIRING_FORUM", "课程 %s 的讨论 %s 即将截止");
        zhHans.put("ACTIVITY_EXPIRING_WEB_LINK", "课程 %s 的线上链接 %s 即将截止");
        zhHans.put("ACTIVITY_EXPIRING_MATERIAL", "课程 %s 的参考档案 %s 即将截止");
        zhHans.put("ACTIVITY_EXPIRING_HOMEWORK", "课程 %s 的作业 %s 即将截止");
        zhHans.put("ACTIVITY_EXPIRING_SLIDE", "课程 %s 的微课 %s 即将截止");
        zhHans.put("ACTIVITY_EXPIRING_LESSON", "课程 %s 的录影教材 %s 即将截止");
        zhHans.put("ACTIVITY_EXPIRING_EXAM", "课程 %s 的即测即评 %s 即将截止");

        zhHans.put("QUIZ_SUBJECT_OPENED", "答题开始");
        zhHans.put("QUIZ_SUBJECT_OPENED_WITH_TITLE", "随堂测 %@ 答题开始");
        zhHans.put("QUIZ_SUBJECT_CLOSED", "答题结束");
        zhHans.put("QUIZ_SUBJECT_CLOSED_WITH_TITLE", "随堂测 %@ 答题结束");

        HashMap<String, String> zhHant = new HashMap<String, String>();

        zhHant.put("CLASSROOM_STARTED", "互動已開啟");
        zhHant.put("CLASSROOM_FINISHED", "互動已結束");
        zhHant.put("CLASSROOM_STARTED_WITH_COURSE_NAME", "課程 %s 的互動已開啟");
        zhHant.put("CLASSROOM_FINISHED_WITH_COURSE_NAME", "課程 %s 的互動已結束");
        zhHant.put("BULLETIN_PUBLISHED", "公告發佈");
        zhHant.put("COURSE_BULLETIN_PUBLISHED", "課程 %s 發佈公告 %s.");
        zhHant.put("COURSE_OPENING", "課程即將開始");
        zhHant.put("COURSE_OPENING_WITH_TITLE", "課程 %s 即將于 %s 開始");
        zhHant.put("COURSE_OUTLINE", "課程大綱");
        zhHant.put("COURSE_OUTLINE_EDITING", "教務 %s 提醒您完成課程 %s 的大綱制定");
        zhHant.put("COURSE_OUTLINE_CLOSING_EDITING", "課程 %s 的大綱制定即將于 %s 截止");
        zhHant.put("TOPIC_REPLIED", "討論回復");
        zhHant.put("TOPIC_REPLIED_FIRST_LEVEL", "%s 回復了您發表的文章 %s");
        zhHant.put("TOPIC_REPLIED_SECOND_LEVEL", "%s 回復了您在文章 %s 的發言");
        zhHant.put("SCORE_PUBLISHED", "成績公佈");
        zhHant.put("SCORE_PUBLISHED_WITH_COURSE", "課程 %s 的成績已公佈");
        zhHant.put("HOMEWORK_SUBMITTED", "作業提交");
        zhHant.put("HOMEWORK_SUBMITTED_WITH_TITLE", "%s 提交了作業 %s");
        zhHans.put("HOMEWORK_SUBMITTED_WITH_GROUP", "小組 %s 提交了作業 %s");
        zhHant.put("NEW_MEMBER", "新成員加入");
        zhHant.put("NEW_MEMBER_WITH_COURSE", "新的班級成員 %s 加入了課程 %s");
        zhHant.put("HOMEWORK_ENDED", "作業繳交截止");
        zhHant.put("HOMEWORK_ENDED_WITH_TITLE", "課程 %s 的作業 %s 繳交已經截止");
        zhHant.put("HOMEWORK_EXPIRING", "作業繳交即將截止");
        zhHant.put("HOMEWORK_EXPIRING_WITH_TITLE", "課程 %s 的作業 %s 繳交即將截止");
        zhHant.put("HOMEWORK_OPENED", "作業開放繳交");
        zhHant.put("HOMEWORK_OPENED_WITH_TITLE", "課程 %s 的作業 %s 已經開放繳交");
        zhHant.put("HOMEWORK_OPENING", "作業即將開放繳交");
        zhHant.put("HOMEWORK_OPENING_WITH_TITLE", "課程 %s 的作業 %s 即將開放繳交");

        zhHant.put("ACTIVITY_OPENED", "學習活動開放");
        zhHant.put("ACTIVITY_OPENED_ONLINE_VIDEO", "課程 %s 的影音教材 %s 已經開放");
        zhHant.put("ACTIVITY_OPENED_FORUM", "課程 %s 的討論 %s 已經開放");
        zhHant.put("ACTIVITY_OPENED_WEB_LINK", "課程 %s 的線上連結 %s 已經開放");
        zhHant.put("ACTIVITY_OPENED_MATERIAL", "課程 %s 的參考檔案 %s 已經開放");
        zhHant.put("ACTIVITY_OPENED_HOMEWORK", "課程 %s 的作業 %s 已經開放");
        zhHant.put("ACTIVITY_OPENED_SLIDE", "課程 %s 的影音簡報 %s 已經開放");
        zhHant.put("ACTIVITY_OPENED_LESSON", "課程 %s 的錄影教材 %s 已經開放");
        zhHant.put("ACTIVITY_OPENED_EXAM", "課程 %s 的即測即評 %s 已經開放");

        zhHant.put("ACTIVITY_OPENING", "學習活動即將開放");
        zhHant.put("ACTIVITY_OPENING_ONLINE_VIDEO", "課程 %s 的影音教材 %s 即將開放");
        zhHant.put("ACTIVITY_OPENING_FORUM", "課程 %s 的討論 %s 即將開放");
        zhHant.put("ACTIVITY_OPENING_WEB_LINK", "課程 %s 的線上連結 %s 即將開放");
        zhHant.put("ACTIVITY_OPENING_MATERIAL", "課程 %s 的參考檔案 %s 即將開放");
        zhHant.put("ACTIVITY_OPENING_HOMEWORK", "課程 %s 的作業 %s 即將開放");
        zhHant.put("ACTIVITY_OPENING_SLIDE", "課程 %s 的影音簡報 %s 即將開放");
        zhHant.put("ACTIVITY_OPENING_LESSON", "課程 %s 的錄影教材 %s 即將開放");
        zhHant.put("ACTIVITY_OPENING_EXAM", "課程 %s 的即測即評 %s 即將開放");

        zhHant.put("ACTIVITY_EXPIRING", "學習活動即將截止");
        zhHant.put("ACTIVITY_EXPIRING_ONLINE_VIDEO", "課程 %s 的影音教材 %s 即將截止");
        zhHant.put("ACTIVITY_EXPIRING_FORUM", "課程 %s 的討論 %s 即將截止");
        zhHant.put("ACTIVITY_EXPIRING_WEB_LINK", "課程 %s 的線上連結 %s 即將截止");
        zhHant.put("ACTIVITY_EXPIRING_MATERIAL", "課程 %s 的參考檔案 %s 即將截止");
        zhHant.put("ACTIVITY_EXPIRING_HOMEWORK", "課程 %s 的作業 %s 即將截止");
        zhHant.put("ACTIVITY_EXPIRING_SLIDE", "課程 %s 的影音簡報 %s 即將截止");
        zhHant.put("ACTIVITY_EXPIRING_LESSON", "課程 %s 的錄影教材 %s 即將截止");
        zhHant.put("ACTIVITY_EXPIRING_EXAM", "課程 %s 的即測即評 %s 即將截止");

        zhHant.put("QUIZ_SUBJECT_OPENED", "答題開始");
        zhHant.put("QUIZ_SUBJECT_OPENED_WITH_TITLE", "隨堂測 %@ 答題開始");
        zhHant.put("QUIZ_SUBJECT_CLOSED", "答题结束");
        zhHant.put("QUIZ_SUBJECT_CLOSED_WITH_TITLE", "隨堂測 %@ 答題結束");

        TRANSLATION.put("en_US", en);
        TRANSLATION.put("zh_CN", zhHans);
        TRANSLATION.put("zh_TW", zhHant);
    }

    public static String translate(String s, String[] args) {
        String locale = Locale.getDefault().toString();

        if (!TRANSLATION.containsKey(locale)) {
            locale = "en_US";
        }
        String message = TRANSLATION.get(locale).get(s);
        if (message == null) {
            return "";
        }
        return String.format(message, args);
    }

    public static String translate(String s) {
        return translate(s, new String[]{});
    }

    public static void main(String[] args) {
        String message = translate("ACTIVITY_EXPIRING_ONLINE_VIDEO", new String[]{"first", "second"});
        System.out.println("message = " + message);
    }
}
