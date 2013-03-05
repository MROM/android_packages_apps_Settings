/*
 * Copyright (C) 2012 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.cmstats;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceScreen;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class AnonymousStats extends SettingsPreferenceFragment
        implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener,
        Preference.OnPreferenceChangeListener {

    private static final String VIEW_STATS = "pref_view_stats";

    protected static final String ANONYMOUS_OPT_IN = "pref_anonymous_opt_in";

    protected static final String ANONYMOUS_FIRST_BOOT = "pref_anonymous_first_boot";

    protected static final String ANONYMOUS_LAST_CHECKED = "pref_anonymous_checked_in";

    protected static final String ANONYMOUS_ALARM_SET = "pref_anonymous_alarm_set";

    private CheckBoxPreference mEnableReporting;

    private Preference mViewStats;

    private Dialog mOkDialog;

    private boolean mOkClicked;

    private SharedPreferences mPrefs;

    @Override
    public void onCreate(Bundle savedInstanceState) {
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        return true;
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
    }

}
