package com.leos.sayboard.preferences;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.leos.sayboard.AppCtx;
import com.leos.sayboard.R;

public class MyPreferences {
    private static SharedPreferences sharedPref;

    public static SharedPreferences getSharedPref() {
        if (sharedPref == null) {
            sharedPref = AppCtx.getAppCtx().getSharedPreferences(
                    AppCtx.getStringRes(R.string.main_shared_pref), Context.MODE_PRIVATE);
        }
        return sharedPref;
    }
}
