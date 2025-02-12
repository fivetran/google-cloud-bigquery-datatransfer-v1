// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface ListDataSourcesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The BigQuery project id for which data sources should be returned.
   * Must be in the form: `projects/{project_id}` or
   * `projects/{project_id}/locations/{location_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The BigQuery project id for which data sources should be returned.
   * Must be in the form: `projects/{project_id}` or
   * `projects/{project_id}/locations/{location_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Pagination token, which can be used to request a specific page
   * of `ListDataSourcesRequest` list results. For multiple-page
   * results, `ListDataSourcesResponse` outputs
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
   * of `ListDataSourcesRequest` list results. For multiple-page
   * results, `ListDataSourcesResponse` outputs
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
