
// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/sync/base/model_type.h

package org.chromium.components.sync;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ModelType.UNSPECIFIED, ModelType.TOP_LEVEL_FOLDER, ModelType.BOOKMARKS,
    ModelType.FIRST_USER_MODEL_TYPE, ModelType.FIRST_REAL_MODEL_TYPE, ModelType.PREFERENCES,
    ModelType.PASSWORDS, ModelType.AUTOFILL_PROFILE, ModelType.AUTOFILL,
    ModelType.AUTOFILL_WALLET_DATA, ModelType.AUTOFILL_WALLET_METADATA, ModelType.THEMES,
    ModelType.TYPED_URLS, ModelType.EXTENSIONS, ModelType.SEARCH_ENGINES, ModelType.SESSIONS,
    ModelType.APPS, ModelType.APP_SETTINGS, ModelType.EXTENSION_SETTINGS,
    ModelType.HISTORY_DELETE_DIRECTIVES, ModelType.DICTIONARY, ModelType.FAVICON_IMAGES,
    ModelType.FAVICON_TRACKING, ModelType.DEVICE_INFO, ModelType.PRIORITY_PREFERENCES,
    ModelType.SUPERVISED_USER_SETTINGS, ModelType.APP_LIST, ModelType.SUPERVISED_USER_WHITELISTS,
    ModelType.ARC_PACKAGE, ModelType.PRINTERS, ModelType.READING_LIST, ModelType.USER_EVENTS,
    ModelType.USER_CONSENTS, ModelType.SEND_TAB_TO_SELF, ModelType.SECURITY_EVENTS,
    ModelType.WIFI_CONFIGURATIONS, ModelType.WEB_APPS, ModelType.OS_PREFERENCES,
    ModelType.OS_PRIORITY_PREFERENCES, ModelType.SHARING_MESSAGE, ModelType.PROXY_TABS,
    ModelType.FIRST_PROXY_TYPE, ModelType.LAST_PROXY_TYPE, ModelType.LAST_USER_MODEL_TYPE,
    ModelType.NIGORI, ModelType.DEPRECATED_EXPERIMENTS, ModelType.LAST_REAL_MODEL_TYPE
})
@Retention(RetentionPolicy.SOURCE)
public @interface ModelType {
  /**
   * Object type unknown.  Objects may transition through the unknown state during their initial
   * creation, before their properties are set.  After deletion, object types are generally
   * preserved.
   */
  int UNSPECIFIED = 0;
  /**
   * A permanent folder whose children may be of mixed datatypes (e.g. the "Google Chrome" folder).
   */
  int TOP_LEVEL_FOLDER = 1;
  /**
   * ------------------------------------ Start of "real" model types. The model types declared
   * before here are somewhat special, as they they do not correspond to any browser data model.
   * The remaining types are bona fide model types; all have a related browser data model and can be
   * represented in the protocol using a specific Message type in the EntitySpecifics protocol
   * buffer. A bookmark folder or a bookmark URL object.
   */
  int BOOKMARKS = 2;
  int FIRST_USER_MODEL_TYPE = 2;
  int FIRST_REAL_MODEL_TYPE = 2;
  /**
   * A preference object, a.k.a. "Settings".
   */
  int PREFERENCES = 3;
  /**
   * A password object.
   */
  int PASSWORDS = 4;
  /**
   * An autofill_profile object, i.e. an address.
   */
  int AUTOFILL_PROFILE = 5;
  /**
   * An autofill object, i.e. an autocomplete entry keyed to an HTML form field.
   */
  int AUTOFILL = 6;
  /**
   * Credit cards and addresses from the user's account. These are read-only on the client.
   */
  int AUTOFILL_WALLET_DATA = 7;
  /**
   * Usage counts and last use dates for Wallet cards and addresses. This data is both readable and
   * writable.
   */
  int AUTOFILL_WALLET_METADATA = 8;
  /**
   * A theme object.
   */
  int THEMES = 9;
  /**
   * A typed_url object, i.e. a URL the user has typed into the Omnibox.
   */
  int TYPED_URLS = 10;
  /**
   * An extension object.
   */
  int EXTENSIONS = 11;
  /**
   * An object representing a custom search engine.
   */
  int SEARCH_ENGINES = 12;
  /**
   * An object representing a browser session, e.g. an open tab. This is used for both "History"
   * (together with TYPED_URLS) and "Tabs" (depending on PROXY_TABS).
   */
  int SESSIONS = 13;
  /**
   * An app object.
   */
  int APPS = 14;
  /**
   * An app setting from the extension settings API.
   */
  int APP_SETTINGS = 15;
  /**
   * An extension setting from the extension settings API.
   */
  int EXTENSION_SETTINGS = 16;
  /**
   * History delete directives, used to propagate history deletions (e.g. based on a time range).
   */
  int HISTORY_DELETE_DIRECTIVES = 17;
  /**
   * Custom spelling dictionary entries.
   */
  int DICTIONARY = 18;
  /**
   * Favicon images, including both the image URL and the actual pixels.
   * TODO(https://crbug.com/978775): Prepend DEPRECATED to the name of favicon data types.
   */
  int FAVICON_IMAGES = 19;
  /**
   * Favicon tracking information, i.e. metadata such as last visit date.
   */
  int FAVICON_TRACKING = 20;
  /**
   * Client-specific metadata, synced before other user types.
   */
  int DEVICE_INFO = 21;
  /**
   * These preferences are synced before other user types and are never encrypted.
   */
  int PRIORITY_PREFERENCES = 22;
  /**
   * Supervised user settings. Cannot be encrypted.
   */
  int SUPERVISED_USER_SETTINGS = 23;
  /**
   * App List items, used by the ChromeOS app launcher.
   */
  int APP_LIST = 24;
  /**
   * Supervised user whitelists. Each item contains a CRX ID (like an extension ID) and a name.
   */
  int SUPERVISED_USER_WHITELISTS = 25;
  /**
   * ARC package items, i.e. Android apps on ChromeOS.
   */
  int ARC_PACKAGE = 26;
  /**
   * Printer device information. ChromeOS only.
   */
  int PRINTERS = 27;
  /**
   * Reading list items. iOS only.
   */
  int READING_LIST = 28;
  /**
   * Commit only user events.
   */
  int USER_EVENTS = 29;
  /**
   * Commit only user consents.
   */
  int USER_CONSENTS = 30;
  /**
   * Tabs sent between devices.
   */
  int SEND_TAB_TO_SELF = 31;
  /**
   * Commit only security events.
   */
  int SECURITY_EVENTS = 32;
  /**
   * Wi-Fi network configurations + credentials
   */
  int WIFI_CONFIGURATIONS = 33;
  /**
   * A web app object.
   */
  int WEB_APPS = 34;
  /**
   * OS-specific preferences (a.k.a. "OS settings"). Chrome OS only.
   */
  int OS_PREFERENCES = 35;
  /**
   * Synced before other user types. Never encrypted. Chrome OS only.
   */
  int OS_PRIORITY_PREFERENCES = 36;
  /**
   * Commit only sharing message object.
   */
  int SHARING_MESSAGE = 37;
  /**
   * ---- Proxy types ---- Proxy types are excluded from the sync protocol, but are still considered
   * real user types. By convention, we prefix them with 'PROXY_' to distinguish them from normal
   * protocol types. Tab sync. This is a placeholder type, so that Sessions can be implicitly
   * enabled for history sync and tabs sync.
   */
  int PROXY_TABS = 38;
  int FIRST_PROXY_TYPE = 38;
  int LAST_PROXY_TYPE = 38;
  int LAST_USER_MODEL_TYPE = 38;
  /**
   * ---- Control Types ---- An object representing a set of Nigori keys.
   */
  int NIGORI = 39;
  int DEPRECATED_EXPERIMENTS = 40;
  int LAST_REAL_MODEL_TYPE = 40;
  int NUM_ENTRIES = 41;
}
