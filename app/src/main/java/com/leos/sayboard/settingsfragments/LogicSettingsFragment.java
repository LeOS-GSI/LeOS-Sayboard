package com.leos.sayboard.settingsfragments;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

import com.leos.sayboard.AppCtx;
import com.leos.sayboard.R;

public class LogicSettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        PreferenceManager preferenceManager = getPreferenceManager();
        preferenceManager.setSharedPreferencesName(AppCtx.getStringRes(R.string.main_shared_pref));
        setPreferencesFromResource(R.xml.logic_preferences, rootKey);
    }
}