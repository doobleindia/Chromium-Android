
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/ntp_snippets/category_info.h

package org.chromium.chrome.browser.ntp.snippets;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ContentSuggestionsCardLayout.FULL_CARD, ContentSuggestionsCardLayout.MINIMAL_CARD
})
@Retention(RetentionPolicy.SOURCE)
public @interface ContentSuggestionsCardLayout {
  /**
   * Uses all fields.
   */
  int FULL_CARD = 0;
  /**
   * No snippet_text and no thumbnail image.
   */
  int MINIMAL_CARD = 1;
}