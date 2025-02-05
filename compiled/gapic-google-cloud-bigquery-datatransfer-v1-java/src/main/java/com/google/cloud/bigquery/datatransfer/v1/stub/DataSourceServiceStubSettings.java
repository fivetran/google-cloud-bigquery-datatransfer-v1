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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link DataSourceServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (bigquerydatatransfer.googleapis.com) and default port (443)
 *       are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of updateTransferRun:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * DataSourceServiceStubSettings.Builder dataSourceServiceSettingsBuilder =
 *     DataSourceServiceStubSettings.newBuilder();
 * dataSourceServiceSettingsBuilder
 *     .updateTransferRunSettings()
 *     .setRetrySettings(
 *         dataSourceServiceSettingsBuilder
 *             .updateTransferRunSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * DataSourceServiceStubSettings dataSourceServiceSettings =
 *     dataSourceServiceSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class DataSourceServiceStubSettings extends StubSettings<DataSourceServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/bigquery")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .build();

  private final UnaryCallSettings<UpdateTransferRunRequest, TransferRun> updateTransferRunSettings;
  private final UnaryCallSettings<LogTransferRunMessagesRequest, Empty>
      logTransferRunMessagesSettings;
  private final UnaryCallSettings<StartBigQueryJobsRequest, Empty> startBigQueryJobsSettings;
  private final UnaryCallSettings<FinishRunRequest, Empty> finishRunSettings;
  private final UnaryCallSettings<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionSettings;
  private final UnaryCallSettings<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionSettings;
  private final UnaryCallSettings<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionSettings;
  private final UnaryCallSettings<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionSettings;
  private final PagedCallSettings<
          ListDataSourceDefinitionsRequest,
          ListDataSourceDefinitionsResponse,
          ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsSettings;
  private final PagedCallSettings<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings;
  private final UnaryCallSettings<GetLocationRequest, Location> getLocationSettings;

  private static final PagedListDescriptor<
          ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse, DataSourceDefinition>
      LIST_DATA_SOURCE_DEFINITIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListDataSourceDefinitionsRequest,
              ListDataSourceDefinitionsResponse,
              DataSourceDefinition>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListDataSourceDefinitionsRequest injectToken(
                ListDataSourceDefinitionsRequest payload, String token) {
              return ListDataSourceDefinitionsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListDataSourceDefinitionsRequest injectPageSize(
                ListDataSourceDefinitionsRequest payload, int pageSize) {
              return ListDataSourceDefinitionsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListDataSourceDefinitionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListDataSourceDefinitionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<DataSourceDefinition> extractResources(
                ListDataSourceDefinitionsResponse payload) {
              return payload.getDataSourceDefinitionsList();
            }
          };

  private static final PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>
      LIST_LOCATIONS_PAGE_STR_DESC =
          new PagedListDescriptor<ListLocationsRequest, ListLocationsResponse, Location>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListLocationsRequest injectToken(ListLocationsRequest payload, String token) {
              return ListLocationsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListLocationsRequest injectPageSize(ListLocationsRequest payload, int pageSize) {
              return ListLocationsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListLocationsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListLocationsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Location> extractResources(ListLocationsResponse payload) {
              return payload.getLocationsList();
            }
          };

  private static final PagedListResponseFactory<
          ListDataSourceDefinitionsRequest,
          ListDataSourceDefinitionsResponse,
          ListDataSourceDefinitionsPagedResponse>
      LIST_DATA_SOURCE_DEFINITIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListDataSourceDefinitionsRequest,
              ListDataSourceDefinitionsResponse,
              ListDataSourceDefinitionsPagedResponse>() {
            @Override
            public ApiFuture<ListDataSourceDefinitionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListDataSourceDefinitionsRequest, ListDataSourceDefinitionsResponse>
                    callable,
                ListDataSourceDefinitionsRequest request,
                ApiCallContext context,
                ApiFuture<ListDataSourceDefinitionsResponse> futureResponse) {
              PageContext<
                      ListDataSourceDefinitionsRequest,
                      ListDataSourceDefinitionsResponse,
                      DataSourceDefinition>
                  pageContext =
                      PageContext.create(
                          callable, LIST_DATA_SOURCE_DEFINITIONS_PAGE_STR_DESC, request, context);
              return ListDataSourceDefinitionsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      LIST_LOCATIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>() {
            @Override
            public ApiFuture<ListLocationsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListLocationsRequest, ListLocationsResponse> callable,
                ListLocationsRequest request,
                ApiCallContext context,
                ApiFuture<ListLocationsResponse> futureResponse) {
              PageContext<ListLocationsRequest, ListLocationsResponse, Location> pageContext =
                  PageContext.create(callable, LIST_LOCATIONS_PAGE_STR_DESC, request, context);
              return ListLocationsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to updateTransferRun. */
  public UnaryCallSettings<UpdateTransferRunRequest, TransferRun> updateTransferRunSettings() {
    return updateTransferRunSettings;
  }

  /** Returns the object with the settings used for calls to logTransferRunMessages. */
  public UnaryCallSettings<LogTransferRunMessagesRequest, Empty> logTransferRunMessagesSettings() {
    return logTransferRunMessagesSettings;
  }

  /** Returns the object with the settings used for calls to startBigQueryJobs. */
  public UnaryCallSettings<StartBigQueryJobsRequest, Empty> startBigQueryJobsSettings() {
    return startBigQueryJobsSettings;
  }

  /** Returns the object with the settings used for calls to finishRun. */
  public UnaryCallSettings<FinishRunRequest, Empty> finishRunSettings() {
    return finishRunSettings;
  }

  /** Returns the object with the settings used for calls to createDataSourceDefinition. */
  public UnaryCallSettings<CreateDataSourceDefinitionRequest, DataSourceDefinition>
      createDataSourceDefinitionSettings() {
    return createDataSourceDefinitionSettings;
  }

  /** Returns the object with the settings used for calls to updateDataSourceDefinition. */
  public UnaryCallSettings<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
      updateDataSourceDefinitionSettings() {
    return updateDataSourceDefinitionSettings;
  }

  /** Returns the object with the settings used for calls to deleteDataSourceDefinition. */
  public UnaryCallSettings<DeleteDataSourceDefinitionRequest, Empty>
      deleteDataSourceDefinitionSettings() {
    return deleteDataSourceDefinitionSettings;
  }

  /** Returns the object with the settings used for calls to getDataSourceDefinition. */
  public UnaryCallSettings<GetDataSourceDefinitionRequest, DataSourceDefinition>
      getDataSourceDefinitionSettings() {
    return getDataSourceDefinitionSettings;
  }

  /** Returns the object with the settings used for calls to listDataSourceDefinitions. */
  public PagedCallSettings<
          ListDataSourceDefinitionsRequest,
          ListDataSourceDefinitionsResponse,
          ListDataSourceDefinitionsPagedResponse>
      listDataSourceDefinitionsSettings() {
    return listDataSourceDefinitionsSettings;
  }

  /** Returns the object with the settings used for calls to listLocations. */
  public PagedCallSettings<ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
      listLocationsSettings() {
    return listLocationsSettings;
  }

  /** Returns the object with the settings used for calls to getLocation. */
  public UnaryCallSettings<GetLocationRequest, Location> getLocationSettings() {
    return getLocationSettings;
  }

  public DataSourceServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcDataSourceServiceStub.create(this);
    }
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonDataSourceServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "bigquerydatatransfer";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "bigquerydatatransfer.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "bigquerydatatransfer.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default gRPC ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  /** Returns a builder for the default REST ChannelProvider for this service. */
  @BetaApi
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultGrpcApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(DataSourceServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultHttpJsonApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(DataSourceServiceStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return DataSourceServiceStubSettings.defaultGrpcApiClientHeaderProviderBuilder();
  }

  /** Returns a new gRPC builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new REST builder for this class. */
  public static Builder newHttpJsonBuilder() {
    return Builder.createHttpJsonDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected DataSourceServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    updateTransferRunSettings = settingsBuilder.updateTransferRunSettings().build();
    logTransferRunMessagesSettings = settingsBuilder.logTransferRunMessagesSettings().build();
    startBigQueryJobsSettings = settingsBuilder.startBigQueryJobsSettings().build();
    finishRunSettings = settingsBuilder.finishRunSettings().build();
    createDataSourceDefinitionSettings =
        settingsBuilder.createDataSourceDefinitionSettings().build();
    updateDataSourceDefinitionSettings =
        settingsBuilder.updateDataSourceDefinitionSettings().build();
    deleteDataSourceDefinitionSettings =
        settingsBuilder.deleteDataSourceDefinitionSettings().build();
    getDataSourceDefinitionSettings = settingsBuilder.getDataSourceDefinitionSettings().build();
    listDataSourceDefinitionsSettings = settingsBuilder.listDataSourceDefinitionsSettings().build();
    listLocationsSettings = settingsBuilder.listLocationsSettings().build();
    getLocationSettings = settingsBuilder.getLocationSettings().build();
  }

  /** Builder for DataSourceServiceStubSettings. */
  public static class Builder extends StubSettings.Builder<DataSourceServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<UpdateTransferRunRequest, TransferRun>
        updateTransferRunSettings;
    private final UnaryCallSettings.Builder<LogTransferRunMessagesRequest, Empty>
        logTransferRunMessagesSettings;
    private final UnaryCallSettings.Builder<StartBigQueryJobsRequest, Empty>
        startBigQueryJobsSettings;
    private final UnaryCallSettings.Builder<FinishRunRequest, Empty> finishRunSettings;
    private final UnaryCallSettings.Builder<CreateDataSourceDefinitionRequest, DataSourceDefinition>
        createDataSourceDefinitionSettings;
    private final UnaryCallSettings.Builder<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
        updateDataSourceDefinitionSettings;
    private final UnaryCallSettings.Builder<DeleteDataSourceDefinitionRequest, Empty>
        deleteDataSourceDefinitionSettings;
    private final UnaryCallSettings.Builder<GetDataSourceDefinitionRequest, DataSourceDefinition>
        getDataSourceDefinitionSettings;
    private final PagedCallSettings.Builder<
            ListDataSourceDefinitionsRequest,
            ListDataSourceDefinitionsResponse,
            ListDataSourceDefinitionsPagedResponse>
        listDataSourceDefinitionsSettings;
    private final PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings;
    private final UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      updateTransferRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      logTransferRunMessagesSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      startBigQueryJobsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      finishRunSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createDataSourceDefinitionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateDataSourceDefinitionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteDataSourceDefinitionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getDataSourceDefinitionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listDataSourceDefinitionsSettings =
          PagedCallSettings.newBuilder(LIST_DATA_SOURCE_DEFINITIONS_PAGE_STR_FACT);
      listLocationsSettings = PagedCallSettings.newBuilder(LIST_LOCATIONS_PAGE_STR_FACT);
      getLocationSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              updateTransferRunSettings,
              logTransferRunMessagesSettings,
              startBigQueryJobsSettings,
              finishRunSettings,
              createDataSourceDefinitionSettings,
              updateDataSourceDefinitionSettings,
              deleteDataSourceDefinitionSettings,
              getDataSourceDefinitionSettings,
              listDataSourceDefinitionsSettings,
              listLocationsSettings,
              getLocationSettings);
      initDefaults(this);
    }

    protected Builder(DataSourceServiceStubSettings settings) {
      super(settings);

      updateTransferRunSettings = settings.updateTransferRunSettings.toBuilder();
      logTransferRunMessagesSettings = settings.logTransferRunMessagesSettings.toBuilder();
      startBigQueryJobsSettings = settings.startBigQueryJobsSettings.toBuilder();
      finishRunSettings = settings.finishRunSettings.toBuilder();
      createDataSourceDefinitionSettings = settings.createDataSourceDefinitionSettings.toBuilder();
      updateDataSourceDefinitionSettings = settings.updateDataSourceDefinitionSettings.toBuilder();
      deleteDataSourceDefinitionSettings = settings.deleteDataSourceDefinitionSettings.toBuilder();
      getDataSourceDefinitionSettings = settings.getDataSourceDefinitionSettings.toBuilder();
      listDataSourceDefinitionsSettings = settings.listDataSourceDefinitionsSettings.toBuilder();
      listLocationsSettings = settings.listLocationsSettings.toBuilder();
      getLocationSettings = settings.getLocationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              updateTransferRunSettings,
              logTransferRunMessagesSettings,
              startBigQueryJobsSettings,
              finishRunSettings,
              createDataSourceDefinitionSettings,
              updateDataSourceDefinitionSettings,
              deleteDataSourceDefinitionSettings,
              getDataSourceDefinitionSettings,
              listDataSourceDefinitionsSettings,
              listLocationsSettings,
              getLocationSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder createHttpJsonDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultHttpJsonTransportProviderBuilder().build());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultHttpJsonApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .updateTransferRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .logTransferRunMessagesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .startBigQueryJobsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .finishRunSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createDataSourceDefinitionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateDataSourceDefinitionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteDataSourceDefinitionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getDataSourceDefinitionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listDataSourceDefinitionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listLocationsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .getLocationSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to updateTransferRun. */
    public UnaryCallSettings.Builder<UpdateTransferRunRequest, TransferRun>
        updateTransferRunSettings() {
      return updateTransferRunSettings;
    }

    /** Returns the builder for the settings used for calls to logTransferRunMessages. */
    public UnaryCallSettings.Builder<LogTransferRunMessagesRequest, Empty>
        logTransferRunMessagesSettings() {
      return logTransferRunMessagesSettings;
    }

    /** Returns the builder for the settings used for calls to startBigQueryJobs. */
    public UnaryCallSettings.Builder<StartBigQueryJobsRequest, Empty> startBigQueryJobsSettings() {
      return startBigQueryJobsSettings;
    }

    /** Returns the builder for the settings used for calls to finishRun. */
    public UnaryCallSettings.Builder<FinishRunRequest, Empty> finishRunSettings() {
      return finishRunSettings;
    }

    /** Returns the builder for the settings used for calls to createDataSourceDefinition. */
    public UnaryCallSettings.Builder<CreateDataSourceDefinitionRequest, DataSourceDefinition>
        createDataSourceDefinitionSettings() {
      return createDataSourceDefinitionSettings;
    }

    /** Returns the builder for the settings used for calls to updateDataSourceDefinition. */
    public UnaryCallSettings.Builder<UpdateDataSourceDefinitionRequest, DataSourceDefinition>
        updateDataSourceDefinitionSettings() {
      return updateDataSourceDefinitionSettings;
    }

    /** Returns the builder for the settings used for calls to deleteDataSourceDefinition. */
    public UnaryCallSettings.Builder<DeleteDataSourceDefinitionRequest, Empty>
        deleteDataSourceDefinitionSettings() {
      return deleteDataSourceDefinitionSettings;
    }

    /** Returns the builder for the settings used for calls to getDataSourceDefinition. */
    public UnaryCallSettings.Builder<GetDataSourceDefinitionRequest, DataSourceDefinition>
        getDataSourceDefinitionSettings() {
      return getDataSourceDefinitionSettings;
    }

    /** Returns the builder for the settings used for calls to listDataSourceDefinitions. */
    public PagedCallSettings.Builder<
            ListDataSourceDefinitionsRequest,
            ListDataSourceDefinitionsResponse,
            ListDataSourceDefinitionsPagedResponse>
        listDataSourceDefinitionsSettings() {
      return listDataSourceDefinitionsSettings;
    }

    /** Returns the builder for the settings used for calls to listLocations. */
    public PagedCallSettings.Builder<
            ListLocationsRequest, ListLocationsResponse, ListLocationsPagedResponse>
        listLocationsSettings() {
      return listLocationsSettings;
    }

    /** Returns the builder for the settings used for calls to getLocation. */
    public UnaryCallSettings.Builder<GetLocationRequest, Location> getLocationSettings() {
      return getLocationSettings;
    }

    @Override
    public DataSourceServiceStubSettings build() throws IOException {
      return new DataSourceServiceStubSettings(this);
    }
  }
}
