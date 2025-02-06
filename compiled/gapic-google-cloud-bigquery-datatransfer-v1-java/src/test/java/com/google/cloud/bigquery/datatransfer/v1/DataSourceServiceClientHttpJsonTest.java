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

import static com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListDataSourceDefinitionsPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListLocationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.bigquery.datatransfer.v1.stub.HttpJsonDataSourceServiceStub;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.Lists;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class DataSourceServiceClientHttpJsonTest {
  private static MockHttpService mockService;
  private static DataSourceServiceClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonDataSourceServiceStub.getMethodDescriptors(),
            DataSourceServiceSettings.getDefaultEndpoint());
    DataSourceServiceSettings settings =
        DataSourceServiceSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                DataSourceServiceSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DataSourceServiceClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void updateTransferRunTest() throws Exception {
    TransferRun expectedResponse =
        TransferRun.newBuilder()
            .setName(
                RunName.ofProjectLocationTransferConfigRunName(
                        "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]")
                    .toString())
            .putAllLabels(new HashMap<String, String>())
            .setScheduleTime(Timestamp.newBuilder().build())
            .setRunTime(Timestamp.newBuilder().build())
            .setErrorStatus(Status.newBuilder().build())
            .setStartTime(Timestamp.newBuilder().build())
            .setEndTime(Timestamp.newBuilder().build())
            .setUpdateTime(Timestamp.newBuilder().build())
            .setParams(Struct.newBuilder().build())
            .setDataSourceId("dataSourceId-1221402528")
            .setState(TransferState.forNumber(0))
            .setUserId(-147132913)
            .setSchedule("schedule-697920873")
            .setNotificationPubsubTopic("notificationPubsubTopic-1361224991")
            .setEmailPreferences(EmailPreferences.newBuilder().build())
            .setPartnerToken("partnerToken151628305")
            .build();
    mockService.addResponse(expectedResponse);

    UpdateTransferRunRequest request =
        UpdateTransferRunRequest.newBuilder()
            .setTransferRun(
                TransferRun.newBuilder()
                    .setName(
                        RunName.ofProjectLocationTransferConfigRunName(
                                "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]")
                            .toString())
                    .putAllLabels(new HashMap<String, String>())
                    .setScheduleTime(Timestamp.newBuilder().build())
                    .setRunTime(Timestamp.newBuilder().build())
                    .setErrorStatus(Status.newBuilder().build())
                    .setStartTime(Timestamp.newBuilder().build())
                    .setEndTime(Timestamp.newBuilder().build())
                    .setUpdateTime(Timestamp.newBuilder().build())
                    .setParams(Struct.newBuilder().build())
                    .setDataSourceId("dataSourceId-1221402528")
                    .setState(TransferState.forNumber(0))
                    .setUserId(-147132913)
                    .setSchedule("schedule-697920873")
                    .setNotificationPubsubTopic("notificationPubsubTopic-1361224991")
                    .setEmailPreferences(EmailPreferences.newBuilder().build())
                    .setPartnerToken("partnerToken151628305")
                    .build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    TransferRun actualResponse = client.updateTransferRun(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateTransferRunExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      UpdateTransferRunRequest request =
          UpdateTransferRunRequest.newBuilder()
              .setTransferRun(
                  TransferRun.newBuilder()
                      .setName(
                          RunName.ofProjectLocationTransferConfigRunName(
                                  "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]")
                              .toString())
                      .putAllLabels(new HashMap<String, String>())
                      .setScheduleTime(Timestamp.newBuilder().build())
                      .setRunTime(Timestamp.newBuilder().build())
                      .setErrorStatus(Status.newBuilder().build())
                      .setStartTime(Timestamp.newBuilder().build())
                      .setEndTime(Timestamp.newBuilder().build())
                      .setUpdateTime(Timestamp.newBuilder().build())
                      .setParams(Struct.newBuilder().build())
                      .setDataSourceId("dataSourceId-1221402528")
                      .setState(TransferState.forNumber(0))
                      .setUserId(-147132913)
                      .setSchedule("schedule-697920873")
                      .setNotificationPubsubTopic("notificationPubsubTopic-1361224991")
                      .setEmailPreferences(EmailPreferences.newBuilder().build())
                      .setPartnerToken("partnerToken151628305")
                      .build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.updateTransferRun(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void logTransferRunMessagesTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    LogTransferRunMessagesRequest request =
        LogTransferRunMessagesRequest.newBuilder()
            .setName(
                "projects/project-9834/locations/location-9834/transferConfigs/transferConfig-9834/runs/run-9834")
            .addAllTransferMessages(new ArrayList<TransferMessage>())
            .build();

    client.logTransferRunMessages(request);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void logTransferRunMessagesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LogTransferRunMessagesRequest request =
          LogTransferRunMessagesRequest.newBuilder()
              .setName(
                  "projects/project-9834/locations/location-9834/transferConfigs/transferConfig-9834/runs/run-9834")
              .addAllTransferMessages(new ArrayList<TransferMessage>())
              .build();
      client.logTransferRunMessages(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void startBigQueryJobsTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    StartBigQueryJobsRequest request =
        StartBigQueryJobsRequest.newBuilder()
            .setName(
                "projects/project-9834/locations/location-9834/transferConfigs/transferConfig-9834/runs/run-9834")
            .addAllImportedData(new ArrayList<ImportedDataInfo>())
            .setUserCredentials(ByteString.EMPTY)
            .setMaxParallelism(-1515657535)
            .build();

    client.startBigQueryJobs(request);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void startBigQueryJobsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      StartBigQueryJobsRequest request =
          StartBigQueryJobsRequest.newBuilder()
              .setName(
                  "projects/project-9834/locations/location-9834/transferConfigs/transferConfig-9834/runs/run-9834")
              .addAllImportedData(new ArrayList<ImportedDataInfo>())
              .setUserCredentials(ByteString.EMPTY)
              .setMaxParallelism(-1515657535)
              .build();
      client.startBigQueryJobs(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void finishRunTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    FinishRunRequest request =
        FinishRunRequest.newBuilder()
            .setName(
                "projects/project-9834/locations/location-9834/transferConfigs/transferConfig-9834/runs/run-9834")
            .build();

    client.finishRun(request);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void finishRunExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      FinishRunRequest request =
          FinishRunRequest.newBuilder()
              .setName(
                  "projects/project-9834/locations/location-9834/transferConfigs/transferConfig-9834/runs/run-9834")
              .build();
      client.finishRun(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createDataSourceDefinitionTest() throws Exception {
    DataSourceDefinition expectedResponse =
        DataSourceDefinition.newBuilder()
            .setName("name3373707")
            .setDataSource(DataSource.newBuilder().build())
            .setTransferRunPubsubTopic("transferRunPubsubTopic1134735884")
            .setRunTimeOffset(Duration.newBuilder().build())
            .setSupportEmail("supportEmail-1568709363")
            .setServiceAccount("serviceAccount1079137720")
            .setDisabled(true)
            .setTransferConfigPubsubTopic("transferConfigPubsubTopic-1921888385")
            .addAllSupportedLocationIds(new ArrayList<String>())
            .build();
    mockService.addResponse(expectedResponse);

    CreateDataSourceDefinitionRequest request =
        CreateDataSourceDefinitionRequest.newBuilder()
            .setParent("projects/project-5833/locations/location-5833")
            .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
            .build();

    DataSourceDefinition actualResponse = client.createDataSourceDefinition(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createDataSourceDefinitionExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      CreateDataSourceDefinitionRequest request =
          CreateDataSourceDefinitionRequest.newBuilder()
              .setParent("projects/project-5833/locations/location-5833")
              .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
              .build();
      client.createDataSourceDefinition(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateDataSourceDefinitionTest() throws Exception {
    DataSourceDefinition expectedResponse =
        DataSourceDefinition.newBuilder()
            .setName("name3373707")
            .setDataSource(DataSource.newBuilder().build())
            .setTransferRunPubsubTopic("transferRunPubsubTopic1134735884")
            .setRunTimeOffset(Duration.newBuilder().build())
            .setSupportEmail("supportEmail-1568709363")
            .setServiceAccount("serviceAccount1079137720")
            .setDisabled(true)
            .setTransferConfigPubsubTopic("transferConfigPubsubTopic-1921888385")
            .addAllSupportedLocationIds(new ArrayList<String>())
            .build();
    mockService.addResponse(expectedResponse);

    UpdateDataSourceDefinitionRequest request =
        UpdateDataSourceDefinitionRequest.newBuilder()
            .setDataSourceDefinition(
                DataSourceDefinition.newBuilder()
                    .setName(
                        "projects/project-9585/locations/location-9585/dataSourceDefinitions/dataSourceDefinition-9585")
                    .setDataSource(DataSource.newBuilder().build())
                    .setTransferRunPubsubTopic("transferRunPubsubTopic1134735884")
                    .setRunTimeOffset(Duration.newBuilder().build())
                    .setSupportEmail("supportEmail-1568709363")
                    .setServiceAccount("serviceAccount1079137720")
                    .setDisabled(true)
                    .setTransferConfigPubsubTopic("transferConfigPubsubTopic-1921888385")
                    .addAllSupportedLocationIds(new ArrayList<String>())
                    .build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    DataSourceDefinition actualResponse = client.updateDataSourceDefinition(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateDataSourceDefinitionExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      UpdateDataSourceDefinitionRequest request =
          UpdateDataSourceDefinitionRequest.newBuilder()
              .setDataSourceDefinition(
                  DataSourceDefinition.newBuilder()
                      .setName(
                          "projects/project-9585/locations/location-9585/dataSourceDefinitions/dataSourceDefinition-9585")
                      .setDataSource(DataSource.newBuilder().build())
                      .setTransferRunPubsubTopic("transferRunPubsubTopic1134735884")
                      .setRunTimeOffset(Duration.newBuilder().build())
                      .setSupportEmail("supportEmail-1568709363")
                      .setServiceAccount("serviceAccount1079137720")
                      .setDisabled(true)
                      .setTransferConfigPubsubTopic("transferConfigPubsubTopic-1921888385")
                      .addAllSupportedLocationIds(new ArrayList<String>())
                      .build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      client.updateDataSourceDefinition(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteDataSourceDefinitionTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    mockService.addResponse(expectedResponse);

    DeleteDataSourceDefinitionRequest request =
        DeleteDataSourceDefinitionRequest.newBuilder()
            .setName(
                "projects/project-9585/locations/location-9585/dataSourceDefinitions/dataSourceDefinition-9585")
            .build();

    client.deleteDataSourceDefinition(request);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteDataSourceDefinitionExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      DeleteDataSourceDefinitionRequest request =
          DeleteDataSourceDefinitionRequest.newBuilder()
              .setName(
                  "projects/project-9585/locations/location-9585/dataSourceDefinitions/dataSourceDefinition-9585")
              .build();
      client.deleteDataSourceDefinition(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getDataSourceDefinitionTest() throws Exception {
    DataSourceDefinition expectedResponse =
        DataSourceDefinition.newBuilder()
            .setName("name3373707")
            .setDataSource(DataSource.newBuilder().build())
            .setTransferRunPubsubTopic("transferRunPubsubTopic1134735884")
            .setRunTimeOffset(Duration.newBuilder().build())
            .setSupportEmail("supportEmail-1568709363")
            .setServiceAccount("serviceAccount1079137720")
            .setDisabled(true)
            .setTransferConfigPubsubTopic("transferConfigPubsubTopic-1921888385")
            .addAllSupportedLocationIds(new ArrayList<String>())
            .build();
    mockService.addResponse(expectedResponse);

    GetDataSourceDefinitionRequest request =
        GetDataSourceDefinitionRequest.newBuilder()
            .setName(
                "projects/project-9585/locations/location-9585/dataSourceDefinitions/dataSourceDefinition-9585")
            .build();

    DataSourceDefinition actualResponse = client.getDataSourceDefinition(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getDataSourceDefinitionExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetDataSourceDefinitionRequest request =
          GetDataSourceDefinitionRequest.newBuilder()
              .setName(
                  "projects/project-9585/locations/location-9585/dataSourceDefinitions/dataSourceDefinition-9585")
              .build();
      client.getDataSourceDefinition(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listDataSourceDefinitionsTest() throws Exception {
    DataSourceDefinition responsesElement = DataSourceDefinition.newBuilder().build();
    ListDataSourceDefinitionsResponse expectedResponse =
        ListDataSourceDefinitionsResponse.newBuilder()
            .setNextPageToken("")
            .addAllDataSourceDefinitions(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ListDataSourceDefinitionsRequest request =
        ListDataSourceDefinitionsRequest.newBuilder()
            .setParent("projects/project-5833/locations/location-5833")
            .setPageToken("pageToken873572522")
            .setPageSize(883849137)
            .build();

    ListDataSourceDefinitionsPagedResponse pagedListResponse =
        client.listDataSourceDefinitions(request);

    List<DataSourceDefinition> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDataSourceDefinitionsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listDataSourceDefinitionsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ListDataSourceDefinitionsRequest request =
          ListDataSourceDefinitionsRequest.newBuilder()
              .setParent("projects/project-5833/locations/location-5833")
              .setPageToken("pageToken873572522")
              .setPageSize(883849137)
              .build();
      client.listDataSourceDefinitions(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listLocationsTest() throws Exception {
    Location responsesElement = Location.newBuilder().build();
    ListLocationsResponse expectedResponse =
        ListLocationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLocations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("projects/project-3664")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listLocationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("projects/project-3664")
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.listLocations(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLocationTest() throws Exception {
    Location expectedResponse =
        Location.newBuilder()
            .setName("name3373707")
            .setLocationId("locationId1541836720")
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setMetadata(Any.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    GetLocationRequest request =
        GetLocationRequest.newBuilder()
            .setName("projects/project-9062/locations/location-9062")
            .build();

    Location actualResponse = client.getLocation(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getLocationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetLocationRequest request =
          GetLocationRequest.newBuilder()
              .setName("projects/project-9062/locations/location-9062")
              .build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
