// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.tasks.tab_management;

import android.view.View;

import org.chromium.chrome.browser.ChromeActivity;

/**
 * Interface for the popup TabGroup UI.
 */
public interface TabGroupPopupUi {
    void initializeWithNative(ChromeActivity activity);

    View.OnLongClickListener getLongClickListenerForTriggering();

    void destroy();
}
