package com.kronos.game_animals;

import android.app.Activity;
import android.app.Application;

import java.util.Stack;

public class MyApplication extends Application {

    private static Stack<Activity> activityStack;
    private static MyApplication singleton;
    @Override
    public void onCreate()
    {
        super.onCreate();
        singleton=this;
    }
    // Returns the application instance
    public static MyApplication getInstance() {
        return singleton;
    }


    public void addActivity(Activity activity){
        if(activityStack ==null){
            activityStack =new Stack<Activity>();
        }
        activityStack.add(activity);
    }

    public Activity currentActivity() {
        Activity activity = activityStack.lastElement();
        return activity;
    }

    public void finishActivity() {
        Activity activity = activityStack.lastElement();
        finishActivity(activity);
    }


    public void finishActivity(Activity activity) {
        if (activity != null) {
            activityStack.remove(activity);
            activity.finish();
            activity = null;
        }
    }

    public void finishActivity(Class<?> cls) {
        for (Activity activity : activityStack) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
            }
        }
    }


    public void finishAllActivity() {
        for (int i = 0, size = activityStack.size(); i < size; i++) {
            if (null != activityStack.get(i)) {
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
    }


    public void AppExit() {
        try {
            finishAllActivity();
        } catch (Exception e) {
        }
    }

}