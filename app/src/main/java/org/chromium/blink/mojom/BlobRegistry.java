// BlobRegistry.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/blob/blob_registry.mojom
//

package org.chromium.blink.mojom;


public interface BlobRegistry extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends BlobRegistry, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BlobRegistry, BlobRegistry.Proxy> MANAGER = BlobRegistry_Internal.MANAGER;


    void register(
org.chromium.mojo.bindings.InterfaceRequest<Blob> blob, String uuid, String contentType, String contentDisposition, DataElement[] elements, 
RegisterResponse callback);

    interface RegisterResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void registerFromStream(
String contentType, String contentDisposition, long lengthHint, org.chromium.mojo.system.DataPipe.ConsumerHandle data, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported progressClient, 
RegisterFromStreamResponse callback);

    interface RegisterFromStreamResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<SerializedBlob> { }



    void getBlobFromUuid(
org.chromium.mojo.bindings.InterfaceRequest<Blob> blob, String uuid, 
GetBlobFromUuidResponse callback);

    interface GetBlobFromUuidResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void urlStoreForOrigin(
org.chromium.url.internal.mojom.Origin origin, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported urlStore);


}
