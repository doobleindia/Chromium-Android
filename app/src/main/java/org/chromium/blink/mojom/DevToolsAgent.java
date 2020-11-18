// DevToolsAgent.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/devtools_agent.mojom
//

package org.chromium.blink.mojom;


public interface DevToolsAgent extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends DevToolsAgent, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DevToolsAgent, DevToolsAgent.Proxy> MANAGER = DevToolsAgent_Internal.MANAGER;


    void attachDevToolsSession(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported host, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported session, org.chromium.mojo.bindings.InterfaceRequest<DevToolsSession> ioSession, DevToolsSessionState reattachSessionState, boolean clientExpectsBinaryResponses, String sessionId);



    void inspectElement(
org.chromium.gfx.mojom.Point point);



    void reportChildWorkers(
boolean report, boolean waitForDebugger, 
ReportChildWorkersResponse callback);

    interface ReportChildWorkersResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
