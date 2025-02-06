// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto

// Protobuf Java Version: 4.26.0
package com.google.cloud.bigquery.datatransfer.v1;

public interface ScheduleOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ScheduleOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If true, automatic scheduling of data transfer runs for this configuration
   * will be disabled. The runs can be started on ad-hoc basis using
   * StartManualTransferRuns API. When automatic scheduling is disabled, the
   * TransferConfig.schedule field will be ignored.
   * </pre>
   *
   * <code>bool disable_auto_scheduling = 3;</code>
   * @return The disableAutoScheduling.
   */
  boolean getDisableAutoScheduling();

  /**
   * <pre>
   * Specifies time to start scheduling transfer runs. The first run will be
   * scheduled at or after the start time according to a recurrence pattern
   * defined in the schedule string. The start time can be changed at any
   * moment. The time when a data transfer can be trigerred manually is not
   * limited by this option.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   * <pre>
   * Specifies time to start scheduling transfer runs. The first run will be
   * scheduled at or after the start time according to a recurrence pattern
   * defined in the schedule string. The start time can be changed at any
   * moment. The time when a data transfer can be trigerred manually is not
   * limited by this option.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   * <pre>
   * Specifies time to start scheduling transfer runs. The first run will be
   * scheduled at or after the start time according to a recurrence pattern
   * defined in the schedule string. The start time can be changed at any
   * moment. The time when a data transfer can be trigerred manually is not
   * limited by this option.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   * <pre>
   * Defines time to stop scheduling transfer runs. A transfer run cannot be
   * scheduled at or after the end time. The end time can be changed at any
   * moment. The time when a data transfer can be trigerred manually is not
   * limited by this option.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * Defines time to stop scheduling transfer runs. A transfer run cannot be
   * scheduled at or after the end time. The end time can be changed at any
   * moment. The time when a data transfer can be trigerred manually is not
   * limited by this option.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * Defines time to stop scheduling transfer runs. A transfer run cannot be
   * scheduled at or after the end time. The end time can be changed at any
   * moment. The time when a data transfer can be trigerred manually is not
   * limited by this option.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
