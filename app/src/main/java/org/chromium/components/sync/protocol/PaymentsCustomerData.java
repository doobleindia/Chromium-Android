// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: autofill_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * <pre>
 * Contains information about a Payments Customer.
 * </pre>
 *
 * Protobuf type {@code sync_pb.PaymentsCustomerData}
 */
public  final class PaymentsCustomerData extends
    com.google.protobuf.GeneratedMessageLite<
        PaymentsCustomerData, PaymentsCustomerData.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.PaymentsCustomerData)
    PaymentsCustomerDataOrBuilder {
  private PaymentsCustomerData() {
    id_ = "";
  }
  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * The billable customer ID associated with the account.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public boolean hasId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <pre>
   * The billable customer ID associated with the account.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * The billable customer ID associated with the account.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * The billable customer ID associated with the account.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void setId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    id_ = value;
  }
  /**
   * <pre>
   * The billable customer ID associated with the account.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void clearId() {
    bitField0_ = (bitField0_ & ~0x00000001);
    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * The billable customer ID associated with the account.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    id_ = value.toStringUtf8();
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getId());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getId());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.PaymentsCustomerData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.PaymentsCustomerData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Contains information about a Payments Customer.
   * </pre>
   *
   * Protobuf type {@code sync_pb.PaymentsCustomerData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.PaymentsCustomerData, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.PaymentsCustomerData)
      org.chromium.components.sync.protocol.PaymentsCustomerDataOrBuilder {
    // Construct using org.chromium.components.sync.protocol.PaymentsCustomerData.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * The billable customer ID associated with the account.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public boolean hasId() {
      return instance.hasId();
    }
    /**
     * <pre>
     * The billable customer ID associated with the account.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * The billable customer ID associated with the account.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * The billable customer ID associated with the account.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * The billable customer ID associated with the account.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * The billable customer ID associated with the account.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.PaymentsCustomerData)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.PaymentsCustomerData();
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
        org.chromium.components.sync.protocol.PaymentsCustomerData other = (org.chromium.components.sync.protocol.PaymentsCustomerData) arg1;
        id_ = visitor.visitString(
            hasId(), id_,
            other.hasId(), other.id_);
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
                String s = input.readString();
                bitField0_ |= 0x00000001;
                id_ = s;
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.PaymentsCustomerData.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.PaymentsCustomerData)
  private static final org.chromium.components.sync.protocol.PaymentsCustomerData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new PaymentsCustomerData();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.PaymentsCustomerData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PaymentsCustomerData> PARSER;

  public static com.google.protobuf.Parser<PaymentsCustomerData> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
