// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v8/resources/custom_interest.proto

package com.google.ads.googleads.v8.resources;

public interface CustomInterestMemberOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v8.resources.CustomInterestMember)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of custom interest member, KEYWORD or URL.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
   * @return The enum numeric value on the wire for memberType.
   */
  int getMemberTypeValue();
  /**
   * <pre>
   * The type of custom interest member, KEYWORD or URL.
   * </pre>
   *
   * <code>.google.ads.googleads.v8.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
   * @return The memberType.
   */
  com.google.ads.googleads.v8.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType getMemberType();

  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>string parameter = 3;</code>
   * @return Whether the parameter field is set.
   */
  boolean hasParameter();
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>string parameter = 3;</code>
   * @return The parameter.
   */
  java.lang.String getParameter();
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>string parameter = 3;</code>
   * @return The bytes for parameter.
   */
  com.google.protobuf.ByteString
      getParameterBytes();
}