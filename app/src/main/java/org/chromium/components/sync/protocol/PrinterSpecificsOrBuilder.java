// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: printer_specifics.proto

package org.chromium.components.sync.protocol;

public interface PrinterSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.PrinterSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * Printer record GUID
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Printer record GUID
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * Printer record GUID
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * User visible name.  Any string.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  boolean hasDisplayName();
  /**
   * <pre>
   * User visible name.  Any string.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * User visible name.  Any string.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * User visible description.  Any string.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  boolean hasDescription();
  /**
   * <pre>
   * User visible description.  Any string.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * User visible description.  Any string.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Printer manufacturer.  Should be a known manufacturuer.
   * Deprecated in favor of make_and_model.
   * </pre>
   *
   * <code>optional string manufacturer = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasManufacturer();
  /**
   * <pre>
   * Printer manufacturer.  Should be a known manufacturuer.
   * Deprecated in favor of make_and_model.
   * </pre>
   *
   * <code>optional string manufacturer = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getManufacturer();
  /**
   * <pre>
   * Printer manufacturer.  Should be a known manufacturuer.
   * Deprecated in favor of make_and_model.
   * </pre>
   *
   * <code>optional string manufacturer = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getManufacturerBytes();

  /**
   * <pre>
   * Printer model.  Should match a known model for the manufacturer.
   * Deprecated in favor of make_and_model.
   * </pre>
   *
   * <code>optional string model = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasModel();
  /**
   * <pre>
   * Printer model.  Should match a known model for the manufacturer.
   * Deprecated in favor of make_and_model.
   * </pre>
   *
   * <code>optional string model = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getModel();
  /**
   * <pre>
   * Printer model.  Should match a known model for the manufacturer.
   * Deprecated in favor of make_and_model.
   * </pre>
   *
   * <code>optional string model = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <pre>
   * Universal Resource Identifier for the printer on the network.  usb:// will
   * be the scheme for USB printers.  Example
   * ipp://address.example:port/queue/queue/queue.
   * </pre>
   *
   * <code>optional string uri = 6;</code>
   */
  boolean hasUri();
  /**
   * <pre>
   * Universal Resource Identifier for the printer on the network.  usb:// will
   * be the scheme for USB printers.  Example
   * ipp://address.example:port/queue/queue/queue.
   * </pre>
   *
   * <code>optional string uri = 6;</code>
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Universal Resource Identifier for the printer on the network.  usb:// will
   * be the scheme for USB printers.  Example
   * ipp://address.example:port/queue/queue/queue.
   * </pre>
   *
   * <code>optional string uri = 6;</code>
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * Universally Unique Identifier provided by the printer.  Used for unique
   * identification of printers in a zeroconf environment.
   * </pre>
   *
   * <code>optional string uuid = 7;</code>
   */
  boolean hasUuid();
  /**
   * <pre>
   * Universally Unique Identifier provided by the printer.  Used for unique
   * identification of printers in a zeroconf environment.
   * </pre>
   *
   * <code>optional string uuid = 7;</code>
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * Universally Unique Identifier provided by the printer.  Used for unique
   * identification of printers in a zeroconf environment.
   * </pre>
   *
   * <code>optional string uuid = 7;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * PPDData was deprecated in favor of PPDReference format.
   * </pre>
   *
   * <code>optional bytes ppd = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasPpd();
  /**
   * <pre>
   * PPDData was deprecated in favor of PPDReference format.
   * </pre>
   *
   * <code>optional bytes ppd = 8 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString getPpd();

  /**
   * <pre>
   * Structure representing the user's ppd configuration.
   * </pre>
   *
   * <code>optional .sync_pb.PrinterPPDReference ppd_reference = 9;</code>
   */
  boolean hasPpdReference();
  /**
   * <pre>
   * Structure representing the user's ppd configuration.
   * </pre>
   *
   * <code>optional .sync_pb.PrinterPPDReference ppd_reference = 9;</code>
   */
  org.chromium.components.sync.protocol.PrinterPPDReference getPpdReference();

  /**
   * <pre>
   * Timestamp when printer was last updated.
   * </pre>
   *
   * <code>optional int64 updated_timestamp = 10;</code>
   */
  boolean hasUpdatedTimestamp();
  /**
   * <pre>
   * Timestamp when printer was last updated.
   * </pre>
   *
   * <code>optional int64 updated_timestamp = 10;</code>
   */
  long getUpdatedTimestamp();

  /**
   * <pre>
   * The make and model of the printer in one string.  The typical arrangement
   * for this is '&lt;make&gt; &lt;model&gt;'.  This aligns with the typical formatting of
   * the IPP attribute printer-make-and-model.
   * </pre>
   *
   * <code>optional string make_and_model = 11;</code>
   */
  boolean hasMakeAndModel();
  /**
   * <pre>
   * The make and model of the printer in one string.  The typical arrangement
   * for this is '&lt;make&gt; &lt;model&gt;'.  This aligns with the typical formatting of
   * the IPP attribute printer-make-and-model.
   * </pre>
   *
   * <code>optional string make_and_model = 11;</code>
   */
  java.lang.String getMakeAndModel();
  /**
   * <pre>
   * The make and model of the printer in one string.  The typical arrangement
   * for this is '&lt;make&gt; &lt;model&gt;'.  This aligns with the typical formatting of
   * the IPP attribute printer-make-and-model.
   * </pre>
   *
   * <code>optional string make_and_model = 11;</code>
   */
  com.google.protobuf.ByteString
      getMakeAndModelBytes();

  /**
   * <pre>
   * Universal Resource Identifier for the print server on the network.  This
   * will only be populated if the printer is from a print server.  Example
   * ipp://address.example:port/
   * </pre>
   *
   * <code>optional string print_server_uri = 12;</code>
   */
  boolean hasPrintServerUri();
  /**
   * <pre>
   * Universal Resource Identifier for the print server on the network.  This
   * will only be populated if the printer is from a print server.  Example
   * ipp://address.example:port/
   * </pre>
   *
   * <code>optional string print_server_uri = 12;</code>
   */
  java.lang.String getPrintServerUri();
  /**
   * <pre>
   * Universal Resource Identifier for the print server on the network.  This
   * will only be populated if the printer is from a print server.  Example
   * ipp://address.example:port/
   * </pre>
   *
   * <code>optional string print_server_uri = 12;</code>
   */
  com.google.protobuf.ByteString
      getPrintServerUriBytes();
}
