
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../ui/android/overscroll_refresh.h

package org.chromium.ui;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    OverscrollAction.NONE, OverscrollAction.PULL_TO_REFRESH, OverscrollAction.HISTORY_NAVIGATION
})
@Retention(RetentionPolicy.SOURCE)
public @interface OverscrollAction {
  int NONE = 0;
  int PULL_TO_REFRESH = 1;
  int HISTORY_NAVIGATION = 2;
}