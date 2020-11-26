// VideoEncodeAcceleratorClient_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;


class VideoEncodeAcceleratorClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<VideoEncodeAcceleratorClient, VideoEncodeAcceleratorClient.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<VideoEncodeAcceleratorClient, VideoEncodeAcceleratorClient.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.VideoEncodeAcceleratorClient";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, VideoEncodeAcceleratorClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public VideoEncodeAcceleratorClient[] buildArray(int size) {
          return new VideoEncodeAcceleratorClient[size];
        }
    };


    private static final int REQUIRE_BITSTREAM_BUFFERS_ORDINAL = 0;

    private static final int BITSTREAM_BUFFER_READY_ORDINAL = 1;

    private static final int NOTIFY_ERROR_ORDINAL = 2;

    private static final int NOTIFY_ENCODER_INFO_CHANGE_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements VideoEncodeAcceleratorClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void requireBitstreamBuffers(
int inputCount, org.chromium.gfx.mojom.Size inputCodedSize, int outputBufferSize) {

            VideoEncodeAcceleratorClientRequireBitstreamBuffersParams _message = new VideoEncodeAcceleratorClientRequireBitstreamBuffersParams();

            _message.inputCount = inputCount;

            _message.inputCodedSize = inputCodedSize;

            _message.outputBufferSize = outputBufferSize;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(REQUIRE_BITSTREAM_BUFFERS_ORDINAL)));

        }


        @Override
        public void bitstreamBufferReady(
int bitstreamBufferId, BitstreamBufferMetadata metadata) {

            VideoEncodeAcceleratorClientBitstreamBufferReadyParams _message = new VideoEncodeAcceleratorClientBitstreamBufferReadyParams();

            _message.bitstreamBufferId = bitstreamBufferId;

            _message.metadata = metadata;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(BITSTREAM_BUFFER_READY_ORDINAL)));

        }


        @Override
        public void notifyError(
int error) {

            VideoEncodeAcceleratorClientNotifyErrorParams _message = new VideoEncodeAcceleratorClientNotifyErrorParams();

            _message.error = error;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(NOTIFY_ERROR_ORDINAL)));

        }


        @Override
        public void notifyEncoderInfoChange(
VideoEncoderInfo info) {

            VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams _message = new VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams();

            _message.info = info;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(NOTIFY_ENCODER_INFO_CHANGE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<VideoEncodeAcceleratorClient> {

        Stub(org.chromium.mojo.system.Core core, VideoEncodeAcceleratorClient impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.NO_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                VideoEncodeAcceleratorClient_Internal.MANAGER, messageWithHeader);





                    case REQUIRE_BITSTREAM_BUFFERS_ORDINAL: {

                        VideoEncodeAcceleratorClientRequireBitstreamBuffersParams data =
                                VideoEncodeAcceleratorClientRequireBitstreamBuffersParams.deserialize(messageWithHeader.getPayload());

                        getImpl().requireBitstreamBuffers(data.inputCount, data.inputCodedSize, data.outputBufferSize);
                        return true;
                    }





                    case BITSTREAM_BUFFER_READY_ORDINAL: {

                        VideoEncodeAcceleratorClientBitstreamBufferReadyParams data =
                                VideoEncodeAcceleratorClientBitstreamBufferReadyParams.deserialize(messageWithHeader.getPayload());

                        getImpl().bitstreamBufferReady(data.bitstreamBufferId, data.metadata);
                        return true;
                    }





                    case NOTIFY_ERROR_ORDINAL: {

                        VideoEncodeAcceleratorClientNotifyErrorParams data =
                                VideoEncodeAcceleratorClientNotifyErrorParams.deserialize(messageWithHeader.getPayload());

                        getImpl().notifyError(data.error);
                        return true;
                    }





                    case NOTIFY_ENCODER_INFO_CHANGE_ORDINAL: {

                        VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams data =
                                VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams.deserialize(messageWithHeader.getPayload());

                        getImpl().notifyEncoderInfoChange(data.info);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), VideoEncodeAcceleratorClient_Internal.MANAGER, messageWithHeader, receiver);










                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class VideoEncodeAcceleratorClientRequireBitstreamBuffersParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int inputCount;
        public org.chromium.gfx.mojom.Size inputCodedSize;
        public int outputBufferSize;

        private VideoEncodeAcceleratorClientRequireBitstreamBuffersParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoEncodeAcceleratorClientRequireBitstreamBuffersParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoEncodeAcceleratorClientRequireBitstreamBuffersParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoEncodeAcceleratorClientRequireBitstreamBuffersParams(elementsOrVersion);
                    {
                        
                    result.inputCount = decoder0.readInt(8);
                    }
                    {
                        
                    result.outputBufferSize = decoder0.readInt(12);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.inputCodedSize = org.chromium.gfx.mojom.Size.decode(decoder1);
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
            
            encoder0.encode(this.inputCount, 8);
            
            encoder0.encode(this.outputBufferSize, 12);
            
            encoder0.encode(this.inputCodedSize, 16, false);
        }
    }



    
    static final class VideoEncodeAcceleratorClientBitstreamBufferReadyParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int bitstreamBufferId;
        public BitstreamBufferMetadata metadata;

        private VideoEncodeAcceleratorClientBitstreamBufferReadyParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoEncodeAcceleratorClientBitstreamBufferReadyParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoEncodeAcceleratorClientBitstreamBufferReadyParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoEncodeAcceleratorClientBitstreamBufferReadyParams(elementsOrVersion);
                    {
                        
                    result.bitstreamBufferId = decoder0.readInt(8);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.metadata = BitstreamBufferMetadata.decode(decoder1);
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
            
            encoder0.encode(this.bitstreamBufferId, 8);
            
            encoder0.encode(this.metadata, 16, false);
        }
    }



    
    static final class VideoEncodeAcceleratorClientNotifyErrorParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int error;

        private VideoEncodeAcceleratorClientNotifyErrorParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoEncodeAcceleratorClientNotifyErrorParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorClientNotifyErrorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoEncodeAcceleratorClientNotifyErrorParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoEncodeAcceleratorClientNotifyErrorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoEncodeAcceleratorClientNotifyErrorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoEncodeAcceleratorClientNotifyErrorParams(elementsOrVersion);
                    {
                        
                    result.error = decoder0.readInt(8);
                        VideoEncodeAccelerator.Error.validate(result.error);
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
            
            encoder0.encode(this.error, 8);
        }
    }



    
    static final class VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public VideoEncoderInfo info;

        private VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.info = VideoEncoderInfo.decode(decoder1);
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
            
            encoder0.encode(this.info, 8, false);
        }
    }



}
