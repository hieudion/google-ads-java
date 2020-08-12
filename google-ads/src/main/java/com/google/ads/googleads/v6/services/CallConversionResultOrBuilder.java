// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/conversion_upload_service.proto

package com.google.ads.googleads.v6.services;

public interface CallConversionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.CallConversionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign.
   * </pre>
   *
   * <code>string caller_id = 5;</code>
   * @return Whether the callerId field is set.
   */
  boolean hasCallerId();
  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign.
   * </pre>
   *
   * <code>string caller_id = 5;</code>
   * @return The callerId.
   */
  java.lang.String getCallerId();
  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign.
   * </pre>
   *
   * <code>string caller_id = 5;</code>
   * @return The bytes for callerId.
   */
  com.google.protobuf.ByteString
      getCallerIdBytes();

  /**
   * <pre>
   * The date time at which the call occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string call_start_date_time = 6;</code>
   * @return Whether the callStartDateTime field is set.
   */
  boolean hasCallStartDateTime();
  /**
   * <pre>
   * The date time at which the call occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string call_start_date_time = 6;</code>
   * @return The callStartDateTime.
   */
  java.lang.String getCallStartDateTime();
  /**
   * <pre>
   * The date time at which the call occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string call_start_date_time = 6;</code>
   * @return The bytes for callStartDateTime.
   */
  com.google.protobuf.ByteString
      getCallStartDateTimeBytes();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>string conversion_action = 7;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>string conversion_action = 7;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>string conversion_action = 7;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string conversion_date_time = 8;</code>
   * @return Whether the conversionDateTime field is set.
   */
  boolean hasConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string conversion_date_time = 8;</code>
   * @return The conversionDateTime.
   */
  java.lang.String getConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string conversion_date_time = 8;</code>
   * @return The bytes for conversionDateTime.
   */
  com.google.protobuf.ByteString
      getConversionDateTimeBytes();
}