// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

// Protobuf Java Version: 4.26.0
package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * A request to update a transfer run.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest}
 */
public final class UpdateTransferRunRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest)
    UpdateTransferRunRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      UpdateTransferRunRequest.class.getName());
  }
  // Use UpdateTransferRunRequest.newBuilder() to construct.
  private UpdateTransferRunRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateTransferRunRequest() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.class, com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.Builder.class);
  }

  private int bitField0_;
  public static final int TRANSFER_RUN_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.datatransfer.v1.TransferRun transferRun_;
  /**
   * <pre>
   * Run name must be set and correspond to an already existing run. Only
   * state, error_status, and data_version fields will be updated. All other
   * fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
   * @return Whether the transferRun field is set.
   */
  @java.lang.Override
  public boolean hasTransferRun() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Run name must be set and correspond to an already existing run. Only
   * state, error_status, and data_version fields will be updated. All other
   * fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
   * @return The transferRun.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferRun getTransferRun() {
    return transferRun_ == null ? com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance() : transferRun_;
  }
  /**
   * <pre>
   * Run name must be set and correspond to an already existing run. Only
   * state, error_status, and data_version fields will be updated. All other
   * fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getTransferRunOrBuilder() {
    return transferRun_ == null ? com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance() : transferRun_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getTransferRun());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
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
        .computeMessageSize(1, getTransferRun());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest other = (com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest) obj;

    if (hasTransferRun() != other.hasTransferRun()) return false;
    if (hasTransferRun()) {
      if (!getTransferRun()
          .equals(other.getTransferRun())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasTransferRun()) {
      hash = (37 * hash) + TRANSFER_RUN_FIELD_NUMBER;
      hash = (53 * hash) + getTransferRun().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A request to update a transfer run.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest)
      com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.class, com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getTransferRunFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      transferRun_ = null;
      if (transferRunBuilder_ != null) {
        transferRunBuilder_.dispose();
        transferRunBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest build() {
      com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest result = new com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.transferRun_ = transferRunBuilder_ == null
            ? transferRun_
            : transferRunBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.getDefaultInstance()) return this;
      if (other.hasTransferRun()) {
        mergeTransferRun(other.getTransferRun());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                  getTransferRunFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.cloud.bigquery.datatransfer.v1.TransferRun transferRun_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> transferRunBuilder_;
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     * @return Whether the transferRun field is set.
     */
    public boolean hasTransferRun() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     * @return The transferRun.
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun getTransferRun() {
      if (transferRunBuilder_ == null) {
        return transferRun_ == null ? com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance() : transferRun_;
      } else {
        return transferRunBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     */
    public Builder setTransferRun(com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (transferRunBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transferRun_ = value;
      } else {
        transferRunBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     */
    public Builder setTransferRun(
        com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (transferRunBuilder_ == null) {
        transferRun_ = builderForValue.build();
      } else {
        transferRunBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     */
    public Builder mergeTransferRun(com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (transferRunBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          transferRun_ != null &&
          transferRun_ != com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance()) {
          getTransferRunBuilder().mergeFrom(value);
        } else {
          transferRun_ = value;
        }
      } else {
        transferRunBuilder_.mergeFrom(value);
      }
      if (transferRun_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     */
    public Builder clearTransferRun() {
      bitField0_ = (bitField0_ & ~0x00000001);
      transferRun_ = null;
      if (transferRunBuilder_ != null) {
        transferRunBuilder_.dispose();
        transferRunBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder getTransferRunBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTransferRunFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getTransferRunOrBuilder() {
      if (transferRunBuilder_ != null) {
        return transferRunBuilder_.getMessageOrBuilder();
      } else {
        return transferRun_ == null ?
            com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance() : transferRun_;
      }
    }
    /**
     * <pre>
     * Run name must be set and correspond to an already existing run. Only
     * state, error_status, and data_version fields will be updated. All other
     * fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> 
        getTransferRunFieldBuilder() {
      if (transferRunBuilder_ == null) {
        transferRunBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder>(
                getTransferRun(),
                getParentForChildren(),
                isClean());
        transferRun_ = null;
      }
      return transferRunBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Required list of fields to be updated in this request.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest)
  private static final com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTransferRunRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTransferRunRequest>() {
    @java.lang.Override
    public UpdateTransferRunRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateTransferRunRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTransferRunRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

