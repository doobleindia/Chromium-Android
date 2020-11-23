// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: experiments_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Whether this client should cull (delete) expired autofill
 * entries when autofill sync is enabled.
 * </pre>
 *
 * Protobuf type {@code sync_pb.AutofillCullingFlags}
 */
public  final class AutofillCullingFlags extends
    com.google.protobuf.GeneratedMessageLite<
        AutofillCullingFlags, AutofillCullingFlags.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.AutofillCullingFlags)
    AutofillCullingFlagsOrBuilder {
  private AutofillCullingFlags() {
  }
  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <code>optional bool enabled = 1;</code>
   */
  public boolean hasEnabled() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional bool enabled = 1;</code>
   */
  public boolean getEnabled() {
    return enabled_;
  }
  /**
   * <code>optional bool enabled = 1;</code>
   */
  private void setEnabled(boolean value) {
    bitField0_ |= 0x00000001;
    enabled_ = value;
  }
  /**
   * <code>optional bool enabled = 1;</code>
   */
  private void clearEnabled() {
    bitField0_ = (bitField0_ & ~0x00000001);
    enabled_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBool(1, enabled_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillCullingFlags parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.AutofillCullingFlags prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Whether this client should cull (delete) expired autofill
   * entries when autofill sync is enabled.
   * </pre>
   *
   * Protobuf type {@code sync_pb.AutofillCullingFlags}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.AutofillCullingFlags, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.AutofillCullingFlags)
      org.chromium.components.sync.protocol.AutofillCullingFlagsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.AutofillCullingFlags.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional bool enabled = 1;</code>
     */
    public boolean hasEnabled() {
      return instance.hasEnabled();
    }
    /**
     * <code>optional bool enabled = 1;</code>
     */
    public boolean getEnabled() {
      return instance.getEnabled();
    }
    /**
     * <code>optional bool enabled = 1;</code>
     */
    public Builder setEnabled(boolean value) {
      copyOnWrite();
      instance.setEnabled(value);
      return this;
    }
    /**
     * <code>optional bool enabled = 1;</code>
     */
    public Builder clearEnabled() {
      copyOnWrite();
      instance.clearEnabled();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.AutofillCullingFlags)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.AutofillCullingFlags();
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
        org.chromium.components.sync.protocol.AutofillCullingFlags other = (org.chromium.components.sync.protocol.AutofillCullingFlags) arg1;
        enabled_ = visitor.visitBoolean(
            hasEnabled(), enabled_,
            other.hasEnabled(), other.enabled_);
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
                enabled_ = input.readBool();
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.AutofillCullingFlags.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.AutofillCullingFlags)
  private static final org.chromium.components.sync.protocol.AutofillCullingFlags DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AutofillCullingFlags();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.AutofillCullingFlags getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AutofillCullingFlags> PARSER;

  public static com.google.protobuf.Parser<AutofillCullingFlags> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

