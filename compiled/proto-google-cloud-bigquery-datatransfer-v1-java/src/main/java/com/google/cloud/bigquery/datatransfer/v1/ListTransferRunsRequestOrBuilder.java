// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface ListTransferRunsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of transfer configuration for which transfer runs should be retrieved.
   * Format of transfer configuration resource name is:
   * `projects/{project_id}/transferConfigs/{config_id}` or
   * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Name of transfer configuration for which transfer runs should be retrieved.
   * Format of transfer configuration resource name is:
   * `projects/{project_id}/transferConfigs/{config_id}` or
   * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * When specified, only transfer runs with requested states are returned.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferState states = 2;</code>
   * @return A list containing the states.
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferState> getStatesList();
  /**
   * <pre>
   * When specified, only transfer runs with requested states are returned.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferState states = 2;</code>
   * @return The count of states.
   */
  int getStatesCount();
  /**
   * <pre>
   * When specified, only transfer runs with requested states are returned.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferState states = 2;</code>
   * @param index The index of the element to return.
   * @return The states at the given index.
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferState getStates(int index);
  /**
   * <pre>
   * When specified, only transfer runs with requested states are returned.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferState states = 2;</code>
   * @return A list containing the enum numeric values on the wire for states.
   */
  java.util.List<java.lang.Integer>
  getStatesValueList();
  /**
   * <pre>
   * When specified, only transfer runs with requested states are returned.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferState states = 2;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of states at the given index.
   */
  int getStatesValue(int index);

  /**
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransferRunsRequest` list results. For multiple-page
   * results, `ListTransferRunsResponse` outputs
   * a `next_page` token, which can be used as the
   * `page_token` value to request the next page of list results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransferRunsRequest` list results. For multiple-page
   * results, `ListTransferRunsResponse` outputs
   * a `next_page` token, which can be used as the
   * `page_token` value to request the next page of list results.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * Page size. The default page size is the maximum value of 1000 results.
   * </pre>
   *
   * <code>int32 page_size = 4;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Indicates how run attempts are to be pulled.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest.RunAttempt run_attempt = 5;</code>
   * @return The enum numeric value on the wire for runAttempt.
   */
  int getRunAttemptValue();
  /**
   * <pre>
   * Indicates how run attempts are to be pulled.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest.RunAttempt run_attempt = 5;</code>
   * @return The runAttempt.
   */
  com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest.RunAttempt getRunAttempt();
}
