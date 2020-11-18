// UrlLoaderClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/url_loader.mojom
//

package org.chromium.network.mojom;


public interface UrlLoaderClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends UrlLoaderClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<UrlLoaderClient, UrlLoaderClient.Proxy> MANAGER = UrlLoaderClient_Internal.MANAGER;


    void onReceiveResponse(
UrlResponseHead head);



    void onReceiveRedirect(
UrlRequestRedirectInfo redirectInfo, UrlResponseHead head);



    void onUploadProgress(
long currentPosition, long totalSize, 
OnUploadProgressResponse callback);

    interface OnUploadProgressResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void onReceiveCachedMetadata(
org.chromium.mojo_base.mojom.BigBuffer data);



    void onTransferSizeUpdated(
int transferSizeDiff);



    void onStartLoadingResponseBody(
org.chromium.mojo.system.DataPipe.ConsumerHandle body);



    void onComplete(
UrlLoaderCompletionStatus status);


}
