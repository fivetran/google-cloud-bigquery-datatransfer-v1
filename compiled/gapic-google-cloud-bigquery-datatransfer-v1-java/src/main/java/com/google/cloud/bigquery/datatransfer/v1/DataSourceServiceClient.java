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

package com.google.cloud.bigquery.datatransfer.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigquery.datatransfer.v1.stub.DataSourceServiceStub;
import com.google.cloud.bigquery.datatransfer.v1.stub.DataSourceServiceStubSettings;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: The Google BigQuery Data Transfer API allows BigQuery users to configure
 * transfer of their data from other Google Products into BigQuery. This service exposes methods
 * that should be used by data source backend.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
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
 * <p>Note: close() needs to be called on the DataSourceServiceClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateTransferRun</td>
 *      <td><p> Update a transfer run. If successful, resets data_source.update_deadline_seconds timer.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateTransferRun(UpdateTransferRunRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateTransferRunCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> LogTransferRunMessages</td>
 *      <td><p> Log messages for a transfer run. If successful (at least 1 message), resets data_source.update_deadline_seconds timer.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> logTransferRunMessages(LogTransferRunMessagesRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> logTransferRunMessagesCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> StartBigQueryJobs</td>
 *      <td><p> Notify the Data Transfer Service that data is ready for loading. The Data Transfer Service will start and monitor multiple BigQuery Load jobs for a transfer run. Monitored jobs will be automatically retried and produce log messages when starting and finishing a job. Can be called multiple times for the same transfer run.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> startBigQueryJobs(StartBigQueryJobsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> startBigQueryJobsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> FinishRun</td>
 *      <td><p> Notify the Data Transfer Service that the data source is done processing the run. No more status updates or requests to start/monitor jobs will be accepted. The run will be finalized by the Data Transfer Service when all monitored jobs are completed. Does not need to be called if the run is set to FAILED.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> finishRun(FinishRunRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> finishRunCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> CreateDataSourceDefinition</td>
 *      <td><p> Creates a data source definition.  Calling this method will automatically use your credentials to create the following Google Cloud resources in YOUR Google Cloud project. 1. OAuth client 2. Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g., projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run The field data_source.client_id should be left empty in the input request, as the API will create a new OAuth client on behalf of the caller. On the other hand data_source.scopes usually need to be set when there are OAuth scopes that need to be granted by end users. 3. We need a longer deadline due to the 60 seconds SLO from Pub/Sub admin Operations. This also applies to update and delete data source definition.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createDataSourceDefinition(CreateDataSourceDefinitionRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createDataSourceDefinitionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> UpdateDataSourceDefinition</td>
 *      <td><p> Updates an existing data source definition. If changing supported_location_ids, triggers same effects as mentioned in "Create a data source definition."</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> updateDataSourceDefinition(UpdateDataSourceDefinitionRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> updateDataSourceDefinitionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> DeleteDataSourceDefinition</td>
 *      <td><p> Deletes a data source definition, all of the transfer configs associated with this data source definition (if any) must be deleted first by the user in ALL regions, in order to delete the data source definition. This method is primarily meant for deleting data sources created during testing stage. If the data source is referenced by transfer configs in the region specified in the request URL, the method will fail immediately. If in the current region (e.g., US) it's not used by any transfer configs, but in another region (e.g., EU) it is, then although the method will succeed in region US, but it will fail when the deletion operation is replicated to region EU. And eventually, the system will replicate the data source definition back from EU to US, in order to bring all regions to consistency. The final effect is that the data source appears to be 'undeleted' in the US region.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> deleteDataSourceDefinition(DeleteDataSourceDefinitionRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> deleteDataSourceDefinitionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetDataSourceDefinition</td>
 *      <td><p> Retrieves an existing data source definition.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getDataSourceDefinition(GetDataSourceDefinitionRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getDataSourceDefinitionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListDataSourceDefinitions</td>
 *      <td><p> Lists supported data source definitions.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listDataSourceDefinitions(ListDataSourceDefinitionsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listDataSourceDefinitionsPagedCallable()
 *           <li><p> listDataSourceDefinitionsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ListLocations</td>
 *      <td><p> Lists information about the supported locations for this service.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> listLocations(ListLocationsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> listLocationsPagedCallable()
 *           <li><p> listLocationsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> GetLocation</td>
 *      <td><p> Gets information about a location.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> getLocation(GetLocationRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> getLocationCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of DataSourceServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataSourceServiceSettings dataSourceServiceSettings =
 *     DataSourceServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * DataSourceServiceClient dataSourceServiceClient =
 *     DataSourceServiceClient.create(dataSourceServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataSourceServiceSettings dataSourceServiceSettings =
 *     DataSourceServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * DataSourceServiceClient dataSourceServiceClient =
 *     DataSourceServiceClient.create(dataSourceServiceSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataSourceServiceSettings dataSourceServiceSettings =
 *     DataSourceServiceSettings.newHttpJsonBuilder().build();
 * DataSourceServiceClient dataSourceServiceClient =
 *     DataSourceServiceClient.create(dataSourceServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class DataSourceServiceClient implements BackgroundResource {
  private final DataSourceServiceSettings settings;
  private final DataSourceServiceStub stub;

  /** Constructs an instance of DataSourceServiceClient with default settings. */
  public static final DataSourceServiceClient create() throws IOException {
    return create(DataSourceServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of DataSourceServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final DataSourceServiceClient create(DataSourceServiceSettings settings)
      throws IOException {
    return new DataSourceServiceClient(settings);
  }

  /**
   * Constructs an instance of DataSourceServiceClient, using the given stub for making calls. This
   * is for advanced usage - prefer using create(DataSourceServiceSettings).
   */
  public static final DataSourceServiceClient create(DataSourceServiceStub stub) {
    return new DataSourceServiceClient(stub);
  }

  /**
   * Constructs an instance of DataSourceServiceClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected DataSourceServiceClient(DataSourceServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((DataSourceServiceStubSettings) settings.getStubSettings()).createStub();
  }

  protected DataSourceServiceClient(DataSourceServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final DataSourceServiceSettings getSettings() {
    return settings;
  }

  public DataSourceServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a transfer run. If successful, resets data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
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
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final TransferRun updateTransferRun(UpdateTransferRunRequest request) {
    return updateTransferRunCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Update a transfer run. If successful, resets data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
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
   *   ApiFuture<TransferRun> future =
   *       dataSourceServiceClient.updateTransferRunCallable().futureCall(request);
   *   // Do something.
   *   TransferRun response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateTransferRunRequest, TransferRun> updateTransferRunCallable() {
    return stub.updateTransferRunCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Log messages for a transfer run. If successful (at least 1 message), resets
   * data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   LogTransferRunMessagesRequest request =
   *       LogTransferRunMessagesRequest.newBuilder()
   *           .setName("name3373707")
   *           .addAllTransferMessages(new ArrayList<TransferMessage>())
   *           .build();
   *   dataSourceServiceClient.logTransferRunMessages(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void logTransferRunMessages(LogTransferRunMessagesRequest request) {
    logTransferRunMessagesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Log messages for a transfer run. If successful (at least 1 message), resets
   * data_source.update_deadline_seconds timer.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   LogTransferRunMessagesRequest request =
   *       LogTransferRunMessagesRequest.newBuilder()
   *           .setName("name3373707")
   *           .addAllTransferMessages(new ArrayList<TransferMessage>())
   *           .build();
   *   ApiFuture<Empty> future =
   *       dataSourceServiceClient.logTransferRunMessagesCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<LogTransferRunMessagesRequest, Empty>
      logTransferRunMessagesCallable() {
    return stub.logTransferRunMessagesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Notify the Data Transfer Service that data is ready for loading. The Data Transfer Service will
   * start and monitor multiple BigQuery Load jobs for a transfer run. Monitored jobs will be
   * automatically retried and produce log messages when starting and finishing a job. Can be called
   * multiple times for the same transfer run.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   StartBigQueryJobsRequest request =
   *       StartBigQueryJobsRequest.newBuilder()
   *           .setName("name3373707")
   *           .addAllImportedData(new ArrayList<ImportedDataInfo>())
   *           .setUserCredentials(ByteString.EMPTY)
   *           .setMaxParallelism(-1515657535)
   *           .build();
   *   dataSourceServiceClient.startBigQueryJobs(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void startBigQueryJobs(StartBigQueryJobsRequest request) {
    startBigQueryJobsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Notify the Data Transfer Service that data is ready for loading. The Data Transfer Service will
   * start and monitor multiple BigQuery Load jobs for a transfer run. Monitored jobs will be
   * automatically retried and produce log messages when starting and finishing a job. Can be called
   * multiple times for the same transfer run.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   StartBigQueryJobsRequest request =
   *       StartBigQueryJobsRequest.newBuilder()
   *           .setName("name3373707")
   *           .addAllImportedData(new ArrayList<ImportedDataInfo>())
   *           .setUserCredentials(ByteString.EMPTY)
   *           .setMaxParallelism(-1515657535)
   *           .build();
   *   ApiFuture<Empty> future =
   *       dataSourceServiceClient.startBigQueryJobsCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<StartBigQueryJobsRequest, Empty> startBigQueryJobsCallable() {
    return stub.startBigQueryJobsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Notify the Data Transfer Service that the data source is done processing the run. No more
   * status updates or requests to start/monitor jobs will be accepted. The run will be finalized by
   * the Data Transfer Service when all monitored jobs are completed. Does not need to be called if
   * the run is set to FAILED.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   FinishRunRequest request = FinishRunRequest.newBuilder().setName("name3373707").build();
   *   dataSourceServiceClient.finishRun(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void finishRun(FinishRunRequest request) {
    finishRunCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Notify the Data Transfer Service that the data source is done processing the run. No more
   * status updates or requests to start/monitor jobs will be accepted. The run will be finalized by
   * the Data Transfer Service when all monitored jobs are completed. Does not need to be called if
   * the run is set to FAILED.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   FinishRunRequest request = FinishRunRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Empty> future = dataSourceServiceClient.finishRunCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<FinishRunRequest, Empty> finishRunCallable() {
    return stub.finishRunCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a data source definition. Calling this method will automatically use your credentials
   * to create the following Google Cloud resources in YOUR Google Cloud project. 1. OAuth client 2.
   * Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
   * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
   * The field data_source.client_id should be left empty in the input request, as the API will
   * create a new OAuth client on behalf of the caller. On the other hand data_source.scopes usually
   * need to be set when there are OAuth scopes that need to be granted by end users. 3. We need a
   * longer deadline due to the 60 seconds SLO from Pub/Sub admin Operations. This also applies to
   * update and delete data source definition.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   CreateDataSourceDefinitionRequest request =
   *       CreateDataSourceDefinitionRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
   *           .build();
   *   DataSourceDefinition response = dataSourceServiceClient.createDataSourceDefinition(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition createDataSourceDefinition(
      CreateDataSourceDefinitionRequest request) {
    return createDataSourceDefinitionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a data source definition. Calling this method will automatically use your credentials
   * to create the following Google Cloud resources in YOUR Google Cloud project. 1. OAuth client 2.
   * Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
   * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
   * The field data_source.client_id should be left empty in the input request, as the API will
   * create a new OAuth client on behalf of the caller. On the other hand data_source.scopes usually
   * need to be set when there are OAuth scopes that need to be granted by end users. 3. We need a
   * longer deadline due to the 60 seconds SLO from Pub/Sub admin Operations. This also applies to
   * update and delete data source definition.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   CreateDataSourceDefinitionRequest request =
   *       CreateDataSourceDefinitionRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
   *           .build();
   *   ApiFuture<DataSourceDefinition> future =
   *       dataSourceServiceClient.createDataSourceDefinitionCallable().futureCall(request);
   *   // Do something.
   *   DataSourceDefinition response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionCallable() {
    return stub.createDataSourceDefinitionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an existing data source definition. If changing supported_location_ids, triggers same
   * effects as mentioned in "Create a data source definition."
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   UpdateDataSourceDefinitionRequest request =
   *       UpdateDataSourceDefinitionRequest.newBuilder()
   *           .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   DataSourceDefinition response = dataSourceServiceClient.updateDataSourceDefinition(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition updateDataSourceDefinition(
      UpdateDataSourceDefinitionRequest request) {
    return updateDataSourceDefinitionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an existing data source definition. If changing supported_location_ids, triggers same
   * effects as mentioned in "Create a data source definition."
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   UpdateDataSourceDefinitionRequest request =
   *       UpdateDataSourceDefinitionRequest.newBuilder()
   *           .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .build();
   *   ApiFuture<DataSourceDefinition> future =
   *       dataSourceServiceClient.updateDataSourceDefinitionCallable().futureCall(request);
   *   // Do something.
   *   DataSourceDefinition response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionCallable() {
    return stub.updateDataSourceDefinitionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a data source definition, all of the transfer configs associated with this data source
   * definition (if any) must be deleted first by the user in ALL regions, in order to delete the
   * data source definition. This method is primarily meant for deleting data sources created during
   * testing stage. If the data source is referenced by transfer configs in the region specified in
   * the request URL, the method will fail immediately. If in the current region (e.g., US) it's not
   * used by any transfer configs, but in another region (e.g., EU) it is, then although the method
   * will succeed in region US, but it will fail when the deletion operation is replicated to region
   * EU. And eventually, the system will replicate the data source definition back from EU to US, in
   * order to bring all regions to consistency. The final effect is that the data source appears to
   * be 'undeleted' in the US region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   DeleteDataSourceDefinitionRequest request =
   *       DeleteDataSourceDefinitionRequest.newBuilder().setName("name3373707").build();
   *   dataSourceServiceClient.deleteDataSourceDefinition(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteDataSourceDefinition(DeleteDataSourceDefinitionRequest request) {
    deleteDataSourceDefinitionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a data source definition, all of the transfer configs associated with this data source
   * definition (if any) must be deleted first by the user in ALL regions, in order to delete the
   * data source definition. This method is primarily meant for deleting data sources created during
   * testing stage. If the data source is referenced by transfer configs in the region specified in
   * the request URL, the method will fail immediately. If in the current region (e.g., US) it's not
   * used by any transfer configs, but in another region (e.g., EU) it is, then although the method
   * will succeed in region US, but it will fail when the deletion operation is replicated to region
   * EU. And eventually, the system will replicate the data source definition back from EU to US, in
   * order to bring all regions to consistency. The final effect is that the data source appears to
   * be 'undeleted' in the US region.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   DeleteDataSourceDefinitionRequest request =
   *       DeleteDataSourceDefinitionRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Empty> future =
   *       dataSourceServiceClient.deleteDataSourceDefinitionCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionCallable() {
    return stub.deleteDataSourceDefinitionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an existing data source definition.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   GetDataSourceDefinitionRequest request =
   *       GetDataSourceDefinitionRequest.newBuilder().setName("name3373707").build();
   *   DataSourceDefinition response = dataSourceServiceClient.getDataSourceDefinition(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final DataSourceDefinition getDataSourceDefinition(
      GetDataSourceDefinitionRequest request) {
    return getDataSourceDefinitionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Retrieves an existing data source definition.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   GetDataSourceDefinitionRequest request =
   *       GetDataSourceDefinitionRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<DataSourceDefinition> future =
   *       dataSourceServiceClient.getDataSourceDefinitionCallable().futureCall(request);
   *   // Do something.
   *   DataSourceDefinition response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionCallable() {
    return stub.getDataSourceDefinitionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists supported data source definitions.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   ListDataSourceDefinitionsRequest request =
   *       ListDataSourceDefinitionsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   for (DataSourceDefinition element :
   *       dataSourceServiceClient.listDataSourceDefinitions(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListDataSourceDefinitionsPagedResponse listDataSourceDefinitions(
      ListDataSourceDefinitionsRequest request) {
    return listDataSourceDefinitionsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists supported data source definitions.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   ListDataSourceDefinitionsRequest request =
   *       ListDataSourceDefinitionsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   ApiFuture<DataSourceDefinition> future =
   *       dataSourceServiceClient.listDataSourceDefinitionsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (DataSourceDefinition element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsPagedCallable() {
    return stub.listDataSourceDefinitionsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists supported data source definitions.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   ListDataSourceDefinitionsRequest request =
   *       ListDataSourceDefinitionsRequest.newBuilder()
   *           .setParent("parent-995424086")
   *           .setPageToken("pageToken873572522")
   *           .setPageSize(883849137)
   *           .build();
   *   while (true) {
   *     ListDataSourceDefinitionsResponse response =
   *         dataSourceServiceClient.listDataSourceDefinitionsCallable().call(request);
   *     for (DataSourceDefinition element : response.getDataSourceDefinitionsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsCallable() {
    return stub.listDataSourceDefinitionsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   for (Location element : dataSourceServiceClient.listLocations(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListLocationsPagedResponse listLocations(ListLocationsRequest request) {
    return listLocationsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   ApiFuture<Location> future =
   *       dataSourceServiceClient.listLocationsPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Location element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return stub.listLocationsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists information about the supported locations for this service.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   ListLocationsRequest request =
   *       ListLocationsRequest.newBuilder()
   *           .setName("name3373707")
   *           .setFilter("filter-1274492040")
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .build();
   *   while (true) {
   *     ListLocationsResponse response =
   *         dataSourceServiceClient.listLocationsCallable().call(request);
   *     for (Location element : response.getLocationsList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return stub.listLocationsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   Location response = dataSourceServiceClient.getLocation(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Location getLocation(GetLocationRequest request) {
    return getLocationCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets information about a location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (DataSourceServiceClient dataSourceServiceClient = DataSourceServiceClient.create()) {
   *   GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
   *   ApiFuture<Location> future =
   *       dataSourceServiceClient.getLocationCallable().futureCall(request);
   *   // Do something.
   *   Location response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return stub.getLocationCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListDataSourceDefinitionsPagedResponse
      extends AbstractPagedListResponse<
          ListDataSourceDefinitionsRequest,
          ListDataSourceDefinitionsResponse,
          DataSourceDefinition,
          ListDataSourceDefinitionsPage,
          ListDataSourceDefinitionsFixedSizeCollection> {

    public static ApiFuture<ListDataSourceDefinitionsPagedResponse> createAsync(
        PageContext<
                ListDataSourceDefinitionsRequest,
                ListDataSourceDefinitionsResponse,
                DataSourceDefinition>
            context,
        ApiFuture<ListDataSourceDefinitionsResponse> futureResponse) {
      ApiFuture<ListDataSourceDefinitionsPage> futurePage =
          ListDataSourceDefinitionsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListDataSourceDefinitionsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListDataSourceDefinitionsPagedResponse(ListDataSourceDefinitionsPage page) {
      super(page, ListDataSourceDefinitionsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListDataSourceDefinitionsPage
      extends AbstractPage<
          ListDataSourceDefinitionsRequest,
          ListDataSourceDefinitionsResponse,
          DataSourceDefinition,
          ListDataSourceDefinitionsPage> {

    private ListDataSourceDefinitionsPage(
        PageContext<
                ListDataSourceDefinitionsRequest,
                ListDataSourceDefinitionsResponse,
                DataSourceDefinition>
            context,
        ListDataSourceDefinitionsResponse response) {
      super(context, response);
    }

    private static ListDataSourceDefinitionsPage createEmptyPage() {
      return new ListDataSourceDefinitionsPage(null, null);
    }

    @Override
    protected ListDataSourceDefinitionsPage createPage(
        PageContext<
                ListDataSourceDefinitionsRequest,
                ListDataSourceDefinitionsResponse,
                DataSourceDefinition>
            context,
        ListDataSourceDefinitionsResponse response) {
      return new ListDataSourceDefinitionsPage(context, response);
    }

    @Override
    public ApiFuture<ListDataSourceDefinitionsPage> createPageAsync(
        PageContext<
                ListDataSourceDefinitionsRequest,
                ListDataSourceDefinitionsResponse,
                DataSourceDefinition>
            context,
        ApiFuture<ListDataSourceDefinitionsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListDataSourceDefinitionsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListDataSourceDefinitionsRequest,
          ListDataSourceDefinitionsResponse,
          DataSourceDefinition,
          ListDataSourceDefinitionsPage,
          ListDataSourceDefinitionsFixedSizeCollection> {

    private ListDataSourceDefinitionsFixedSizeCollection(
        List<ListDataSourceDefinitionsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListDataSourceDefinitionsFixedSizeCollection createEmptyCollection() {
      return new ListDataSourceDefinitionsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListDataSourceDefinitionsFixedSizeCollection createCollection(
        List<ListDataSourceDefinitionsPage> pages, int collectionSize) {
      return new ListDataSourceDefinitionsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListLocationsPagedResponse
      extends AbstractPagedListResponse<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    public static ApiFuture<ListLocationsPagedResponse> createAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      ApiFuture<ListLocationsPage> futurePage =
          ListLocationsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListLocationsPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListLocationsPagedResponse(ListLocationsPage page) {
      super(page, ListLocationsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListLocationsPage
      extends AbstractPage<
          ListLocationsRequest, ListLocationsResponse, Location, ListLocationsPage> {

    private ListLocationsPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      super(context, response);
    }

    private static ListLocationsPage createEmptyPage() {
      return new ListLocationsPage(null, null);
    }

    @Override
    protected ListLocationsPage createPage(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ListLocationsResponse response) {
      return new ListLocationsPage(context, response);
    }

    @Override
    public ApiFuture<ListLocationsPage> createPageAsync(
        PageContext<ListLocationsRequest, ListLocationsResponse, Location> context,
        ApiFuture<ListLocationsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListLocationsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListLocationsRequest,
          ListLocationsResponse,
          Location,
          ListLocationsPage,
          ListLocationsFixedSizeCollection> {

    private ListLocationsFixedSizeCollection(List<ListLocationsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListLocationsFixedSizeCollection createEmptyCollection() {
      return new ListLocationsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListLocationsFixedSizeCollection createCollection(
        List<ListLocationsPage> pages, int collectionSize) {
      return new ListLocationsFixedSizeCollection(pages, collectionSize);
    }
  }
}
