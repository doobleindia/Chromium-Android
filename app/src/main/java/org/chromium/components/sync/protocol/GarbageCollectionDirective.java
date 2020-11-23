// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sync.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.GarbageCollectionDirective}
 */
public  final class GarbageCollectionDirective extends
    com.google.protobuf.GeneratedMessageLite<
        GarbageCollectionDirective, GarbageCollectionDirective.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.GarbageCollectionDirective)
    GarbageCollectionDirectiveOrBuilder {
  private GarbageCollectionDirective() {
  }
  /**
   * Protobuf enum {@code sync_pb.GarbageCollectionDirective.Type}
   */
  public enum Type
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>VERSION_WATERMARK = 1;</code>
     */
    VERSION_WATERMARK(1),
    /**
     * <code>AGE_WATERMARK = 2;</code>
     */
    AGE_WATERMARK(2),
    /**
     * <code>DEPRECATED_MAX_ITEM_COUNT = 3 [deprecated = true];</code>
     */
    @java.lang.Deprecated
    DEPRECATED_MAX_ITEM_COUNT(3),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>VERSION_WATERMARK = 1;</code>
     */
    public static final int VERSION_WATERMARK_VALUE = 1;
    /**
     * <code>AGE_WATERMARK = 2;</code>
     */
    public static final int AGE_WATERMARK_VALUE = 2;
    /**
     * <code>DEPRECATED_MAX_ITEM_COUNT = 3 [deprecated = true];</code>
     */
    public static final int DEPRECATED_MAX_ITEM_COUNT_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return VERSION_WATERMARK;
        case 2: return AGE_WATERMARK;
        case 3: return DEPRECATED_MAX_ITEM_COUNT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sync_pb.GarbageCollectionDirective.Type)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
   */
  public org.chromium.components.sync.protocol.GarbageCollectionDirective.Type getType() {
    org.chromium.components.sync.protocol.GarbageCollectionDirective.Type result = org.chromium.components.sync.protocol.GarbageCollectionDirective.Type.forNumber(type_);
    return result == null ? org.chromium.components.sync.protocol.GarbageCollectionDirective.Type.UNKNOWN : result;
  }
  /**
   * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
   */
  private void setType(org.chromium.components.sync.protocol.GarbageCollectionDirective.Type value) {
    if (value == null) {
      throw new NullPointerException();
    }
    bitField0_ |= 0x00000001;
    type_ = value.getNumber();
  }
  /**
   * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
   */
  private void clearType() {
    bitField0_ = (bitField0_ & ~0x00000001);
    type_ = 0;
  }

  public static final int VERSION_WATERMARK_FIELD_NUMBER = 2;
  private long versionWatermark_;
  /**
   * <pre>
   * This field specifies the watermark for the versions which should get
   * garbage collected.  The client should purge all sync entities when
   * receiving any value of this.  This is a change from previous behavior,
   * where the client would only be required to purge items older than the
   * specified watermark.
   * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
   * the client will delete ALL data, regardless of its value.
   * </pre>
   *
   * <code>optional int64 version_watermark = 2;</code>
   */
  public boolean hasVersionWatermark() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * This field specifies the watermark for the versions which should get
   * garbage collected.  The client should purge all sync entities when
   * receiving any value of this.  This is a change from previous behavior,
   * where the client would only be required to purge items older than the
   * specified watermark.
   * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
   * the client will delete ALL data, regardless of its value.
   * </pre>
   *
   * <code>optional int64 version_watermark = 2;</code>
   */
  public long getVersionWatermark() {
    return versionWatermark_;
  }
  /**
   * <pre>
   * This field specifies the watermark for the versions which should get
   * garbage collected.  The client should purge all sync entities when
   * receiving any value of this.  This is a change from previous behavior,
   * where the client would only be required to purge items older than the
   * specified watermark.
   * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
   * the client will delete ALL data, regardless of its value.
   * </pre>
   *
   * <code>optional int64 version_watermark = 2;</code>
   */
  private void setVersionWatermark(long value) {
    bitField0_ |= 0x00000002;
    versionWatermark_ = value;
  }
  /**
   * <pre>
   * This field specifies the watermark for the versions which should get
   * garbage collected.  The client should purge all sync entities when
   * receiving any value of this.  This is a change from previous behavior,
   * where the client would only be required to purge items older than the
   * specified watermark.
   * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
   * the client will delete ALL data, regardless of its value.
   * </pre>
   *
   * <code>optional int64 version_watermark = 2;</code>
   */
  private void clearVersionWatermark() {
    bitField0_ = (bitField0_ & ~0x00000002);
    versionWatermark_ = 0L;
  }

  public static final int AGE_WATERMARK_IN_DAYS_FIELD_NUMBER = 3;
  private int ageWatermarkInDays_;
  /**
   * <pre>
   * This field specifies the watermark in terms of age in days.  The client
   * should purge all sync entities which are older than this specific value
   * based on last modified time.
   * </pre>
   *
   * <code>optional int32 age_watermark_in_days = 3;</code>
   */
  public boolean hasAgeWatermarkInDays() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * This field specifies the watermark in terms of age in days.  The client
   * should purge all sync entities which are older than this specific value
   * based on last modified time.
   * </pre>
   *
   * <code>optional int32 age_watermark_in_days = 3;</code>
   */
  public int getAgeWatermarkInDays() {
    return ageWatermarkInDays_;
  }
  /**
   * <pre>
   * This field specifies the watermark in terms of age in days.  The client
   * should purge all sync entities which are older than this specific value
   * based on last modified time.
   * </pre>
   *
   * <code>optional int32 age_watermark_in_days = 3;</code>
   */
  private void setAgeWatermarkInDays(int value) {
    bitField0_ |= 0x00000004;
    ageWatermarkInDays_ = value;
  }
  /**
   * <pre>
   * This field specifies the watermark in terms of age in days.  The client
   * should purge all sync entities which are older than this specific value
   * based on last modified time.
   * </pre>
   *
   * <code>optional int32 age_watermark_in_days = 3;</code>
   */
  private void clearAgeWatermarkInDays() {
    bitField0_ = (bitField0_ & ~0x00000004);
    ageWatermarkInDays_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, versionWatermark_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, ageWatermarkInDays_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, versionWatermark_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ageWatermarkInDays_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.GarbageCollectionDirective parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.GarbageCollectionDirective prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.GarbageCollectionDirective}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.GarbageCollectionDirective, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.GarbageCollectionDirective)
      org.chromium.components.sync.protocol.GarbageCollectionDirectiveOrBuilder {
    // Construct using org.chromium.components.sync.protocol.GarbageCollectionDirective.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
     */
    public boolean hasType() {
      return instance.hasType();
    }
    /**
     * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
     */
    public org.chromium.components.sync.protocol.GarbageCollectionDirective.Type getType() {
      return instance.getType();
    }
    /**
     * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
     */
    public Builder setType(org.chromium.components.sync.protocol.GarbageCollectionDirective.Type value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.GarbageCollectionDirective.Type type = 1 [default = UNKNOWN];</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <pre>
     * This field specifies the watermark for the versions which should get
     * garbage collected.  The client should purge all sync entities when
     * receiving any value of this.  This is a change from previous behavior,
     * where the client would only be required to purge items older than the
     * specified watermark.
     * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
     * the client will delete ALL data, regardless of its value.
     * </pre>
     *
     * <code>optional int64 version_watermark = 2;</code>
     */
    public boolean hasVersionWatermark() {
      return instance.hasVersionWatermark();
    }
    /**
     * <pre>
     * This field specifies the watermark for the versions which should get
     * garbage collected.  The client should purge all sync entities when
     * receiving any value of this.  This is a change from previous behavior,
     * where the client would only be required to purge items older than the
     * specified watermark.
     * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
     * the client will delete ALL data, regardless of its value.
     * </pre>
     *
     * <code>optional int64 version_watermark = 2;</code>
     */
    public long getVersionWatermark() {
      return instance.getVersionWatermark();
    }
    /**
     * <pre>
     * This field specifies the watermark for the versions which should get
     * garbage collected.  The client should purge all sync entities when
     * receiving any value of this.  This is a change from previous behavior,
     * where the client would only be required to purge items older than the
     * specified watermark.
     * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
     * the client will delete ALL data, regardless of its value.
     * </pre>
     *
     * <code>optional int64 version_watermark = 2;</code>
     */
    public Builder setVersionWatermark(long value) {
      copyOnWrite();
      instance.setVersionWatermark(value);
      return this;
    }
    /**
     * <pre>
     * This field specifies the watermark for the versions which should get
     * garbage collected.  The client should purge all sync entities when
     * receiving any value of this.  This is a change from previous behavior,
     * where the client would only be required to purge items older than the
     * specified watermark.
     * TODO(crbug.com/877951): Rename this to make clear that whenever it's set,
     * the client will delete ALL data, regardless of its value.
     * </pre>
     *
     * <code>optional int64 version_watermark = 2;</code>
     */
    public Builder clearVersionWatermark() {
      copyOnWrite();
      instance.clearVersionWatermark();
      return this;
    }

    /**
     * <pre>
     * This field specifies the watermark in terms of age in days.  The client
     * should purge all sync entities which are older than this specific value
     * based on last modified time.
     * </pre>
     *
     * <code>optional int32 age_watermark_in_days = 3;</code>
     */
    public boolean hasAgeWatermarkInDays() {
      return instance.hasAgeWatermarkInDays();
    }
    /**
     * <pre>
     * This field specifies the watermark in terms of age in days.  The client
     * should purge all sync entities which are older than this specific value
     * based on last modified time.
     * </pre>
     *
     * <code>optional int32 age_watermark_in_days = 3;</code>
     */
    public int getAgeWatermarkInDays() {
      return instance.getAgeWatermarkInDays();
    }
    /**
     * <pre>
     * This field specifies the watermark in terms of age in days.  The client
     * should purge all sync entities which are older than this specific value
     * based on last modified time.
     * </pre>
     *
     * <code>optional int32 age_watermark_in_days = 3;</code>
     */
    public Builder setAgeWatermarkInDays(int value) {
      copyOnWrite();
      instance.setAgeWatermarkInDays(value);
      return this;
    }
    /**
     * <pre>
     * This field specifies the watermark in terms of age in days.  The client
     * should purge all sync entities which are older than this specific value
     * based on last modified time.
     * </pre>
     *
     * <code>optional int32 age_watermark_in_days = 3;</code>
     */
    public Builder clearAgeWatermarkInDays() {
      copyOnWrite();
      instance.clearAgeWatermarkInDays();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.GarbageCollectionDirective)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.GarbageCollectionDirective();
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
        org.chromium.components.sync.protocol.GarbageCollectionDirective other = (org.chromium.components.sync.protocol.GarbageCollectionDirective) arg1;
        type_ = visitor.visitInt(hasType(), type_,
            other.hasType(), other.type_);
        versionWatermark_ = visitor.visitLong(
            hasVersionWatermark(), versionWatermark_,
            other.hasVersionWatermark(), other.versionWatermark_);
        ageWatermarkInDays_ = visitor.visitInt(
            hasAgeWatermarkInDays(), ageWatermarkInDays_,
            other.hasAgeWatermarkInDays(), other.ageWatermarkInDays_);
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
                int rawValue = input.readEnum();
                org.chromium.components.sync.protocol.GarbageCollectionDirective.Type value = org.chromium.components.sync.protocol.GarbageCollectionDirective.Type.forNumber(rawValue);
                if (value == null) {
                  super.mergeVarintField(1, rawValue);
                } else {
                  bitField0_ |= 0x00000001;
                  type_ = rawValue;
                }
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                versionWatermark_ = input.readInt64();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                ageWatermarkInDays_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.GarbageCollectionDirective.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.GarbageCollectionDirective)
  private static final org.chromium.components.sync.protocol.GarbageCollectionDirective DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new GarbageCollectionDirective();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.GarbageCollectionDirective getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GarbageCollectionDirective> PARSER;

  public static com.google.protobuf.Parser<GarbageCollectionDirective> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

