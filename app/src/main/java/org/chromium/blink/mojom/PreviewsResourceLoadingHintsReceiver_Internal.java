// PreviewsResourceLoadingHintsReceiver_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/loader/previews_resource_loading_hints.mojom
//

package org.chromium.blink.mojom;


class PreviewsResourceLoadingHintsReceiver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<PreviewsResourceLoadingHintsReceiver, PreviewsResourceLoadingHintsReceiver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<PreviewsResourceLoadingHintsReceiver, PreviewsResourceLoadingHintsReceiver.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.PreviewsResourceLoadingHintsReceiver";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, PreviewsResourceLoadingHintsReceiver impl) {
            return new Stub(core, impl);
        }

        @Override
        public PreviewsResourceLoadingHintsReceiver[] buildArray(int size) {
          return new PreviewsResourceLoadingHintsReceiver[size];
        }
    };


    private static final int SET_RESOURCE_LOADING_HINTS_ORDINAL = 0;

    private static final int SET_COMPRESS_PUBLIC_IMAGES_HINTS_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements PreviewsResourceLoadingHintsReceiver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void setResourceLoadingHints(
PreviewsResourceLoadingHints previewsResourceLoadingHints) {

            PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams _message = new PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams();

            _message.previewsResourceLoadingHints = previewsResourceLoadingHints;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_RESOURCE_LOADING_HINTS_ORDINAL)));

        }


        @Override
        public void setCompressPublicImagesHints(
CompressPublicImagesHints imagesHints) {

            PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams _message = new PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams();

            _message.imagesHints = imagesHints;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_COMPRESS_PUBLIC_IMAGES_HINTS_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<PreviewsResourceLoadingHintsReceiver> {

        Stub(org.chromium.mojo.system.Core core, PreviewsResourceLoadingHintsReceiver impl) {
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
                                PreviewsResourceLoadingHintsReceiver_Internal.MANAGER, messageWithHeader);





                    case SET_RESOURCE_LOADING_HINTS_ORDINAL: {

                        PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams data =
                                PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setResourceLoadingHints(data.previewsResourceLoadingHints);
                        return true;
                    }





                    case SET_COMPRESS_PUBLIC_IMAGES_HINTS_ORDINAL: {

                        PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams data =
                                PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setCompressPublicImagesHints(data.imagesHints);
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
                                getCore(), PreviewsResourceLoadingHintsReceiver_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public PreviewsResourceLoadingHints previewsResourceLoadingHints;

        private PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams() {
            this(0);
        }

        public static PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PreviewsResourceLoadingHintsReceiverSetResourceLoadingHintsParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.previewsResourceLoadingHints = PreviewsResourceLoadingHints.decode(decoder1);
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
            
            encoder0.encode(this.previewsResourceLoadingHints, 8, false);
        }
    }



    
    static final class PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public CompressPublicImagesHints imagesHints;

        private PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams() {
            this(0);
        }

        public static PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new PreviewsResourceLoadingHintsReceiverSetCompressPublicImagesHintsParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.imagesHints = CompressPublicImagesHints.decode(decoder1);
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
            
            encoder0.encode(this.imagesHints, 8, false);
        }
    }



}
