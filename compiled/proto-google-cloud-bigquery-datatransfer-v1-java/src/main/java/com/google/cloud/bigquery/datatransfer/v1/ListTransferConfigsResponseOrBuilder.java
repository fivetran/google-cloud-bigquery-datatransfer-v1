// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface ListTransferConfigsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferConfig> 
      getTransferConfigsList();
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferConfig getTransferConfigs(int index);
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTransferConfigsCount();
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder> 
      getTransferConfigsOrBuilderList();
  /**
   * <pre>
   * Output only. The stored pipeline transfer configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_configs = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder getTransferConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListTransferConfigsRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `ListTransferConfigsRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
