// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: arc_package_specifics.proto

package org.chromium.components.sync.protocol;

public interface ArcPackageSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.ArcPackageSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Unique identifier for the item:
   * Android package name.
   * </pre>
   *
   * <code>optional string package_name = 1;</code>
   */
  boolean hasPackageName();
  /**
   * <pre>
   * Unique identifier for the item:
   * Android package name.
   * </pre>
   *
   * <code>optional string package_name = 1;</code>
   */
  java.lang.String getPackageName();
  /**
   * <pre>
   * Unique identifier for the item:
   * Android package name.
   * </pre>
   *
   * <code>optional string package_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getPackageNameBytes();

  /**
   * <pre>
   * Android package version.
   * </pre>
   *
   * <code>optional int32 package_version = 2;</code>
   */
  boolean hasPackageVersion();
  /**
   * <pre>
   * Android package version.
   * </pre>
   *
   * <code>optional int32 package_version = 2;</code>
   */
  int getPackageVersion();

  /**
   * <pre>
   * Last Android id generated when Android side backups data.
   * </pre>
   *
   * <code>optional int64 last_backup_android_id = 3;</code>
   */
  boolean hasLastBackupAndroidId();
  /**
   * <pre>
   * Last Android id generated when Android side backups data.
   * </pre>
   *
   * <code>optional int64 last_backup_android_id = 3;</code>
   */
  long getLastBackupAndroidId();

  /**
   * <pre>
   * Last time internal value that Android side backups data.
   * </pre>
   *
   * <code>optional int64 last_backup_time = 4;</code>
   */
  boolean hasLastBackupTime();
  /**
   * <pre>
   * Last time internal value that Android side backups data.
   * </pre>
   *
   * <code>optional int64 last_backup_time = 4;</code>
   */
  long getLastBackupTime();
}
