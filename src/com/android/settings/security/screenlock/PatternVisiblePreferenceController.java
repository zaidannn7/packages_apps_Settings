/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.settings.security.screenlock;

import android.content.Context;

import com.android.internal.widget.LockPatternUtils;

public class PatternVisiblePreferenceController extends AbstractPatternSwitchPreferenceController {
    private static final String PREF_KEY = "visiblepattern";

    public PatternVisiblePreferenceController(Context context, int userId,
            LockPatternUtils lockPatternUtils) {
        super(context, PREF_KEY, userId, lockPatternUtils);
    }

    @Override
    protected boolean isEnabled(LockPatternUtils utils, int userId) {
        return utils.isVisiblePatternEnabled(userId);
    }

    @Override
    protected void setEnabled(LockPatternUtils utils, int userId, boolean enabled) {
        utils.setVisiblePatternEnabled(enabled, userId);
    }
}