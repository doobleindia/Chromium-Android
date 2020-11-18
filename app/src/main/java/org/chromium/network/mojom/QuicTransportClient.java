// QuicTransportClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/quic_transport.mojom
//

package org.chromium.network.mojom;


public interface QuicTransportClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends QuicTransportClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<QuicTransportClient, QuicTransportClient.Proxy> MANAGER = QuicTransportClient_Internal.MANAGER;


    void onDatagramReceived(
org.chromium.mojo_base.mojom.ReadOnlyBuffer data);



    void onIncomingStreamClosed(
int streamId, boolean finReceived);


}
