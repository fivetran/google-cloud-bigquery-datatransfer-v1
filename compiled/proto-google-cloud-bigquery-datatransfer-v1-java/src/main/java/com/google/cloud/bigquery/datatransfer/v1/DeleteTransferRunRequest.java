// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 4.26.0
package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * A request to delete data transfer run information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest}
 */
public final class DeleteTransferRunRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest)
    DeleteTransferRunRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      DeleteTransferRunRequest.class.getName());
  }
  // Use DeleteTransferRunRequest.newBuilder() to construct.
  private DeleteTransferRunRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DeleteTransferRunRequest() {
    name_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_DeleteTransferRunRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_DeleteTransferRunRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest.class, com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The field will contain name of the resource requested, for
   * example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
   * or
   * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The field will contain name of the resource requested, for
   * example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
   * or
   * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, name_);
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest other = (com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest prototype) {
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
   * A request to delete data transfer run information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest)
      com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_DeleteTransferRunRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_DeleteTransferRunRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest.class, com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_DeleteTransferRunRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest build() {
      com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest result = new com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              name_ = input.readStringRequireUtf8();
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The field will contain name of the resource requested, for
     * example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The field will contain name of the resource requested, for
     * example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The field will contain name of the resource requested, for
     * example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The field will contain name of the resource requested, for
     * example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The field will contain name of the resource requested, for
     * example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
     * or
     * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest)
  private static final com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteTransferRunRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteTransferRunRequest>() {
    @java.lang.Override
    public DeleteTransferRunRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteTransferRunRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteTransferRunRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

