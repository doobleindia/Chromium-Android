// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: encryption.proto

package org.chromium.components.sync.protocol;

public interface EncryptedDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.EncryptedData)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string key_name = 1;</code>
   */
  boolean hasKeyName();
  /**
   * <code>optional string key_name = 1;</code>
   */
  java.lang.String getKeyName();
  /**
   * <code>optional string key_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getKeyNameBytes();

  /**
   * <code>optional string blob = 2;</code>
   */
  boolean hasBlob();
  /**
   * <code>optional string blob = 2;</code>
   */
  java.lang.String getBlob();
  /**
   * <code>optional string blob = 2;</code>
   */
  com.google.protobuf.ByteString
      getBlobBytes();
}
