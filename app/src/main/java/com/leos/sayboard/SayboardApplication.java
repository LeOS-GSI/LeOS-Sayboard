package com.leos.sayboard;

import android.app.Application;
import android.content.Context;

import androidx.annotation.StringRes;

import com.leos.sayboard.preferences.MyPreferences;

import org.greenrobot.eventbus.EventBus;

public class SayboardApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        EventBus.builder().logNoSubscriberMessages(false).sendNoSubscriberEvent(false).installDefaultEventBus();
        AppCtx.setAppCtx(this);
    }
}
