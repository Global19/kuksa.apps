// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

public interface TimestampIntervalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.base.TimestampInterval)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Start of interval inclusive.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp start_inclusive = 1;</code>
   */
  boolean hasStartInclusive();
  /**
   * <pre>
   * Start of interval inclusive.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp start_inclusive = 1;</code>
   */
  org.sensoris.types.base.Timestamp getStartInclusive();
  /**
   * <pre>
   * Start of interval inclusive.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp start_inclusive = 1;</code>
   */
  org.sensoris.types.base.TimestampOrBuilder getStartInclusiveOrBuilder();

  /**
   * <pre>
   * End of interval exclusive.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp end_exclusive = 2;</code>
   */
  boolean hasEndExclusive();
  /**
   * <pre>
   * End of interval exclusive.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp end_exclusive = 2;</code>
   */
  org.sensoris.types.base.Timestamp getEndExclusive();
  /**
   * <pre>
   * End of interval exclusive.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Timestamp end_exclusive = 2;</code>
   */
  org.sensoris.types.base.TimestampOrBuilder getEndExclusiveOrBuilder();
}
