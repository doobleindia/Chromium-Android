// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/display_info.proto

package org.chromium.components.feed.core.proto.wire;

public final class DisplayInfoProto {
  private DisplayInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface DisplayInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:components.feed.core.proto.wire.DisplayInfo)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Density of the screen in physical pixels per density independent pixel
     * (DIP); see:
     * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
     * </pre>
     *
     * <code>optional float screen_density = 1;</code>
     */
    boolean hasScreenDensity();
    /**
     * <pre>
     * Density of the screen in physical pixels per density independent pixel
     * (DIP); see:
     * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
     * </pre>
     *
     * <code>optional float screen_density = 1;</code>
     */
    float getScreenDensity();

    /**
     * <pre>
     * The width of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_width_in_pixels = 2;</code>
     */
    boolean hasScreenWidthInPixels();
    /**
     * <pre>
     * The width of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_width_in_pixels = 2;</code>
     */
    int getScreenWidthInPixels();

    /**
     * <pre>
     * The height of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_height_in_pixels = 3;</code>
     */
    boolean hasScreenHeightInPixels();
    /**
     * <pre>
     * The height of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_height_in_pixels = 3;</code>
     */
    int getScreenHeightInPixels();
  }
  /**
   * <pre>
   * The information about the client's screen.
   * Next id: 4
   * </pre>
   *
   * Protobuf type {@code components.feed.core.proto.wire.DisplayInfo}
   */
  public  static final class DisplayInfo extends
      com.google.protobuf.GeneratedMessageLite<
          DisplayInfo, DisplayInfo.Builder> implements
      // @@protoc_insertion_point(message_implements:components.feed.core.proto.wire.DisplayInfo)
      DisplayInfoOrBuilder {
    private DisplayInfo() {
    }
    private int bitField0_;
    public static final int SCREEN_DENSITY_FIELD_NUMBER = 1;
    private float screenDensity_;
    /**
     * <pre>
     * Density of the screen in physical pixels per density independent pixel
     * (DIP); see:
     * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
     * </pre>
     *
     * <code>optional float screen_density = 1;</code>
     */
    public boolean hasScreenDensity() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Density of the screen in physical pixels per density independent pixel
     * (DIP); see:
     * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
     * </pre>
     *
     * <code>optional float screen_density = 1;</code>
     */
    public float getScreenDensity() {
      return screenDensity_;
    }
    /**
     * <pre>
     * Density of the screen in physical pixels per density independent pixel
     * (DIP); see:
     * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
     * </pre>
     *
     * <code>optional float screen_density = 1;</code>
     */
    private void setScreenDensity(float value) {
      bitField0_ |= 0x00000001;
      screenDensity_ = value;
    }
    /**
     * <pre>
     * Density of the screen in physical pixels per density independent pixel
     * (DIP); see:
     * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
     * </pre>
     *
     * <code>optional float screen_density = 1;</code>
     */
    private void clearScreenDensity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      screenDensity_ = 0F;
    }

    public static final int SCREEN_WIDTH_IN_PIXELS_FIELD_NUMBER = 2;
    private int screenWidthInPixels_;
    /**
     * <pre>
     * The width of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_width_in_pixels = 2;</code>
     */
    public boolean hasScreenWidthInPixels() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * The width of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_width_in_pixels = 2;</code>
     */
    public int getScreenWidthInPixels() {
      return screenWidthInPixels_;
    }
    /**
     * <pre>
     * The width of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_width_in_pixels = 2;</code>
     */
    private void setScreenWidthInPixels(int value) {
      bitField0_ |= 0x00000002;
      screenWidthInPixels_ = value;
    }
    /**
     * <pre>
     * The width of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_width_in_pixels = 2;</code>
     */
    private void clearScreenWidthInPixels() {
      bitField0_ = (bitField0_ & ~0x00000002);
      screenWidthInPixels_ = 0;
    }

    public static final int SCREEN_HEIGHT_IN_PIXELS_FIELD_NUMBER = 3;
    private int screenHeightInPixels_;
    /**
     * <pre>
     * The height of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_height_in_pixels = 3;</code>
     */
    public boolean hasScreenHeightInPixels() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     * The height of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_height_in_pixels = 3;</code>
     */
    public int getScreenHeightInPixels() {
      return screenHeightInPixels_;
    }
    /**
     * <pre>
     * The height of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_height_in_pixels = 3;</code>
     */
    private void setScreenHeightInPixels(int value) {
      bitField0_ |= 0x00000004;
      screenHeightInPixels_ = value;
    }
    /**
     * <pre>
     * The height of the screen in pixels.
     * </pre>
     *
     * <code>optional uint32 screen_height_in_pixels = 3;</code>
     */
    private void clearScreenHeightInPixels() {
      bitField0_ = (bitField0_ & ~0x00000004);
      screenHeightInPixels_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeFloat(1, screenDensity_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, screenWidthInPixels_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, screenHeightInPixels_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, screenDensity_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, screenWidthInPixels_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, screenHeightInPixels_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * <pre>
     * The information about the client's screen.
     * Next id: 4
     * </pre>
     *
     * Protobuf type {@code components.feed.core.proto.wire.DisplayInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo, Builder> implements
        // @@protoc_insertion_point(builder_implements:components.feed.core.proto.wire.DisplayInfo)
        org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfoOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Density of the screen in physical pixels per density independent pixel
       * (DIP); see:
       * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
       * </pre>
       *
       * <code>optional float screen_density = 1;</code>
       */
      public boolean hasScreenDensity() {
        return instance.hasScreenDensity();
      }
      /**
       * <pre>
       * Density of the screen in physical pixels per density independent pixel
       * (DIP); see:
       * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
       * </pre>
       *
       * <code>optional float screen_density = 1;</code>
       */
      public float getScreenDensity() {
        return instance.getScreenDensity();
      }
      /**
       * <pre>
       * Density of the screen in physical pixels per density independent pixel
       * (DIP); see:
       * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
       * </pre>
       *
       * <code>optional float screen_density = 1;</code>
       */
      public Builder setScreenDensity(float value) {
        copyOnWrite();
        instance.setScreenDensity(value);
        return this;
      }
      /**
       * <pre>
       * Density of the screen in physical pixels per density independent pixel
       * (DIP); see:
       * http://developer.android.com/reference/android/util/DisplayMetrics.html#density
       * </pre>
       *
       * <code>optional float screen_density = 1;</code>
       */
      public Builder clearScreenDensity() {
        copyOnWrite();
        instance.clearScreenDensity();
        return this;
      }

      /**
       * <pre>
       * The width of the screen in pixels.
       * </pre>
       *
       * <code>optional uint32 screen_width_in_pixels = 2;</code>
       */
      public boolean hasScreenWidthInPixels() {
        return instance.hasScreenWidthInPixels();
      }
      /**
       * <pre>
       * The width of the screen in pixels.
       * </pre>
       *
       * <code>optional uint32 screen_width_in_pixels = 2;</code>
       */
      public int getScreenWidthInPixels() {
        return instance.getScreenWidthInPixels();
      }
      /**
       * <pre>
       * The width of the screen in pixels.
       * </pre>
       *
       * <code>optional uint32 screen_width_in_pixels = 2;</code>
       */
      public Builder setScreenWidthInPixels(int value) {
        copyOnWrite();
        instance.setScreenWidthInPixels(value);
        return this;
      }
      /**
       * <pre>
       * The width of the screen in pixels.
       * </pre>
       *
       * <code>optional uint32 screen_width_in_pixels = 2;</code>
       */
      public Builder clearScreenWidthInPixels() {
        copyOnWrite();
        instance.clearScreenWidthInPixels();
        return this;
      }

      /**
       * <pre>
       * The height of the screen in pixels.
       * </pre>
       *
       * <code>optional uint32 screen_height_in_pixels = 3;</code>
       */
      public boolean hasScreenHeightInPixels() {
        return instance.hasScreenHeightInPixels();
      }
      /**
       * <pre>
       * The height of the screen in pixels.
       * </pre>
       *
       * <code>optional uint32 screen_height_in_pixels = 3;</code>
       */
      public int getScreenHeightInPixels() {
        return instance.getScreenHeightInPixels();
      }
      /**
       * <pre>
       * The height of the screen in pixels.
       * </pre>
       *
       * <code>optional uint32 screen_height_in_pixels = 3;</code>
       */
      public Builder setScreenHeightInPixels(int value) {
        copyOnWrite();
        instance.setScreenHeightInPixels(value);
        return this;
      }
      /**
       * <pre>
       * The height of the screen in pixels.
       * </pre>
       *
       * <code>optional uint32 screen_height_in_pixels = 3;</code>
       */
      public Builder clearScreenHeightInPixels() {
        copyOnWrite();
        instance.clearScreenHeightInPixels();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:components.feed.core.proto.wire.DisplayInfo)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo();
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
          org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo other = (org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo) arg1;
          screenDensity_ = visitor.visitFloat(
              hasScreenDensity(), screenDensity_,
              other.hasScreenDensity(), other.screenDensity_);
          screenWidthInPixels_ = visitor.visitInt(
              hasScreenWidthInPixels(), screenWidthInPixels_,
              other.hasScreenWidthInPixels(), other.screenWidthInPixels_);
          screenHeightInPixels_ = visitor.visitInt(
              hasScreenHeightInPixels(), screenHeightInPixels_,
              other.hasScreenHeightInPixels(), other.screenHeightInPixels_);
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
                case 13: {
                  bitField0_ |= 0x00000001;
                  screenDensity_ = input.readFloat();
                  break;
                }
                case 16: {
                  bitField0_ |= 0x00000002;
                  screenWidthInPixels_ = input.readUInt32();
                  break;
                }
                case 24: {
                  bitField0_ |= 0x00000004;
                  screenHeightInPixels_ = input.readUInt32();
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
          if (PARSER == null) {    synchronized (org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo.class) {
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


    // @@protoc_insertion_point(class_scope:components.feed.core.proto.wire.DisplayInfo)
    private static final org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new DisplayInfo();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.chromium.components.feed.core.proto.wire.DisplayInfoProto.DisplayInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<DisplayInfo> PARSER;

    public static com.google.protobuf.Parser<DisplayInfo> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
