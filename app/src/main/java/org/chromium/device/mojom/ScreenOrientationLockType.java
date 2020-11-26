// ScreenOrientationLockType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/screen_orientation_lock_types.mojom
//

package org.chromium.device.mojom;

public final class ScreenOrientationLockType {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int DEFAULT = 0;
    public static final int PORTRAIT_PRIMARY = 1; // DEFAULT + 1
    public static final int PORTRAIT_SECONDARY = 2; // PORTRAIT_PRIMARY + 1
    public static final int LANDSCAPE_PRIMARY = 3; // PORTRAIT_SECONDARY + 1
    public static final int LANDSCAPE_SECONDARY = 4; // LANDSCAPE_PRIMARY + 1
    public static final int ANY = 5; // LANDSCAPE_SECONDARY + 1
    public static final int LANDSCAPE = 6; // ANY + 1
    public static final int PORTRAIT = 7; // LANDSCAPE + 1
    public static final int NATURAL = 8; // PORTRAIT + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 8;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private ScreenOrientationLockType() {}
}