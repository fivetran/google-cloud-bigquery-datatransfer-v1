// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 4.26.0
package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * A request to list data transfers configured for a BigQuery project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest}
 */
public final class ListTransferConfigsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
    ListTransferConfigsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      ListTransferConfigsRequest.class.getName());
  }
  // Use ListTransferConfigsRequest.newBuilder() to construct.
  private ListTransferConfigsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListTransferConfigsRequest() {
    parent_ = "";
    dataSourceIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    pageToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.class, com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   * <pre>
   * Required. The BigQuery project id for which transfer configs
   * should be returned: `projects/{project_id}` or
   * `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
   * Required. The BigQuery project id for which transfer configs
   * should be returned: `projects/{project_id}` or
   * `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

  public static final int DATA_SOURCE_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList dataSourceIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   * @return A list containing the dataSourceIds.
   */
  public com.google.protobuf.ProtocolStringList
      getDataSourceIdsList() {
    return dataSourceIds_;
  }
  /**
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   * @return The count of dataSourceIds.
   */
  public int getDataSourceIdsCount() {
    return dataSourceIds_.size();
  }
  /**
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The dataSourceIds at the given index.
   */
  public java.lang.String getDataSourceIds(int index) {
    return dataSourceIds_.get(index);
  }
  /**
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dataSourceIds at the given index.
   */
  public com.google.protobuf.ByteString
      getDataSourceIdsBytes(int index) {
    return dataSourceIds_.getByteString(index);
  }

  public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pageToken_ = "";
  /**
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransfersRequest` list results. For multiple-page
   * results, `ListTransfersResponse` outputs
   * a `next_page` token, which can be used as the
   * `page_token` value to request the next page of list results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  @java.lang.Override
  public java.lang.String getPageToken() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransfersRequest` list results. For multiple-page
   * results, `ListTransfersResponse` outputs
   * a `next_page` token, which can be used as the
   * `page_token` value to request the next page of list results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPageTokenBytes() {
    java.lang.Object ref = pageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAGE_SIZE_FIELD_NUMBER = 4;
  private int pageSize_ = 0;
  /**
   * <pre>
   * Page size. The default page size is the maximum value of 1000 results.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   * @return The pageSize.
   */
  @java.lang.Override
  public int getPageSize() {
    return pageSize_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, parent_);
    }
    for (int i = 0; i < dataSourceIds_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, dataSourceIds_.getRaw(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(pageToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, pageToken_);
    }
    if (pageSize_ != 0) {
      output.writeInt32(4, pageSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dataSourceIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(dataSourceIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDataSourceIdsList().size();
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(pageToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, pageToken_);
    }
    if (pageSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, pageSize_);
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest other = (com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest) obj;

    if (!getParent()
        .equals(other.getParent())) return false;
    if (!getDataSourceIdsList()
        .equals(other.getDataSourceIdsList())) return false;
    if (!getPageToken()
        .equals(other.getPageToken())) return false;
    if (getPageSize()
        != other.getPageSize()) return false;
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
    if (getDataSourceIdsCount() > 0) {
      hash = (37 * hash) + DATA_SOURCE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getDataSourceIdsList().hashCode();
    }
    hash = (37 * hash) + PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getPageToken().hashCode();
    hash = (37 * hash) + PAGE_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getPageSize();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest prototype) {
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
   * A request to list data transfers configured for a BigQuery project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.class, com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.newBuilder()
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
      parent_ = "";
      dataSourceIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      pageToken_ = "";
      pageSize_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_ListTransferConfigsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest build() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest result = new com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        dataSourceIds_.makeImmutable();
        result.dataSourceIds_ = dataSourceIds_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.pageToken_ = pageToken_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pageSize_ = pageSize_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.dataSourceIds_.isEmpty()) {
        if (dataSourceIds_.isEmpty()) {
          dataSourceIds_ = other.dataSourceIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureDataSourceIdsIsMutable();
          dataSourceIds_.addAll(other.dataSourceIds_);
        }
        onChanged();
      }
      if (!other.getPageToken().isEmpty()) {
        pageToken_ = other.pageToken_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getPageSize() != 0) {
        setPageSize(other.getPageSize());
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureDataSourceIdsIsMutable();
              dataSourceIds_.add(s);
              break;
            } // case 18
            case 26: {
              pageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              pageSize_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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
     * Required. The BigQuery project id for which transfer configs
     * should be returned: `projects/{project_id}` or
     * `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The BigQuery project id for which transfer configs
     * should be returned: `projects/{project_id}` or
     * `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The BigQuery project id for which transfer configs
     * should be returned: `projects/{project_id}` or
     * `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The BigQuery project id for which transfer configs
     * should be returned: `projects/{project_id}` or
     * `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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
     * Required. The BigQuery project id for which transfer configs
     * should be returned: `projects/{project_id}` or
     * `projects/{project_id}/locations/{location_id}`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
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

    private com.google.protobuf.LazyStringArrayList dataSourceIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureDataSourceIdsIsMutable() {
      if (!dataSourceIds_.isModifiable()) {
        dataSourceIds_ = new com.google.protobuf.LazyStringArrayList(dataSourceIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @return A list containing the dataSourceIds.
     */
    public com.google.protobuf.ProtocolStringList
        getDataSourceIdsList() {
      dataSourceIds_.makeImmutable();
      return dataSourceIds_;
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @return The count of dataSourceIds.
     */
    public int getDataSourceIdsCount() {
      return dataSourceIds_.size();
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The dataSourceIds at the given index.
     */
    public java.lang.String getDataSourceIds(int index) {
      return dataSourceIds_.get(index);
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the dataSourceIds at the given index.
     */
    public com.google.protobuf.ByteString
        getDataSourceIdsBytes(int index) {
      return dataSourceIds_.getByteString(index);
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The dataSourceIds to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @param value The dataSourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addDataSourceIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @param values The dataSourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllDataSourceIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureDataSourceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dataSourceIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSourceIds() {
      dataSourceIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When specified, only configurations of requested data sources are returned.
     * </pre>
     *
     * <code>repeated string data_source_ids = 2;</code>
     * @param value The bytes of the dataSourceIds to add.
     * @return This builder for chaining.
     */
    public Builder addDataSourceIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureDataSourceIdsIsMutable();
      dataSourceIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object pageToken_ = "";
    /**
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @return The pageToken.
     */
    public java.lang.String getPageToken() {
      java.lang.Object ref = pageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @return The bytes for pageToken.
     */
    public com.google.protobuf.ByteString
        getPageTokenBytes() {
      java.lang.Object ref = pageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @param value The pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pageToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageToken() {
      pageToken_ = getDefaultInstance().getPageToken();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination token, which can be used to request a specific page
     * of `ListTransfersRequest` list results. For multiple-page
     * results, `ListTransfersResponse` outputs
     * a `next_page` token, which can be used as the
     * `page_token` value to request the next page of list results.
     * </pre>
     *
     * <code>string page_token = 3;</code>
     * @param value The bytes for pageToken to set.
     * @return This builder for chaining.
     */
    public Builder setPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pageToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int pageSize_ ;
    /**
     * <pre>
     * Page size. The default page size is the maximum value of 1000 results.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     * @return The pageSize.
     */
    @java.lang.Override
    public int getPageSize() {
      return pageSize_;
    }
    /**
     * <pre>
     * Page size. The default page size is the maximum value of 1000 results.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     * @param value The pageSize to set.
     * @return This builder for chaining.
     */
    public Builder setPageSize(int value) {

      pageSize_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Page size. The default page size is the maximum value of 1000 results.
     * </pre>
     *
     * <code>int32 page_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageSize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      pageSize_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
  private static final com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTransferConfigsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListTransferConfigsRequest>() {
    @java.lang.Override
    public ListTransferConfigsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListTransferConfigsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTransferConfigsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

