// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface UpdateDataSourceDefinitionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
   * @return Whether the dataSourceDefinition field is set.
   */
  boolean hasDataSourceDefinition();
  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
   * @return The dataSourceDefinition.
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition getDataSourceDefinition();
  /**
   * <pre>
   * Data source definition.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition data_source_definition = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinitionOrBuilder getDataSourceDefinitionOrBuilder();

  /**
   * <pre>
   * Update field mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Update field mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Update field mask.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
