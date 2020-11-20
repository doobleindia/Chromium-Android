// InternalAuthenticator_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webauthn/internal_authenticator.mojom
//

package org.chromium.blink.mojom;


class InternalAuthenticator_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<InternalAuthenticator, InternalAuthenticator.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<InternalAuthenticator, InternalAuthenticator.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.InternalAuthenticator";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, InternalAuthenticator impl) {
            return new Stub(core, impl);
        }

        @Override
        public InternalAuthenticator[] buildArray(int size) {
          return new InternalAuthenticator[size];
        }
    };


    private static final int MAKE_CREDENTIAL_ORDINAL = 0;

    private static final int GET_ASSERTION_ORDINAL = 1;

    private static final int IS_USER_VERIFYING_PLATFORM_AUTHENTICATOR_AVAILABLE_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements InternalAuthenticator.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void makeCredential(
PublicKeyCredentialCreationOptions options, 
MakeCredentialResponse callback) {

            InternalAuthenticatorMakeCredentialParams _message = new InternalAuthenticatorMakeCredentialParams();

            _message.options = options;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    MAKE_CREDENTIAL_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new InternalAuthenticatorMakeCredentialResponseParamsForwardToCallback(callback));

        }


        @Override
        public void getAssertion(
PublicKeyCredentialRequestOptions options, 
GetAssertionResponse callback) {

            InternalAuthenticatorGetAssertionParams _message = new InternalAuthenticatorGetAssertionParams();

            _message.options = options;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_ASSERTION_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new InternalAuthenticatorGetAssertionResponseParamsForwardToCallback(callback));

        }


        @Override
        public void isUserVerifyingPlatformAuthenticatorAvailable(

IsUserVerifyingPlatformAuthenticatorAvailableResponse callback) {

            InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams _message = new InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    IS_USER_VERIFYING_PLATFORM_AUTHENTICATOR_AVAILABLE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<InternalAuthenticator> {

        Stub(org.chromium.mojo.system.Core core, InternalAuthenticator impl) {
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
                                InternalAuthenticator_Internal.MANAGER, messageWithHeader);








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
                                getCore(), InternalAuthenticator_Internal.MANAGER, messageWithHeader, receiver);







                    case MAKE_CREDENTIAL_ORDINAL: {

                        InternalAuthenticatorMakeCredentialParams data =
                                InternalAuthenticatorMakeCredentialParams.deserialize(messageWithHeader.getPayload());

                        getImpl().makeCredential(data.options, new InternalAuthenticatorMakeCredentialResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }







                    case GET_ASSERTION_ORDINAL: {

                        InternalAuthenticatorGetAssertionParams data =
                                InternalAuthenticatorGetAssertionParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getAssertion(data.options, new InternalAuthenticatorGetAssertionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }







                    case IS_USER_VERIFYING_PLATFORM_AUTHENTICATOR_AVAILABLE_ORDINAL: {

                        InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams.deserialize(messageWithHeader.getPayload());

                        getImpl().isUserVerifyingPlatformAuthenticatorAvailable(new InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    }


    
    static final class InternalAuthenticatorMakeCredentialParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public PublicKeyCredentialCreationOptions options;

        private InternalAuthenticatorMakeCredentialParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public InternalAuthenticatorMakeCredentialParams() {
            this(0);
        }

        public static InternalAuthenticatorMakeCredentialParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InternalAuthenticatorMakeCredentialParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static InternalAuthenticatorMakeCredentialParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InternalAuthenticatorMakeCredentialParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new InternalAuthenticatorMakeCredentialParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.options = PublicKeyCredentialCreationOptions.decode(decoder1);
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
            
            encoder0.encode(this.options, 8, false);
        }
    }



    
    static final class InternalAuthenticatorMakeCredentialResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int status;
        public MakeCredentialAuthenticatorResponse credential;

        private InternalAuthenticatorMakeCredentialResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public InternalAuthenticatorMakeCredentialResponseParams() {
            this(0);
        }

        public static InternalAuthenticatorMakeCredentialResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InternalAuthenticatorMakeCredentialResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static InternalAuthenticatorMakeCredentialResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InternalAuthenticatorMakeCredentialResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new InternalAuthenticatorMakeCredentialResponseParams(elementsOrVersion);
                    {
                        
                    result.status = decoder0.readInt(8);
                        AuthenticatorStatus.validate(result.status);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.credential = MakeCredentialAuthenticatorResponse.decode(decoder1);
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
            
            encoder0.encode(this.status, 8);
            
            encoder0.encode(this.credential, 16, true);
        }
    }

    static class InternalAuthenticatorMakeCredentialResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final InternalAuthenticator.MakeCredentialResponse mCallback;

        InternalAuthenticatorMakeCredentialResponseParamsForwardToCallback(InternalAuthenticator.MakeCredentialResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(MAKE_CREDENTIAL_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                InternalAuthenticatorMakeCredentialResponseParams response = InternalAuthenticatorMakeCredentialResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.status, response.credential);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class InternalAuthenticatorMakeCredentialResponseParamsProxyToResponder implements InternalAuthenticator.MakeCredentialResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        InternalAuthenticatorMakeCredentialResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer status, MakeCredentialAuthenticatorResponse credential) {
            InternalAuthenticatorMakeCredentialResponseParams _response = new InternalAuthenticatorMakeCredentialResponseParams();

            _response.status = status;

            _response.credential = credential;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    MAKE_CREDENTIAL_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class InternalAuthenticatorGetAssertionParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public PublicKeyCredentialRequestOptions options;

        private InternalAuthenticatorGetAssertionParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public InternalAuthenticatorGetAssertionParams() {
            this(0);
        }

        public static InternalAuthenticatorGetAssertionParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InternalAuthenticatorGetAssertionParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static InternalAuthenticatorGetAssertionParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InternalAuthenticatorGetAssertionParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new InternalAuthenticatorGetAssertionParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.options = PublicKeyCredentialRequestOptions.decode(decoder1);
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
            
            encoder0.encode(this.options, 8, false);
        }
    }



    
    static final class InternalAuthenticatorGetAssertionResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int status;
        public GetAssertionAuthenticatorResponse credential;

        private InternalAuthenticatorGetAssertionResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public InternalAuthenticatorGetAssertionResponseParams() {
            this(0);
        }

        public static InternalAuthenticatorGetAssertionResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InternalAuthenticatorGetAssertionResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static InternalAuthenticatorGetAssertionResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InternalAuthenticatorGetAssertionResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new InternalAuthenticatorGetAssertionResponseParams(elementsOrVersion);
                    {
                        
                    result.status = decoder0.readInt(8);
                        AuthenticatorStatus.validate(result.status);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.credential = GetAssertionAuthenticatorResponse.decode(decoder1);
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
            
            encoder0.encode(this.status, 8);
            
            encoder0.encode(this.credential, 16, true);
        }
    }

    static class InternalAuthenticatorGetAssertionResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final InternalAuthenticator.GetAssertionResponse mCallback;

        InternalAuthenticatorGetAssertionResponseParamsForwardToCallback(InternalAuthenticator.GetAssertionResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_ASSERTION_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                InternalAuthenticatorGetAssertionResponseParams response = InternalAuthenticatorGetAssertionResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.status, response.credential);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class InternalAuthenticatorGetAssertionResponseParamsProxyToResponder implements InternalAuthenticator.GetAssertionResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        InternalAuthenticatorGetAssertionResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Integer status, GetAssertionAuthenticatorResponse credential) {
            InternalAuthenticatorGetAssertionResponseParams _response = new InternalAuthenticatorGetAssertionResponseParams();

            _response.status = status;

            _response.credential = credential;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_ASSERTION_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams() {
            this(0);
        }

        public static InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean available;

        private InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams() {
            this(0);
        }

        public static InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams(elementsOrVersion);
                    {
                        
                    result.available = decoder0.readBoolean(8, 0);
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
            
            encoder0.encode(this.available, 8, 0);
        }
    }

    static class InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final InternalAuthenticator.IsUserVerifyingPlatformAuthenticatorAvailableResponse mCallback;

        InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsForwardToCallback(InternalAuthenticator.IsUserVerifyingPlatformAuthenticatorAvailableResponse callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(IS_USER_VERIFYING_PLATFORM_AUTHENTICATOR_AVAILABLE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams response = InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.available);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsProxyToResponder implements InternalAuthenticator.IsUserVerifyingPlatformAuthenticatorAvailableResponse {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Boolean available) {
            InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams _response = new InternalAuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams();

            _response.available = available;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    IS_USER_VERIFYING_PLATFORM_AUTHENTICATOR_AVAILABLE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
