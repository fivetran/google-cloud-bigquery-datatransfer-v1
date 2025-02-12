// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public interface CreateTransferConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The BigQuery project id where the transfer configuration should be created.
   * Must be in the format projects/{project_id}/locations/{location_id} or
   * projects/{project_id}. If specified location and location of the
   * destination bigquery dataset do not match - the request will fail.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The BigQuery project id where the transfer configuration should be created.
   * Must be in the format projects/{project_id}/locations/{location_id} or
   * projects/{project_id}. If specified location and location of the
   * destination bigquery dataset do not match - the request will fail.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. Data transfer configuration to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the transferConfig field is set.
   */
  boolean hasTransferConfig();
  /**
   * <pre>
   * Required. Data transfer configuration to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The transferConfig.
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferConfig getTransferConfig();
  /**
   * <pre>
   * Required. Data transfer configuration to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferConfig transfer_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferConfigOrBuilder getTransferConfigOrBuilder();

  /**
   * <pre>
   * Optional OAuth2 authorization code to use with this transfer configuration.
   * This is required if new credentials are needed, as indicated by
   * `CheckValidCreds`.
   * In order to obtain authorization_code, please make a
   * request to
   * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=&lt;datatransferapiclientid&gt;&amp;scope=&lt;data_source_scopes&gt;&amp;redirect_uri=&lt;redirect_uri&gt;
   *
   * * client_id should be OAuth client_id of BigQuery DTS API for the given
   *   data source returned by ListDataSources method.
   * * data_source_scopes are the scopes returned by ListDataSources method.
   * * redirect_uri is an optional parameter. If not specified, then
   *   authorization code is posted to the opener of authorization flow window.
   *   Otherwise it will be sent to the redirect uri. A special value of
   *   urn:ietf:wg:oauth:2.0:oob means that authorization code should be
   *   returned in the title bar of the browser, with the page text prompting
   *   the user to copy the code and paste it in the application.
   * </pre>
   *
   * <code>string authorization_code = 3;</code>
   * @return The authorizationCode.
   */
  java.lang.String getAuthorizationCode();
  /**
   * <pre>
   * Optional OAuth2 authorization code to use with this transfer configuration.
   * This is required if new credentials are needed, as indicated by
   * `CheckValidCreds`.
   * In order to obtain authorization_code, please make a
   * request to
   * https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=&lt;datatransferapiclientid&gt;&amp;scope=&lt;data_source_scopes&gt;&amp;redirect_uri=&lt;redirect_uri&gt;
   *
   * * client_id should be OAuth client_id of BigQuery DTS API for the given
   *   data source returned by ListDataSources method.
   * * data_source_scopes are the scopes returned by ListDataSources method.
   * * redirect_uri is an optional parameter. If not specified, then
   *   authorization code is posted to the opener of authorization flow window.
   *   Otherwise it will be sent to the redirect uri. A special value of
   *   urn:ietf:wg:oauth:2.0:oob means that authorization code should be
   *   returned in the title bar of the browser, with the page text prompting
   *   the user to copy the code and paste it in the application.
   * </pre>
   *
   * <code>string authorization_code = 3;</code>
   * @return The bytes for authorizationCode.
   */
  com.google.protobuf.ByteString
      getAuthorizationCodeBytes();

  /**
   * <pre>
   * Optional version info. If users want to find a very recent access token,
   * that is, immediately after approving access, users have to set the
   * version_info claim in the token request. To obtain the version_info, users
   * must use the "none+gsession" response type. which be return a
   * version_info back in the authorization response which be be put in a JWT
   * claim in the token request.
   * </pre>
   *
   * <code>string version_info = 5;</code>
   * @return The versionInfo.
   */
  java.lang.String getVersionInfo();
  /**
   * <pre>
   * Optional version info. If users want to find a very recent access token,
   * that is, immediately after approving access, users have to set the
   * version_info claim in the token request. To obtain the version_info, users
   * must use the "none+gsession" response type. which be return a
   * version_info back in the authorization response which be be put in a JWT
   * claim in the token request.
   * </pre>
   *
   * <code>string version_info = 5;</code>
   * @return The bytes for versionInfo.
   */
  com.google.protobuf.ByteString
      getVersionInfoBytes();

  /**
   * <pre>
   * Optional service account name. If this field is set, transfer config will
   * be created with this service account credentials. It requires that
   * requesting user calling this API has permissions to act as this service
   * account.
   * </pre>
   *
   * <code>string service_account_name = 6;</code>
   * @return The serviceAccountName.
   */
  java.lang.String getServiceAccountName();
  /**
   * <pre>
   * Optional service account name. If this field is set, transfer config will
   * be created with this service account credentials. It requires that
   * requesting user calling this API has permissions to act as this service
   * account.
   * </pre>
   *
   * <code>string service_account_name = 6;</code>
   * @return The bytes for serviceAccountName.
   */
  com.google.protobuf.ByteString
      getServiceAccountNameBytes();
}
