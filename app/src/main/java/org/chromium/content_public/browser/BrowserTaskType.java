
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/public/browser/browser_task_traits.h

package org.chromium.content_public.browser;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    BrowserTaskType.DEFAULT, BrowserTaskType.BOOTSTRAP, BrowserTaskType.NAVIGATION,
    BrowserTaskType.PRECONNECT, BrowserTaskType.BROWSER_TASK_TYPE_LAST
})
@Retention(RetentionPolicy.SOURCE)
public @interface BrowserTaskType {
  /**
   * A catch all tasks that don't fit the types below.
   */
  int DEFAULT = 0;
  /**
   * Critical startup tasks.
   */
  int BOOTSTRAP = 1;
  /**
   * Navigation related tasks.
   */
  int NAVIGATION = 2;
  /**
   * A subset of network tasks related to preconnection.
   */
  int PRECONNECT = 3;
  /**
   * Used to validate values in Java
   */
  int BROWSER_TASK_TYPE_LAST = 4;
}
