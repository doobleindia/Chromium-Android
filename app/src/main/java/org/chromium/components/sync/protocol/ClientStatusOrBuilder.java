// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sync.proto

package org.chromium.components.sync.protocol;

public interface ClientStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ClientStatus)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Flag to indicate if the client has detected hierarchy conflcits.  The flag
   * is left unset if update application has not been attempted yet.
   * The server should attempt to resolve any hierarchy conflicts when this flag
   * is set.  The client may not assume that any particular action will be
   * taken.  There is no guarantee the problem will be addressed in a reasonable
   * amount of time.
   * </pre>
   *
   * <code>optional bool hierarchy_conflict_detected = 1;</code>
   */
  boolean hasHierarchyConflictDetected();
  /**
   * <pre>
   * Flag to indicate if the client has detected hierarchy conflcits.  The flag
   * is left unset if update application has not been attempted yet.
   * The server should attempt to resolve any hierarchy conflicts when this flag
   * is set.  The client may not assume that any particular action will be
   * taken.  There is no guarantee the problem will be addressed in a reasonable
   * amount of time.
   * </pre>
   *
   * <code>optional bool hierarchy_conflict_detected = 1;</code>
   */
  boolean getHierarchyConflictDetected();

  /**
   * <pre>
   * Whether the client has full sync (or, sync the feature) enabled or not.
   * </pre>
   *
   * <code>optional bool is_sync_feature_enabled = 2;</code>
   */
  boolean hasIsSyncFeatureEnabled();
  /**
   * <pre>
   * Whether the client has full sync (or, sync the feature) enabled or not.
   * </pre>
   *
   * <code>optional bool is_sync_feature_enabled = 2;</code>
   */
  boolean getIsSyncFeatureEnabled();
}