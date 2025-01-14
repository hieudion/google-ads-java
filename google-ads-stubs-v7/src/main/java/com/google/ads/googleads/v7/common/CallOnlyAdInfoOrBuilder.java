// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/ad_type_infos.proto

package com.google.ads.googleads.v7.common;

public interface CallOnlyAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.CallOnlyAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The country code in the ad.
   * </pre>
   *
   * <code>optional string country_code = 13;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * The country code in the ad.
   * </pre>
   *
   * <code>optional string country_code = 13;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * The country code in the ad.
   * </pre>
   *
   * <code>optional string country_code = 13;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * The phone number in the ad.
   * </pre>
   *
   * <code>optional string phone_number = 14;</code>
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   * <pre>
   * The phone number in the ad.
   * </pre>
   *
   * <code>optional string phone_number = 14;</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <pre>
   * The phone number in the ad.
   * </pre>
   *
   * <code>optional string phone_number = 14;</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * The business name in the ad.
   * </pre>
   *
   * <code>optional string business_name = 15;</code>
   * @return Whether the businessName field is set.
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * The business name in the ad.
   * </pre>
   *
   * <code>optional string business_name = 15;</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * The business name in the ad.
   * </pre>
   *
   * <code>optional string business_name = 15;</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * First headline in the ad.
   * </pre>
   *
   * <code>optional string headline1 = 16;</code>
   * @return Whether the headline1 field is set.
   */
  boolean hasHeadline1();
  /**
   * <pre>
   * First headline in the ad.
   * </pre>
   *
   * <code>optional string headline1 = 16;</code>
   * @return The headline1.
   */
  java.lang.String getHeadline1();
  /**
   * <pre>
   * First headline in the ad.
   * </pre>
   *
   * <code>optional string headline1 = 16;</code>
   * @return The bytes for headline1.
   */
  com.google.protobuf.ByteString
      getHeadline1Bytes();

  /**
   * <pre>
   * Second headline in the ad.
   * </pre>
   *
   * <code>optional string headline2 = 17;</code>
   * @return Whether the headline2 field is set.
   */
  boolean hasHeadline2();
  /**
   * <pre>
   * Second headline in the ad.
   * </pre>
   *
   * <code>optional string headline2 = 17;</code>
   * @return The headline2.
   */
  java.lang.String getHeadline2();
  /**
   * <pre>
   * Second headline in the ad.
   * </pre>
   *
   * <code>optional string headline2 = 17;</code>
   * @return The bytes for headline2.
   */
  com.google.protobuf.ByteString
      getHeadline2Bytes();

  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>optional string description1 = 18;</code>
   * @return Whether the description1 field is set.
   */
  boolean hasDescription1();
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>optional string description1 = 18;</code>
   * @return The description1.
   */
  java.lang.String getDescription1();
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>optional string description1 = 18;</code>
   * @return The bytes for description1.
   */
  com.google.protobuf.ByteString
      getDescription1Bytes();

  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>optional string description2 = 19;</code>
   * @return Whether the description2 field is set.
   */
  boolean hasDescription2();
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>optional string description2 = 19;</code>
   * @return The description2.
   */
  java.lang.String getDescription2();
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>optional string description2 = 19;</code>
   * @return The bytes for description2.
   */
  com.google.protobuf.ByteString
      getDescription2Bytes();

  /**
   * <pre>
   * Whether to enable call tracking for the creative. Enabling call
   * tracking also enables call conversions.
   * </pre>
   *
   * <code>optional bool call_tracked = 20;</code>
   * @return Whether the callTracked field is set.
   */
  boolean hasCallTracked();
  /**
   * <pre>
   * Whether to enable call tracking for the creative. Enabling call
   * tracking also enables call conversions.
   * </pre>
   *
   * <code>optional bool call_tracked = 20;</code>
   * @return The callTracked.
   */
  boolean getCallTracked();

  /**
   * <pre>
   * Whether to disable call conversion for the creative.
   * If set to `true`, disables call conversions even when `call_tracked` is
   * `true`.
   * If `call_tracked` is `false`, this field is ignored.
   * </pre>
   *
   * <code>optional bool disable_call_conversion = 21;</code>
   * @return Whether the disableCallConversion field is set.
   */
  boolean hasDisableCallConversion();
  /**
   * <pre>
   * Whether to disable call conversion for the creative.
   * If set to `true`, disables call conversions even when `call_tracked` is
   * `true`.
   * If `call_tracked` is `false`, this field is ignored.
   * </pre>
   *
   * <code>optional bool disable_call_conversion = 21;</code>
   * @return The disableCallConversion.
   */
  boolean getDisableCallConversion();

  /**
   * <pre>
   * The URL to be used for phone number verification.
   * </pre>
   *
   * <code>optional string phone_number_verification_url = 22;</code>
   * @return Whether the phoneNumberVerificationUrl field is set.
   */
  boolean hasPhoneNumberVerificationUrl();
  /**
   * <pre>
   * The URL to be used for phone number verification.
   * </pre>
   *
   * <code>optional string phone_number_verification_url = 22;</code>
   * @return The phoneNumberVerificationUrl.
   */
  java.lang.String getPhoneNumberVerificationUrl();
  /**
   * <pre>
   * The URL to be used for phone number verification.
   * </pre>
   *
   * <code>optional string phone_number_verification_url = 22;</code>
   * @return The bytes for phoneNumberVerificationUrl.
   */
  com.google.protobuf.ByteString
      getPhoneNumberVerificationUrlBytes();

  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * `call_tracked` is set to `true`. Otherwise this field is ignored.
   * </pre>
   *
   * <code>optional string conversion_action = 23;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * `call_tracked` is set to `true`. Otherwise this field is ignored.
   * </pre>
   *
   * <code>optional string conversion_action = 23;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * `call_tracked` is set to `true`. Otherwise this field is ignored.
   * </pre>
   *
   * <code>optional string conversion_action = 23;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The call conversion behavior of this call only ad. It can use its own call
   * conversion setting, inherit the account level setting, or be disabled.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.CallConversionReportingStateEnum.CallConversionReportingState conversion_reporting_state = 10;</code>
   * @return The enum numeric value on the wire for conversionReportingState.
   */
  int getConversionReportingStateValue();
  /**
   * <pre>
   * The call conversion behavior of this call only ad. It can use its own call
   * conversion setting, inherit the account level setting, or be disabled.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.CallConversionReportingStateEnum.CallConversionReportingState conversion_reporting_state = 10;</code>
   * @return The conversionReportingState.
   */
  com.google.ads.googleads.v7.enums.CallConversionReportingStateEnum.CallConversionReportingState getConversionReportingState();
}
