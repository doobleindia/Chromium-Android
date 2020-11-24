// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: password_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Properties of password sync objects.
 * </pre>
 *
 * Protobuf type {@code sync_pb.PasswordSpecifics}
 */
public  final class PasswordSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        PasswordSpecifics, PasswordSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.PasswordSpecifics)
    PasswordSpecificsOrBuilder {
  private PasswordSpecifics() {
  }
  private int bitField0_;
  public static final int ENCRYPTED_FIELD_NUMBER = 1;
  private org.chromium.components.sync.protocol.EncryptedData encrypted_;
  /**
   * <pre>
   * The actual password data. Contains an encrypted PasswordSpecificsData
   * message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  public boolean hasEncrypted() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The actual password data. Contains an encrypted PasswordSpecificsData
   * message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  public org.chromium.components.sync.protocol.EncryptedData getEncrypted() {
    return encrypted_ == null ? org.chromium.components.sync.protocol.EncryptedData.getDefaultInstance() : encrypted_;
  }
  /**
   * <pre>
   * The actual password data. Contains an encrypted PasswordSpecificsData
   * message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  private void setEncrypted(org.chromium.components.sync.protocol.EncryptedData value) {
    if (value == null) {
      throw new NullPointerException();
    }
    encrypted_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <pre>
   * The actual password data. Contains an encrypted PasswordSpecificsData
   * message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  private void setEncrypted(
      org.chromium.components.sync.protocol.EncryptedData.Builder builderForValue) {
    encrypted_ = builderForValue.build();
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The actual password data. Contains an encrypted PasswordSpecificsData
   * message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  private void mergeEncrypted(org.chromium.components.sync.protocol.EncryptedData value) {
    if (encrypted_ != null &&
        encrypted_ != org.chromium.components.sync.protocol.EncryptedData.getDefaultInstance()) {
      encrypted_ =
        org.chromium.components.sync.protocol.EncryptedData.newBuilder(encrypted_).mergeFrom(value).buildPartial();
    } else {
      encrypted_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <pre>
   * The actual password data. Contains an encrypted PasswordSpecificsData
   * message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  private void clearEncrypted() {  encrypted_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int CLIENT_ONLY_ENCRYPTED_DATA_FIELD_NUMBER = 2;
  private org.chromium.components.sync.protocol.PasswordSpecificsData clientOnlyEncryptedData_;
  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
   */
  public boolean hasClientOnlyEncryptedData() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
   */
  public org.chromium.components.sync.protocol.PasswordSpecificsData getClientOnlyEncryptedData() {
    return clientOnlyEncryptedData_ == null ? org.chromium.components.sync.protocol.PasswordSpecificsData.getDefaultInstance() : clientOnlyEncryptedData_;
  }
  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
   */
  private void setClientOnlyEncryptedData(org.chromium.components.sync.protocol.PasswordSpecificsData value) {
    if (value == null) {
      throw new NullPointerException();
    }
    clientOnlyEncryptedData_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
   */
  private void setClientOnlyEncryptedData(
      org.chromium.components.sync.protocol.PasswordSpecificsData.Builder builderForValue) {
    clientOnlyEncryptedData_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
   */
  private void mergeClientOnlyEncryptedData(org.chromium.components.sync.protocol.PasswordSpecificsData value) {
    if (clientOnlyEncryptedData_ != null &&
        clientOnlyEncryptedData_ != org.chromium.components.sync.protocol.PasswordSpecificsData.getDefaultInstance()) {
      clientOnlyEncryptedData_ =
        org.chromium.components.sync.protocol.PasswordSpecificsData.newBuilder(clientOnlyEncryptedData_).mergeFrom(value).buildPartial();
    } else {
      clientOnlyEncryptedData_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
   */
  private void clearClientOnlyEncryptedData() {  clientOnlyEncryptedData_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int UNENCRYPTED_METADATA_FIELD_NUMBER = 3;
  private org.chromium.components.sync.protocol.PasswordSpecificsMetadata unencryptedMetadata_;
  /**
   * <pre>
   * Password related metadata, which is sent to the server side. The field
   * should never be set for full encryption users. If encryption is enabled,
   * this field must be cleared.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
   */
  public boolean hasUnencryptedMetadata() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * Password related metadata, which is sent to the server side. The field
   * should never be set for full encryption users. If encryption is enabled,
   * this field must be cleared.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
   */
  public org.chromium.components.sync.protocol.PasswordSpecificsMetadata getUnencryptedMetadata() {
    return unencryptedMetadata_ == null ? org.chromium.components.sync.protocol.PasswordSpecificsMetadata.getDefaultInstance() : unencryptedMetadata_;
  }
  /**
   * <pre>
   * Password related metadata, which is sent to the server side. The field
   * should never be set for full encryption users. If encryption is enabled,
   * this field must be cleared.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
   */
  private void setUnencryptedMetadata(org.chromium.components.sync.protocol.PasswordSpecificsMetadata value) {
    if (value == null) {
      throw new NullPointerException();
    }
    unencryptedMetadata_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * Password related metadata, which is sent to the server side. The field
   * should never be set for full encryption users. If encryption is enabled,
   * this field must be cleared.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
   */
  private void setUnencryptedMetadata(
      org.chromium.components.sync.protocol.PasswordSpecificsMetadata.Builder builderForValue) {
    unencryptedMetadata_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * Password related metadata, which is sent to the server side. The field
   * should never be set for full encryption users. If encryption is enabled,
   * this field must be cleared.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
   */
  private void mergeUnencryptedMetadata(org.chromium.components.sync.protocol.PasswordSpecificsMetadata value) {
    if (unencryptedMetadata_ != null &&
        unencryptedMetadata_ != org.chromium.components.sync.protocol.PasswordSpecificsMetadata.getDefaultInstance()) {
      unencryptedMetadata_ =
        org.chromium.components.sync.protocol.PasswordSpecificsMetadata.newBuilder(unencryptedMetadata_).mergeFrom(value).buildPartial();
    } else {
      unencryptedMetadata_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * Password related metadata, which is sent to the server side. The field
   * should never be set for full encryption users. If encryption is enabled,
   * this field must be cleared.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
   */
  private void clearUnencryptedMetadata() {  unencryptedMetadata_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getEncrypted());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getClientOnlyEncryptedData());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getUnencryptedMetadata());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEncrypted());
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getClientOnlyEncryptedData());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUnencryptedMetadata());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.PasswordSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PasswordSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.PasswordSpecifics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Properties of password sync objects.
   * </pre>
   *
   * Protobuf type {@code sync_pb.PasswordSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.PasswordSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.PasswordSpecifics)
      org.chromium.components.sync.protocol.PasswordSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.PasswordSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The actual password data. Contains an encrypted PasswordSpecificsData
     * message.
     * </pre>
     *
     * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
     */
    public boolean hasEncrypted() {
      return instance.hasEncrypted();
    }
    /**
     * <pre>
     * The actual password data. Contains an encrypted PasswordSpecificsData
     * message.
     * </pre>
     *
     * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
     */
    public org.chromium.components.sync.protocol.EncryptedData getEncrypted() {
      return instance.getEncrypted();
    }
    /**
     * <pre>
     * The actual password data. Contains an encrypted PasswordSpecificsData
     * message.
     * </pre>
     *
     * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
     */
    public Builder setEncrypted(org.chromium.components.sync.protocol.EncryptedData value) {
      copyOnWrite();
      instance.setEncrypted(value);
      return this;
      }
    /**
     * <pre>
     * The actual password data. Contains an encrypted PasswordSpecificsData
     * message.
     * </pre>
     *
     * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
     */
    public Builder setEncrypted(
        org.chromium.components.sync.protocol.EncryptedData.Builder builderForValue) {
      copyOnWrite();
      instance.setEncrypted(builderForValue);
      return this;
    }
    /**
     * <pre>
     * The actual password data. Contains an encrypted PasswordSpecificsData
     * message.
     * </pre>
     *
     * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
     */
    public Builder mergeEncrypted(org.chromium.components.sync.protocol.EncryptedData value) {
      copyOnWrite();
      instance.mergeEncrypted(value);
      return this;
    }
    /**
     * <pre>
     * The actual password data. Contains an encrypted PasswordSpecificsData
     * message.
     * </pre>
     *
     * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
     */
    public Builder clearEncrypted() {  copyOnWrite();
      instance.clearEncrypted();
      return this;
    }

    /**
     * <pre>
     * An unsynced field for use internally on the client. This field should
     * never be set in any network-based communications because it contains
     * unencrypted material.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
     */
    public boolean hasClientOnlyEncryptedData() {
      return instance.hasClientOnlyEncryptedData();
    }
    /**
     * <pre>
     * An unsynced field for use internally on the client. This field should
     * never be set in any network-based communications because it contains
     * unencrypted material.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
     */
    public org.chromium.components.sync.protocol.PasswordSpecificsData getClientOnlyEncryptedData() {
      return instance.getClientOnlyEncryptedData();
    }
    /**
     * <pre>
     * An unsynced field for use internally on the client. This field should
     * never be set in any network-based communications because it contains
     * unencrypted material.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
     */
    public Builder setClientOnlyEncryptedData(org.chromium.components.sync.protocol.PasswordSpecificsData value) {
      copyOnWrite();
      instance.setClientOnlyEncryptedData(value);
      return this;
      }
    /**
     * <pre>
     * An unsynced field for use internally on the client. This field should
     * never be set in any network-based communications because it contains
     * unencrypted material.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
     */
    public Builder setClientOnlyEncryptedData(
        org.chromium.components.sync.protocol.PasswordSpecificsData.Builder builderForValue) {
      copyOnWrite();
      instance.setClientOnlyEncryptedData(builderForValue);
      return this;
    }
    /**
     * <pre>
     * An unsynced field for use internally on the client. This field should
     * never be set in any network-based communications because it contains
     * unencrypted material.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
     */
    public Builder mergeClientOnlyEncryptedData(org.chromium.components.sync.protocol.PasswordSpecificsData value) {
      copyOnWrite();
      instance.mergeClientOnlyEncryptedData(value);
      return this;
    }
    /**
     * <pre>
     * An unsynced field for use internally on the client. This field should
     * never be set in any network-based communications because it contains
     * unencrypted material.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
     */
    public Builder clearClientOnlyEncryptedData() {  copyOnWrite();
      instance.clearClientOnlyEncryptedData();
      return this;
    }

    /**
     * <pre>
     * Password related metadata, which is sent to the server side. The field
     * should never be set for full encryption users. If encryption is enabled,
     * this field must be cleared.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
     */
    public boolean hasUnencryptedMetadata() {
      return instance.hasUnencryptedMetadata();
    }
    /**
     * <pre>
     * Password related metadata, which is sent to the server side. The field
     * should never be set for full encryption users. If encryption is enabled,
     * this field must be cleared.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
     */
    public org.chromium.components.sync.protocol.PasswordSpecificsMetadata getUnencryptedMetadata() {
      return instance.getUnencryptedMetadata();
    }
    /**
     * <pre>
     * Password related metadata, which is sent to the server side. The field
     * should never be set for full encryption users. If encryption is enabled,
     * this field must be cleared.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
     */
    public Builder setUnencryptedMetadata(org.chromium.components.sync.protocol.PasswordSpecificsMetadata value) {
      copyOnWrite();
      instance.setUnencryptedMetadata(value);
      return this;
      }
    /**
     * <pre>
     * Password related metadata, which is sent to the server side. The field
     * should never be set for full encryption users. If encryption is enabled,
     * this field must be cleared.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
     */
    public Builder setUnencryptedMetadata(
        org.chromium.components.sync.protocol.PasswordSpecificsMetadata.Builder builderForValue) {
      copyOnWrite();
      instance.setUnencryptedMetadata(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Password related metadata, which is sent to the server side. The field
     * should never be set for full encryption users. If encryption is enabled,
     * this field must be cleared.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
     */
    public Builder mergeUnencryptedMetadata(org.chromium.components.sync.protocol.PasswordSpecificsMetadata value) {
      copyOnWrite();
      instance.mergeUnencryptedMetadata(value);
      return this;
    }
    /**
     * <pre>
     * Password related metadata, which is sent to the server side. The field
     * should never be set for full encryption users. If encryption is enabled,
     * this field must be cleared.
     * </pre>
     *
     * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
     */
    public Builder clearUnencryptedMetadata() {  copyOnWrite();
      instance.clearUnencryptedMetadata();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.PasswordSpecifics)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.PasswordSpecifics();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.components.sync.protocol.PasswordSpecifics other = (org.chromium.components.sync.protocol.PasswordSpecifics) arg1;
        encrypted_ = visitor.visitMessage(encrypted_, other.encrypted_);
        clientOnlyEncryptedData_ = visitor.visitMessage(clientOnlyEncryptedData_, other.clientOnlyEncryptedData_);
        unencryptedMetadata_ = visitor.visitMessage(unencryptedMetadata_, other.unencryptedMetadata_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                org.chromium.components.sync.protocol.EncryptedData.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                  subBuilder = encrypted_.toBuilder();
                }
                encrypted_ = input.readMessage(org.chromium.components.sync.protocol.EncryptedData.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(encrypted_);
                  encrypted_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                org.chromium.components.sync.protocol.PasswordSpecificsData.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = clientOnlyEncryptedData_.toBuilder();
                }
                clientOnlyEncryptedData_ = input.readMessage(org.chromium.components.sync.protocol.PasswordSpecificsData.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(clientOnlyEncryptedData_);
                  clientOnlyEncryptedData_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 26: {
                org.chromium.components.sync.protocol.PasswordSpecificsMetadata.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = unencryptedMetadata_.toBuilder();
                }
                unencryptedMetadata_ = input.readMessage(org.chromium.components.sync.protocol.PasswordSpecificsMetadata.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(unencryptedMetadata_);
                  unencryptedMetadata_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.PasswordSpecifics.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:sync_pb.PasswordSpecifics)
  private static final org.chromium.components.sync.protocol.PasswordSpecifics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PasswordSpecifics();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.PasswordSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PasswordSpecifics> PARSER;

  public static com.google.protobuf.Parser<PasswordSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
