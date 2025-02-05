// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 4.26.0
package com.google.cloud.bigquery.datatransfer.v1;

/**
 * <pre>
 * A response to start manual transfer runs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse}
 */
public final class StartManualTransferRunsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse)
    StartManualTransferRunsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      StartManualTransferRunsResponse.class.getName());
  }
  // Use StartManualTransferRunsResponse.newBuilder() to construct.
  private StartManualTransferRunsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private StartManualTransferRunsResponse() {
    runs_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_StartManualTransferRunsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_StartManualTransferRunsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse.class, com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse.Builder.class);
  }

  public static final int RUNS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> runs_;
  /**
   * <pre>
   * The transfer runs that were created.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> getRunsList() {
    return runs_;
  }
  /**
   * <pre>
   * The transfer runs that were created.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> 
      getRunsOrBuilderList() {
    return runs_;
  }
  /**
   * <pre>
   * The transfer runs that were created.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public int getRunsCount() {
    return runs_.size();
  }
  /**
   * <pre>
   * The transfer runs that were created.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferRun getRuns(int index) {
    return runs_.get(index);
  }
  /**
   * <pre>
   * The transfer runs that were created.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getRunsOrBuilder(
      int index) {
    return runs_.get(index);
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
    for (int i = 0; i < runs_.size(); i++) {
      output.writeMessage(1, runs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < runs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, runs_.get(i));
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
    if (!(obj instanceof com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse other = (com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse) obj;

    if (!getRunsList()
        .equals(other.getRunsList())) return false;
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
    if (getRunsCount() > 0) {
      hash = (37 * hash) + RUNS_FIELD_NUMBER;
      hash = (53 * hash) + getRunsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse prototype) {
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
   * A response to start manual transfer runs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse)
      com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_StartManualTransferRunsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_StartManualTransferRunsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse.class, com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse.newBuilder()
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
      if (runsBuilder_ == null) {
        runs_ = java.util.Collections.emptyList();
      } else {
        runs_ = null;
        runsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.internal_static_google_cloud_bigquery_datatransfer_v1_StartManualTransferRunsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse build() {
      com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse buildPartial() {
      com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse result = new com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse result) {
      if (runsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          runs_ = java.util.Collections.unmodifiableList(runs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.runs_ = runs_;
      } else {
        result.runs_ = runsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse) {
        return mergeFrom((com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse other) {
      if (other == com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse.getDefaultInstance()) return this;
      if (runsBuilder_ == null) {
        if (!other.runs_.isEmpty()) {
          if (runs_.isEmpty()) {
            runs_ = other.runs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRunsIsMutable();
            runs_.addAll(other.runs_);
          }
          onChanged();
        }
      } else {
        if (!other.runs_.isEmpty()) {
          if (runsBuilder_.isEmpty()) {
            runsBuilder_.dispose();
            runsBuilder_ = null;
            runs_ = other.runs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            runsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getRunsFieldBuilder() : null;
          } else {
            runsBuilder_.addAllMessages(other.runs_);
          }
        }
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
              com.google.cloud.bigquery.datatransfer.v1.TransferRun m =
                  input.readMessage(
                      com.google.cloud.bigquery.datatransfer.v1.TransferRun.parser(),
                      extensionRegistry);
              if (runsBuilder_ == null) {
                ensureRunsIsMutable();
                runs_.add(m);
              } else {
                runsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> runs_ =
      java.util.Collections.emptyList();
    private void ensureRunsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        runs_ = new java.util.ArrayList<com.google.cloud.bigquery.datatransfer.v1.TransferRun>(runs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> runsBuilder_;

    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun> getRunsList() {
      if (runsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(runs_);
      } else {
        return runsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public int getRunsCount() {
      if (runsBuilder_ == null) {
        return runs_.size();
      } else {
        return runsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun getRuns(int index) {
      if (runsBuilder_ == null) {
        return runs_.get(index);
      } else {
        return runsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder setRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (runsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRunsIsMutable();
        runs_.set(index, value);
        onChanged();
      } else {
        runsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder setRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        runs_.set(index, builderForValue.build());
        onChanged();
      } else {
        runsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addRuns(com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (runsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRunsIsMutable();
        runs_.add(value);
        onChanged();
      } else {
        runsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun value) {
      if (runsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRunsIsMutable();
        runs_.add(index, value);
        onChanged();
      } else {
        runsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addRuns(
        com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        runs_.add(builderForValue.build());
        onChanged();
      } else {
        runsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addRuns(
        int index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder builderForValue) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        runs_.add(index, builderForValue.build());
        onChanged();
      } else {
        runsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder addAllRuns(
        java.lang.Iterable<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRun> values) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, runs_);
        onChanged();
      } else {
        runsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder clearRuns() {
      if (runsBuilder_ == null) {
        runs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        runsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public Builder removeRuns(int index) {
      if (runsBuilder_ == null) {
        ensureRunsIsMutable();
        runs_.remove(index);
        onChanged();
      } else {
        runsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder getRunsBuilder(
        int index) {
      return getRunsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getRunsOrBuilder(
        int index) {
      if (runsBuilder_ == null) {
        return runs_.get(index);  } else {
        return runsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> 
         getRunsOrBuilderList() {
      if (runsBuilder_ != null) {
        return runsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(runs_);
      }
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder addRunsBuilder() {
      return getRunsFieldBuilder().addBuilder(
          com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance());
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder addRunsBuilder(
        int index) {
      return getRunsFieldBuilder().addBuilder(
          index, com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance());
    }
    /**
     * <pre>
     * The transfer runs that were created.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferRun runs = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder> 
         getRunsBuilderList() {
      return getRunsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder> 
        getRunsFieldBuilder() {
      if (runsBuilder_ == null) {
        runsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.cloud.bigquery.datatransfer.v1.TransferRun, com.google.cloud.bigquery.datatransfer.v1.TransferRun.Builder, com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder>(
                runs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        runs_ = null;
      }
      return runsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse)
  private static final com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse();
  }

  public static com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartManualTransferRunsResponse>
      PARSER = new com.google.protobuf.AbstractParser<StartManualTransferRunsResponse>() {
    @java.lang.Override
    public StartManualTransferRunsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartManualTransferRunsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartManualTransferRunsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

