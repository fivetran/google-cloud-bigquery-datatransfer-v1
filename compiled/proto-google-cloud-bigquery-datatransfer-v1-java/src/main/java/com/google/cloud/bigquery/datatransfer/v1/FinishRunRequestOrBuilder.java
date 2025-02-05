// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

// Protobuf Java Version: 4.26.0
package com.google.cloud.bigquery.datatransfer.v1;

public interface FinishRunRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.FinishRunRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the resource in the form:
   * "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the resource in the form:
   * "projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
