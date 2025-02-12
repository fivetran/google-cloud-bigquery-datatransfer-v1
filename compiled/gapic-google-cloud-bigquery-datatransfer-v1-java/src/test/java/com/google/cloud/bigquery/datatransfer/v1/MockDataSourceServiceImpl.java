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

import com.google.api.core.BetaApi;
import com.google.cloud.bigquery.datatransfer.v1.DataSourceServiceGrpc.DataSourceServiceImplBase;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockDataSourceServiceImpl extends DataSourceServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockDataSourceServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void updateTransferRun(
      UpdateTransferRunRequest request, StreamObserver<TransferRun> responseObserver) {
    Object response = responses.poll();
    if (response instanceof TransferRun) {
      requests.add(request);
      responseObserver.onNext(((TransferRun) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateTransferRun, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  TransferRun.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void logTransferRunMessages(
      LogTransferRunMessagesRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method LogTransferRunMessages, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void startBigQueryJobs(
      StartBigQueryJobsRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method StartBigQueryJobs, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void finishRun(FinishRunRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method FinishRun, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void createDataSourceDefinition(
      CreateDataSourceDefinitionRequest request,
      StreamObserver<DataSourceDefinition> responseObserver) {
    Object response = responses.poll();
    if (response instanceof DataSourceDefinition) {
      requests.add(request);
      responseObserver.onNext(((DataSourceDefinition) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateDataSourceDefinition, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  DataSourceDefinition.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void updateDataSourceDefinition(
      UpdateDataSourceDefinitionRequest request,
      StreamObserver<DataSourceDefinition> responseObserver) {
    Object response = responses.poll();
    if (response instanceof DataSourceDefinition) {
      requests.add(request);
      responseObserver.onNext(((DataSourceDefinition) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method UpdateDataSourceDefinition, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  DataSourceDefinition.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteDataSourceDefinition(
      DeleteDataSourceDefinitionRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteDataSourceDefinition, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getDataSourceDefinition(
      GetDataSourceDefinitionRequest request,
      StreamObserver<DataSourceDefinition> responseObserver) {
    Object response = responses.poll();
    if (response instanceof DataSourceDefinition) {
      requests.add(request);
      responseObserver.onNext(((DataSourceDefinition) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetDataSourceDefinition, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  DataSourceDefinition.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listDataSourceDefinitions(
      ListDataSourceDefinitionsRequest request,
      StreamObserver<ListDataSourceDefinitionsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListDataSourceDefinitionsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListDataSourceDefinitionsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListDataSourceDefinitions, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListDataSourceDefinitionsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
