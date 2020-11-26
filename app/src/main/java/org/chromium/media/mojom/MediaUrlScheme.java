// MediaUrlScheme.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/media_metrics_provider.mojom
//

package org.chromium.media.mojom;

public final class MediaUrlScheme {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int UNKNOWN = 0;
    public static final int MISSING = 1; // UNKNOWN + 1
    public static final int HTTP = 2; // MISSING + 1
    public static final int HTTPS = 3; // HTTP + 1
    public static final int FTP = 4; // HTTPS + 1
    public static final int CHROME_EXTENSION = 5; // FTP + 1
    public static final int JAVASCRIPT = 6; // CHROME_EXTENSION + 1
    public static final int FILE = 7; // JAVASCRIPT + 1
    public static final int BLOB = 8; // FILE + 1
    public static final int DATA = 9; // BLOB + 1
    public static final int FILE_SYSTEM = 10; // DATA + 1
    public static final int CHROME = 11; // FILE_SYSTEM + 1
    public static final int CONTENT = 12; // CHROME + 1
    public static final int CONTENT_ID = 13; // CONTENT + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 13;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private MediaUrlScheme() {}
}