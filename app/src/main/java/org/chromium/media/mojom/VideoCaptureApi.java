// VideoCaptureApi.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/capture/mojom/video_capture_types.mojom
//

package org.chromium.media.mojom;

public final class VideoCaptureApi {
    private static final boolean IS_EXTENSIBLE = false;

    public static final int LINUX_V4L2_SINGLE_PLANE = 0;
    public static final int WIN_MEDIA_FOUNDATION = 1; // LINUX_V4L2_SINGLE_PLANE + 1
    public static final int WIN_MEDIA_FOUNDATION_SENSOR = 2; // WIN_MEDIA_FOUNDATION + 1
    public static final int WIN_DIRECT_SHOW = 3; // WIN_MEDIA_FOUNDATION_SENSOR + 1
    public static final int MACOSX_AVFOUNDATION = 4; // WIN_DIRECT_SHOW + 1
    public static final int MACOSX_DECKLINK = 5; // MACOSX_AVFOUNDATION + 1
    public static final int ANDROID_API1 = 6; // MACOSX_DECKLINK + 1
    public static final int ANDROID_API2_LEGACY = 7; // ANDROID_API1 + 1
    public static final int ANDROID_API2_FULL = 8; // ANDROID_API2_LEGACY + 1
    public static final int ANDROID_API2_LIMITED = 9; // ANDROID_API2_FULL + 1
    public static final int VIRTUAL_DEVICE = 10; // ANDROID_API2_LIMITED + 1
    public static final int UNKNOWN = 11; // VIRTUAL_DEVICE + 1

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 11;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    private VideoCaptureApi() {}
}