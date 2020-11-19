
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/public/common/screen_orientation_values.h

package org.chromium.content_public.common;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ScreenOrientationValues.DEFAULT, ScreenOrientationValues.PORTRAIT_PRIMARY,
    ScreenOrientationValues.PORTRAIT_SECONDARY, ScreenOrientationValues.LANDSCAPE_PRIMARY,
    ScreenOrientationValues.LANDSCAPE_SECONDARY, ScreenOrientationValues.ANY,
    ScreenOrientationValues.LANDSCAPE, ScreenOrientationValues.PORTRAIT,
    ScreenOrientationValues.NATURAL, ScreenOrientationValues.LAST
})
@Retention(RetentionPolicy.SOURCE)
public @interface ScreenOrientationValues {
  int DEFAULT = 0;
  int PORTRAIT_PRIMARY = 1;
  int PORTRAIT_SECONDARY = 2;
  int LANDSCAPE_PRIMARY = 3;
  int LANDSCAPE_SECONDARY = 4;
  int ANY = 5;
  int LANDSCAPE = 6;
  int PORTRAIT = 7;
  int NATURAL = 8;
  int LAST = 8;
}
