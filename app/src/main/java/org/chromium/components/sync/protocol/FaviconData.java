// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: favicon_image_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.FaviconData}
 */
public  final class FaviconData extends
    com.google.protobuf.GeneratedMessageLite<
        FaviconData, FaviconData.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.FaviconData)
    FaviconDataOrBuilder {
  private FaviconData() {
    favicon_ = com.google.protobuf.ByteString.EMPTY;
  }
  private int bitField0_;
  public static final int FAVICON_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString favicon_;
  /**
   * <pre>
   * The image data for the favicon (PNG encoded).
   * </pre>
   *
   * <code>optional bytes favicon = 1;</code>
   */
  public boolean hasFavicon() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The image data for the favicon (PNG encoded).
   * </pre>
   *
   * <code>optional bytes favicon = 1;</code>
   */
  public com.google.protobuf.ByteString getFavicon() {
    return favicon_;
  }
  /**
   * <pre>
   * The image data for the favicon (PNG encoded).
   * </pre>
   *
   * <code>optional bytes favicon = 1;</code>
   */
  private void setFavicon(com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    favicon_ = value;
  }
  /**
   * <pre>
   * The image data for the favicon (PNG encoded).
   * </pre>
   *
   * <code>optional bytes favicon = 1;</code>
   */
  private void clearFavicon() {
    bitField0_ = (bitField0_ & ~0x00000001);
    favicon_ = getDefaultInstance().getFavicon();
  }

  public static final int WIDTH_FIELD_NUMBER = 2;
  private int width_;
  /**
   * <pre>
   * The favicon dimensions.
   * </pre>
   *
   * <code>optional int32 width = 2;</code>
   */
  public boolean hasWidth() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * The favicon dimensions.
   * </pre>
   *
   * <code>optional int32 width = 2;</code>
   */
  public int getWidth() {
    return width_;
  }
  /**
   * <pre>
   * The favicon dimensions.
   * </pre>
   *
   * <code>optional int32 width = 2;</code>
   */
  private void setWidth(int value) {
    bitField0_ |= 0x00000002;
    width_ = value;
  }
  /**
   * <pre>
   * The favicon dimensions.
   * </pre>
   *
   * <code>optional int32 width = 2;</code>
   */
  private void clearWidth() {
    bitField0_ = (bitField0_ & ~0x00000002);
    width_ = 0;
  }

  public static final int HEIGHT_FIELD_NUMBER = 3;
  private int height_;
  /**
   * <code>optional int32 height = 3;</code>
   */
  public boolean hasHeight() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 height = 3;</code>
   */
  public int getHeight() {
    return height_;
  }
  /**
   * <code>optional int32 height = 3;</code>
   */
  private void setHeight(int value) {
    bitField0_ |= 0x00000004;
    height_ = value;
  }
  /**
   * <code>optional int32 height = 3;</code>
   */
  private void clearHeight() {
    bitField0_ = (bitField0_ & ~0x00000004);
    height_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeBytes(1, favicon_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, width_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, height_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, favicon_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, width_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, height_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.FaviconData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.FaviconData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.FaviconData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.FaviconData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.FaviconData, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.FaviconData)
      org.chromium.components.sync.protocol.FaviconDataOrBuilder {
    // Construct using org.chromium.components.sync.protocol.FaviconData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The image data for the favicon (PNG encoded).
     * </pre>
     *
     * <code>optional bytes favicon = 1;</code>
     */
    public boolean hasFavicon() {
      return instance.hasFavicon();
    }
    /**
     * <pre>
     * The image data for the favicon (PNG encoded).
     * </pre>
     *
     * <code>optional bytes favicon = 1;</code>
     */
    public com.google.protobuf.ByteString getFavicon() {
      return instance.getFavicon();
    }
    /**
     * <pre>
     * The image data for the favicon (PNG encoded).
     * </pre>
     *
     * <code>optional bytes favicon = 1;</code>
     */
    public Builder setFavicon(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setFavicon(value);
      return this;
    }
    /**
     * <pre>
     * The image data for the favicon (PNG encoded).
     * </pre>
     *
     * <code>optional bytes favicon = 1;</code>
     */
    public Builder clearFavicon() {
      copyOnWrite();
      instance.clearFavicon();
      return this;
    }

    /**
     * <pre>
     * The favicon dimensions.
     * </pre>
     *
     * <code>optional int32 width = 2;</code>
     */
    public boolean hasWidth() {
      return instance.hasWidth();
    }
    /**
     * <pre>
     * The favicon dimensions.
     * </pre>
     *
     * <code>optional int32 width = 2;</code>
     */
    public int getWidth() {
      return instance.getWidth();
    }
    /**
     * <pre>
     * The favicon dimensions.
     * </pre>
     *
     * <code>optional int32 width = 2;</code>
     */
    public Builder setWidth(int value) {
      copyOnWrite();
      instance.setWidth(value);
      return this;
    }
    /**
     * <pre>
     * The favicon dimensions.
     * </pre>
     *
     * <code>optional int32 width = 2;</code>
     */
    public Builder clearWidth() {
      copyOnWrite();
      instance.clearWidth();
      return this;
    }

    /**
     * <code>optional int32 height = 3;</code>
     */
    public boolean hasHeight() {
      return instance.hasHeight();
    }
    /**
     * <code>optional int32 height = 3;</code>
     */
    public int getHeight() {
      return instance.getHeight();
    }
    /**
     * <code>optional int32 height = 3;</code>
     */
    public Builder setHeight(int value) {
      copyOnWrite();
      instance.setHeight(value);
      return this;
    }
    /**
     * <code>optional int32 height = 3;</code>
     */
    public Builder clearHeight() {
      copyOnWrite();
      instance.clearHeight();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.FaviconData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.FaviconData();
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
        org.chromium.components.sync.protocol.FaviconData other = (org.chromium.components.sync.protocol.FaviconData) arg1;
        favicon_ = visitor.visitByteString(
            hasFavicon(), favicon_,
            other.hasFavicon(), other.favicon_);
        width_ = visitor.visitInt(
            hasWidth(), width_,
            other.hasWidth(), other.width_);
        height_ = visitor.visitInt(
            hasHeight(), height_,
            other.hasHeight(), other.height_);
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
                bitField0_ |= 0x00000001;
                favicon_ = input.readBytes();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                width_ = input.readInt32();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                height_ = input.readInt32();
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.FaviconData.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.FaviconData)
  private static final org.chromium.components.sync.protocol.FaviconData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new FaviconData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.FaviconData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<FaviconData> PARSER;

  public static com.google.protobuf.Parser<FaviconData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
