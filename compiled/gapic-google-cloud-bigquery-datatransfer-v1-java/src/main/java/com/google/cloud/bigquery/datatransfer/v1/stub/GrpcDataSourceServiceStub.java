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

package com.google.cloud.bigquery.datatransfer.v1.stub;

import static com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListDataSourceDefinitionsPagedResponse;
import static com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceClient.ListLocationsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition;
import com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest;
import com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest;
import com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse;
import com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest;
import com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest;
import com.google.cloud.bigquery.datatransfer.v1.TransferRun;
import com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest;
import com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the DataSourceService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcDataSourceServiceStub extends DataSourceServiceStub {
  private static final MethodDescriptor<UpdateTransferRunRequest, TransferRun>
      updateTransferRunMethodDescriptor =
          MethodDescriptor.<UpdateTransferRunRequest, TransferRun>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/UpdateTransferRun")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateTransferRunRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(TransferRun.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<LogTransferRunMessagesRequest, Empty>
      logTransferRunMessagesMethodDescriptor =
          MethodDescriptor.<LogTransferRunMessagesRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/LogTransferRunMessages")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(LogTransferRunMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<StartBigQueryJobsRequest, Empty>
      startBigQueryJobsMethodDescriptor =
          MethodDescriptor.<StartBigQueryJobsRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/StartBigQueryJobs")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(StartBigQueryJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<FinishRunRequest, Empty> finishRunMethodDescriptor =
      MethodDescriptor.<FinishRunRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.bigquery.datatransfer.v1.DataSourceService/FinishRun")
          .setRequestMarshaller(ProtoUtils.marshaller(FinishRunRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionMethodDescriptor =
          MethodDescriptor.<CreateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/CreateDataSourceDefinition")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DataSourceDefinition.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionMethodDescriptor =
          MethodDescriptor.<UpdateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/UpdateDataSourceDefinition")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DataSourceDefinition.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionMethodDescriptor =
          MethodDescriptor.<DeleteDataSourceDefinitionRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/DeleteDataSourceDefinition")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionMethodDescriptor =
          MethodDescriptor.<GetDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/GetDataSourceDefinition")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DataSourceDefinition.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsMethodDescriptor =
          MethodDescriptor
              .<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/ListDataSourceDefinitions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListDataSourceDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListDataSourceDefinitionsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          MethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListLocationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListLocationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetLocationRequest, Location> getLocationMethodDescriptor =
      MethodDescriptor.<GetLocationRequest, Location>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.location.Locations/GetLocation")
          .setRequestMarshaller(ProtoUtils.marshaller(GetLocationRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Location.getDefaultInstance()))
          .build();

  private final UnaryCallable<UpdateTransferRunRequest, TransferRun> updateTransferRunCallable;
  private final UnaryCallable<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesCallable;
  private final UnaryCallable<StartBigQueryJobsRequest, Empty> startBigQueryJobsCallable;
  private final UnaryCallable<FinishRunRequest, Empty> finishRunCallable;
  private final UnaryCallable<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionCallable;
  private final UnaryCallable<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionCallable;
  private final UnaryCallable<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionCallable;
  private final UnaryCallable<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionCallable;
  private final UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsCallable;
  private final UnaryCallable<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsPagedCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcDataSourceServiceStub create(DataSourceServiceStubSettings settings)
      throws IOException {
    return new GrpcDataSourceServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcDataSourceServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcDataSourceServiceStub(
        DataSourceServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcDataSourceServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcDataSourceServiceStub(
        DataSourceServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcDataSourceServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcDataSourceServiceStub(
      DataSourceServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcDataSourceServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcDataSourceServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcDataSourceServiceStub(
      DataSourceServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<UpdateTransferRunRequest, TransferRun> updateTransferRunTransportSettings =
        GrpcCallSettings.<UpdateTransferRunRequest, TransferRun>newBuilder()
            .setMethodDescriptor(updateTransferRunMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add(
                      "transfer_run.name", String.valueOf(request.getTransferRun().getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesTransportSettings =
        GrpcCallSettings.<LogTransferRunMessagesRequest, Empty>newBuilder()
            .setMethodDescriptor(logTransferRunMessagesMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<StartBigQueryJobsRequest, Empty> startBigQueryJobsTransportSettings =
        GrpcCallSettings.<StartBigQueryJobsRequest, Empty>newBuilder()
            .setMethodDescriptor(startBigQueryJobsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<FinishRunRequest, Empty> finishRunTransportSettings =
        GrpcCallSettings.<FinishRunRequest, Empty>newBuilder()
            .setMethodDescriptor(finishRunMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<CreateDataSourceDefinitionRequest, DataSourceDefinition>
        createDataSourceDefinitionTransportSettings =
            GrpcCallSettings.<CreateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(createDataSourceDefinitionMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
        updateDataSourceDefinitionTransportSettings =
            GrpcCallSettings.<UpdateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(updateDataSourceDefinitionMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add(
                          "data_source_definition.name",
                          String.valueOf(request.getDataSourceDefinition().getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<DeleteDataSourceDefinitionRequest, Empty>
        deleteDataSourceDefinitionTransportSettings =
            GrpcCallSettings.<DeleteDataSourceDefinitionRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteDataSourceDefinitionMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<GetDataSourceDefinitionRequest, DataSourceDefinition>
        getDataSourceDefinitionTransportSettings =
            GrpcCallSettings.<GetDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(getDataSourceDefinitionMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
        listDataSourceDefinitionsTransportSettings =
            GrpcCallSettings
                .<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>newBuilder()
                .setMethodDescriptor(listDataSourceDefinitionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<ListLocationsRequest, ListLocationsResponse> listLocationsTransportSettings =
        GrpcCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
            .setMethodDescriptor(listLocationsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        GrpcCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();

    this.updateTransferRunCallable =
        callableFactory.createUnaryCallable(
            updateTransferRunTransportSettings,
            settings.updateTransferRunSettings(),
            clientContext);
    this.logTransferRunMessagesCallable =
        callableFactory.createUnaryCallable(
            logTransferRunMessagesTransportSettings,
            settings.logTransferRunMessagesSettings(),
            clientContext);
    this.startBigQueryJobsCallable =
        callableFactory.createUnaryCallable(
            startBigQueryJobsTransportSettings,
            settings.startBigQueryJobsSettings(),
            clientContext);
    this.finishRunCallable =
        callableFactory.createUnaryCallable(
            finishRunTransportSettings, settings.finishRunSettings(), clientContext);
    this.createDataSourceDefinitionCallable =
        callableFactory.createUnaryCallable(
            createDataSourceDefinitionTransportSettings,
            settings.createDataSourceDefinitionSettings(),
            clientContext);
    this.updateDataSourceDefinitionCallable =
        callableFactory.createUnaryCallable(
            updateDataSourceDefinitionTransportSettings,
            settings.updateDataSourceDefinitionSettings(),
            clientContext);
    this.deleteDataSourceDefinitionCallable =
        callableFactory.createUnaryCallable(
            deleteDataSourceDefinitionTransportSettings,
            settings.deleteDataSourceDefinitionSettings(),
            clientContext);
    this.getDataSourceDefinitionCallable =
        callableFactory.createUnaryCallable(
            getDataSourceDefinitionTransportSettings,
            settings.getDataSourceDefinitionSettings(),
            clientContext);
    this.listDataSourceDefinitionsCallable =
        callableFactory.createUnaryCallable(
            listDataSourceDefinitionsTransportSettings,
            settings.listDataSourceDefinitionsSettings(),
            clientContext);
    this.listDataSourceDefinitionsPagedCallable =
        callableFactory.createPagedCallable(
            listDataSourceDefinitionsTransportSettings,
            settings.listDataSourceDefinitionsSettings(),
            clientContext);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<UpdateTransferRunRequest, TransferRun> updateTransferRunCallable() {
    return updateTransferRunCallable;
  }

  @Override
  public UnaryCallable<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesCallable() {
    return logTransferRunMessagesCallable;
  }

  @Override
  public UnaryCallable<StartBigQueryJobsRequest, Empty> startBigQueryJobsCallable() {
    return startBigQueryJobsCallable;
  }

  @Override
  public UnaryCallable<FinishRunRequest, Empty> finishRunCallable() {
    return finishRunCallable;
  }

  @Override
  public UnaryCallable<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionCallable() {
    return createDataSourceDefinitionCallable;
  }

  @Override
  public UnaryCallable<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionCallable() {
    return updateDataSourceDefinitionCallable;
  }

  @Override
  public UnaryCallable<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionCallable() {
    return deleteDataSourceDefinitionCallable;
  }

  @Override
  public UnaryCallable<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionCallable() {
    return getDataSourceDefinitionCallable;
  }

  @Override
  public UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsCallable() {
    return listDataSourceDefinitionsCallable;
  }

  @Override
  public UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsPagedCallable() {
    return listDataSourceDefinitionsPagedCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
