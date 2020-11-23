// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model_type_state.proto

package org.chromium.components.sync.protocol;

public interface ModelTypeStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ModelTypeState)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The latest progress markers received from the server.
   * </pre>
   *
   * <code>optional .sync_pb.DataTypeProgressMarker progress_marker = 1;</code>
   */
  boolean hasProgressMarker();
  /**
   * <pre>
   * The latest progress markers received from the server.
   * </pre>
   *
   * <code>optional .sync_pb.DataTypeProgressMarker progress_marker = 1;</code>
   */
  org.chromium.components.sync.protocol.DataTypeProgressMarker getProgressMarker();

  /**
   * <pre>
   * A data type context.  Sent to the server in every commit or update
   * request.  May be updated by either responses from the server or requests
   * made on the model thread.  The interpretation of this value may be
   * data-type specific.  Many data types ignore it.
   * </pre>
   *
   * <code>optional .sync_pb.DataTypeContext type_context = 2;</code>
   */
  boolean hasTypeContext();
  /**
   * <pre>
   * A data type context.  Sent to the server in every commit or update
   * request.  May be updated by either responses from the server or requests
   * made on the model thread.  The interpretation of this value may be
   * data-type specific.  Many data types ignore it.
   * </pre>
   *
   * <code>optional .sync_pb.DataTypeContext type_context = 2;</code>
   */
  org.chromium.components.sync.protocol.DataTypeContext getTypeContext();

  /**
   * <pre>
   * This value is set if this type's data should be encrypted on the server.
   * If this key changes, the client will need to re-commit all of its local
   * data to the server using the new encryption key.
   * </pre>
   *
   * <code>optional string encryption_key_name = 3;</code>
   */
  boolean hasEncryptionKeyName();
  /**
   * <pre>
   * This value is set if this type's data should be encrypted on the server.
   * If this key changes, the client will need to re-commit all of its local
   * data to the server using the new encryption key.
   * </pre>
   *
   * <code>optional string encryption_key_name = 3;</code>
   */
  java.lang.String getEncryptionKeyName();
  /**
   * <pre>
   * This value is set if this type's data should be encrypted on the server.
   * If this key changes, the client will need to re-commit all of its local
   * data to the server using the new encryption key.
   * </pre>
   *
   * <code>optional string encryption_key_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getEncryptionKeyNameBytes();

  /**
   * <pre>
   * This flag is set to true when the first download cycle is complete.  The
   * ModelTypeProcessor should not attempt to commit any items until this
   * flag is set.
   * </pre>
   *
   * <code>optional bool initial_sync_done = 4;</code>
   */
  boolean hasInitialSyncDone();
  /**
   * <pre>
   * This flag is set to true when the first download cycle is complete.  The
   * ModelTypeProcessor should not attempt to commit any items until this
   * flag is set.
   * </pre>
   *
   * <code>optional bool initial_sync_done = 4;</code>
   */
  boolean getInitialSyncDone();

  /**
   * <pre>
   * A GUID that identifies the committing sync client. It's persisted within
   * the sync metadata and should be used to check the integrity of the
   * metadata. Mismatches with the guid of the running client indicates invalid
   * persisted sync metadata, because cache_guid is reset when sync is disabled,
   * and disabling sync is supposed to clear sync metadata.
   * </pre>
   *
   * <code>optional string cache_guid = 5;</code>
   */
  boolean hasCacheGuid();
  /**
   * <pre>
   * A GUID that identifies the committing sync client. It's persisted within
   * the sync metadata and should be used to check the integrity of the
   * metadata. Mismatches with the guid of the running client indicates invalid
   * persisted sync metadata, because cache_guid is reset when sync is disabled,
   * and disabling sync is supposed to clear sync metadata.
   * </pre>
   *
   * <code>optional string cache_guid = 5;</code>
   */
  java.lang.String getCacheGuid();
  /**
   * <pre>
   * A GUID that identifies the committing sync client. It's persisted within
   * the sync metadata and should be used to check the integrity of the
   * metadata. Mismatches with the guid of the running client indicates invalid
   * persisted sync metadata, because cache_guid is reset when sync is disabled,
   * and disabling sync is supposed to clear sync metadata.
   * </pre>
   *
   * <code>optional string cache_guid = 5;</code>
   */
  com.google.protobuf.ByteString
      getCacheGuidBytes();

  /**
   * <pre>
   * Syncing account ID, representing the user.
   * </pre>
   *
   * <code>optional string authenticated_account_id = 6;</code>
   */
  boolean hasAuthenticatedAccountId();
  /**
   * <pre>
   * Syncing account ID, representing the user.
   * </pre>
   *
   * <code>optional string authenticated_account_id = 6;</code>
   */
  java.lang.String getAuthenticatedAccountId();
  /**
   * <pre>
   * Syncing account ID, representing the user.
   * </pre>
   *
   * <code>optional string authenticated_account_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getAuthenticatedAccountIdBytes();
}
