package com.google.cloud.bigquery.datatransfer.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Google BigQuery Data Transfer API allows BigQuery users to
 * configure transfer of their data from other Google Products into BigQuery.
 * This service exposes methods that should be used by data source backend.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/cloud/bigquery/datatransfer/v1/datasource.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataSourceServiceGrpc {

  private DataSourceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "google.cloud.bigquery.datatransfer.v1.DataSourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest,
      com.google.cloud.bigquery.datatransfer.v1.TransferRun> getUpdateTransferRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTransferRun",
      requestType = com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.class,
      responseType = com.google.cloud.bigquery.datatransfer.v1.TransferRun.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest,
      com.google.cloud.bigquery.datatransfer.v1.TransferRun> getUpdateTransferRunMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest, com.google.cloud.bigquery.datatransfer.v1.TransferRun> getUpdateTransferRunMethod;
    if ((getUpdateTransferRunMethod = DataSourceServiceGrpc.getUpdateTransferRunMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getUpdateTransferRunMethod = DataSourceServiceGrpc.getUpdateTransferRunMethod) == null) {
          DataSourceServiceGrpc.getUpdateTransferRunMethod = getUpdateTransferRunMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest, com.google.cloud.bigquery.datatransfer.v1.TransferRun>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTransferRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.TransferRun.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("UpdateTransferRun"))
              .build();
        }
      }
    }
    return getUpdateTransferRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest,
      com.google.protobuf.Empty> getLogTransferRunMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LogTransferRunMessages",
      requestType = com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest,
      com.google.protobuf.Empty> getLogTransferRunMessagesMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest, com.google.protobuf.Empty> getLogTransferRunMessagesMethod;
    if ((getLogTransferRunMessagesMethod = DataSourceServiceGrpc.getLogTransferRunMessagesMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getLogTransferRunMessagesMethod = DataSourceServiceGrpc.getLogTransferRunMessagesMethod) == null) {
          DataSourceServiceGrpc.getLogTransferRunMessagesMethod = getLogTransferRunMessagesMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LogTransferRunMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("LogTransferRunMessages"))
              .build();
        }
      }
    }
    return getLogTransferRunMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest,
      com.google.protobuf.Empty> getStartBigQueryJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartBigQueryJobs",
      requestType = com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest,
      com.google.protobuf.Empty> getStartBigQueryJobsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest, com.google.protobuf.Empty> getStartBigQueryJobsMethod;
    if ((getStartBigQueryJobsMethod = DataSourceServiceGrpc.getStartBigQueryJobsMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getStartBigQueryJobsMethod = DataSourceServiceGrpc.getStartBigQueryJobsMethod) == null) {
          DataSourceServiceGrpc.getStartBigQueryJobsMethod = getStartBigQueryJobsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartBigQueryJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("StartBigQueryJobs"))
              .build();
        }
      }
    }
    return getStartBigQueryJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest,
      com.google.protobuf.Empty> getFinishRunMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishRun",
      requestType = com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest,
      com.google.protobuf.Empty> getFinishRunMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest, com.google.protobuf.Empty> getFinishRunMethod;
    if ((getFinishRunMethod = DataSourceServiceGrpc.getFinishRunMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getFinishRunMethod = DataSourceServiceGrpc.getFinishRunMethod) == null) {
          DataSourceServiceGrpc.getFinishRunMethod = getFinishRunMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishRun"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("FinishRun"))
              .build();
        }
      }
    }
    return getFinishRunMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest,
      com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getCreateDataSourceDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataSourceDefinition",
      requestType = com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.class,
      responseType = com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest,
      com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getCreateDataSourceDefinitionMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getCreateDataSourceDefinitionMethod;
    if ((getCreateDataSourceDefinitionMethod = DataSourceServiceGrpc.getCreateDataSourceDefinitionMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getCreateDataSourceDefinitionMethod = DataSourceServiceGrpc.getCreateDataSourceDefinitionMethod) == null) {
          DataSourceServiceGrpc.getCreateDataSourceDefinitionMethod = getCreateDataSourceDefinitionMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataSourceDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("CreateDataSourceDefinition"))
              .build();
        }
      }
    }
    return getCreateDataSourceDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest,
      com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getUpdateDataSourceDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataSourceDefinition",
      requestType = com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.class,
      responseType = com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest,
      com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getUpdateDataSourceDefinitionMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getUpdateDataSourceDefinitionMethod;
    if ((getUpdateDataSourceDefinitionMethod = DataSourceServiceGrpc.getUpdateDataSourceDefinitionMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getUpdateDataSourceDefinitionMethod = DataSourceServiceGrpc.getUpdateDataSourceDefinitionMethod) == null) {
          DataSourceServiceGrpc.getUpdateDataSourceDefinitionMethod = getUpdateDataSourceDefinitionMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataSourceDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("UpdateDataSourceDefinition"))
              .build();
        }
      }
    }
    return getUpdateDataSourceDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest,
      com.google.protobuf.Empty> getDeleteDataSourceDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataSourceDefinition",
      requestType = com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest,
      com.google.protobuf.Empty> getDeleteDataSourceDefinitionMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest, com.google.protobuf.Empty> getDeleteDataSourceDefinitionMethod;
    if ((getDeleteDataSourceDefinitionMethod = DataSourceServiceGrpc.getDeleteDataSourceDefinitionMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getDeleteDataSourceDefinitionMethod = DataSourceServiceGrpc.getDeleteDataSourceDefinitionMethod) == null) {
          DataSourceServiceGrpc.getDeleteDataSourceDefinitionMethod = getDeleteDataSourceDefinitionMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataSourceDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("DeleteDataSourceDefinition"))
              .build();
        }
      }
    }
    return getDeleteDataSourceDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest,
      com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getGetDataSourceDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDataSourceDefinition",
      requestType = com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest.class,
      responseType = com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest,
      com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getGetDataSourceDefinitionMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getGetDataSourceDefinitionMethod;
    if ((getGetDataSourceDefinitionMethod = DataSourceServiceGrpc.getGetDataSourceDefinitionMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getGetDataSourceDefinitionMethod = DataSourceServiceGrpc.getGetDataSourceDefinitionMethod) == null) {
          DataSourceServiceGrpc.getGetDataSourceDefinitionMethod = getGetDataSourceDefinitionMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest, com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetDataSourceDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("GetDataSourceDefinition"))
              .build();
        }
      }
    }
    return getGetDataSourceDefinitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest,
      com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse> getListDataSourceDefinitionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataSourceDefinitions",
      requestType = com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest.class,
      responseType = com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest,
      com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse> getListDataSourceDefinitionsMethod() {
    io.grpc.MethodDescriptor<com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest, com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse> getListDataSourceDefinitionsMethod;
    if ((getListDataSourceDefinitionsMethod = DataSourceServiceGrpc.getListDataSourceDefinitionsMethod) == null) {
      synchronized (DataSourceServiceGrpc.class) {
        if ((getListDataSourceDefinitionsMethod = DataSourceServiceGrpc.getListDataSourceDefinitionsMethod) == null) {
          DataSourceServiceGrpc.getListDataSourceDefinitionsMethod = getListDataSourceDefinitionsMethod =
              io.grpc.MethodDescriptor.<com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest, com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataSourceDefinitions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceServiceMethodDescriptorSupplier("ListDataSourceDefinitions"))
              .build();
        }
      }
    }
    return getListDataSourceDefinitionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataSourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceStub>() {
        @java.lang.Override
        public DataSourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceServiceStub(channel, callOptions);
        }
      };
    return DataSourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataSourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceBlockingStub>() {
        @java.lang.Override
        public DataSourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceServiceBlockingStub(channel, callOptions);
        }
      };
    return DataSourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataSourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceServiceFutureStub>() {
        @java.lang.Override
        public DataSourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceServiceFutureStub(channel, callOptions);
        }
      };
    return DataSourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Google BigQuery Data Transfer API allows BigQuery users to
   * configure transfer of their data from other Google Products into BigQuery.
   * This service exposes methods that should be used by data source backend.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Update a transfer run. If successful, resets
     * data_source.update_deadline_seconds timer.
     * </pre>
     */
    default void updateTransferRun(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferRun> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTransferRunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Log messages for a transfer run. If successful (at least 1 message), resets
     * data_source.update_deadline_seconds timer.
     * </pre>
     */
    default void logTransferRunMessages(com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLogTransferRunMessagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify the Data Transfer Service that data is ready for loading.
     * The Data Transfer Service will start and monitor multiple BigQuery Load
     * jobs for a transfer run. Monitored jobs will be automatically retried
     * and produce log messages when starting and finishing a job.
     * Can be called multiple times for the same transfer run.
     * </pre>
     */
    default void startBigQueryJobs(com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartBigQueryJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify the Data Transfer Service that the data source is done processing
     * the run. No more status updates or requests to start/monitor jobs will be
     * accepted. The run will be finalized by the Data Transfer Service when all
     * monitored jobs are completed.
     * Does not need to be called if the run is set to FAILED.
     * </pre>
     */
    default void finishRun(com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishRunMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a data source definition.  Calling this method will automatically
     * use your credentials to create the following Google Cloud resources in
     * YOUR Google Cloud project.
     * 1. OAuth client
     * 2. Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
     * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
     * The field data_source.client_id should be left empty in the input request,
     * as the API will create a new OAuth client on behalf of the caller. On the
     * other hand data_source.scopes usually need to be set when there are OAuth
     * scopes that need to be granted by end users.
     * 3. We need a longer deadline due to the 60 seconds SLO from Pub/Sub admin
     * Operations. This also applies to update and delete data source definition.
     * </pre>
     */
    default void createDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataSourceDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing data source definition. If changing
     * supported_location_ids, triggers same effects as mentioned in "Create a
     * data source definition."
     * </pre>
     */
    default void updateDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDataSourceDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a data source definition, all of the transfer configs associated
     * with this data source definition (if any) must be deleted first by the user
     * in ALL regions, in order to delete the data source definition.
     * This method is primarily meant for deleting data sources created during
     * testing stage.
     * If the data source is referenced by transfer configs in the region
     * specified in the request URL, the method will fail immediately. If in the
     * current region (e.g., US) it's not used by any transfer configs, but in
     * another region (e.g., EU) it is, then although the method will succeed in
     * region US, but it will fail when the deletion operation is replicated to
     * region EU. And eventually, the system will replicate the data source
     * definition back from EU to US, in order to bring all regions to
     * consistency. The final effect is that the data source appears to be
     * 'undeleted' in the US region.
     * </pre>
     */
    default void deleteDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataSourceDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves an existing data source definition.
     * </pre>
     */
    default void getDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataSourceDefinitionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists supported data source definitions.
     * </pre>
     */
    default void listDataSourceDefinitions(com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataSourceDefinitionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DataSourceService.
   * <pre>
   * The Google BigQuery Data Transfer API allows BigQuery users to
   * configure transfer of their data from other Google Products into BigQuery.
   * This service exposes methods that should be used by data source backend.
   * </pre>
   */
  public static abstract class DataSourceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DataSourceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DataSourceService.
   * <pre>
   * The Google BigQuery Data Transfer API allows BigQuery users to
   * configure transfer of their data from other Google Products into BigQuery.
   * This service exposes methods that should be used by data source backend.
   * </pre>
   */
  public static final class DataSourceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DataSourceServiceStub> {
    private DataSourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Update a transfer run. If successful, resets
     * data_source.update_deadline_seconds timer.
     * </pre>
     */
    public void updateTransferRun(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferRun> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTransferRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Log messages for a transfer run. If successful (at least 1 message), resets
     * data_source.update_deadline_seconds timer.
     * </pre>
     */
    public void logTransferRunMessages(com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLogTransferRunMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify the Data Transfer Service that data is ready for loading.
     * The Data Transfer Service will start and monitor multiple BigQuery Load
     * jobs for a transfer run. Monitored jobs will be automatically retried
     * and produce log messages when starting and finishing a job.
     * Can be called multiple times for the same transfer run.
     * </pre>
     */
    public void startBigQueryJobs(com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartBigQueryJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify the Data Transfer Service that the data source is done processing
     * the run. No more status updates or requests to start/monitor jobs will be
     * accepted. The run will be finalized by the Data Transfer Service when all
     * monitored jobs are completed.
     * Does not need to be called if the run is set to FAILED.
     * </pre>
     */
    public void finishRun(com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishRunMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a data source definition.  Calling this method will automatically
     * use your credentials to create the following Google Cloud resources in
     * YOUR Google Cloud project.
     * 1. OAuth client
     * 2. Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
     * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
     * The field data_source.client_id should be left empty in the input request,
     * as the API will create a new OAuth client on behalf of the caller. On the
     * other hand data_source.scopes usually need to be set when there are OAuth
     * scopes that need to be granted by end users.
     * 3. We need a longer deadline due to the 60 seconds SLO from Pub/Sub admin
     * Operations. This also applies to update and delete data source definition.
     * </pre>
     */
    public void createDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataSourceDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing data source definition. If changing
     * supported_location_ids, triggers same effects as mentioned in "Create a
     * data source definition."
     * </pre>
     */
    public void updateDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDataSourceDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a data source definition, all of the transfer configs associated
     * with this data source definition (if any) must be deleted first by the user
     * in ALL regions, in order to delete the data source definition.
     * This method is primarily meant for deleting data sources created during
     * testing stage.
     * If the data source is referenced by transfer configs in the region
     * specified in the request URL, the method will fail immediately. If in the
     * current region (e.g., US) it's not used by any transfer configs, but in
     * another region (e.g., EU) it is, then although the method will succeed in
     * region US, but it will fail when the deletion operation is replicated to
     * region EU. And eventually, the system will replicate the data source
     * definition back from EU to US, in order to bring all regions to
     * consistency. The final effect is that the data source appears to be
     * 'undeleted' in the US region.
     * </pre>
     */
    public void deleteDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataSourceDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves an existing data source definition.
     * </pre>
     */
    public void getDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataSourceDefinitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists supported data source definitions.
     * </pre>
     */
    public void listDataSourceDefinitions(com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataSourceDefinitionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DataSourceService.
   * <pre>
   * The Google BigQuery Data Transfer API allows BigQuery users to
   * configure transfer of their data from other Google Products into BigQuery.
   * This service exposes methods that should be used by data source backend.
   * </pre>
   */
  public static final class DataSourceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DataSourceServiceBlockingStub> {
    private DataSourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Update a transfer run. If successful, resets
     * data_source.update_deadline_seconds timer.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.TransferRun updateTransferRun(com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTransferRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Log messages for a transfer run. If successful (at least 1 message), resets
     * data_source.update_deadline_seconds timer.
     * </pre>
     */
    public com.google.protobuf.Empty logTransferRunMessages(com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLogTransferRunMessagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify the Data Transfer Service that data is ready for loading.
     * The Data Transfer Service will start and monitor multiple BigQuery Load
     * jobs for a transfer run. Monitored jobs will be automatically retried
     * and produce log messages when starting and finishing a job.
     * Can be called multiple times for the same transfer run.
     * </pre>
     */
    public com.google.protobuf.Empty startBigQueryJobs(com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartBigQueryJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify the Data Transfer Service that the data source is done processing
     * the run. No more status updates or requests to start/monitor jobs will be
     * accepted. The run will be finalized by the Data Transfer Service when all
     * monitored jobs are completed.
     * Does not need to be called if the run is set to FAILED.
     * </pre>
     */
    public com.google.protobuf.Empty finishRun(com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishRunMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a data source definition.  Calling this method will automatically
     * use your credentials to create the following Google Cloud resources in
     * YOUR Google Cloud project.
     * 1. OAuth client
     * 2. Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
     * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
     * The field data_source.client_id should be left empty in the input request,
     * as the API will create a new OAuth client on behalf of the caller. On the
     * other hand data_source.scopes usually need to be set when there are OAuth
     * scopes that need to be granted by end users.
     * 3. We need a longer deadline due to the 60 seconds SLO from Pub/Sub admin
     * Operations. This also applies to update and delete data source definition.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition createDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataSourceDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing data source definition. If changing
     * supported_location_ids, triggers same effects as mentioned in "Create a
     * data source definition."
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition updateDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataSourceDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a data source definition, all of the transfer configs associated
     * with this data source definition (if any) must be deleted first by the user
     * in ALL regions, in order to delete the data source definition.
     * This method is primarily meant for deleting data sources created during
     * testing stage.
     * If the data source is referenced by transfer configs in the region
     * specified in the request URL, the method will fail immediately. If in the
     * current region (e.g., US) it's not used by any transfer configs, but in
     * another region (e.g., EU) it is, then although the method will succeed in
     * region US, but it will fail when the deletion operation is replicated to
     * region EU. And eventually, the system will replicate the data source
     * definition back from EU to US, in order to bring all regions to
     * consistency. The final effect is that the data source appears to be
     * 'undeleted' in the US region.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataSourceDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves an existing data source definition.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition getDataSourceDefinition(com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataSourceDefinitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists supported data source definitions.
     * </pre>
     */
    public com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse listDataSourceDefinitions(com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataSourceDefinitionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DataSourceService.
   * <pre>
   * The Google BigQuery Data Transfer API allows BigQuery users to
   * configure transfer of their data from other Google Products into BigQuery.
   * This service exposes methods that should be used by data source backend.
   * </pre>
   */
  public static final class DataSourceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DataSourceServiceFutureStub> {
    private DataSourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Update a transfer run. If successful, resets
     * data_source.update_deadline_seconds timer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.TransferRun> updateTransferRun(
        com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTransferRunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Log messages for a transfer run. If successful (at least 1 message), resets
     * data_source.update_deadline_seconds timer.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> logTransferRunMessages(
        com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLogTransferRunMessagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify the Data Transfer Service that data is ready for loading.
     * The Data Transfer Service will start and monitor multiple BigQuery Load
     * jobs for a transfer run. Monitored jobs will be automatically retried
     * and produce log messages when starting and finishing a job.
     * Can be called multiple times for the same transfer run.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> startBigQueryJobs(
        com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartBigQueryJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify the Data Transfer Service that the data source is done processing
     * the run. No more status updates or requests to start/monitor jobs will be
     * accepted. The run will be finalized by the Data Transfer Service when all
     * monitored jobs are completed.
     * Does not need to be called if the run is set to FAILED.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> finishRun(
        com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishRunMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a data source definition.  Calling this method will automatically
     * use your credentials to create the following Google Cloud resources in
     * YOUR Google Cloud project.
     * 1. OAuth client
     * 2. Pub/Sub Topics and Subscriptions in each supported_location_ids. e.g.,
     * projects/{project_id}/{topics|subscriptions}/bigquerydatatransfer.{data_source_id}.{location_id}.run
     * The field data_source.client_id should be left empty in the input request,
     * as the API will create a new OAuth client on behalf of the caller. On the
     * other hand data_source.scopes usually need to be set when there are OAuth
     * scopes that need to be granted by end users.
     * 3. We need a longer deadline due to the 60 seconds SLO from Pub/Sub admin
     * Operations. This also applies to update and delete data source definition.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> createDataSourceDefinition(
        com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataSourceDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing data source definition. If changing
     * supported_location_ids, triggers same effects as mentioned in "Create a
     * data source definition."
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> updateDataSourceDefinition(
        com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDataSourceDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a data source definition, all of the transfer configs associated
     * with this data source definition (if any) must be deleted first by the user
     * in ALL regions, in order to delete the data source definition.
     * This method is primarily meant for deleting data sources created during
     * testing stage.
     * If the data source is referenced by transfer configs in the region
     * specified in the request URL, the method will fail immediately. If in the
     * current region (e.g., US) it's not used by any transfer configs, but in
     * another region (e.g., EU) it is, then although the method will succeed in
     * region US, but it will fail when the deletion operation is replicated to
     * region EU. And eventually, the system will replicate the data source
     * definition back from EU to US, in order to bring all regions to
     * consistency. The final effect is that the data source appears to be
     * 'undeleted' in the US region.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDataSourceDefinition(
        com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataSourceDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves an existing data source definition.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition> getDataSourceDefinition(
        com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataSourceDefinitionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Lists supported data source definitions.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse> listDataSourceDefinitions(
        com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataSourceDefinitionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UPDATE_TRANSFER_RUN = 0;
  private static final int METHODID_LOG_TRANSFER_RUN_MESSAGES = 1;
  private static final int METHODID_START_BIG_QUERY_JOBS = 2;
  private static final int METHODID_FINISH_RUN = 3;
  private static final int METHODID_CREATE_DATA_SOURCE_DEFINITION = 4;
  private static final int METHODID_UPDATE_DATA_SOURCE_DEFINITION = 5;
  private static final int METHODID_DELETE_DATA_SOURCE_DEFINITION = 6;
  private static final int METHODID_GET_DATA_SOURCE_DEFINITION = 7;
  private static final int METHODID_LIST_DATA_SOURCE_DEFINITIONS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_TRANSFER_RUN:
          serviceImpl.updateTransferRun((com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.TransferRun>) responseObserver);
          break;
        case METHODID_LOG_TRANSFER_RUN_MESSAGES:
          serviceImpl.logTransferRunMessages((com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_START_BIG_QUERY_JOBS:
          serviceImpl.startBigQueryJobs((com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FINISH_RUN:
          serviceImpl.finishRun((com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_DATA_SOURCE_DEFINITION:
          serviceImpl.createDataSourceDefinition((com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>) responseObserver);
          break;
        case METHODID_UPDATE_DATA_SOURCE_DEFINITION:
          serviceImpl.updateDataSourceDefinition((com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>) responseObserver);
          break;
        case METHODID_DELETE_DATA_SOURCE_DEFINITION:
          serviceImpl.deleteDataSourceDefinition((com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_DATA_SOURCE_DEFINITION:
          serviceImpl.getDataSourceDefinition((com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>) responseObserver);
          break;
        case METHODID_LIST_DATA_SOURCE_DEFINITIONS:
          serviceImpl.listDataSourceDefinitions((com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getUpdateTransferRunMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest,
              com.google.cloud.bigquery.datatransfer.v1.TransferRun>(
                service, METHODID_UPDATE_TRANSFER_RUN)))
        .addMethod(
          getLogTransferRunMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.LogTransferRunMessagesRequest,
              com.google.protobuf.Empty>(
                service, METHODID_LOG_TRANSFER_RUN_MESSAGES)))
        .addMethod(
          getStartBigQueryJobsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.StartBigQueryJobsRequest,
              com.google.protobuf.Empty>(
                service, METHODID_START_BIG_QUERY_JOBS)))
        .addMethod(
          getFinishRunMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.FinishRunRequest,
              com.google.protobuf.Empty>(
                service, METHODID_FINISH_RUN)))
        .addMethod(
          getCreateDataSourceDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.CreateDataSourceDefinitionRequest,
              com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>(
                service, METHODID_CREATE_DATA_SOURCE_DEFINITION)))
        .addMethod(
          getUpdateDataSourceDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.UpdateDataSourceDefinitionRequest,
              com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>(
                service, METHODID_UPDATE_DATA_SOURCE_DEFINITION)))
        .addMethod(
          getDeleteDataSourceDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.DeleteDataSourceDefinitionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_DATA_SOURCE_DEFINITION)))
        .addMethod(
          getGetDataSourceDefinitionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.GetDataSourceDefinitionRequest,
              com.google.cloud.bigquery.datatransfer.v1.DataSourceDefinition>(
                service, METHODID_GET_DATA_SOURCE_DEFINITION)))
        .addMethod(
          getListDataSourceDefinitionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsRequest,
              com.google.cloud.bigquery.datatransfer.v1.ListDataSourceDefinitionsResponse>(
                service, METHODID_LIST_DATA_SOURCE_DEFINITIONS)))
        .build();
  }

  private static abstract class DataSourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataSourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.bigquery.datatransfer.v1.DataSourceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataSourceService");
    }
  }

  private static final class DataSourceServiceFileDescriptorSupplier
      extends DataSourceServiceBaseDescriptorSupplier {
    DataSourceServiceFileDescriptorSupplier() {}
  }

  private static final class DataSourceServiceMethodDescriptorSupplier
      extends DataSourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DataSourceServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataSourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataSourceServiceFileDescriptorSupplier())
              .addMethod(getUpdateTransferRunMethod())
              .addMethod(getLogTransferRunMessagesMethod())
              .addMethod(getStartBigQueryJobsMethod())
              .addMethod(getFinishRunMethod())
              .addMethod(getCreateDataSourceDefinitionMethod())
              .addMethod(getUpdateDataSourceDefinitionMethod())
              .addMethod(getDeleteDataSourceDefinitionMethod())
              .addMethod(getGetDataSourceDefinitionMethod())
              .addMethod(getListDataSourceDefinitionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
