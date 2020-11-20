// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: components/feed/core/proto/wire/feed_query.proto

package org.chromium.components.feed.core.proto.wire;

public final class FeedQueryProto {
  private FeedQueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface FeedQueryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:components.feed.core.proto.wire.FeedQuery)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
     */
    boolean hasReason();
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
     */
    org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason getReason();

    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * Token.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    boolean hasPageToken();
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * Token.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    com.google.protobuf.ByteString getPageToken();
  }
  /**
   * Protobuf type {@code components.feed.core.proto.wire.FeedQuery}
   */
  public  static final class FeedQuery extends
      com.google.protobuf.GeneratedMessageLite<
          FeedQuery, FeedQuery.Builder> implements
      // @@protoc_insertion_point(message_implements:components.feed.core.proto.wire.FeedQuery)
      FeedQueryOrBuilder {
    private FeedQuery() {
      pageToken_ = com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * Protobuf enum {@code components.feed.core.proto.wire.FeedQuery.RequestReason}
     */
    public enum RequestReason
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <pre>
       * Bucket for any not listed. Should not be used (prefer adding a new
       * request reason)
       * </pre>
       *
       * <code>UNKNOWN_REQUEST_REASON = 0;</code>
       */
      UNKNOWN_REQUEST_REASON(0),
      /**
       * <pre>
       * App is manually triggering a request, outside of scheduling a request.
       * Should be used rarely.
       * </pre>
       *
       * <code>MANUAL_REFRESH = 1;</code>
       */
      MANUAL_REFRESH(1),
      /**
       * <pre>
       * Host wants a request to refresh content.
       * </pre>
       *
       * <code>SCHEDULED_REFRESH = 2;</code>
       */
      SCHEDULED_REFRESH(2),
      /**
       * <pre>
       * Loading more content (should be deprecated soon for more clarity behind
       * reason).
       * </pre>
       *
       * <code>NEXT_PAGE_SCROLL = 4;</code>
       */
      NEXT_PAGE_SCROLL(4),
      /**
       * <pre>
       * Refresh after clearing all content
       * </pre>
       *
       * <code>CLEAR_ALL = 5;</code>
       */
      CLEAR_ALL(5),
      /**
       * <pre>
       * Refresh from zero state (no content)
       * </pre>
       *
       * <code>ZERO_STATE_REFRESH = 6;</code>
       */
      ZERO_STATE_REFRESH(6),
      /**
       * <pre>
       * Initial loading of content for a session
       * </pre>
       *
       * <code>INITIAL_LOAD = 7;</code>
       */
      INITIAL_LOAD(7),
      /**
       * <pre>
       * Loading new content (while displaying existing content)
       * </pre>
       *
       * <code>WITH_CONTENT = 8;</code>
       */
      WITH_CONTENT(8),
      ;

      /**
       * <pre>
       * Bucket for any not listed. Should not be used (prefer adding a new
       * request reason)
       * </pre>
       *
       * <code>UNKNOWN_REQUEST_REASON = 0;</code>
       */
      public static final int UNKNOWN_REQUEST_REASON_VALUE = 0;
      /**
       * <pre>
       * App is manually triggering a request, outside of scheduling a request.
       * Should be used rarely.
       * </pre>
       *
       * <code>MANUAL_REFRESH = 1;</code>
       */
      public static final int MANUAL_REFRESH_VALUE = 1;
      /**
       * <pre>
       * Host wants a request to refresh content.
       * </pre>
       *
       * <code>SCHEDULED_REFRESH = 2;</code>
       */
      public static final int SCHEDULED_REFRESH_VALUE = 2;
      /**
       * <pre>
       * Loading more content (should be deprecated soon for more clarity behind
       * reason).
       * </pre>
       *
       * <code>NEXT_PAGE_SCROLL = 4;</code>
       */
      public static final int NEXT_PAGE_SCROLL_VALUE = 4;
      /**
       * <pre>
       * Refresh after clearing all content
       * </pre>
       *
       * <code>CLEAR_ALL = 5;</code>
       */
      public static final int CLEAR_ALL_VALUE = 5;
      /**
       * <pre>
       * Refresh from zero state (no content)
       * </pre>
       *
       * <code>ZERO_STATE_REFRESH = 6;</code>
       */
      public static final int ZERO_STATE_REFRESH_VALUE = 6;
      /**
       * <pre>
       * Initial loading of content for a session
       * </pre>
       *
       * <code>INITIAL_LOAD = 7;</code>
       */
      public static final int INITIAL_LOAD_VALUE = 7;
      /**
       * <pre>
       * Loading new content (while displaying existing content)
       * </pre>
       *
       * <code>WITH_CONTENT = 8;</code>
       */
      public static final int WITH_CONTENT_VALUE = 8;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RequestReason valueOf(int value) {
        return forNumber(value);
      }

      public static RequestReason forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN_REQUEST_REASON;
          case 1: return MANUAL_REFRESH;
          case 2: return SCHEDULED_REFRESH;
          case 4: return NEXT_PAGE_SCROLL;
          case 5: return CLEAR_ALL;
          case 6: return ZERO_STATE_REFRESH;
          case 7: return INITIAL_LOAD;
          case 8: return WITH_CONTENT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RequestReason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          RequestReason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RequestReason>() {
              public RequestReason findValueByNumber(int number) {
                return RequestReason.forNumber(number);
              }
            };

      private final int value;

      private RequestReason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:components.feed.core.proto.wire.FeedQuery.RequestReason)
    }

    private int bitField0_;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
     */
    public boolean hasReason() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
     */
    public org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason getReason() {
      org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason result = org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason.forNumber(reason_);
      return result == null ? org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason.UNKNOWN_REQUEST_REASON : result;
    }
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
     */
    private void setReason(org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      reason_ = value.getNumber();
    }
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
     */
    private void clearReason() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reason_ = 0;
    }

    public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString pageToken_;
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * Token.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    public boolean hasPageToken() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * Token.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getPageToken() {
      return pageToken_;
    }
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * Token.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    private void setPageToken(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      pageToken_ = value;
    }
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * Token.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    private void clearPageToken() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pageToken_ = getDefaultInstance().getPageToken();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, reason_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, pageToken_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, reason_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, pageToken_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code components.feed.core.proto.wire.FeedQuery}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery, Builder> implements
        // @@protoc_insertion_point(builder_implements:components.feed.core.proto.wire.FeedQuery)
        org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQueryOrBuilder {
      // Construct using org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * The reason the query is being initiated.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
       */
      public boolean hasReason() {
        return instance.hasReason();
      }
      /**
       * <pre>
       * The reason the query is being initiated.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
       */
      public org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason getReason() {
        return instance.getReason();
      }
      /**
       * <pre>
       * The reason the query is being initiated.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
       */
      public Builder setReason(org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason value) {
        copyOnWrite();
        instance.setReason(value);
        return this;
      }
      /**
       * <pre>
       * The reason the query is being initiated.
       * </pre>
       *
       * <code>optional .components.feed.core.proto.wire.FeedQuery.RequestReason reason = 1;</code>
       */
      public Builder clearReason() {
        copyOnWrite();
        instance.clearReason();
        return this;
      }

      /**
       * <pre>
       * Used to fetch the next page when scrolling copied from
       * Token.next_page_token
       * </pre>
       *
       * <code>optional bytes page_token = 2;</code>
       */
      public boolean hasPageToken() {
        return instance.hasPageToken();
      }
      /**
       * <pre>
       * Used to fetch the next page when scrolling copied from
       * Token.next_page_token
       * </pre>
       *
       * <code>optional bytes page_token = 2;</code>
       */
      public com.google.protobuf.ByteString getPageToken() {
        return instance.getPageToken();
      }
      /**
       * <pre>
       * Used to fetch the next page when scrolling copied from
       * Token.next_page_token
       * </pre>
       *
       * <code>optional bytes page_token = 2;</code>
       */
      public Builder setPageToken(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPageToken(value);
        return this;
      }
      /**
       * <pre>
       * Used to fetch the next page when scrolling copied from
       * Token.next_page_token
       * </pre>
       *
       * <code>optional bytes page_token = 2;</code>
       */
      public Builder clearPageToken() {
        copyOnWrite();
        instance.clearPageToken();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:components.feed.core.proto.wire.FeedQuery)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery();
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
          org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery other = (org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery) arg1;
          reason_ = visitor.visitInt(hasReason(), reason_,
              other.hasReason(), other.reason_);
          pageToken_ = visitor.visitByteString(
              hasPageToken(), pageToken_,
              other.hasPageToken(), other.pageToken_);
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
                  org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason value = org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.RequestReason.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(1, rawValue);
                  } else {
                    bitField0_ |= 0x00000001;
                    reason_ = rawValue;
                  }
                  break;
                }
                case 18: {
                  bitField0_ |= 0x00000002;
                  pageToken_ = input.readBytes();
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
          if (PARSER == null) {    synchronized (org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery.class) {
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


    // @@protoc_insertion_point(class_scope:components.feed.core.proto.wire.FeedQuery)
    private static final org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new FeedQuery();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static org.chromium.components.feed.core.proto.wire.FeedQueryProto.FeedQuery getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<FeedQuery> PARSER;

    public static com.google.protobuf.Parser<FeedQuery> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
