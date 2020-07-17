// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/batch_job_service.proto

package com.google.ads.googleads.v4.services;

public final class BatchJobServiceProto {
  private BatchJobServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_BatchJobOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_BatchJobOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateBatchJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateBatchJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateBatchJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateBatchJobResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_RunBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_RunBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_ListBatchJobResultsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_ListBatchJobResultsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_ListBatchJobResultsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_ListBatchJobResultsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_BatchJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_BatchJobResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v4/services/batch" +
      "_job_service.proto\022 google.ads.googleads" +
      ".v4.services\0321google/ads/googleads/v4/re" +
      "sources/batch_job.proto\0329google/ads/goog" +
      "leads/v4/services/google_ads_service.pro" +
      "to\032\034google/api/annotations.proto\032\027google" +
      "/api/client.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032#g" +
      "oogle/longrunning/operations.proto\032\027goog" +
      "le/rpc/status.proto\"~\n\025MutateBatchJobReq" +
      "uest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022K\n\toperat" +
      "ion\030\002 \001(\01323.google.ads.googleads.v4.serv" +
      "ices.BatchJobOperationB\003\340A\002\"q\n\021BatchJobO" +
      "peration\022=\n\006create\030\001 \001(\0132+.google.ads.go" +
      "ogleads.v4.resources.BatchJobH\000\022\020\n\006remov" +
      "e\030\003 \001(\tH\000B\013\n\toperation\"`\n\026MutateBatchJob" +
      "Response\022F\n\006result\030\001 \001(\01326.google.ads.go" +
      "ogleads.v4.services.MutateBatchJobResult" +
      "\"-\n\024MutateBatchJobResult\022\025\n\rresource_nam" +
      "e\030\001 \001(\t\"V\n\022GetBatchJobRequest\022@\n\rresourc" +
      "e_name\030\001 \001(\tB)\340A\002\372A#\n!googleads.googleap" +
      "is.com/BatchJob\"V\n\022RunBatchJobRequest\022@\n" +
      "\rresource_name\030\001 \001(\tB)\340A\002\372A#\n!googleads." +
      "googleapis.com/BatchJob\"\313\001\n\034AddBatchJobO" +
      "perationsRequest\022@\n\rresource_name\030\001 \001(\tB" +
      ")\340A\002\372A#\n!googleads.googleapis.com/BatchJ" +
      "ob\022\026\n\016sequence_token\030\002 \001(\t\022Q\n\021mutate_ope" +
      "rations\030\003 \003(\01321.google.ads.googleads.v4." +
      "services.MutateOperationB\003\340A\002\"V\n\035AddBatc" +
      "hJobOperationsResponse\022\030\n\020total_operatio" +
      "ns\030\001 \001(\003\022\033\n\023next_sequence_token\030\002 \001(\t\"\205\001" +
      "\n\032ListBatchJobResultsRequest\022@\n\rresource" +
      "_name\030\001 \001(\tB)\340A\002\372A#\n!googleads.googleapi" +
      "s.com/BatchJob\022\022\n\npage_token\030\002 \001(\t\022\021\n\tpa" +
      "ge_size\030\003 \001(\005\"y\n\033ListBatchJobResultsResp" +
      "onse\022A\n\007results\030\001 \003(\01320.google.ads.googl" +
      "eads.v4.services.BatchJobResult\022\027\n\017next_" +
      "page_token\030\002 \001(\t\"\253\001\n\016BatchJobResult\022\027\n\017o" +
      "peration_index\030\001 \001(\003\022\\\n\031mutate_operation" +
      "_response\030\002 \001(\01329.google.ads.googleads.v" +
      "4.services.MutateOperationResponse\022\"\n\006st" +
      "atus\030\003 \001(\0132\022.google.rpc.Status2\343\t\n\017Batch" +
      "JobService\022\326\001\n\016MutateBatchJob\0227.google.a" +
      "ds.googleads.v4.services.MutateBatchJobR" +
      "equest\0328.google.ads.googleads.v4.service" +
      "s.MutateBatchJobResponse\"Q\202\323\344\223\0023\"./v4/cu" +
      "stomers/{customer_id=*}/batchJobs:mutate" +
      ":\001*\332A\025customer_id,operation\022\265\001\n\013GetBatch" +
      "Job\0224.google.ads.googleads.v4.services.G" +
      "etBatchJobRequest\032+.google.ads.googleads" +
      ".v4.resources.BatchJob\"C\202\323\344\223\002-\022+/v4/{res" +
      "ource_name=customers/*/batchJobs/*}\332A\rre" +
      "source_name\022\343\001\n\023ListBatchJobResults\022<.go" +
      "ogle.ads.googleads.v4.services.ListBatch" +
      "JobResultsRequest\032=.google.ads.googleads" +
      ".v4.services.ListBatchJobResultsResponse" +
      "\"O\202\323\344\223\0029\0227/v4/{resource_name=customers/*" +
      "/batchJobs/*}:listResults\332A\rresource_nam" +
      "e\022\206\002\n\013RunBatchJob\0224.google.ads.googleads" +
      ".v4.services.RunBatchJobRequest\032\035.google" +
      ".longrunning.Operation\"\241\001\202\323\344\223\0024\"//v4/{re" +
      "source_name=customers/*/batchJobs/*}:run" +
      ":\001*\332A\rresource_name\312AT\n\025google.protobuf." +
      "Empty\022;google.ads.googleads.v4.resources" +
      ".BatchJob.BatchJobMetadata\022\262\002\n\025AddBatchJ" +
      "obOperations\022>.google.ads.googleads.v4.s" +
      "ervices.AddBatchJobOperationsRequest\032?.g" +
      "oogle.ads.googleads.v4.services.AddBatch" +
      "JobOperationsResponse\"\227\001\202\323\344\223\002>\"9/v4/{res" +
      "ource_name=customers/*/batchJobs/*}:addO" +
      "perations:\001*\332A.resource_name,sequence_to" +
      "ken,mutate_operations\332A\037resource_name,mu" +
      "tate_operations\032\033\312A\030googleads.googleapis" +
      ".comB\373\001\n$com.google.ads.googleads.v4.ser" +
      "vicesB\024BatchJobServiceProtoP\001ZHgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v4/services;services\242\002\003GAA\252\002 Google.A" +
      "ds.GoogleAds.V4.Services\312\002 Google\\Ads\\Go" +
      "ogleAds\\V4\\Services\352\002$Google::Ads::Googl" +
      "eAds::V4::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.BatchJobProto.getDescriptor(),
          com.google.ads.googleads.v4.services.GoogleAdsServiceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_MutateBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_MutateBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateBatchJobRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v4_services_BatchJobOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_BatchJobOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_BatchJobOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateBatchJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_MutateBatchJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateBatchJobResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v4_services_MutateBatchJobResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_MutateBatchJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateBatchJobResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_GetBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_GetBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetBatchJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_RunBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v4_services_RunBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_RunBatchJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "SequenceToken", "MutateOperations", });
    internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_AddBatchJobOperationsResponse_descriptor,
        new java.lang.String[] { "TotalOperations", "NextSequenceToken", });
    internal_static_google_ads_googleads_v4_services_ListBatchJobResultsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v4_services_ListBatchJobResultsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_ListBatchJobResultsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "PageToken", "PageSize", });
    internal_static_google_ads_googleads_v4_services_ListBatchJobResultsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v4_services_ListBatchJobResultsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_ListBatchJobResultsResponse_descriptor,
        new java.lang.String[] { "Results", "NextPageToken", });
    internal_static_google_ads_googleads_v4_services_BatchJobResult_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v4_services_BatchJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_BatchJobResult_descriptor,
        new java.lang.String[] { "OperationIndex", "MutateOperationResponse", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.resources.BatchJobProto.getDescriptor();
    com.google.ads.googleads.v4.services.GoogleAdsServiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}