// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: password_specifics.proto

package org.chromium.components.sync.protocol;

public interface PasswordSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.PasswordSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The actual password data. Contains an encrypted PasswordSpecificsData
   * message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  boolean hasEncrypted();
  /**
   * <pre>
   * The actual password data. Contains an encrypted PasswordSpecificsData
   * message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  org.chromium.components.sync.protocol.EncryptedData getEncrypted();

  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
   */
  boolean hasClientOnlyEncryptedData();
  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsData client_only_encrypted_data = 2;</code>
   */
  org.chromium.components.sync.protocol.PasswordSpecificsData getClientOnlyEncryptedData();

  /**
   * <pre>
   * Password related metadata, which is sent to the server side. The field
   * should never be set for full encryption users. If encryption is enabled,
   * this field must be cleared.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
   */
  boolean hasUnencryptedMetadata();
  /**
   * <pre>
   * Password related metadata, which is sent to the server side. The field
   * should never be set for full encryption users. If encryption is enabled,
   * this field must be cleared.
   * </pre>
   *
   * <code>optional .sync_pb.PasswordSpecificsMetadata unencrypted_metadata = 3;</code>
   */
  org.chromium.components.sync.protocol.PasswordSpecificsMetadata getUnencryptedMetadata();
}