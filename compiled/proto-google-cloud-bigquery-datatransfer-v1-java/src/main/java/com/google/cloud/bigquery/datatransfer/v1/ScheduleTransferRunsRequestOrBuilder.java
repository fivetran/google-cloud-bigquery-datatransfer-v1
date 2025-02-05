// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 4.26.0
package com.google.cloud.bigquery.datatransfer.v1;

public interface ScheduleTransferRunsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Transfer configuration name in the form:
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
   * Required. Transfer configuration name in the form:
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
   * Required. Start time of the range of transfer runs. For example,
   * `"2017-05-25T00:00:00+00:00"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Required. Start time of the range of transfer runs. For example,
   * `"2017-05-25T00:00:00+00:00"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Required. Start time of the range of transfer runs. For example,
   * `"2017-05-25T00:00:00+00:00"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Required. End time of the range of transfer runs. For example,
   * `"2017-05-30T00:00:00+00:00"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Required. End time of the range of transfer runs. For example,
   * `"2017-05-30T00:00:00+00:00"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Required. End time of the range of transfer runs. For example,
   * `"2017-05-30T00:00:00+00:00"`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
