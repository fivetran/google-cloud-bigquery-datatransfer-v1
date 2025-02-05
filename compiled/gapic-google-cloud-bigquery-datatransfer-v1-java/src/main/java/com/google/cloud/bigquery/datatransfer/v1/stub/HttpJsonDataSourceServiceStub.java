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

import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
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
import com.google.protobuf.Empty;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the DataSourceService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class HttpJsonDataSourceServiceStub extends DataSourceServiceStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<UpdateTransferRunRequest, TransferRun>
      updateTransferRunMethodDescriptor =
          ApiMethodDescriptor.<UpdateTransferRunRequest, TransferRun>newBuilder()
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/UpdateTransferRun")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateTransferRunRequest>newBuilder()
                      .setPath(
                          "/v1/{transferRun.name=projects/*/locations/*/transferConfigs/*/runs/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateTransferRunRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "transferRun.name", request.getTransferRun().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateTransferRunRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("transferRun", request.getTransferRun(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<TransferRun>newBuilder()
                      .setDefaultInstance(TransferRun.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<LogTransferRunMessagesRequest, Empty>
      logTransferRunMessagesMethodDescriptor =
          ApiMethodDescriptor.<LogTransferRunMessagesRequest, Empty>newBuilder()
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/LogTransferRunMessages")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<LogTransferRunMessagesRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/transferConfigs/*/runs/*}:logMessages",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<LogTransferRunMessagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<LogTransferRunMessagesRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Empty>newBuilder()
                      .setDefaultInstance(Empty.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<StartBigQueryJobsRequest, Empty>
      startBigQueryJobsMethodDescriptor =
          ApiMethodDescriptor.<StartBigQueryJobsRequest, Empty>newBuilder()
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/StartBigQueryJobs")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<StartBigQueryJobsRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/transferConfigs/*/runs/*}:startBigQueryJobs",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<StartBigQueryJobsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<StartBigQueryJobsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("*", request.toBuilder().clearName().build(), true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Empty>newBuilder()
                      .setDefaultInstance(Empty.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<FinishRunRequest, Empty> finishRunMethodDescriptor =
      ApiMethodDescriptor.<FinishRunRequest, Empty>newBuilder()
          .setFullMethodName("google.cloud.bigquery.datatransfer.v1.DataSourceService/FinishRun")
          .setHttpMethod("POST")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<FinishRunRequest>newBuilder()
                  .setPath(
                      "/v1/{name=projects/*/locations/*/transferConfigs/*/runs/*}:finishRun",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<FinishRunRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<FinishRunRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                        return fields;
                      })
                  .setRequestBodyExtractor(
                      request ->
                          ProtoRestSerializer.create()
                              .toBody("*", request.toBuilder().clearName().build(), true))
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Empty>newBuilder()
                  .setDefaultInstance(Empty.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionMethodDescriptor =
          ApiMethodDescriptor.<CreateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/CreateDataSourceDefinition")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateDataSourceDefinitionRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/dataSourceDefinitions",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateDataSourceDefinitionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateDataSourceDefinitionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "dataSourceDefinition",
                                      request.getDataSourceDefinition(),
                                      true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<DataSourceDefinition>newBuilder()
                      .setDefaultInstance(DataSourceDefinition.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionMethodDescriptor =
          ApiMethodDescriptor.<UpdateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/UpdateDataSourceDefinition")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateDataSourceDefinitionRequest>newBuilder()
                      .setPath(
                          "/v1/{dataSourceDefinition.name=projects/*/locations/*/dataSourceDefinitions/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateDataSourceDefinitionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields,
                                "dataSourceDefinition.name",
                                request.getDataSourceDefinition().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateDataSourceDefinitionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody(
                                      "dataSourceDefinition",
                                      request.getDataSourceDefinition(),
                                      true))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<DataSourceDefinition>newBuilder()
                      .setDefaultInstance(DataSourceDefinition.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionMethodDescriptor =
          ApiMethodDescriptor.<DeleteDataSourceDefinitionRequest, Empty>newBuilder()
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/DeleteDataSourceDefinition")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteDataSourceDefinitionRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/dataSourceDefinitions/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteDataSourceDefinitionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteDataSourceDefinitionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Empty>newBuilder()
                      .setDefaultInstance(Empty.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionMethodDescriptor =
          ApiMethodDescriptor.<GetDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/GetDataSourceDefinition")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetDataSourceDefinitionRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*/dataSourceDefinitions/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetDataSourceDefinitionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetDataSourceDefinitionRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<DataSourceDefinition>newBuilder()
                      .setDefaultInstance(DataSourceDefinition.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
      listDataSourceDefinitionsMethodDescriptor =
          ApiMethodDescriptor
              .<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>newBuilder()
              .setFullMethodName(
                  "google.cloud.bigquery.datatransfer.v1.DataSourceService/ListDataSourceDefinitions")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListDataSourceDefinitionsRequest>newBuilder()
                      .setPath(
                          "/v1/{parent=projects/*/locations/*}/dataSourceDefinitions",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListDataSourceDefinitionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListDataSourceDefinitionsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListDataSourceDefinitionsResponse>newBuilder()
                      .setDefaultInstance(ListDataSourceDefinitionsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          ApiMethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListLocationsRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*}/locations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListLocationsResponse>newBuilder()
                      .setDefaultInstance(ListLocationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetLocationRequest, Location>
      getLocationMethodDescriptor =
          ApiMethodDescriptor.<GetLocationRequest, Location>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/GetLocation")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetLocationRequest>newBuilder()
                      .setPath(
                          "/v1/{name=projects/*/locations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(fields, "$alt", "json;enum-encoding=int");
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Location>newBuilder()
                      .setDefaultInstance(Location.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
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
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonDataSourceServiceStub create(DataSourceServiceStubSettings settings)
      throws IOException {
    return new HttpJsonDataSourceServiceStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonDataSourceServiceStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonDataSourceServiceStub(
        DataSourceServiceStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonDataSourceServiceStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonDataSourceServiceStub(
        DataSourceServiceStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonDataSourceServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonDataSourceServiceStub(
      DataSourceServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonDataSourceServiceCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonDataSourceServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonDataSourceServiceStub(
      DataSourceServiceStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<UpdateTransferRunRequest, TransferRun> updateTransferRunTransportSettings =
        HttpJsonCallSettings.<UpdateTransferRunRequest, TransferRun>newBuilder()
            .setMethodDescriptor(updateTransferRunMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add(
                      "transfer_run.name", String.valueOf(request.getTransferRun().getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<LogTransferRunMessagesRequest, Empty>
        logTransferRunMessagesTransportSettings =
            HttpJsonCallSettings.<LogTransferRunMessagesRequest, Empty>newBuilder()
                .setMethodDescriptor(logTransferRunMessagesMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<StartBigQueryJobsRequest, Empty> startBigQueryJobsTransportSettings =
        HttpJsonCallSettings.<StartBigQueryJobsRequest, Empty>newBuilder()
            .setMethodDescriptor(startBigQueryJobsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<FinishRunRequest, Empty> finishRunTransportSettings =
        HttpJsonCallSettings.<FinishRunRequest, Empty>newBuilder()
            .setMethodDescriptor(finishRunMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    HttpJsonCallSettings<CreateDataSourceDefinitionRequest, DataSourceDefinition>
        createDataSourceDefinitionTransportSettings =
            HttpJsonCallSettings
                .<CreateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(createDataSourceDefinitionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
        updateDataSourceDefinitionTransportSettings =
            HttpJsonCallSettings
                .<UpdateDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(updateDataSourceDefinitionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add(
                          "data_source_definition.name",
                          String.valueOf(request.getDataSourceDefinition().getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<DeleteDataSourceDefinitionRequest, Empty>
        deleteDataSourceDefinitionTransportSettings =
            HttpJsonCallSettings.<DeleteDataSourceDefinitionRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteDataSourceDefinitionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetDataSourceDefinitionRequest, DataSourceDefinition>
        getDataSourceDefinitionTransportSettings =
            HttpJsonCallSettings.<GetDataSourceDefinitionRequest, DataSourceDefinition>newBuilder()
                .setMethodDescriptor(getDataSourceDefinitionMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
        listDataSourceDefinitionsTransportSettings =
            HttpJsonCallSettings
                .<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>newBuilder()
                .setMethodDescriptor(listDataSourceDefinitionsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("parent", String.valueOf(request.getParent()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<ListLocationsRequest, ListLocationsResponse>
        listLocationsTransportSettings =
            HttpJsonCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
                .setMethodDescriptor(listLocationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    HttpJsonCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        HttpJsonCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
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

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(updateTransferRunMethodDescriptor);
    methodDescriptors.add(logTransferRunMessagesMethodDescriptor);
    methodDescriptors.add(startBigQueryJobsMethodDescriptor);
    methodDescriptors.add(finishRunMethodDescriptor);
    methodDescriptors.add(createDataSourceDefinitionMethodDescriptor);
    methodDescriptors.add(updateDataSourceDefinitionMethodDescriptor);
    methodDescriptors.add(deleteDataSourceDefinitionMethodDescriptor);
    methodDescriptors.add(getDataSourceDefinitionMethodDescriptor);
    methodDescriptors.add(listDataSourceDefinitionsMethodDescriptor);
    methodDescriptors.add(listLocationsMethodDescriptor);
    methodDescriptors.add(getLocationMethodDescriptor);
    return methodDescriptors;
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
