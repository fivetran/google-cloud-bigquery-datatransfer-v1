// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface StartManualTransferRunsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Transfer configuration name in the form:
   * `projects/{project_id}/transferConfigs/{config_id}` or
   * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Transfer configuration name in the form:
   * `projects/{project_id}/transferConfigs/{config_id}` or
   * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * User labels to add to the backfilled runs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * User labels to add to the backfilled runs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * User labels to add to the backfilled runs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * User labels to add to the backfilled runs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * User labels to add to the backfilled runs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Time range for the transfer runs that should be started.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest.TimeRange requested_time_range = 3;</code>
   * @return Whether the requestedTimeRange field is set.
   */
  boolean hasRequestedTimeRange();
  /**
   * <pre>
   * Time range for the transfer runs that should be started.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest.TimeRange requested_time_range = 3;</code>
   * @return The requestedTimeRange.
   */
  com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest.TimeRange getRequestedTimeRange();
  /**
   * <pre>
   * Time range for the transfer runs that should be started.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest.TimeRange requested_time_range = 3;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest.TimeRangeOrBuilder getRequestedTimeRangeOrBuilder();

  /**
   * <pre>
   * Specific run_time for a transfer run to be started. The
   * requested_run_time must not be in the future.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_run_time = 4;</code>
   * @return Whether the requestedRunTime field is set.
   */
  boolean hasRequestedRunTime();
  /**
   * <pre>
   * Specific run_time for a transfer run to be started. The
   * requested_run_time must not be in the future.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_run_time = 4;</code>
   * @return The requestedRunTime.
   */
  com.google.protobuf.Timestamp getRequestedRunTime();
  /**
   * <pre>
   * Specific run_time for a transfer run to be started. The
   * requested_run_time must not be in the future.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_run_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestedRunTimeOrBuilder();

  com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest.TimeCase getTimeCase();
}
