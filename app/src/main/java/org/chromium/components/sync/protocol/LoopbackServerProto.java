// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: loopback_server.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Contains the loopback server state.
 * </pre>
 *
 * Protobuf type {@code sync_pb.LoopbackServerProto}
 */
public  final class LoopbackServerProto extends
    com.google.protobuf.GeneratedMessageLite<
        LoopbackServerProto, LoopbackServerProto.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.LoopbackServerProto)
    LoopbackServerProtoOrBuilder {
  private LoopbackServerProto() {
    entities_ = emptyProtobufList();
    keystoreKeys_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int VERSION_FIELD_NUMBER = 1;
  private long version_;
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   */
  public boolean hasVersion() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   */
  public long getVersion() {
    return version_;
  }
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   */
  private void setVersion(long value) {
    bitField0_ |= 0x00000001;
    version_ = value;
  }
  /**
   * <pre>
   * The protocol buffer format version.
   * </pre>
   *
   * <code>optional int64 version = 1;</code>
   */
  private void clearVersion() {
    bitField0_ = (bitField0_ & ~0x00000001);
    version_ = 0L;
  }

  public static final int STORE_BIRTHDAY_FIELD_NUMBER = 2;
  private long storeBirthday_;
  /**
   * <code>optional int64 store_birthday = 2;</code>
   */
  public boolean hasStoreBirthday() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 store_birthday = 2;</code>
   */
  public long getStoreBirthday() {
    return storeBirthday_;
  }
  /**
   * <code>optional int64 store_birthday = 2;</code>
   */
  private void setStoreBirthday(long value) {
    bitField0_ |= 0x00000002;
    storeBirthday_ = value;
  }
  /**
   * <code>optional int64 store_birthday = 2;</code>
   */
  private void clearStoreBirthday() {
    bitField0_ = (bitField0_ & ~0x00000002);
    storeBirthday_ = 0L;
  }

  public static final int ENTITIES_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.components.sync.protocol.LoopbackServerEntity> entities_;
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  public java.util.List<org.chromium.components.sync.protocol.LoopbackServerEntity> getEntitiesList() {
    return entities_;
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  public java.util.List<? extends org.chromium.components.sync.protocol.LoopbackServerEntityOrBuilder> 
      getEntitiesOrBuilderList() {
    return entities_;
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  public int getEntitiesCount() {
    return entities_.size();
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  public org.chromium.components.sync.protocol.LoopbackServerEntity getEntities(int index) {
    return entities_.get(index);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  public org.chromium.components.sync.protocol.LoopbackServerEntityOrBuilder getEntitiesOrBuilder(
      int index) {
    return entities_.get(index);
  }
  private void ensureEntitiesIsMutable() {
    if (!entities_.isModifiable()) {
      entities_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(entities_);
     }
  }

  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void setEntities(
      int index, org.chromium.components.sync.protocol.LoopbackServerEntity value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEntitiesIsMutable();
    entities_.set(index, value);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void setEntities(
      int index, org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
    ensureEntitiesIsMutable();
    entities_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void addEntities(org.chromium.components.sync.protocol.LoopbackServerEntity value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEntitiesIsMutable();
    entities_.add(value);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void addEntities(
      int index, org.chromium.components.sync.protocol.LoopbackServerEntity value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureEntitiesIsMutable();
    entities_.add(index, value);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void addEntities(
      org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
    ensureEntitiesIsMutable();
    entities_.add(builderForValue.build());
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void addEntities(
      int index, org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
    ensureEntitiesIsMutable();
    entities_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void addAllEntities(
      java.lang.Iterable<? extends org.chromium.components.sync.protocol.LoopbackServerEntity> values) {
    ensureEntitiesIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, entities_);
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void clearEntities() {
    entities_ = emptyProtobufList();
  }
  /**
   * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
   */
  private void removeEntities(int index) {
    ensureEntitiesIsMutable();
    entities_.remove(index);
  }

  public static final int KEYSTORE_KEYS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<com.google.protobuf.ByteString> keystoreKeys_;
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   */
  public java.util.List<com.google.protobuf.ByteString>
      getKeystoreKeysList() {
    return keystoreKeys_;
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   */
  public int getKeystoreKeysCount() {
    return keystoreKeys_.size();
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   */
  public com.google.protobuf.ByteString getKeystoreKeys(int index) {
    return keystoreKeys_.get(index);
  }
  private void ensureKeystoreKeysIsMutable() {
    if (!keystoreKeys_.isModifiable()) {
      keystoreKeys_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(keystoreKeys_);
     }
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   */
  private void setKeystoreKeys(
      int index, com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureKeystoreKeysIsMutable();
    keystoreKeys_.set(index, value);
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   */
  private void addKeystoreKeys(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureKeystoreKeysIsMutable();
    keystoreKeys_.add(value);
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   */
  private void addAllKeystoreKeys(
      java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
    ensureKeystoreKeysIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, keystoreKeys_);
  }
  /**
   * <pre>
   * All Keystore keys known to the server.
   * </pre>
   *
   * <code>repeated bytes keystore_keys = 4;</code>
   */
  private void clearKeystoreKeys() {
    keystoreKeys_ = emptyProtobufList();
  }

  public static final int LAST_VERSION_ASSIGNED_FIELD_NUMBER = 5;
  private long lastVersionAssigned_;
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   */
  public boolean hasLastVersionAssigned() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   */
  public long getLastVersionAssigned() {
    return lastVersionAssigned_;
  }
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   */
  private void setLastVersionAssigned(long value) {
    bitField0_ |= 0x00000004;
    lastVersionAssigned_ = value;
  }
  /**
   * <pre>
   * The last entity ID that was assigned to an entity.
   * </pre>
   *
   * <code>optional int64 last_version_assigned = 5;</code>
   */
  private void clearLastVersionAssigned() {
    bitField0_ = (bitField0_ & ~0x00000004);
    lastVersionAssigned_ = 0L;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt64(1, version_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, storeBirthday_);
    }
    for (int i = 0; i < entities_.size(); i++) {
      output.writeMessage(3, entities_.get(i));
    }
    for (int i = 0; i < keystoreKeys_.size(); i++) {
      output.writeBytes(4, keystoreKeys_.get(i));
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt64(5, lastVersionAssigned_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, version_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, storeBirthday_);
    }
    for (int i = 0; i < entities_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, entities_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < keystoreKeys_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(keystoreKeys_.get(i));
      }
      size += dataSize;
      size += 1 * getKeystoreKeysList().size();
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, lastVersionAssigned_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.LoopbackServerProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.LoopbackServerProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Contains the loopback server state.
   * </pre>
   *
   * Protobuf type {@code sync_pb.LoopbackServerProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.LoopbackServerProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.LoopbackServerProto)
      org.chromium.components.sync.protocol.LoopbackServerProtoOrBuilder {
    // Construct using org.chromium.components.sync.protocol.LoopbackServerProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The protocol buffer format version.
     * </pre>
     *
     * <code>optional int64 version = 1;</code>
     */
    public boolean hasVersion() {
      return instance.hasVersion();
    }
    /**
     * <pre>
     * The protocol buffer format version.
     * </pre>
     *
     * <code>optional int64 version = 1;</code>
     */
    public long getVersion() {
      return instance.getVersion();
    }
    /**
     * <pre>
     * The protocol buffer format version.
     * </pre>
     *
     * <code>optional int64 version = 1;</code>
     */
    public Builder setVersion(long value) {
      copyOnWrite();
      instance.setVersion(value);
      return this;
    }
    /**
     * <pre>
     * The protocol buffer format version.
     * </pre>
     *
     * <code>optional int64 version = 1;</code>
     */
    public Builder clearVersion() {
      copyOnWrite();
      instance.clearVersion();
      return this;
    }

    /**
     * <code>optional int64 store_birthday = 2;</code>
     */
    public boolean hasStoreBirthday() {
      return instance.hasStoreBirthday();
    }
    /**
     * <code>optional int64 store_birthday = 2;</code>
     */
    public long getStoreBirthday() {
      return instance.getStoreBirthday();
    }
    /**
     * <code>optional int64 store_birthday = 2;</code>
     */
    public Builder setStoreBirthday(long value) {
      copyOnWrite();
      instance.setStoreBirthday(value);
      return this;
    }
    /**
     * <code>optional int64 store_birthday = 2;</code>
     */
    public Builder clearStoreBirthday() {
      copyOnWrite();
      instance.clearStoreBirthday();
      return this;
    }

    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public java.util.List<org.chromium.components.sync.protocol.LoopbackServerEntity> getEntitiesList() {
      return java.util.Collections.unmodifiableList(
          instance.getEntitiesList());
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public int getEntitiesCount() {
      return instance.getEntitiesCount();
    }/**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public org.chromium.components.sync.protocol.LoopbackServerEntity getEntities(int index) {
      return instance.getEntities(index);
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder setEntities(
        int index, org.chromium.components.sync.protocol.LoopbackServerEntity value) {
      copyOnWrite();
      instance.setEntities(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder setEntities(
        int index, org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
      copyOnWrite();
      instance.setEntities(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addEntities(org.chromium.components.sync.protocol.LoopbackServerEntity value) {
      copyOnWrite();
      instance.addEntities(value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addEntities(
        int index, org.chromium.components.sync.protocol.LoopbackServerEntity value) {
      copyOnWrite();
      instance.addEntities(index, value);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addEntities(
        org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
      copyOnWrite();
      instance.addEntities(builderForValue);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addEntities(
        int index, org.chromium.components.sync.protocol.LoopbackServerEntity.Builder builderForValue) {
      copyOnWrite();
      instance.addEntities(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder addAllEntities(
        java.lang.Iterable<? extends org.chromium.components.sync.protocol.LoopbackServerEntity> values) {
      copyOnWrite();
      instance.addAllEntities(values);
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder clearEntities() {
      copyOnWrite();
      instance.clearEntities();
      return this;
    }
    /**
     * <code>repeated .sync_pb.LoopbackServerEntity entities = 3;</code>
     */
    public Builder removeEntities(int index) {
      copyOnWrite();
      instance.removeEntities(index);
      return this;
    }

    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     */
    public java.util.List<com.google.protobuf.ByteString>
        getKeystoreKeysList() {
      return java.util.Collections.unmodifiableList(
          instance.getKeystoreKeysList());
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     */
    public int getKeystoreKeysCount() {
      return instance.getKeystoreKeysCount();
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     */
    public com.google.protobuf.ByteString getKeystoreKeys(int index) {
      return instance.getKeystoreKeys(index);
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     */
    public Builder setKeystoreKeys(
        int index, com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setKeystoreKeys(index, value);
      return this;
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     */
    public Builder addKeystoreKeys(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addKeystoreKeys(value);
      return this;
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     */
    public Builder addAllKeystoreKeys(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      copyOnWrite();
      instance.addAllKeystoreKeys(values);
      return this;
    }
    /**
     * <pre>
     * All Keystore keys known to the server.
     * </pre>
     *
     * <code>repeated bytes keystore_keys = 4;</code>
     */
    public Builder clearKeystoreKeys() {
      copyOnWrite();
      instance.clearKeystoreKeys();
      return this;
    }

    /**
     * <pre>
     * The last entity ID that was assigned to an entity.
     * </pre>
     *
     * <code>optional int64 last_version_assigned = 5;</code>
     */
    public boolean hasLastVersionAssigned() {
      return instance.hasLastVersionAssigned();
    }
    /**
     * <pre>
     * The last entity ID that was assigned to an entity.
     * </pre>
     *
     * <code>optional int64 last_version_assigned = 5;</code>
     */
    public long getLastVersionAssigned() {
      return instance.getLastVersionAssigned();
    }
    /**
     * <pre>
     * The last entity ID that was assigned to an entity.
     * </pre>
     *
     * <code>optional int64 last_version_assigned = 5;</code>
     */
    public Builder setLastVersionAssigned(long value) {
      copyOnWrite();
      instance.setLastVersionAssigned(value);
      return this;
    }
    /**
     * <pre>
     * The last entity ID that was assigned to an entity.
     * </pre>
     *
     * <code>optional int64 last_version_assigned = 5;</code>
     */
    public Builder clearLastVersionAssigned() {
      copyOnWrite();
      instance.clearLastVersionAssigned();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.LoopbackServerProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.LoopbackServerProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        entities_.makeImmutable();
        keystoreKeys_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.components.sync.protocol.LoopbackServerProto other = (org.chromium.components.sync.protocol.LoopbackServerProto) arg1;
        version_ = visitor.visitLong(
            hasVersion(), version_,
            other.hasVersion(), other.version_);
        storeBirthday_ = visitor.visitLong(
            hasStoreBirthday(), storeBirthday_,
            other.hasStoreBirthday(), other.storeBirthday_);
        entities_= visitor.visitList(entities_, other.entities_);
        keystoreKeys_= visitor.visitList(keystoreKeys_, other.keystoreKeys_);
        lastVersionAssigned_ = visitor.visitLong(
            hasLastVersionAssigned(), lastVersionAssigned_,
            other.hasLastVersionAssigned(), other.lastVersionAssigned_);
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
              case 8: {
                bitField0_ |= 0x00000001;
                version_ = input.readInt64();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                storeBirthday_ = input.readInt64();
                break;
              }
              case 26: {
                if (!entities_.isModifiable()) {
                  entities_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(entities_);
                }
                entities_.add(
                    input.readMessage(org.chromium.components.sync.protocol.LoopbackServerEntity.parser(), extensionRegistry));
                break;
              }
              case 34: {
                if (!keystoreKeys_.isModifiable()) {
                  keystoreKeys_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(keystoreKeys_);
                }
                keystoreKeys_.add(input.readBytes());
                break;
              }
              case 40: {
                bitField0_ |= 0x00000004;
                lastVersionAssigned_ = input.readInt64();
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.LoopbackServerProto.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.LoopbackServerProto)
  private static final org.chromium.components.sync.protocol.LoopbackServerProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LoopbackServerProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.LoopbackServerProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LoopbackServerProto> PARSER;

  public static com.google.protobuf.Parser<LoopbackServerProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

