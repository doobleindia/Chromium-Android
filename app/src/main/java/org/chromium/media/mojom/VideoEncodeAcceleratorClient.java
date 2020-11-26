// VideoEncodeAcceleratorClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;


public interface VideoEncodeAcceleratorClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends VideoEncodeAcceleratorClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<VideoEncodeAcceleratorClient, VideoEncodeAcceleratorClient.Proxy> MANAGER = VideoEncodeAcceleratorClient_Internal.MANAGER;


    void requireBitstreamBuffers(
int inputCount, org.chromium.gfx.mojom.Size inputCodedSize, int outputBufferSize);



    void bitstreamBufferReady(
int bitstreamBufferId, BitstreamBufferMetadata metadata);



    void notifyError(
int error);



    void notifyEncoderInfoChange(
VideoEncoderInfo info);


}
