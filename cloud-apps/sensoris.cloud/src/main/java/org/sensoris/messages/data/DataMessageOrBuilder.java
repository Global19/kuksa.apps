// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/messages/data.proto

package org.sensoris.messages.data;

public interface DataMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.messages.data.DataMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.DataMessage.Envelope envelope = 1;</code>
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.DataMessage.Envelope envelope = 1;</code>
   */
  org.sensoris.messages.data.DataMessage.Envelope getEnvelope();
  /**
   * <pre>
   * Envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.messages.data.DataMessage.Envelope envelope = 1;</code>
   */
  org.sensoris.messages.data.DataMessage.EnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Event group.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.EventGroup event_group = 2;</code>
   */
  java.util.List<org.sensoris.messages.data.EventGroup> 
      getEventGroupList();
  /**
   * <pre>
   * Event group.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.EventGroup event_group = 2;</code>
   */
  org.sensoris.messages.data.EventGroup getEventGroup(int index);
  /**
   * <pre>
   * Event group.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.EventGroup event_group = 2;</code>
   */
  int getEventGroupCount();
  /**
   * <pre>
   * Event group.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.EventGroup event_group = 2;</code>
   */
  java.util.List<? extends org.sensoris.messages.data.EventGroupOrBuilder> 
      getEventGroupOrBuilderList();
  /**
   * <pre>
   * Event group.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.EventGroup event_group = 2;</code>
   */
  org.sensoris.messages.data.EventGroupOrBuilder getEventGroupOrBuilder(
      int index);

  /**
   * <pre>
   * Event relation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventRelation event_relation = 3;</code>
   */
  java.util.List<org.sensoris.messages.data.DataMessage.EventRelation> 
      getEventRelationList();
  /**
   * <pre>
   * Event relation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventRelation event_relation = 3;</code>
   */
  org.sensoris.messages.data.DataMessage.EventRelation getEventRelation(int index);
  /**
   * <pre>
   * Event relation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventRelation event_relation = 3;</code>
   */
  int getEventRelationCount();
  /**
   * <pre>
   * Event relation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventRelation event_relation = 3;</code>
   */
  java.util.List<? extends org.sensoris.messages.data.DataMessage.EventRelationOrBuilder> 
      getEventRelationOrBuilderList();
  /**
   * <pre>
   * Event relation.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventRelation event_relation = 3;</code>
   */
  org.sensoris.messages.data.DataMessage.EventRelationOrBuilder getEventRelationOrBuilder(
      int index);

  /**
   * <pre>
   * Event source.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventSource event_source = 4;</code>
   */
  java.util.List<org.sensoris.messages.data.DataMessage.EventSource> 
      getEventSourceList();
  /**
   * <pre>
   * Event source.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventSource event_source = 4;</code>
   */
  org.sensoris.messages.data.DataMessage.EventSource getEventSource(int index);
  /**
   * <pre>
   * Event source.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventSource event_source = 4;</code>
   */
  int getEventSourceCount();
  /**
   * <pre>
   * Event source.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventSource event_source = 4;</code>
   */
  java.util.List<? extends org.sensoris.messages.data.DataMessage.EventSourceOrBuilder> 
      getEventSourceOrBuilderList();
  /**
   * <pre>
   * Event source.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.messages.data.DataMessage.EventSource event_source = 4;</code>
   */
  org.sensoris.messages.data.DataMessage.EventSourceOrBuilder getEventSourceOrBuilder(
      int index);
}
