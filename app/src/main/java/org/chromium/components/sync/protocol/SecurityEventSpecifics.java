// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security_event_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.SecurityEventSpecifics}
 */
public  final class SecurityEventSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        SecurityEventSpecifics, SecurityEventSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.SecurityEventSpecifics)
    SecurityEventSpecificsOrBuilder {
  private SecurityEventSpecifics() {
  }
  private int bitField0_;
  private int eventCase_ = 0;
  private java.lang.Object event_;
  public enum EventCase
      implements com.google.protobuf.Internal.EnumLite {
    GAIA_PASSWORD_REUSE_EVENT(1),
    EVENT_NOT_SET(0);
    private final int value;
    private EventCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventCase valueOf(int value) {
      return forNumber(value);
    }

    public static EventCase forNumber(int value) {
      switch (value) {
        case 1: return GAIA_PASSWORD_REUSE_EVENT;
        case 0: return EVENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EventCase
  getEventCase() {
    return EventCase.forNumber(
        eventCase_);
  }

  private void clearEvent() {
    eventCase_ = 0;
    event_ = null;
  }

  public static final int GAIA_PASSWORD_REUSE_EVENT_FIELD_NUMBER = 1;
  /**
   * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
   */
  public boolean hasGaiaPasswordReuseEvent() {
    return eventCase_ == 1;
  }
  /**
   * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
   */
  public org.chromium.components.sync.protocol.GaiaPasswordReuse getGaiaPasswordReuseEvent() {
    if (eventCase_ == 1) {
       return (org.chromium.components.sync.protocol.GaiaPasswordReuse) event_;
    }
    return org.chromium.components.sync.protocol.GaiaPasswordReuse.getDefaultInstance();
  }
  /**
   * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
   */
  private void setGaiaPasswordReuseEvent(org.chromium.components.sync.protocol.GaiaPasswordReuse value) {
    if (value == null) {
      throw new NullPointerException();
    }
    event_ = value;
    eventCase_ = 1;
  }
  /**
   * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
   */
  private void setGaiaPasswordReuseEvent(
      org.chromium.components.sync.protocol.GaiaPasswordReuse.Builder builderForValue) {
    event_ = builderForValue.build();
    eventCase_ = 1;
  }
  /**
   * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
   */
  private void mergeGaiaPasswordReuseEvent(org.chromium.components.sync.protocol.GaiaPasswordReuse value) {
    if (eventCase_ == 1 &&
        event_ != org.chromium.components.sync.protocol.GaiaPasswordReuse.getDefaultInstance()) {
      event_ = org.chromium.components.sync.protocol.GaiaPasswordReuse.newBuilder((org.chromium.components.sync.protocol.GaiaPasswordReuse) event_)
          .mergeFrom(value).buildPartial();
    } else {
      event_ = value;
    }
    eventCase_ = 1;
  }
  /**
   * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
   */
  private void clearGaiaPasswordReuseEvent() {
    if (eventCase_ == 1) {
      eventCase_ = 0;
      event_ = null;
    }
  }

  public static final int EVENT_TIME_USEC_FIELD_NUMBER = 2;
  private long eventTimeUsec_;
  /**
   * <pre>
   * Time of event, as measured by client in microseconds since Windows epoch.
   * </pre>
   *
   * <code>optional int64 event_time_usec = 2;</code>
   */
  public boolean hasEventTimeUsec() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * Time of event, as measured by client in microseconds since Windows epoch.
   * </pre>
   *
   * <code>optional int64 event_time_usec = 2;</code>
   */
  public long getEventTimeUsec() {
    return eventTimeUsec_;
  }
  /**
   * <pre>
   * Time of event, as measured by client in microseconds since Windows epoch.
   * </pre>
   *
   * <code>optional int64 event_time_usec = 2;</code>
   */
  private void setEventTimeUsec(long value) {
    bitField0_ |= 0x00000002;
    eventTimeUsec_ = value;
  }
  /**
   * <pre>
   * Time of event, as measured by client in microseconds since Windows epoch.
   * </pre>
   *
   * <code>optional int64 event_time_usec = 2;</code>
   */
  private void clearEventTimeUsec() {
    bitField0_ = (bitField0_ & ~0x00000002);
    eventTimeUsec_ = 0L;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (eventCase_ == 1) {
      output.writeMessage(1, (org.chromium.components.sync.protocol.GaiaPasswordReuse) event_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, eventTimeUsec_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (eventCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.chromium.components.sync.protocol.GaiaPasswordReuse) event_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, eventTimeUsec_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.SecurityEventSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.SecurityEventSpecifics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.SecurityEventSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.SecurityEventSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.SecurityEventSpecifics)
      org.chromium.components.sync.protocol.SecurityEventSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.SecurityEventSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }

    public EventCase
        getEventCase() {
      return instance.getEventCase();
    }

    public Builder clearEvent() {
      copyOnWrite();
      instance.clearEvent();
      return this;
    }


    /**
     * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
     */
    public boolean hasGaiaPasswordReuseEvent() {
      return instance.hasGaiaPasswordReuseEvent();
    }
    /**
     * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
     */
    public org.chromium.components.sync.protocol.GaiaPasswordReuse getGaiaPasswordReuseEvent() {
      return instance.getGaiaPasswordReuseEvent();
    }
    /**
     * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
     */
    public Builder setGaiaPasswordReuseEvent(org.chromium.components.sync.protocol.GaiaPasswordReuse value) {
      copyOnWrite();
      instance.setGaiaPasswordReuseEvent(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
     */
    public Builder setGaiaPasswordReuseEvent(
        org.chromium.components.sync.protocol.GaiaPasswordReuse.Builder builderForValue) {
      copyOnWrite();
      instance.setGaiaPasswordReuseEvent(builderForValue);
      return this;
    }
    /**
     * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
     */
    public Builder mergeGaiaPasswordReuseEvent(org.chromium.components.sync.protocol.GaiaPasswordReuse value) {
      copyOnWrite();
      instance.mergeGaiaPasswordReuseEvent(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.GaiaPasswordReuse gaia_password_reuse_event = 1;</code>
     */
    public Builder clearGaiaPasswordReuseEvent() {
      copyOnWrite();
      instance.clearGaiaPasswordReuseEvent();
      return this;
    }

    /**
     * <pre>
     * Time of event, as measured by client in microseconds since Windows epoch.
     * </pre>
     *
     * <code>optional int64 event_time_usec = 2;</code>
     */
    public boolean hasEventTimeUsec() {
      return instance.hasEventTimeUsec();
    }
    /**
     * <pre>
     * Time of event, as measured by client in microseconds since Windows epoch.
     * </pre>
     *
     * <code>optional int64 event_time_usec = 2;</code>
     */
    public long getEventTimeUsec() {
      return instance.getEventTimeUsec();
    }
    /**
     * <pre>
     * Time of event, as measured by client in microseconds since Windows epoch.
     * </pre>
     *
     * <code>optional int64 event_time_usec = 2;</code>
     */
    public Builder setEventTimeUsec(long value) {
      copyOnWrite();
      instance.setEventTimeUsec(value);
      return this;
    }
    /**
     * <pre>
     * Time of event, as measured by client in microseconds since Windows epoch.
     * </pre>
     *
     * <code>optional int64 event_time_usec = 2;</code>
     */
    public Builder clearEventTimeUsec() {
      copyOnWrite();
      instance.clearEventTimeUsec();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.SecurityEventSpecifics)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.SecurityEventSpecifics();
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
        org.chromium.components.sync.protocol.SecurityEventSpecifics other = (org.chromium.components.sync.protocol.SecurityEventSpecifics) arg1;
        eventTimeUsec_ = visitor.visitLong(
            hasEventTimeUsec(), eventTimeUsec_,
            other.hasEventTimeUsec(), other.eventTimeUsec_);
        switch (other.getEventCase()) {
          case GAIA_PASSWORD_REUSE_EVENT: {
            event_ = visitor.visitOneofMessage(
                eventCase_ == 1,
                event_,
                other.event_);
            break;
          }
          case EVENT_NOT_SET: {
            visitor.visitOneofNotSet(eventCase_ != 0);
            break;
          }
        }
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          if (other.eventCase_ != 0) {
            eventCase_ = other.eventCase_;
          }
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
                org.chromium.components.sync.protocol.GaiaPasswordReuse.Builder subBuilder = null;
                if (eventCase_ == 1) {
                  subBuilder = ((org.chromium.components.sync.protocol.GaiaPasswordReuse) event_).toBuilder();
                }
                event_ =
                     input.readMessage(org.chromium.components.sync.protocol.GaiaPasswordReuse.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom((org.chromium.components.sync.protocol.GaiaPasswordReuse) event_);
                  event_ = subBuilder.buildPartial();
                }
                eventCase_ = 1;
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                eventTimeUsec_ = input.readInt64();
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.SecurityEventSpecifics.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.SecurityEventSpecifics)
  private static final org.chromium.components.sync.protocol.SecurityEventSpecifics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SecurityEventSpecifics();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.SecurityEventSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SecurityEventSpecifics> PARSER;

  public static com.google.protobuf.Parser<SecurityEventSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
