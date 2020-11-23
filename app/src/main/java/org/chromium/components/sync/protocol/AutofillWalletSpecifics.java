// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: autofill_specifics.proto

package org.chromium.components.sync.protocol;

/**
 * Protobuf type {@code sync_pb.AutofillWalletSpecifics}
 */
public  final class AutofillWalletSpecifics extends
    com.google.protobuf.GeneratedMessageLite<
        AutofillWalletSpecifics, AutofillWalletSpecifics.Builder> implements
    // @@protoc_insertion_point(message_implements:sync_pb.AutofillWalletSpecifics)
    AutofillWalletSpecificsOrBuilder {
  private AutofillWalletSpecifics() {
  }
  /**
   * Protobuf enum {@code sync_pb.AutofillWalletSpecifics.WalletInfoType}
   */
  public enum WalletInfoType
      implements com.google.protobuf.Internal.EnumLite {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>MASKED_CREDIT_CARD = 1;</code>
     */
    MASKED_CREDIT_CARD(1),
    /**
     * <code>POSTAL_ADDRESS = 2;</code>
     */
    POSTAL_ADDRESS(2),
    /**
     * <code>CUSTOMER_DATA = 3;</code>
     */
    CUSTOMER_DATA(3),
    /**
     * <code>CREDIT_CARD_CLOUD_TOKEN_DATA = 4;</code>
     */
    CREDIT_CARD_CLOUD_TOKEN_DATA(4),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>MASKED_CREDIT_CARD = 1;</code>
     */
    public static final int MASKED_CREDIT_CARD_VALUE = 1;
    /**
     * <code>POSTAL_ADDRESS = 2;</code>
     */
    public static final int POSTAL_ADDRESS_VALUE = 2;
    /**
     * <code>CUSTOMER_DATA = 3;</code>
     */
    public static final int CUSTOMER_DATA_VALUE = 3;
    /**
     * <code>CREDIT_CARD_CLOUD_TOKEN_DATA = 4;</code>
     */
    public static final int CREDIT_CARD_CLOUD_TOKEN_DATA_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WalletInfoType valueOf(int value) {
      return forNumber(value);
    }

    public static WalletInfoType forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return MASKED_CREDIT_CARD;
        case 2: return POSTAL_ADDRESS;
        case 3: return CUSTOMER_DATA;
        case 4: return CREDIT_CARD_CLOUD_TOKEN_DATA;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WalletInfoType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WalletInfoType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WalletInfoType>() {
            public WalletInfoType findValueByNumber(int number) {
              return WalletInfoType.forNumber(number);
            }
          };

    private final int value;

    private WalletInfoType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:sync_pb.AutofillWalletSpecifics.WalletInfoType)
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>optional .sync_pb.AutofillWalletSpecifics.WalletInfoType type = 1;</code>
   */
  public boolean hasType() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .sync_pb.AutofillWalletSpecifics.WalletInfoType type = 1;</code>
   */
  public org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType getType() {
    org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType result = org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType.forNumber(type_);
    return result == null ? org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType.UNKNOWN : result;
  }
  /**
   * <code>optional .sync_pb.AutofillWalletSpecifics.WalletInfoType type = 1;</code>
   */
  private void setType(org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    bitField0_ |= 0x00000001;
    type_ = value.getNumber();
  }
  /**
   * <code>optional .sync_pb.AutofillWalletSpecifics.WalletInfoType type = 1;</code>
   */
  private void clearType() {
    bitField0_ = (bitField0_ & ~0x00000001);
    type_ = 0;
  }

  public static final int MASKED_CARD_FIELD_NUMBER = 2;
  private org.chromium.components.sync.protocol.WalletMaskedCreditCard maskedCard_;
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * MASKED_CREDIT_CARD.
   * </pre>
   *
   * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
   */
  public boolean hasMaskedCard() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * MASKED_CREDIT_CARD.
   * </pre>
   *
   * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
   */
  public org.chromium.components.sync.protocol.WalletMaskedCreditCard getMaskedCard() {
    return maskedCard_ == null ? org.chromium.components.sync.protocol.WalletMaskedCreditCard.getDefaultInstance() : maskedCard_;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * MASKED_CREDIT_CARD.
   * </pre>
   *
   * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
   */
  private void setMaskedCard(org.chromium.components.sync.protocol.WalletMaskedCreditCard value) {
    if (value == null) {
      throw new NullPointerException();
    }
    maskedCard_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * MASKED_CREDIT_CARD.
   * </pre>
   *
   * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
   */
  private void setMaskedCard(
      org.chromium.components.sync.protocol.WalletMaskedCreditCard.Builder builderForValue) {
    maskedCard_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * MASKED_CREDIT_CARD.
   * </pre>
   *
   * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
   */
  private void mergeMaskedCard(org.chromium.components.sync.protocol.WalletMaskedCreditCard value) {
    if (maskedCard_ != null &&
        maskedCard_ != org.chromium.components.sync.protocol.WalletMaskedCreditCard.getDefaultInstance()) {
      maskedCard_ =
        org.chromium.components.sync.protocol.WalletMaskedCreditCard.newBuilder(maskedCard_).mergeFrom(value).buildPartial();
    } else {
      maskedCard_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * MASKED_CREDIT_CARD.
   * </pre>
   *
   * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
   */
  private void clearMaskedCard() {  maskedCard_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int ADDRESS_FIELD_NUMBER = 3;
  private org.chromium.components.sync.protocol.WalletPostalAddress address_;
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to ADDRESS.
   * </pre>
   *
   * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
   */
  public boolean hasAddress() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to ADDRESS.
   * </pre>
   *
   * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
   */
  public org.chromium.components.sync.protocol.WalletPostalAddress getAddress() {
    return address_ == null ? org.chromium.components.sync.protocol.WalletPostalAddress.getDefaultInstance() : address_;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to ADDRESS.
   * </pre>
   *
   * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
   */
  private void setAddress(org.chromium.components.sync.protocol.WalletPostalAddress value) {
    if (value == null) {
      throw new NullPointerException();
    }
    address_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to ADDRESS.
   * </pre>
   *
   * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
   */
  private void setAddress(
      org.chromium.components.sync.protocol.WalletPostalAddress.Builder builderForValue) {
    address_ = builderForValue.build();
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to ADDRESS.
   * </pre>
   *
   * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
   */
  private void mergeAddress(org.chromium.components.sync.protocol.WalletPostalAddress value) {
    if (address_ != null &&
        address_ != org.chromium.components.sync.protocol.WalletPostalAddress.getDefaultInstance()) {
      address_ =
        org.chromium.components.sync.protocol.WalletPostalAddress.newBuilder(address_).mergeFrom(value).buildPartial();
    } else {
      address_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to ADDRESS.
   * </pre>
   *
   * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
   */
  private void clearAddress() {  address_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static final int CUSTOMER_DATA_FIELD_NUMBER = 4;
  private org.chromium.components.sync.protocol.PaymentsCustomerData customerData_;
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
   */
  public boolean hasCustomerData() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
   */
  public org.chromium.components.sync.protocol.PaymentsCustomerData getCustomerData() {
    return customerData_ == null ? org.chromium.components.sync.protocol.PaymentsCustomerData.getDefaultInstance() : customerData_;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
   */
  private void setCustomerData(org.chromium.components.sync.protocol.PaymentsCustomerData value) {
    if (value == null) {
      throw new NullPointerException();
    }
    customerData_ = value;
    bitField0_ |= 0x00000008;
    }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
   */
  private void setCustomerData(
      org.chromium.components.sync.protocol.PaymentsCustomerData.Builder builderForValue) {
    customerData_ = builderForValue.build();
    bitField0_ |= 0x00000008;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
   */
  private void mergeCustomerData(org.chromium.components.sync.protocol.PaymentsCustomerData value) {
    if (customerData_ != null &&
        customerData_ != org.chromium.components.sync.protocol.PaymentsCustomerData.getDefaultInstance()) {
      customerData_ =
        org.chromium.components.sync.protocol.PaymentsCustomerData.newBuilder(customerData_).mergeFrom(value).buildPartial();
    } else {
      customerData_ = value;
    }
    bitField0_ |= 0x00000008;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
   */
  private void clearCustomerData() {  customerData_ = null;
    bitField0_ = (bitField0_ & ~0x00000008);
  }

  public static final int CLOUD_TOKEN_DATA_FIELD_NUMBER = 5;
  private org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData cloudTokenData_;
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * CREDIT_CARD_CLOUD_TOKEN_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
   */
  public boolean hasCloudTokenData() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * CREDIT_CARD_CLOUD_TOKEN_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
   */
  public org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData getCloudTokenData() {
    return cloudTokenData_ == null ? org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData.getDefaultInstance() : cloudTokenData_;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * CREDIT_CARD_CLOUD_TOKEN_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
   */
  private void setCloudTokenData(org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData value) {
    if (value == null) {
      throw new NullPointerException();
    }
    cloudTokenData_ = value;
    bitField0_ |= 0x00000010;
    }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * CREDIT_CARD_CLOUD_TOKEN_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
   */
  private void setCloudTokenData(
      org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData.Builder builderForValue) {
    cloudTokenData_ = builderForValue.build();
    bitField0_ |= 0x00000010;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * CREDIT_CARD_CLOUD_TOKEN_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
   */
  private void mergeCloudTokenData(org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData value) {
    if (cloudTokenData_ != null &&
        cloudTokenData_ != org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData.getDefaultInstance()) {
      cloudTokenData_ =
        org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData.newBuilder(cloudTokenData_).mergeFrom(value).buildPartial();
    } else {
      cloudTokenData_ = value;
    }
    bitField0_ |= 0x00000010;
  }
  /**
   * <pre>
   * This field exists if and only if the "type" field equals to
   * CREDIT_CARD_CLOUD_TOKEN_DATA.
   * </pre>
   *
   * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
   */
  private void clearCloudTokenData() {  cloudTokenData_ = null;
    bitField0_ = (bitField0_ & ~0x00000010);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeEnum(1, type_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(2, getMaskedCard());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeMessage(3, getAddress());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeMessage(4, getCustomerData());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeMessage(5, getCloudTokenData());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMaskedCard());
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAddress());
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCustomerData());
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCloudTokenData());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.components.sync.protocol.AutofillWalletSpecifics prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code sync_pb.AutofillWalletSpecifics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.components.sync.protocol.AutofillWalletSpecifics, Builder> implements
      // @@protoc_insertion_point(builder_implements:sync_pb.AutofillWalletSpecifics)
      org.chromium.components.sync.protocol.AutofillWalletSpecificsOrBuilder {
    // Construct using org.chromium.components.sync.protocol.AutofillWalletSpecifics.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional .sync_pb.AutofillWalletSpecifics.WalletInfoType type = 1;</code>
     */
    public boolean hasType() {
      return instance.hasType();
    }
    /**
     * <code>optional .sync_pb.AutofillWalletSpecifics.WalletInfoType type = 1;</code>
     */
    public org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType getType() {
      return instance.getType();
    }
    /**
     * <code>optional .sync_pb.AutofillWalletSpecifics.WalletInfoType type = 1;</code>
     */
    public Builder setType(org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>optional .sync_pb.AutofillWalletSpecifics.WalletInfoType type = 1;</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * MASKED_CREDIT_CARD.
     * </pre>
     *
     * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
     */
    public boolean hasMaskedCard() {
      return instance.hasMaskedCard();
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * MASKED_CREDIT_CARD.
     * </pre>
     *
     * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
     */
    public org.chromium.components.sync.protocol.WalletMaskedCreditCard getMaskedCard() {
      return instance.getMaskedCard();
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * MASKED_CREDIT_CARD.
     * </pre>
     *
     * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
     */
    public Builder setMaskedCard(org.chromium.components.sync.protocol.WalletMaskedCreditCard value) {
      copyOnWrite();
      instance.setMaskedCard(value);
      return this;
      }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * MASKED_CREDIT_CARD.
     * </pre>
     *
     * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
     */
    public Builder setMaskedCard(
        org.chromium.components.sync.protocol.WalletMaskedCreditCard.Builder builderForValue) {
      copyOnWrite();
      instance.setMaskedCard(builderForValue);
      return this;
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * MASKED_CREDIT_CARD.
     * </pre>
     *
     * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
     */
    public Builder mergeMaskedCard(org.chromium.components.sync.protocol.WalletMaskedCreditCard value) {
      copyOnWrite();
      instance.mergeMaskedCard(value);
      return this;
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * MASKED_CREDIT_CARD.
     * </pre>
     *
     * <code>optional .sync_pb.WalletMaskedCreditCard masked_card = 2;</code>
     */
    public Builder clearMaskedCard() {  copyOnWrite();
      instance.clearMaskedCard();
      return this;
    }

    /**
     * <pre>
     * This field exists if and only if the "type" field equals to ADDRESS.
     * </pre>
     *
     * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
     */
    public boolean hasAddress() {
      return instance.hasAddress();
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to ADDRESS.
     * </pre>
     *
     * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
     */
    public org.chromium.components.sync.protocol.WalletPostalAddress getAddress() {
      return instance.getAddress();
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to ADDRESS.
     * </pre>
     *
     * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
     */
    public Builder setAddress(org.chromium.components.sync.protocol.WalletPostalAddress value) {
      copyOnWrite();
      instance.setAddress(value);
      return this;
      }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to ADDRESS.
     * </pre>
     *
     * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
     */
    public Builder setAddress(
        org.chromium.components.sync.protocol.WalletPostalAddress.Builder builderForValue) {
      copyOnWrite();
      instance.setAddress(builderForValue);
      return this;
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to ADDRESS.
     * </pre>
     *
     * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
     */
    public Builder mergeAddress(org.chromium.components.sync.protocol.WalletPostalAddress value) {
      copyOnWrite();
      instance.mergeAddress(value);
      return this;
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to ADDRESS.
     * </pre>
     *
     * <code>optional .sync_pb.WalletPostalAddress address = 3;</code>
     */
    public Builder clearAddress() {  copyOnWrite();
      instance.clearAddress();
      return this;
    }

    /**
     * <pre>
     * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
     */
    public boolean hasCustomerData() {
      return instance.hasCustomerData();
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
     */
    public org.chromium.components.sync.protocol.PaymentsCustomerData getCustomerData() {
      return instance.getCustomerData();
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
     */
    public Builder setCustomerData(org.chromium.components.sync.protocol.PaymentsCustomerData value) {
      copyOnWrite();
      instance.setCustomerData(value);
      return this;
      }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
     */
    public Builder setCustomerData(
        org.chromium.components.sync.protocol.PaymentsCustomerData.Builder builderForValue) {
      copyOnWrite();
      instance.setCustomerData(builderForValue);
      return this;
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
     */
    public Builder mergeCustomerData(org.chromium.components.sync.protocol.PaymentsCustomerData value) {
      copyOnWrite();
      instance.mergeCustomerData(value);
      return this;
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to CUSTOMER_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.PaymentsCustomerData customer_data = 4;</code>
     */
    public Builder clearCustomerData() {  copyOnWrite();
      instance.clearCustomerData();
      return this;
    }

    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * CREDIT_CARD_CLOUD_TOKEN_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
     */
    public boolean hasCloudTokenData() {
      return instance.hasCloudTokenData();
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * CREDIT_CARD_CLOUD_TOKEN_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
     */
    public org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData getCloudTokenData() {
      return instance.getCloudTokenData();
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * CREDIT_CARD_CLOUD_TOKEN_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
     */
    public Builder setCloudTokenData(org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData value) {
      copyOnWrite();
      instance.setCloudTokenData(value);
      return this;
      }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * CREDIT_CARD_CLOUD_TOKEN_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
     */
    public Builder setCloudTokenData(
        org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData.Builder builderForValue) {
      copyOnWrite();
      instance.setCloudTokenData(builderForValue);
      return this;
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * CREDIT_CARD_CLOUD_TOKEN_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
     */
    public Builder mergeCloudTokenData(org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData value) {
      copyOnWrite();
      instance.mergeCloudTokenData(value);
      return this;
    }
    /**
     * <pre>
     * This field exists if and only if the "type" field equals to
     * CREDIT_CARD_CLOUD_TOKEN_DATA.
     * </pre>
     *
     * <code>optional .sync_pb.WalletCreditCardCloudTokenData cloud_token_data = 5;</code>
     */
    public Builder clearCloudTokenData() {  copyOnWrite();
      instance.clearCloudTokenData();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:sync_pb.AutofillWalletSpecifics)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.components.sync.protocol.AutofillWalletSpecifics();
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
        org.chromium.components.sync.protocol.AutofillWalletSpecifics other = (org.chromium.components.sync.protocol.AutofillWalletSpecifics) arg1;
        type_ = visitor.visitInt(hasType(), type_,
            other.hasType(), other.type_);
        maskedCard_ = visitor.visitMessage(maskedCard_, other.maskedCard_);
        address_ = visitor.visitMessage(address_, other.address_);
        customerData_ = visitor.visitMessage(customerData_, other.customerData_);
        cloudTokenData_ = visitor.visitMessage(cloudTokenData_, other.cloudTokenData_);
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
                org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType value = org.chromium.components.sync.protocol.AutofillWalletSpecifics.WalletInfoType.forNumber(rawValue);
                if (value == null) {
                  super.mergeVarintField(1, rawValue);
                } else {
                  bitField0_ |= 0x00000001;
                  type_ = rawValue;
                }
                break;
              }
              case 18: {
                org.chromium.components.sync.protocol.WalletMaskedCreditCard.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = maskedCard_.toBuilder();
                }
                maskedCard_ = input.readMessage(org.chromium.components.sync.protocol.WalletMaskedCreditCard.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(maskedCard_);
                  maskedCard_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 26: {
                org.chromium.components.sync.protocol.WalletPostalAddress.Builder subBuilder = null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = address_.toBuilder();
                }
                address_ = input.readMessage(org.chromium.components.sync.protocol.WalletPostalAddress.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(address_);
                  address_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
              case 34: {
                org.chromium.components.sync.protocol.PaymentsCustomerData.Builder subBuilder = null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = customerData_.toBuilder();
                }
                customerData_ = input.readMessage(org.chromium.components.sync.protocol.PaymentsCustomerData.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(customerData_);
                  customerData_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
              case 42: {
                org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData.Builder subBuilder = null;
                if (((bitField0_ & 0x00000010) == 0x00000010)) {
                  subBuilder = cloudTokenData_.toBuilder();
                }
                cloudTokenData_ = input.readMessage(org.chromium.components.sync.protocol.WalletCreditCardCloudTokenData.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(cloudTokenData_);
                  cloudTokenData_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000010;
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
        if (PARSER == null) {    synchronized (org.chromium.components.sync.protocol.AutofillWalletSpecifics.class) {
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


  // @@protoc_insertion_point(class_scope:sync_pb.AutofillWalletSpecifics)
  private static final org.chromium.components.sync.protocol.AutofillWalletSpecifics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AutofillWalletSpecifics();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.components.sync.protocol.AutofillWalletSpecifics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AutofillWalletSpecifics> PARSER;

  public static com.google.protobuf.Parser<AutofillWalletSpecifics> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

