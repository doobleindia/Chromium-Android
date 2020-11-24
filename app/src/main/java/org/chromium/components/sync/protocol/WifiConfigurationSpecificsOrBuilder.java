// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wifi_configuration_specifics.proto

package org.chromium.components.sync.protocol;

public interface WifiConfigurationSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.WifiConfigurationSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The actual wifi configuration data. Contains an encrypted
   * WifiConfigurationSpecificsData message.
   * </pre>
   *
   * <code>optional .sync_pb.EncryptedData encrypted = 1;</code>
   */
  boolean hasEncrypted();
  /**
   * <pre>
   * The actual wifi configuration data. Contains an encrypted
   * WifiConfigurationSpecificsData message.
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
   * <code>optional .sync_pb.WifiConfigurationSpecificsData client_only_encrypted_data = 2;</code>
   */
  boolean hasClientOnlyEncryptedData();
  /**
   * <pre>
   * An unsynced field for use internally on the client. This field should
   * never be set in any network-based communications because it contains
   * unencrypted material.
   * </pre>
   *
   * <code>optional .sync_pb.WifiConfigurationSpecificsData client_only_encrypted_data = 2;</code>
   */
  org.chromium.components.sync.protocol.WifiConfigurationSpecificsData getClientOnlyEncryptedData();
}