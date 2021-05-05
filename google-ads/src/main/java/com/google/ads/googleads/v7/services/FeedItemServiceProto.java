// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/services/feed_item_service.proto

package com.google.ads.googleads.v7.services;

public final class FeedItemServiceProto {
  private FeedItemServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_GetFeedItemRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_GetFeedItemRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateFeedItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateFeedItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_FeedItemOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_FeedItemOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateFeedItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateFeedItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v7_services_MutateFeedItemResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v7_services_MutateFeedItemResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v7/services/feed_" +
      "item_service.proto\022 google.ads.googleads" +
      ".v7.services\0329google/ads/googleads/v7/en" +
      "ums/response_content_type.proto\0321google/" +
      "ads/googleads/v7/resources/feed_item.pro" +
      "to\032\034google/api/annotations.proto\032\027google" +
      "/api/client.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032 g" +
      "oogle/protobuf/field_mask.proto\032\027google/" +
      "rpc/status.proto\"V\n\022GetFeedItemRequest\022@" +
      "\n\rresource_name\030\001 \001(\tB)\340A\002\372A#\n!googleads" +
      ".googleapis.com/FeedItem\"\233\002\n\026MutateFeedI" +
      "temsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022L\n" +
      "\noperations\030\002 \003(\01323.google.ads.googleads" +
      ".v7.services.FeedItemOperationB\003\340A\002\022\027\n\017p" +
      "artial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 " +
      "\001(\010\022i\n\025response_content_type\030\005 \001(\0162J.goo" +
      "gle.ads.googleads.v7.enums.ResponseConte" +
      "ntTypeEnum.ResponseContentType\"\341\001\n\021FeedI" +
      "temOperation\022/\n\013update_mask\030\004 \001(\0132\032.goog" +
      "le.protobuf.FieldMask\022=\n\006create\030\001 \001(\0132+." +
      "google.ads.googleads.v7.resources.FeedIt" +
      "emH\000\022=\n\006update\030\002 \001(\0132+.google.ads.google" +
      "ads.v7.resources.FeedItemH\000\022\020\n\006remove\030\003 " +
      "\001(\tH\000B\013\n\toperation\"\225\001\n\027MutateFeedItemsRe" +
      "sponse\0221\n\025partial_failure_error\030\003 \001(\0132\022." +
      "google.rpc.Status\022G\n\007results\030\002 \003(\01326.goo" +
      "gle.ads.googleads.v7.services.MutateFeed" +
      "ItemResult\"m\n\024MutateFeedItemResult\022\025\n\rre" +
      "source_name\030\001 \001(\t\022>\n\tfeed_item\030\002 \001(\0132+.g" +
      "oogle.ads.googleads.v7.resources.FeedIte" +
      "m2\355\003\n\017FeedItemService\022\265\001\n\013GetFeedItem\0224." +
      "google.ads.googleads.v7.services.GetFeed" +
      "ItemRequest\032+.google.ads.googleads.v7.re" +
      "sources.FeedItem\"C\202\323\344\223\002-\022+/v7/{resource_" +
      "name=customers/*/feedItems/*}\332A\rresource" +
      "_name\022\332\001\n\017MutateFeedItems\0228.google.ads.g" +
      "oogleads.v7.services.MutateFeedItemsRequ" +
      "est\0329.google.ads.googleads.v7.services.M" +
      "utateFeedItemsResponse\"R\202\323\344\223\0023\"./v7/cust" +
      "omers/{customer_id=*}/feedItems:mutate:\001" +
      "*\332A\026customer_id,operations\032E\312A\030googleads" +
      ".googleapis.com\322A\'https://www.googleapis" +
      ".com/auth/adwordsB\373\001\n$com.google.ads.goo" +
      "gleads.v7.servicesB\024FeedItemServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v7/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V7.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V7\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V7::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v7.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v7.resources.FeedItemProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v7_services_GetFeedItemRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v7_services_GetFeedItemRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_GetFeedItemRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v7_services_MutateFeedItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v7_services_MutateFeedItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateFeedItemsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v7_services_FeedItemOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v7_services_FeedItemOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_FeedItemOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v7_services_MutateFeedItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v7_services_MutateFeedItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateFeedItemsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v7_services_MutateFeedItemResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v7_services_MutateFeedItemResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v7_services_MutateFeedItemResult_descriptor,
        new java.lang.String[] { "ResourceName", "FeedItem", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v7.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v7.resources.FeedItemProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}