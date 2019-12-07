// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

public interface EventEnvelopeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.EventEnvelope)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier, shall be unique for all events in a data message.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Identifier, shall be unique for all events in a data message.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Identifier, shall be unique for all events in a data message.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [1, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Timestamp.
   * This is the timestamp of when the event has been detected. In case of a longer identification cycle, the actual timestamp of detection needs to be back-calculated.
   * &#64;example At time t = 10, a traffic sign is observed with the camera sensor. At time t = 15, the processing unit calculates the existence and position of the traffic sign, then the traffic sign event with t = 10 is to be created, so that the relative position fits to the localization of the vehicle at t = 10 in the sensoris.protobuf.categories.localization.VehiclePositionAndOrientation event.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp timestamp = 2;</code>
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * Timestamp.
   * This is the timestamp of when the event has been detected. In case of a longer identification cycle, the actual timestamp of detection needs to be back-calculated.
   * &#64;example At time t = 10, a traffic sign is observed with the camera sensor. At time t = 15, the processing unit calculates the existence and position of the traffic sign, then the traffic sign event with t = 10 is to be created, so that the relative position fits to the localization of the vehicle at t = 10 in the sensoris.protobuf.categories.localization.VehiclePositionAndOrientation event.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp timestamp = 2;</code>
   */
  org.sensoris.types.base.Timestamp getTimestamp();
  /**
   * <pre>
   * Timestamp.
   * This is the timestamp of when the event has been detected. In case of a longer identification cycle, the actual timestamp of detection needs to be back-calculated.
   * &#64;example At time t = 10, a traffic sign is observed with the camera sensor. At time t = 15, the processing unit calculates the existence and position of the traffic sign, then the traffic sign event with t = 10 is to be created, so that the relative position fits to the localization of the vehicle at t = 10 in the sensoris.protobuf.categories.localization.VehiclePositionAndOrientation event.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp timestamp = 2;</code>
   */
  org.sensoris.types.base.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * Proprietary extension.
   * An event proprietary extension provides additional information for the specific event, e.g. provides metadata for the set event fields or adds additional information that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getExtensionList();
  /**
   * <pre>
   * Proprietary extension.
   * An event proprietary extension provides additional information for the specific event, e.g. provides metadata for the set event fields or adds additional information that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.Any getExtension(int index);
  /**
   * <pre>
   * Proprietary extension.
   * An event proprietary extension provides additional information for the specific event, e.g. provides metadata for the set event fields or adds additional information that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Proprietary extension.
   * An event proprietary extension provides additional information for the specific event, e.g. provides metadata for the set event fields or adds additional information that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Proprietary extension.
   * An event proprietary extension provides additional information for the specific event, e.g. provides metadata for the set event fields or adds additional information that is not part of the SENSORIS specification.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
      int index);
}
