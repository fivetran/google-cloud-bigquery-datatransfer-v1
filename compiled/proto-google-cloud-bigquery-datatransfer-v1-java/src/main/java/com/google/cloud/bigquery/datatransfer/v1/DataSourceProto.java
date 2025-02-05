// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.datatransfer.v1;

public final class DataSourceProto {
  private DataSourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/bigquery/datatransfer/v1/" +
      "datasource.proto\022%google.cloud.bigquery." +
      "datatransfer.v1\032\034google/api/annotations." +
      "proto\032\037google/api/field_behavior.proto\0328" +
      "google/cloud/bigquery/datatransfer/v1/da" +
      "tatransfer.proto\0324google/cloud/bigquery/" +
      "datatransfer/v1/transfer.proto\032\036google/p" +
      "rotobuf/duration.proto\032\033google/protobuf/" +
      "empty.proto\032 google/protobuf/field_mask." +
      "proto\032\036google/protobuf/wrappers.proto\032\027g" +
      "oogle/api/client.proto\"\236\016\n\020ImportedDataI" +
      "nfo\022\013\n\003sql\030\001 \001(\t\022\034\n\024destination_table_id" +
      "\030\002 \001(\t\022%\n\035destination_table_description\030" +
      "\n \001(\t\022[\n\ntable_defs\030\003 \003(\0132G.google.cloud" +
      ".bigquery.datatransfer.v1.ImportedDataIn" +
      "fo.TableDefinition\022\036\n\026user_defined_funct" +
      "ions\030\004 \003(\t\022R\n\021write_disposition\030\006 \001(\01627." +
      "google.cloud.bigquery.datatransfer.v1.Wr" +
      "iteDisposition\032\255\003\n\013FieldSchema\022\022\n\nfield_" +
      "name\030\001 \001(\t\022V\n\004type\030\002 \001(\0162H.google.cloud." +
      "bigquery.datatransfer.v1.ImportedDataInf" +
      "o.FieldSchema.Type\022\023\n\013is_repeated\030\003 \001(\010\022" +
      "\023\n\013description\030\004 \001(\t\022T\n\006schema\030\005 \001(\0132D.g" +
      "oogle.cloud.bigquery.datatransfer.v1.Imp" +
      "ortedDataInfo.RecordSchema\"\261\001\n\004Type\022\024\n\020T" +
      "YPE_UNSPECIFIED\020\000\022\n\n\006STRING\020\001\022\013\n\007INTEGER" +
      "\020\002\022\t\n\005FLOAT\020\003\022\n\n\006RECORD\020\004\022\t\n\005BYTES\020\005\022\013\n\007" +
      "BOOLEAN\020\006\022\r\n\tTIMESTAMP\020\007\022\010\n\004DATE\020\010\022\010\n\004TI" +
      "ME\020\t\022\014\n\010DATETIME\020\n\022\013\n\007NUMERIC\020\013\022\r\n\tGEOGR" +
      "APHY\020\014\032c\n\014RecordSchema\022S\n\006fields\030\001 \003(\0132C" +
      ".google.cloud.bigquery.datatransfer.v1.I" +
      "mportedDataInfo.FieldSchema\032\221\006\n\017TableDef" +
      "inition\022\020\n\010table_id\030\001 \001(\t\022\023\n\013source_uris" +
      "\030\002 \003(\t\022N\n\006format\030\003 \001(\0162>.google.cloud.bi" +
      "gquery.datatransfer.v1.ImportedDataInfo." +
      "Format\022\027\n\017max_bad_records\030\004 \001(\005\022R\n\010encod" +
      "ing\030\005 \001(\0162@.google.cloud.bigquery.datatr" +
      "ansfer.v1.ImportedDataInfo.Encoding\022g\n\013c" +
      "sv_options\030\006 \001(\0132R.google.cloud.bigquery" +
      ".datatransfer.v1.ImportedDataInfo.TableD" +
      "efinition.CsvOptions\022T\n\006schema\030\007 \001(\0132D.g" +
      "oogle.cloud.bigquery.datatransfer.v1.Imp" +
      "ortedDataInfo.RecordSchema\0229\n\025ignore_unk" +
      "nown_values\030\n \001(\0132\032.google.protobuf.Bool" +
      "Value\032\237\002\n\nCsvOptions\0225\n\017field_delimiter\030" +
      "\001 \001(\0132\034.google.protobuf.StringValue\0229\n\025a" +
      "llow_quoted_newlines\030\002 \001(\0132\032.google.prot" +
      "obuf.BoolValue\0220\n\nquote_char\030\003 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\0226\n\021skip_leading" +
      "_rows\030\004 \001(\0132\033.google.protobuf.Int64Value" +
      "\0225\n\021allow_jagged_rows\030\005 \001(\0132\032.google.pro" +
      "tobuf.BoolValue\"~\n\006Format\022\026\n\022FORMAT_UNSP" +
      "ECIFIED\020\000\022\007\n\003CSV\020\001\022\010\n\004JSON\020\002\022\010\n\004AVRO\020\003\022\014" +
      "\n\010RECORDIO\020\004\022\014\n\010COLUMNIO\020\005\022\r\n\tCAPACITOR\020" +
      "\006\022\013\n\007PARQUET\020\007\022\007\n\003ORC\020\010\">\n\010Encoding\022\030\n\024E" +
      "NCODING_UNSPECIFIED\020\000\022\016\n\nISO_8859_1\020\001\022\010\n" +
      "\004UTF8\020\002\"\225\001\n\030UpdateTransferRunRequest\022H\n\014" +
      "transfer_run\030\001 \001(\01322.google.cloud.bigque" +
      "ry.datatransfer.v1.TransferRun\022/\n\013update" +
      "_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\"" +
      "\200\001\n\035LogTransferRunMessagesRequest\022\014\n\004nam" +
      "e\030\001 \001(\t\022Q\n\021transfer_messages\030\002 \003(\01326.goo" +
      "gle.cloud.bigquery.datatransfer.v1.Trans" +
      "ferMessage\"\253\001\n\030StartBigQueryJobsRequest\022" +
      "\014\n\004name\030\001 \001(\t\022N\n\rimported_data\030\002 \003(\01327.g" +
      "oogle.cloud.bigquery.datatransfer.v1.Imp" +
      "ortedDataInfo\022\030\n\020user_credentials\030\003 \001(\014\022" +
      "\027\n\017max_parallelism\030\010 \001(\005\" \n\020FinishRunReq" +
      "uest\022\014\n\004name\030\001 \001(\t\"\220\001\n!CreateDataSourceD" +
      "efinitionRequest\022\016\n\006parent\030\001 \001(\t\022[\n\026data" +
      "_source_definition\030\002 \001(\0132;.google.cloud." +
      "bigquery.datatransfer.v1.DataSourceDefin" +
      "ition\"\261\001\n!UpdateDataSourceDefinitionRequ" +
      "est\022[\n\026data_source_definition\030\001 \001(\0132;.go" +
      "ogle.cloud.bigquery.datatransfer.v1.Data" +
      "SourceDefinition\022/\n\013update_mask\030\002 \001(\0132\032." +
      "google.protobuf.FieldMask\"1\n!DeleteDataS" +
      "ourceDefinitionRequest\022\014\n\004name\030\001 \001(\t\".\n\036" +
      "GetDataSourceDefinitionRequest\022\014\n\004name\030\001" +
      " \001(\t\"Y\n ListDataSourceDefinitionsRequest" +
      "\022\016\n\006parent\030\001 \001(\t\022\022\n\npage_token\030\002 \001(\t\022\021\n\t" +
      "page_size\030\003 \001(\005\"\237\001\n!ListDataSourceDefini" +
      "tionsResponse\022\\\n\027data_source_definitions" +
      "\030\001 \003(\0132;.google.cloud.bigquery.datatrans" +
      "fer.v1.DataSourceDefinition\022\034\n\017next_page" +
      "_token\030\002 \001(\tB\003\340A\003\"\313\002\n\024DataSourceDefiniti" +
      "on\022\014\n\004name\030\025 \001(\t\022F\n\013data_source\030\001 \001(\01321." +
      "google.cloud.bigquery.datatransfer.v1.Da" +
      "taSource\022!\n\031transfer_run_pubsub_topic\030\r " +
      "\001(\t\0222\n\017run_time_offset\030\020 \001(\0132\031.google.pr" +
      "otobuf.Duration\022\025\n\rsupport_email\030\026 \001(\t\022\027" +
      "\n\017service_account\030\002 \001(\t\022\020\n\010disabled\030\005 \001(" +
      "\010\022$\n\034transfer_config_pubsub_topic\030\014 \001(\t\022" +
      "\036\n\026supported_location_ids\030\027 \003(\t*[\n\020Write" +
      "Disposition\022!\n\035WRITE_DISPOSITION_UNSPECI" +
      "FIED\020\000\022\022\n\016WRITE_TRUNCATE\020\001\022\020\n\014WRITE_APPE" +
      "ND\020\0022\370\020\n\021DataSourceService\022\347\001\n\021UpdateTra" +
      "nsferRun\022?.google.cloud.bigquery.datatra" +
      "nsfer.v1.UpdateTransferRunRequest\0322.goog" +
      "le.cloud.bigquery.datatransfer.v1.Transf" +
      "erRun\"]\202\323\344\223\002W2G/v1/{transfer_run.name=pr" +
      "ojects/*/locations/*/transferConfigs/*/r" +
      "uns/*}:\014transfer_run\022\311\001\n\026LogTransferRunM" +
      "essages\022D.google.cloud.bigquery.datatran" +
      "sfer.v1.LogTransferRunMessagesRequest\032\026." +
      "google.protobuf.Empty\"Q\202\323\344\223\002K\"F/v1/{name" +
      "=projects/*/locations/*/transferConfigs/" +
      "*/runs/*}:logMessages:\001*\022\305\001\n\021StartBigQue" +
      "ryJobs\022?.google.cloud.bigquery.datatrans" +
      "fer.v1.StartBigQueryJobsRequest\032\026.google" +
      ".protobuf.Empty\"W\202\323\344\223\002Q\"L/v1/{name=proje" +
      "cts/*/locations/*/transferConfigs/*/runs" +
      "/*}:startBigQueryJobs:\001*\022\255\001\n\tFinishRun\0227" +
      ".google.cloud.bigquery.datatransfer.v1.F" +
      "inishRunRequest\032\026.google.protobuf.Empty\"" +
      "O\202\323\344\223\002I\"D/v1/{name=projects/*/locations/" +
      "*/transferConfigs/*/runs/*}:finishRun:\001*" +
      "\022\376\001\n\032CreateDataSourceDefinition\022H.google" +
      ".cloud.bigquery.datatransfer.v1.CreateDa" +
      "taSourceDefinitionRequest\032;.google.cloud" +
      ".bigquery.datatransfer.v1.DataSourceDefi" +
      "nition\"Y\202\323\344\223\002S\"9/v1/{parent=projects/*/l" +
      "ocations/*}/dataSourceDefinitions:\026data_" +
      "source_definition\022\225\002\n\032UpdateDataSourceDe" +
      "finition\022H.google.cloud.bigquery.datatra" +
      "nsfer.v1.UpdateDataSourceDefinitionReque" +
      "st\032;.google.cloud.bigquery.datatransfer." +
      "v1.DataSourceDefinition\"p\202\323\344\223\002j2P/v1/{da" +
      "ta_source_definition.name=projects/*/loc" +
      "ations/*/dataSourceDefinitions/*}:\026data_" +
      "source_definition\022\301\001\n\032DeleteDataSourceDe" +
      "finition\022H.google.cloud.bigquery.datatra" +
      "nsfer.v1.DeleteDataSourceDefinitionReque" +
      "st\032\026.google.protobuf.Empty\"A\202\323\344\223\002;*9/v1/" +
      "{name=projects/*/locations/*/dataSourceD" +
      "efinitions/*}\022\340\001\n\027GetDataSourceDefinitio" +
      "n\022E.google.cloud.bigquery.datatransfer.v" +
      "1.GetDataSourceDefinitionRequest\032;.googl" +
      "e.cloud.bigquery.datatransfer.v1.DataSou" +
      "rceDefinition\"A\202\323\344\223\002;\0229/v1/{name=project" +
      "s/*/locations/*/dataSourceDefinitions/*}" +
      "\022\361\001\n\031ListDataSourceDefinitions\022G.google." +
      "cloud.bigquery.datatransfer.v1.ListDataS" +
      "ourceDefinitionsRequest\032H.google.cloud.b" +
      "igquery.datatransfer.v1.ListDataSourceDe" +
      "finitionsResponse\"A\202\323\344\223\002;\0229/v1/{parent=p" +
      "rojects/*/locations/*}/dataSourceDefinit" +
      "ions\032\200\001\312A#bigquerydatatransfer.googleapi" +
      "s.com\322AWhttps://www.googleapis.com/auth/" +
      "bigquery,https://www.googleapis.com/auth" +
      "/cloud-platformB\341\001\n)com.google.cloud.big" +
      "query.datatransfer.v1B\017DataSourceProtoP\001" +
      "ZQgoogle.golang.org/genproto/googleapis/" +
      "cloud/bigquery/datatransfer/v1;datatrans" +
      "fer\252\002%Google.Cloud.BigQuery.DataTransfer" +
      ".V1\312\002%Google\\Cloud\\BigQuery\\DataTransfer" +
      "\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.getDescriptor(),
          com.google.cloud.bigquery.datatransfer.v1.TransferProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor,
        new java.lang.String[] { "Sql", "DestinationTableId", "DestinationTableDescription", "TableDefs", "UserDefinedFunctions", "WriteDisposition", });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_descriptor =
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_FieldSchema_descriptor,
        new java.lang.String[] { "FieldName", "Type", "IsRepeated", "Description", "Schema", });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_descriptor =
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_RecordSchema_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_descriptor =
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_descriptor,
        new java.lang.String[] { "TableId", "SourceUris", "Format", "MaxBadRecords", "Encoding", "CsvOptions", "Schema", "IgnoreUnknownValues", });
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_descriptor =
      internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_ImportedDataInfo_TableDefinition_CsvOptions_descriptor,
        new java.lang.String[] { "FieldDelimiter", "AllowQuotedNewlines", "QuoteChar", "SkipLeadingRows", "AllowJaggedRows", });
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_UpdateTransferRunRequest_descriptor,
        new java.lang.String[] { "TransferRun", "UpdateMask", });
    internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_LogTransferRunMessagesRequest_descriptor,
        new java.lang.String[] { "Name", "TransferMessages", });
    internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_StartBigQueryJobsRequest_descriptor,
        new java.lang.String[] { "Name", "ImportedData", "UserCredentials", "MaxParallelism", });
    internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_FinishRunRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_CreateDataSourceDefinitionRequest_descriptor,
        new java.lang.String[] { "Parent", "DataSourceDefinition", });
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_UpdateDataSourceDefinitionRequest_descriptor,
        new java.lang.String[] { "DataSourceDefinition", "UpdateMask", });
    internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_DeleteDataSourceDefinitionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_GetDataSourceDefinitionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageToken", "PageSize", });
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_ListDataSourceDefinitionsResponse_descriptor,
        new java.lang.String[] { "DataSourceDefinitions", "NextPageToken", });
    internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_DataSourceDefinition_descriptor,
        new java.lang.String[] { "Name", "DataSource", "TransferRunPubsubTopic", "RunTimeOffset", "SupportEmail", "ServiceAccount", "Disabled", "TransferConfigPubsubTopic", "SupportedLocationIds", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.bigquery.datatransfer.v1.DataTransferProto.getDescriptor();
    com.google.cloud.bigquery.datatransfer.v1.TransferProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
