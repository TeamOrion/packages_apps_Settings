 /*
 * Copyright (C) 2015 OrionLP
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
package com.android.settings.orion;

import android.content.Context;
import android.content.ContentResolver;
import android.content.Intent;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.preference.SwitchPreference;
import android.preference.PreferenceScreen;
import android.provider.Settings;

import com.android.internal.logging.MetricsLogger;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class LockscreenTweaks extends SettingsPreferenceFragment {

    private static final String LSWEATHER = "ls_weather";
    private PreferenceScreen mLsWeather;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.orion_lockscreen_tweaks);

        ContentResolver resolver = getActivity().getContentResolver();

        mLsWeather = (PreferenceScreen)findPreference(LSWEATHER);
  }
  
  	@Override
    protected int getMetricsCategory() {
        return MetricsLogger.APPLICATION;
    }

}
