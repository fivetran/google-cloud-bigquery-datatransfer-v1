// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface IsDataTransferServiceEnabledResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.IsDataTransferServiceEnabledResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates whether the data transfer service is enabled for the project.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * A string that contains additional information about why the service is
   * deemed not enabled. This is only available when `enable` is false.
   * </pre>
   *
   * <code>string reason = 2;</code>
   * @return The reason.
   */
  java.lang.String getReason();
  /**
   * <pre>
   * A string that contains additional information about why the service is
   * deemed not enabled. This is only available when `enable` is false.
   * </pre>
   *
   * <code>string reason = 2;</code>
   * @return The bytes for reason.
   */
  com.google.protobuf.ByteString
      getReasonBytes();
}
