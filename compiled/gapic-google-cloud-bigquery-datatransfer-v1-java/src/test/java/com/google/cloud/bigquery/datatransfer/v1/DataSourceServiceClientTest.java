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
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.grpc.testing.MockGrpcService;
import com.google.api.gax.grpc.testing.MockServiceHelper;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.common.collect.Lists;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Struct;
import com.google.protobuf.Timestamp;
import com.google.rpc.Status;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class DataSourceServiceClientTest {
  private static MockDataSourceService mockDataSourceService;
  private static MockLocations mockLocations;
  private static MockServiceHelper mockServiceHelper;
  private LocalChannelProvider channelProvider;
  private DataSourceServiceClient client;

  @BeforeClass
  public static void startStaticServer() {
    mockDataSourceService = new MockDataSourceService();
    mockLocations = new MockLocations();
    mockServiceHelper =
        new MockServiceHelper(
            UUID.randomUUID().toString(),
            Arrays.<MockGrpcService>asList(mockDataSourceService, mockLocations));
    mockServiceHelper.start();
  }

  @AfterClass
  public static void stopServer() {
    mockServiceHelper.stop();
  }

  @Before
  public void setUp() throws IOException {
    mockServiceHelper.reset();
    channelProvider = mockServiceHelper.createChannelProvider();
    DataSourceServiceSettings settings =
        DataSourceServiceSettings.newBuilder()
            .setTransportChannelProvider(channelProvider)
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = DataSourceServiceClient.create(settings);
  }

  @After
  public void tearDown() throws Exception {
    client.close();
  }

  @Test
  public void updateTransferRunTest() throws Exception {
    TransferRun expectedResponse =
        TransferRun.newBuilder()
            .setName(
                RunName.ofProjectLocationTransferConfigRunName(
                        "[PROJECT]", "[LOCATION]", "[TRANSFER_CONFIG]", "[RUN]")
                    .toString())
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
            .build();
    mockDataSourceService.addResponse(expectedResponse);

    UpdateTransferRunRequest request =
        UpdateTransferRunRequest.newBuilder()
            .setTransferRun(TransferRun.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    TransferRun actualResponse = client.updateTransferRun(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateTransferRunRequest actualRequest = ((UpdateTransferRunRequest) actualRequests.get(0));

    Assert.assertEquals(request.getTransferRun(), actualRequest.getTransferRun());
    Assert.assertEquals(request.getUpdateMask(), actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateTransferRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      UpdateTransferRunRequest request =
          UpdateTransferRunRequest.newBuilder()
              .setTransferRun(TransferRun.newBuilder().build())
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
    mockDataSourceService.addResponse(expectedResponse);

    LogTransferRunMessagesRequest request =
        LogTransferRunMessagesRequest.newBuilder()
            .setName("name3373707")
            .addAllTransferMessages(new ArrayList<TransferMessage>())
            .build();

    client.logTransferRunMessages(request);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    LogTransferRunMessagesRequest actualRequest =
        ((LogTransferRunMessagesRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertEquals(request.getTransferMessagesList(), actualRequest.getTransferMessagesList());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void logTransferRunMessagesExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      LogTransferRunMessagesRequest request =
          LogTransferRunMessagesRequest.newBuilder()
              .setName("name3373707")
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
    mockDataSourceService.addResponse(expectedResponse);

    StartBigQueryJobsRequest request =
        StartBigQueryJobsRequest.newBuilder()
            .setName("name3373707")
            .addAllImportedData(new ArrayList<ImportedDataInfo>())
            .setUserCredentials(ByteString.EMPTY)
            .setMaxParallelism(-1515657535)
            .build();

    client.startBigQueryJobs(request);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    StartBigQueryJobsRequest actualRequest = ((StartBigQueryJobsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertEquals(request.getImportedDataList(), actualRequest.getImportedDataList());
    Assert.assertEquals(request.getUserCredentials(), actualRequest.getUserCredentials());
    Assert.assertEquals(request.getMaxParallelism(), actualRequest.getMaxParallelism());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void startBigQueryJobsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      StartBigQueryJobsRequest request =
          StartBigQueryJobsRequest.newBuilder()
              .setName("name3373707")
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
    mockDataSourceService.addResponse(expectedResponse);

    FinishRunRequest request = FinishRunRequest.newBuilder().setName("name3373707").build();

    client.finishRun(request);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    FinishRunRequest actualRequest = ((FinishRunRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void finishRunExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      FinishRunRequest request = FinishRunRequest.newBuilder().setName("name3373707").build();
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
    mockDataSourceService.addResponse(expectedResponse);

    CreateDataSourceDefinitionRequest request =
        CreateDataSourceDefinitionRequest.newBuilder()
            .setParent("parent-995424086")
            .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
            .build();

    DataSourceDefinition actualResponse = client.createDataSourceDefinition(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    CreateDataSourceDefinitionRequest actualRequest =
        ((CreateDataSourceDefinitionRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getDataSourceDefinition(), actualRequest.getDataSourceDefinition());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void createDataSourceDefinitionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      CreateDataSourceDefinitionRequest request =
          CreateDataSourceDefinitionRequest.newBuilder()
              .setParent("parent-995424086")
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
    mockDataSourceService.addResponse(expectedResponse);

    UpdateDataSourceDefinitionRequest request =
        UpdateDataSourceDefinitionRequest.newBuilder()
            .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
            .setUpdateMask(FieldMask.newBuilder().build())
            .build();

    DataSourceDefinition actualResponse = client.updateDataSourceDefinition(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    UpdateDataSourceDefinitionRequest actualRequest =
        ((UpdateDataSourceDefinitionRequest) actualRequests.get(0));

    Assert.assertEquals(request.getDataSourceDefinition(), actualRequest.getDataSourceDefinition());
    Assert.assertEquals(request.getUpdateMask(), actualRequest.getUpdateMask());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void updateDataSourceDefinitionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      UpdateDataSourceDefinitionRequest request =
          UpdateDataSourceDefinitionRequest.newBuilder()
              .setDataSourceDefinition(DataSourceDefinition.newBuilder().build())
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
    mockDataSourceService.addResponse(expectedResponse);

    DeleteDataSourceDefinitionRequest request =
        DeleteDataSourceDefinitionRequest.newBuilder().setName("name3373707").build();

    client.deleteDataSourceDefinition(request);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    DeleteDataSourceDefinitionRequest actualRequest =
        ((DeleteDataSourceDefinitionRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void deleteDataSourceDefinitionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      DeleteDataSourceDefinitionRequest request =
          DeleteDataSourceDefinitionRequest.newBuilder().setName("name3373707").build();
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
    mockDataSourceService.addResponse(expectedResponse);

    GetDataSourceDefinitionRequest request =
        GetDataSourceDefinitionRequest.newBuilder().setName("name3373707").build();

    DataSourceDefinition actualResponse = client.getDataSourceDefinition(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetDataSourceDefinitionRequest actualRequest =
        ((GetDataSourceDefinitionRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getDataSourceDefinitionExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      GetDataSourceDefinitionRequest request =
          GetDataSourceDefinitionRequest.newBuilder().setName("name3373707").build();
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
    mockDataSourceService.addResponse(expectedResponse);

    ListDataSourceDefinitionsRequest request =
        ListDataSourceDefinitionsRequest.newBuilder()
            .setParent("parent-995424086")
            .setPageToken("pageToken873572522")
            .setPageSize(883849137)
            .build();

    ListDataSourceDefinitionsPagedResponse pagedListResponse =
        client.listDataSourceDefinitions(request);

    List<DataSourceDefinition> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getDataSourceDefinitionsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockDataSourceService.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListDataSourceDefinitionsRequest actualRequest =
        ((ListDataSourceDefinitionsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getParent(), actualRequest.getParent());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listDataSourceDefinitionsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockDataSourceService.addException(exception);

    try {
      ListDataSourceDefinitionsRequest request =
          ListDataSourceDefinitionsRequest.newBuilder()
              .setParent("parent-995424086")
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
    mockLocations.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("name3373707")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

    List<AbstractMessage> actualRequests = mockLocations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    ListLocationsRequest actualRequest = ((ListLocationsRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertEquals(request.getFilter(), actualRequest.getFilter());
    Assert.assertEquals(request.getPageSize(), actualRequest.getPageSize());
    Assert.assertEquals(request.getPageToken(), actualRequest.getPageToken());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void listLocationsExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLocations.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("name3373707")
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
    mockLocations.addResponse(expectedResponse);

    GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();

    Location actualResponse = client.getLocation(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<AbstractMessage> actualRequests = mockLocations.getRequests();
    Assert.assertEquals(1, actualRequests.size());
    GetLocationRequest actualRequest = ((GetLocationRequest) actualRequests.get(0));

    Assert.assertEquals(request.getName(), actualRequest.getName());
    Assert.assertTrue(
        channelProvider.isHeaderSent(
            ApiClientHeaderProvider.getDefaultApiClientHeaderKey(),
            GaxGrpcProperties.getDefaultApiClientHeaderPattern()));
  }

  @Test
  public void getLocationExceptionTest() throws Exception {
    StatusRuntimeException exception = new StatusRuntimeException(io.grpc.Status.INVALID_ARGUMENT);
    mockLocations.addException(exception);

    try {
      GetLocationRequest request = GetLocationRequest.newBuilder().setName("name3373707").build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
