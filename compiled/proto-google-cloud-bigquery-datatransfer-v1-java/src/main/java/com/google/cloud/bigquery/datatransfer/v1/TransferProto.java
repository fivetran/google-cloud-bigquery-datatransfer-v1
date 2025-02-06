// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/transfer.proto
// Protobuf Java Version: 4.26.0

package com.google.cloud.bigquery.datatransfer.v1;

public final class TransferProto {
  private TransferProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 0,
      /* suffix= */ "",
      TransferProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/bigquery/datatransfer/v1/" +
      "transfer.proto\022%google.cloud.bigquery.da" +
      "tatransfer.v1\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032\034googl" +
      "e/protobuf/struct.proto\032\037google/protobuf" +
      "/timestamp.proto\032\027google/rpc/status.prot" +
      "o\"0\n\020EmailPreferences\022\034\n\024enable_failure_" +
      "email\030\001 \001(\010\"\220\001\n\017ScheduleOptions\022\037\n\027disab" +
      "le_auto_scheduling\030\003 \001(\010\022.\n\nstart_time\030\001" +
      " \001(\0132\032.google.protobuf.Timestamp\022,\n\010end_" +
      "time\030\002 \001(\0132\032.google.protobuf.Timestamp\"\250" +
      "\007\n\016TransferConfig\022\014\n\004name\030\001 \001(\t\022 \n\026desti" +
      "nation_dataset_id\030\002 \001(\tH\000\022\024\n\014display_nam" +
      "e\030\003 \001(\t\022\026\n\016data_source_id\030\005 \001(\t\022\'\n\006param" +
      "s\030\t \001(\0132\027.google.protobuf.Struct\022\020\n\010sche" +
      "dule\030\007 \001(\t\022P\n\020schedule_options\030\030 \001(\01326.g" +
      "oogle.cloud.bigquery.datatransfer.v1.Sch" +
      "eduleOptions\022 \n\030data_refresh_window_days" +
      "\030\014 \001(\005\022\020\n\010disabled\030\r \001(\010\0224\n\013update_time\030" +
      "\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0226" +
      "\n\rnext_run_time\030\010 \001(\0132\032.google.protobuf." +
      "TimestampB\003\340A\003\022H\n\005state\030\n \001(\01624.google.c" +
      "loud.bigquery.datatransfer.v1.TransferSt" +
      "ateB\003\340A\003\022\017\n\007user_id\030\013 \001(\003\022\033\n\016dataset_reg" +
      "ion\030\016 \001(\tB\003\340A\003\022!\n\031notification_pubsub_to" +
      "pic\030\017 \001(\t\022R\n\021email_preferences\030\022 \001(\01327.g" +
      "oogle.cloud.bigquery.datatransfer.v1.Ema" +
      "ilPreferences\022\025\n\rpartner_token\030\026 \001(\t\0228\n\027" +
      "partner_connection_info\030\027 \001(\0132\027.google.p" +
      "rotobuf.Struct:\271\001\352A\265\001\n2bigquerydatatrans" +
      "fer.googleapis.com/TransferConfig\0224proje" +
      "cts/{project}/transferConfigs/{transfer_" +
      "config}\022Iprojects/{project}/locations/{l" +
      "ocation}/transferConfigs/{transfer_confi" +
      "g}B\r\n\013destination\"\225\010\n\013TransferRun\022\014\n\004nam" +
      "e\030\001 \001(\t\022N\n\006labels\030\026 \003(\0132>.google.cloud.b" +
      "igquery.datatransfer.v1.TransferRun.Labe" +
      "lsEntry\0221\n\rschedule_time\030\003 \001(\0132\032.google." +
      "protobuf.Timestamp\022,\n\010run_time\030\n \001(\0132\032.g" +
      "oogle.protobuf.Timestamp\022(\n\014error_status" +
      "\030\025 \001(\0132\022.google.rpc.Status\0223\n\nstart_time" +
      "\030\004 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "1\n\010end_time\030\005 \001(\0132\032.google.protobuf.Time" +
      "stampB\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google" +
      ".protobuf.TimestampB\003\340A\003\022,\n\006params\030\t \001(\013" +
      "2\027.google.protobuf.StructB\003\340A\003\022%\n\026destin" +
      "ation_dataset_id\030\002 \001(\tB\003\340A\003H\000\022\033\n\016data_so" +
      "urce_id\030\007 \001(\tB\003\340A\003\022C\n\005state\030\010 \001(\01624.goog" +
      "le.cloud.bigquery.datatransfer.v1.Transf" +
      "erState\022\017\n\007user_id\030\013 \001(\003\022\025\n\010schedule\030\014 \001" +
      "(\tB\003\340A\003\022&\n\031notification_pubsub_topic\030\027 \001" +
      "(\tB\003\340A\003\022W\n\021email_preferences\030\031 \001(\01327.goo" +
      "gle.cloud.bigquery.datatransfer.v1.Email" +
      "PreferencesB\003\340A\003\022\032\n\rpartner_token\030\034 \001(\tB" +
      "\003\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu" +
      "e\030\002 \001(\t:\0028\001:\304\001\352A\300\001\n\'bigquerydatatransfer" +
      ".googleapis.com/Run\022?projects/{project}/" +
      "transferConfigs/{transfer_config}/runs/{" +
      "run}\022Tprojects/{project}/locations/{loca" +
      "tion}/transferConfigs/{transfer_config}/" +
      "runs/{run}B\r\n\013destination\"\225\002\n\017TransferMe" +
      "ssage\0220\n\014message_time\030\001 \001(\0132\032.google.pro" +
      "tobuf.Timestamp\022X\n\010severity\030\002 \001(\0162F.goog" +
      "le.cloud.bigquery.datatransfer.v1.Transf" +
      "erMessage.MessageSeverity\022\024\n\014message_tex" +
      "t\030\003 \001(\t\"`\n\017MessageSeverity\022 \n\034MESSAGE_SE" +
      "VERITY_UNSPECIFIED\020\000\022\010\n\004INFO\020\001\022\013\n\007WARNIN" +
      "G\020\002\022\t\n\005ERROR\020\003\022\t\n\005DEBUG\020\004*K\n\014TransferTyp" +
      "e\022\035\n\031TRANSFER_TYPE_UNSPECIFIED\020\000\022\t\n\005BATC" +
      "H\020\001\022\r\n\tSTREAMING\020\002\032\002\030\001*s\n\rTransferState\022" +
      "\036\n\032TRANSFER_STATE_UNSPECIFIED\020\000\022\013\n\007PENDI" +
      "NG\020\002\022\013\n\007RUNNING\020\003\022\r\n\tSUCCEEDED\020\004\022\n\n\006FAIL" +
      "ED\020\005\022\r\n\tCANCELLED\020\006B\317\002\n)com.google.cloud" +
      ".bigquery.datatransfer.v1B\rTransferProto" +
      "P\001ZQgoogle.golang.org/genproto/googleapi" +
      "s/cloud/bigquery/datatransfer/v1;datatra" +
      "nsfer\242\002\005GCBDT\252\002%Google.Cloud.BigQuery.Da" +
      "taTransfer.V1\312\002%Google\\Cloud\\BigQuery\\Da" +
      "taTransfer\\V1\352Ae\n&bigquerydatatransfer.g" +
      "oogle.com/Parent\022\022projects/{project}\022\'pr" +
      "ojects/{project}/locations/{location}b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_EmailPreferences_descriptor,
        new java.lang.String[] { "EnableFailureEmail", });
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_ScheduleOptions_descriptor,
        new java.lang.String[] { "DisableAutoScheduling", "StartTime", "EndTime", });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_TransferConfig_descriptor,
        new java.lang.String[] { "Name", "DestinationDatasetId", "DisplayName", "DataSourceId", "Params", "Schedule", "ScheduleOptions", "DataRefreshWindowDays", "Disabled", "UpdateTime", "NextRunTime", "State", "UserId", "DatasetRegion", "NotificationPubsubTopic", "EmailPreferences", "PartnerToken", "PartnerConnectionInfo", "Destination", });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor,
        new java.lang.String[] { "Name", "Labels", "ScheduleTime", "RunTime", "ErrorStatus", "StartTime", "EndTime", "UpdateTime", "Params", "DestinationDatasetId", "DataSourceId", "State", "UserId", "Schedule", "NotificationPubsubTopic", "EmailPreferences", "PartnerToken", "Destination", });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_LabelsEntry_descriptor =
      internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_TransferRun_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_google_cloud_bigquery_datatransfer_v1_TransferMessage_descriptor,
        new java.lang.String[] { "MessageTime", "Severity", "MessageText", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
