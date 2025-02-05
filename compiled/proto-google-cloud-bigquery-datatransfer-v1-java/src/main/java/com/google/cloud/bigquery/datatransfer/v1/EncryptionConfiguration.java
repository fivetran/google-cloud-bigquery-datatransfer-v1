// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * Represents the encryption configuration for a transfer.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration}
 */
public final class EncryptionConfiguration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration)
    EncryptionConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncryptionConfiguration.newBuilder() to construct.
  private EncryptionConfiguration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncryptionConfiguration() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncryptionConfiguration();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.TransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration.class, com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration.Builder.class);
  }

  private int bitField0_;
  public static final int KMS_KEY_NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue kmsKeyName_;
  /**
   * <pre>
   * The name of the KMS key used for encrypting BigQuery data.
   * </pre>
   *
   * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
   * @return Whether the kmsKeyName field is set.
   */
  @java.lang.Override
  public boolean hasKmsKeyName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The name of the KMS key used for encrypting BigQuery data.
   * </pre>
   *
   * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
   * @return The kmsKeyName.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getKmsKeyName() {
    return kmsKeyName_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : kmsKeyName_;
  }
  /**
   * <pre>
   * The name of the KMS key used for encrypting BigQuery data.
   * </pre>
   *
   * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getKmsKeyNameOrBuilder() {
    return kmsKeyName_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : kmsKeyName_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getKmsKeyName());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKmsKeyName());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration other = (com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration) obj;

    if (hasKmsKeyName() != other.hasKmsKeyName()) return false;
    if (hasKmsKeyName()) {
      if (!getKmsKeyName()
          .equals(other.getKmsKeyName())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasKmsKeyName()) {
      hash = (37 * hash) + KMS_KEY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getKmsKeyName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Represents the encryption configuration for a transfer.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration)
      com.google.cloud.bigquery.datatransfer.v1.EncryptionConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration.class, com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getKmsKeyNameFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      kmsKeyName_ = null;
      if (kmsKeyNameBuilder_ != null) {
        kmsKeyNameBuilder_.dispose();
        kmsKeyNameBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.TransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_EncryptionConfiguration_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration build() {
      com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration result = new com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.kmsKeyName_ = kmsKeyNameBuilder_ == null
            ? kmsKeyName_
            : kmsKeyNameBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration.getDefaultInstance()) return this;
      if (other.hasKmsKeyName()) {
        mergeKmsKeyName(other.getKmsKeyName());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getKmsKeyNameFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.StringValue kmsKeyName_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> kmsKeyNameBuilder_;
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     * @return Whether the kmsKeyName field is set.
     */
    public boolean hasKmsKeyName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     * @return The kmsKeyName.
     */
    public com.google.protobuf.StringValue getKmsKeyName() {
      if (kmsKeyNameBuilder_ == null) {
        return kmsKeyName_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : kmsKeyName_;
      } else {
        return kmsKeyNameBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     */
    public Builder setKmsKeyName(com.google.protobuf.StringValue value) {
      if (kmsKeyNameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kmsKeyName_ = value;
      } else {
        kmsKeyNameBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     */
    public Builder setKmsKeyName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (kmsKeyNameBuilder_ == null) {
        kmsKeyName_ = builderForValue.build();
      } else {
        kmsKeyNameBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     */
    public Builder mergeKmsKeyName(com.google.protobuf.StringValue value) {
      if (kmsKeyNameBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          kmsKeyName_ != null &&
          kmsKeyName_ != com.google.protobuf.StringValue.getDefaultInstance()) {
          getKmsKeyNameBuilder().mergeFrom(value);
        } else {
          kmsKeyName_ = value;
        }
      } else {
        kmsKeyNameBuilder_.mergeFrom(value);
      }
      if (kmsKeyName_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     */
    public Builder clearKmsKeyName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      kmsKeyName_ = null;
      if (kmsKeyNameBuilder_ != null) {
        kmsKeyNameBuilder_.dispose();
        kmsKeyNameBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getKmsKeyNameBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getKmsKeyNameFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getKmsKeyNameOrBuilder() {
      if (kmsKeyNameBuilder_ != null) {
        return kmsKeyNameBuilder_.getMessageOrBuilder();
      } else {
        return kmsKeyName_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : kmsKeyName_;
      }
    }
    /**
     * <pre>
     * The name of the KMS key used for encrypting BigQuery data.
     * </pre>
     *
     * <code>.google.protobuf.StringValue kms_key_name = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getKmsKeyNameFieldBuilder() {
      if (kmsKeyNameBuilder_ == null) {
        kmsKeyNameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getKmsKeyName(),
                getParentForChildren(),
                isClean());
        kmsKeyName_ = null;
      }
      return kmsKeyNameBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration)
  private static final com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptionConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<EncryptionConfiguration>() {
    @java.lang.Override
    public EncryptionConfiguration parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<EncryptionConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptionConfiguration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.EncryptionConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

