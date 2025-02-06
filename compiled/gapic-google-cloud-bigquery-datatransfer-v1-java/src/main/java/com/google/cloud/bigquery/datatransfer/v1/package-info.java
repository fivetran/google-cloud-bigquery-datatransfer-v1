/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to BigQuery Data Transfer API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= DataSourceServiceClient =======================
 *
 * <p>Service Description: The Google BigQuery Data Transfer API allows BigQuery users to configure
 * transfer of their data from other Google Products into BigQuery. This service exposes methods
 * that should be used by data source backend.
 *
 * <p>Sample for DataSourceServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
 *   UpdateTransferRunRequest request =
 *       UpdateTransferRunRequest.newBuilder()
 *           .setTransferRun(TransferRun.newBuilder().build())
 *           .setUpdateMask(FieldMask.newBuilder().build())
 *           .build();
 *   TransferRun response = dataSourceServiceClient.updateTransferRun(request);
 * }
 * }</pre>
 *
 * <p>======================= DataTransferServiceClient =======================
 *
 * <p>Service Description: The Google BigQuery Data Transfer Service API enables BigQuery users to
 * configure the transfer of their data from other Google Products into BigQuery. This service
 * contains methods that are end user exposed. It backs up the frontend.
 *
 * <p>Sample for DataTransferServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
 *   DataSourceName name =
 *       DataSourceName.ofProjectLocationDataSourceName(
 *           "[PROJECT]", "[LOCATION]", "[DATA_SOURCE]");
 *   DataSource response = dataTransferServiceClient.getDataSource(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.bigquery.datatransfer.v1;

import javax.annotation.Generated;
