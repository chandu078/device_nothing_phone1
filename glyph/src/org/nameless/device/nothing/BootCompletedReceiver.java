/*
 * Copyright (C) 2022 The LineageOS Project
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package org.nameless.device.nothing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.nameless.device.nothing.GlyphUtils;

public class BootCompletedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        GlyphUtils.startService(context);
    }
}
