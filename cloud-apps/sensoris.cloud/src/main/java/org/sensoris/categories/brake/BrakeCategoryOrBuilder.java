// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/brake.proto

package org.sensoris.categories.brake;

public interface BrakeCategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.brake.BrakeCategory)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.CategoryEnvelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.CategoryEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.CategoryEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  java.util.List<org.sensoris.categories.brake.BrakeSystemsStatus> 
      getBrakeSystemsStatusList();
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  org.sensoris.categories.brake.BrakeSystemsStatus getBrakeSystemsStatus(int index);
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  int getBrakeSystemsStatusCount();
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  java.util.List<? extends org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder> 
      getBrakeSystemsStatusOrBuilderList();
  /**
   * <pre>
   * Status of brake systems.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.brake.BrakeSystemsStatus brake_systems_status = 2;</code>
   */
  org.sensoris.categories.brake.BrakeSystemsStatusOrBuilder getBrakeSystemsStatusOrBuilder(
      int index);
}
