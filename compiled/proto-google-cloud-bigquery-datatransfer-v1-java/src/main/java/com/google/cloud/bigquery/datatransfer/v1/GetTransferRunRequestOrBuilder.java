// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface GetTransferRunRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The field will contain name of the resource requested, for example:
   * `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}` or
   * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The field will contain name of the resource requested, for example:
   * `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}` or
   * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}/runs/{run_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
