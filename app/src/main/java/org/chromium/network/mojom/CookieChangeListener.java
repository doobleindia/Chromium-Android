// CookieChangeListener.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cookie_manager.mojom
//

package org.chromium.network.mojom;


public interface CookieChangeListener extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CookieChangeListener, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CookieChangeListener, CookieChangeListener.Proxy> MANAGER = CookieChangeListener_Internal.MANAGER;


    void onCookieChange(
CookieChangeInfo change);


}
