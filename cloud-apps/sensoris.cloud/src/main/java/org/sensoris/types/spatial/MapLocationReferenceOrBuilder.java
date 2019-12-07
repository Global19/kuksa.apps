// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/spatial.proto

package org.sensoris.types.spatial;

public interface MapLocationReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.types.spatial.MapLocationReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Absolute position of the map object.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 1;</code>
   */
  boolean hasPositionAndAccuracy();
  /**
   * <pre>
   * Absolute position of the map object.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 1;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracy getPositionAndAccuracy();
  /**
   * <pre>
   * Absolute position of the map object.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 1;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracyOrBuilder getPositionAndAccuracyOrBuilder();

  /**
   * <pre>
   * Map z-level at the absolute position of the map object.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value z_level = 2;</code>
   */
  boolean hasZLevel();
  /**
   * <pre>
   * Map z-level at the absolute position of the map object.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value z_level = 2;</code>
   */
  com.google.protobuf.Int64Value getZLevel();
  /**
   * <pre>
   * Map z-level at the absolute position of the map object.
   * &#64;unit 1
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.google.protobuf.Int64Value z_level = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getZLevelOrBuilder();

  /**
   * <pre>
   * Location reference of a map object defined by a tile id, link id and offset on link id.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference.TileIdLinkIdOffset tile_link_offset_reference = 3;</code>
   */
  boolean hasTileLinkOffsetReference();
  /**
   * <pre>
   * Location reference of a map object defined by a tile id, link id and offset on link id.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference.TileIdLinkIdOffset tile_link_offset_reference = 3;</code>
   */
  org.sensoris.types.spatial.MapLocationReference.TileIdLinkIdOffset getTileLinkOffsetReference();
  /**
   * <pre>
   * Location reference of a map object defined by a tile id, link id and offset on link id.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference.TileIdLinkIdOffset tile_link_offset_reference = 3;</code>
   */
  org.sensoris.types.spatial.MapLocationReference.TileIdLinkIdOffsetOrBuilder getTileLinkOffsetReferenceOrBuilder();

  /**
   * <pre>
   * Location reference of a map object defined by a tile id and object id.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference.TileIdObjectId map_object_id = 4;</code>
   */
  boolean hasMapObjectId();
  /**
   * <pre>
   * Location reference of a map object defined by a tile id and object id.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference.TileIdObjectId map_object_id = 4;</code>
   */
  org.sensoris.types.spatial.MapLocationReference.TileIdObjectId getMapObjectId();
  /**
   * <pre>
   * Location reference of a map object defined by a tile id and object id.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.MapLocationReference.TileIdObjectId map_object_id = 4;</code>
   */
  org.sensoris.types.spatial.MapLocationReference.TileIdObjectIdOrBuilder getMapObjectIdOrBuilder();

  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<com.google.protobuf.Any> 
      getExtensionList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.Any getExtension(int index);
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  int getExtensionCount();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  java.util.List<? extends com.google.protobuf.AnyOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <pre>
   * Proprietary extension.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extension = 15;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder(
      int index);

  public org.sensoris.types.spatial.MapLocationReference.MapBasedReferenceCase getMapBasedReferenceCase();
}