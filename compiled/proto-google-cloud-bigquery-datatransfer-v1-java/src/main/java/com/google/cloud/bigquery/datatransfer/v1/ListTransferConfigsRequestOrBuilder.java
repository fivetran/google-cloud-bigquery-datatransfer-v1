// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface ListTransferConfigsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The BigQuery project id for which transfer configs
   * should be returned: `projects/{project_id}` or
   * `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The BigQuery project id for which transfer configs
   * should be returned: `projects/{project_id}` or
   * `projects/{project_id}/locations/{location_id}`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   * @return A list containing the dataSourceIds.
   */
  java.util.List<java.lang.String>
      getDataSourceIdsList();
  /**
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   * @return The count of dataSourceIds.
   */
  int getDataSourceIdsCount();
  /**
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The dataSourceIds at the given index.
   */
  java.lang.String getDataSourceIds(int index);
  /**
   * <pre>
   * When specified, only configurations of requested data sources are returned.
   * </pre>
   *
   * <code>repeated string data_source_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dataSourceIds at the given index.
   */
  com.google.protobuf.ByteString
      getDataSourceIdsBytes(int index);

  /**
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListTransfersRequest` list results. For multiple-page
   * results, `ListTransfersResponse` outputs
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
   * of `ListTransfersRequest` list results. For multiple-page
   * results, `ListTransfersResponse` outputs
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
}
