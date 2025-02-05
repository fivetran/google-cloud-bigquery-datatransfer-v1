// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * Represents the request of the CreateDataSourceDefinition method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest}
 */
public final class CreateDataSourceDefinitionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest)
    CreateDataSourceDefinitionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateDataSourceDefinitionRequest.newBuilder() to construct.
  private CreateDataSourceDefinitionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateDataSourceDefinitionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateDataSourceDefinitionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.class, com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * The BigQuery project id for which data source definition is associated.
   * Must be in the form: `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The BigQuery project id for which data source definition is associated.
   * Must be in the form: `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_SOURCE_DEFINITION_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition dataSourceDefinition_;
  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
   * @return Whether the dataSourceDefinition field is set.
   */
  @java.lang.Override
  public boolean hasDataSourceDefinition() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
   * @return The dataSourceDefinition.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition getDataSourceDefinition() {
    return dataSourceDefinition_ == null ? com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance() : dataSourceDefinition_;
  }
  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder getDataSourceDefinitionOrBuilder() {
    return dataSourceDefinition_ == null ? com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance() : dataSourceDefinition_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getDataSourceDefinition());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDataSourceDefinition());
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest other = (com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (hasDataSourceDefinition() != other.hasDataSourceDefinition()) return false;
    if (hasDataSourceDefinition()) {
      if (!getDataSourceDefinition()
          .equals(other.getDataSourceDefinition())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasDataSourceDefinition()) {
      hash = (37 * hash) + DATA_SOURCE_DEFINITION_FIELD_NUMBER;
      hash = (53 * hash) + getDataSourceDefinition().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest prototype) {
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
   * Represents the request of the CreateDataSourceDefinition method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest)
      com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.class, com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.newBuilder()
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
        getDataSourceDefinitionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      dataSourceDefinition_ = null;
      if (dataSourceDefinitionBuilder_ != null) {
        dataSourceDefinitionBuilder_.dispose();
        dataSourceDefinitionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest build() {
      com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest result = new com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.dataSourceDefinition_ = dataSourceDefinitionBuilder_ == null
            ? dataSourceDefinition_
            : dataSourceDefinitionBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasDataSourceDefinition()) {
        mergeDataSourceDefinition(other.getDataSourceDefinition());
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
              parent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDataSourceDefinitionFieldBuilder().getBuilder(),
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

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The BigQuery project id for which data source definition is associated.
     * Must be in the form: `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The BigQuery project id for which data source definition is associated.
     * Must be in the form: `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The BigQuery project id for which data source definition is associated.
     * Must be in the form: `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The BigQuery project id for which data source definition is associated.
     * Must be in the form: `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The BigQuery project id for which data source definition is associated.
     * Must be in the form: `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1;</code>
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition dataSourceDefinition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder> dataSourceDefinitionBuilder_;
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     * @return Whether the dataSourceDefinition field is set.
     */
    public boolean hasDataSourceDefinition() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     * @return The dataSourceDefinition.
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition getDataSourceDefinition() {
      if (dataSourceDefinitionBuilder_ == null) {
        return dataSourceDefinition_ == null ? com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance() : dataSourceDefinition_;
      } else {
        return dataSourceDefinitionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     */
    public Builder setDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition value) {
      if (dataSourceDefinitionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataSourceDefinition_ = value;
      } else {
        dataSourceDefinitionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     */
    public Builder setDataSourceDefinition(
        com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder builderForValue) {
      if (dataSourceDefinitionBuilder_ == null) {
        dataSourceDefinition_ = builderForValue.build();
      } else {
        dataSourceDefinitionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     */
    public Builder mergeDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition value) {
      if (dataSourceDefinitionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          dataSourceDefinition_ != null &&
          dataSourceDefinition_ != com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance()) {
          getDataSourceDefinitionBuilder().mergeFrom(value);
        } else {
          dataSourceDefinition_ = value;
        }
      } else {
        dataSourceDefinitionBuilder_.mergeFrom(value);
      }
      if (dataSourceDefinition_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     */
    public Builder clearDataSourceDefinition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      dataSourceDefinition_ = null;
      if (dataSourceDefinitionBuilder_ != null) {
        dataSourceDefinitionBuilder_.dispose();
        dataSourceDefinitionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder getDataSourceDefinitionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDataSourceDefinitionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder getDataSourceDefinitionOrBuilder() {
      if (dataSourceDefinitionBuilder_ != null) {
        return dataSourceDefinitionBuilder_.getMessageOrBuilder();
      } else {
        return dataSourceDefinition_ == null ?
            com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance() : dataSourceDefinition_;
      }
    }
    /**
     * <pre>
     * Data source definition.
     * </pre>
     *
     * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder> 
        getDataSourceDefinitionFieldBuilder() {
      if (dataSourceDefinitionBuilder_ == null) {
        dataSourceDefinitionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.Builder, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder>(
                getDataSourceDefinition(),
                getParentForChildren(),
                isClean());
        dataSourceDefinition_ = null;
      }
      return dataSourceDefinitionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest)
  private static final com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDataSourceDefinitionRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateDataSourceDefinitionRequest>() {
    @java.lang.Override
    public CreateDataSourceDefinitionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateDataSourceDefinitionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDataSourceDefinitionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

