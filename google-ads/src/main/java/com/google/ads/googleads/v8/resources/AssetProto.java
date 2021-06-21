// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/asset.proto

package com.google.ads.googleads.v8.resources;

public final class AssetProto {
  private AssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v8_resources_AssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v8_resources_AssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v8/resources/asse" +
      "t.proto\022!google.ads.googleads.v8.resourc" +
      "es\0320google/ads/googleads/v8/common/asset" +
      "_types.proto\0325google/ads/googleads/v8/co" +
      "mmon/custom_parameter.proto\032+google/ads/" +
      "googleads/v8/common/policy.proto\032.google" +
      "/ads/googleads/v8/enums/asset_type.proto" +
      "\032:google/ads/googleads/v8/enums/policy_a" +
      "pproval_status.proto\0328google/ads/googlea" +
      "ds/v8/enums/policy_review_status.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032\034google/api/annotatio" +
      "ns.proto\"\373\n\n\005Asset\022=\n\rresource_name\030\001 \001(" +
      "\tB&\340A\005\372A \n\036googleads.googleapis.com/Asse" +
      "t\022\024\n\002id\030\013 \001(\003B\003\340A\003H\001\210\001\001\022\021\n\004name\030\014 \001(\tH\002\210" +
      "\001\001\022I\n\004type\030\004 \001(\01626.google.ads.googleads." +
      "v8.enums.AssetTypeEnum.AssetTypeB\003\340A\003\022\022\n" +
      "\nfinal_urls\030\016 \003(\t\022\031\n\021final_mobile_urls\030\020" +
      " \003(\t\022\"\n\025tracking_url_template\030\021 \001(\tH\003\210\001\001" +
      "\022N\n\025url_custom_parameters\030\022 \003(\0132/.google" +
      ".ads.googleads.v8.common.CustomParameter" +
      "\022\035\n\020final_url_suffix\030\023 \001(\tH\004\210\001\001\022R\n\016polic" +
      "y_summary\030\r \001(\01325.google.ads.googleads.v" +
      "8.resources.AssetPolicySummaryB\003\340A\003\022U\n\023y" +
      "outube_video_asset\030\005 \001(\01321.google.ads.go" +
      "ogleads.v8.common.YoutubeVideoAssetB\003\340A\005" +
      "H\000\022S\n\022media_bundle_asset\030\006 \001(\01320.google." +
      "ads.googleads.v8.common.MediaBundleAsset" +
      "B\003\340A\005H\000\022F\n\013image_asset\030\007 \001(\0132*.google.ad" +
      "s.googleads.v8.common.ImageAssetB\003\340A\003H\000\022" +
      "D\n\ntext_asset\030\010 \001(\0132).google.ads.googlea" +
      "ds.v8.common.TextAssetB\003\340A\003H\000\022H\n\017lead_fo" +
      "rm_asset\030\t \001(\0132-.google.ads.googleads.v8" +
      ".common.LeadFormAssetH\000\022Q\n\024book_on_googl" +
      "e_asset\030\n \001(\01321.google.ads.googleads.v8." +
      "common.BookOnGoogleAssetH\000\022I\n\017promotion_" +
      "asset\030\017 \001(\0132..google.ads.googleads.v8.co" +
      "mmon.PromotionAssetH\000\022E\n\rcallout_asset\030\024" +
      " \001(\0132,.google.ads.googleads.v8.common.Ca" +
      "lloutAssetH\000\022Z\n\030structured_snippet_asset" +
      "\030\025 \001(\01326.google.ads.googleads.v8.common." +
      "StructuredSnippetAssetH\000\022G\n\016sitelink_ass" +
      "et\030\026 \001(\0132-.google.ads.googleads.v8.commo" +
      "n.SitelinkAssetH\000:N\352AK\n\036googleads.google" +
      "apis.com/Asset\022)customers/{customer_id}/" +
      "assets/{asset_id}B\014\n\nasset_dataB\005\n\003_idB\007" +
      "\n\005_nameB\030\n\026_tracking_url_templateB\023\n\021_fi" +
      "nal_url_suffix\"\273\002\n\022AssetPolicySummary\022S\n" +
      "\024policy_topic_entries\030\001 \003(\01320.google.ads" +
      ".googleads.v8.common.PolicyTopicEntryB\003\340" +
      "A\003\022d\n\rreview_status\030\002 \001(\0162H.google.ads.g" +
      "oogleads.v8.enums.PolicyReviewStatusEnum" +
      ".PolicyReviewStatusB\003\340A\003\022j\n\017approval_sta" +
      "tus\030\003 \001(\0162L.google.ads.googleads.v8.enum" +
      "s.PolicyApprovalStatusEnum.PolicyApprova" +
      "lStatusB\003\340A\003B\367\001\n%com.google.ads.googlead" +
      "s.v8.resourcesB\nAssetProtoP\001ZJgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v8/resources;resources\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V8.Resources\312\002!Google\\Ads\\" +
      "GoogleAds\\V8\\Resources\352\002%Google::Ads::Go" +
      "ogleAds::V8::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v8.common.AssetTypesProto.getDescriptor(),
          com.google.ads.googleads.v8.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v8.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.AssetTypeProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v8.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v8_resources_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v8_resources_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_Asset_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "PolicySummary", "YoutubeVideoAsset", "MediaBundleAsset", "ImageAsset", "TextAsset", "LeadFormAsset", "BookOnGoogleAsset", "PromotionAsset", "CalloutAsset", "StructuredSnippetAsset", "SitelinkAsset", "AssetData", "Id", "Name", "TrackingUrlTemplate", "FinalUrlSuffix", });
    internal_static_google_ads_googleads_v8_resources_AssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v8_resources_AssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v8_resources_AssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v8.common.AssetTypesProto.getDescriptor();
    com.google.ads.googleads.v8.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v8.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v8.enums.AssetTypeProto.getDescriptor();
    com.google.ads.googleads.v8.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v8.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}