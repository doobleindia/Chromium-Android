// BitstreamBufferMetadata.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;


public final class BitstreamBufferMetadata extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int payloadSizeBytes;
    public boolean keyFrame;
    public org.chromium.mojo_base.mojom.TimeDelta timestamp;
    public Vp8Metadata vp8;

    private BitstreamBufferMetadata(int version) {
        super(STRUCT_SIZE, version);
    }

    public BitstreamBufferMetadata() {
        this(0);
    }

    public static BitstreamBufferMetadata deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static BitstreamBufferMetadata deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BitstreamBufferMetadata decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BitstreamBufferMetadata result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new BitstreamBufferMetadata(elementsOrVersion);
                {
                    
                result.payloadSizeBytes = decoder0.readInt(8);
                }
                {
                    
                result.keyFrame = decoder0.readBoolean(12, 0);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.timestamp = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.vp8 = Vp8Metadata.decode(decoder1);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.payloadSizeBytes, 8);
        
        encoder0.encode(this.keyFrame, 12, 0);
        
        encoder0.encode(this.timestamp, 16, false);
        
        encoder0.encode(this.vp8, 24, true);
    }
}