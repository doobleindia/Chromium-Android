
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/offline_items_collection/core/rename_result.h

package org.chromium.components.offline_items_collection;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    RenameResult.SUCCESS, RenameResult.FAILURE_NAME_CONFLICT, RenameResult.FAILURE_NAME_TOO_LONG,
    RenameResult.FAILURE_NAME_INVALID, RenameResult.FAILURE_UNAVAILABLE,
    RenameResult.FAILURE_UNKNOWN, RenameResult.MAX_VALUE
})
@Retention(RetentionPolicy.SOURCE)
public @interface RenameResult {
  int SUCCESS = 0;
  int FAILURE_NAME_CONFLICT = 1;
  int FAILURE_NAME_TOO_LONG = 2;
  int FAILURE_NAME_INVALID = 3;
  int FAILURE_UNAVAILABLE = 4;
  int FAILURE_UNKNOWN = 5;
  int MAX_VALUE = FAILURE_UNKNOWN;
}
