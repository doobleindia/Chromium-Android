// Copyright 2019 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.components.signin.base;

import androidx.annotation.NonNull;

import org.chromium.base.annotations.CalledByNative;

/**
 * Structure storing the core information about a Google account that is always known. The {@link
 * CoreAccountInfo} for a given user is almost always the same but it may change in some rare cases.
 * For example, the email will change if the user changes email.
 * This class has a native counterpart called CoreAccountInfo.
 */
public class CoreAccountInfo {
    private final CoreAccountId mId;
    private final String mEmail;
    private final String mGaiaId;

    /**
     * Constructs a CoreAccountInfo with the provided parameters
     * @param id A CoreAccountId associated with the account, equal to either email or gaiaId.
     * @param email The email of the account.
     * @param gaiaId String representation of the Gaia ID. Must not be an email address.
     */
    @CalledByNative
    public CoreAccountInfo(
            @NonNull CoreAccountId id, @NonNull String email, @NonNull String gaiaId) {
        assert id != null;
        assert email != null;
        assert gaiaId != null;
        assert !gaiaId.contains("@");

        mId = id;
        mEmail = email;
        mGaiaId = gaiaId;
    }

    /**
     * Returns a unique identifier of the current account.
     */
    @CalledByNative
    public CoreAccountId getId() {
        return mId;
    }

    /**
     * Returns the email of the current account.
     */
    @CalledByNative
    public String getEmail() {
        return mEmail;
    }

    /**
     * Returns the string representation of the Gaia ID
     */
    @CalledByNative
    public String getGaiaId() {
        return mGaiaId;
    }

    @Override
    public String toString() {
        return String.format("CoreAccountInfo{id[%s], name[%s]}", getId(), getEmail());
    }

    @Override
    public int hashCode() {
        int result = 31 * mId.hashCode() + mEmail.hashCode();
        return 31 * result + mGaiaId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CoreAccountInfo)) return false;
        CoreAccountInfo other = (CoreAccountInfo) obj;
        return mId.equals(other.mId) && mEmail.equals(other.mEmail)
                && mGaiaId.equals(other.mGaiaId);
    }
}
