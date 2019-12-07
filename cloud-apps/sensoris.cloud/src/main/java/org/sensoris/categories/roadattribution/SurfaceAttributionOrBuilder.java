// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/road_attribution.proto

package org.sensoris.categories.roadattribution;

public interface SurfaceAttributionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensoris.protobuf.categories.roadattribution.SurfaceAttribution)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  boolean hasEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelope getEnvelope();
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder();

  /**
   * <pre>
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 2;</code>
   */
  boolean hasPositionAndAccuracy();
  /**
   * <pre>
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 2;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracy getPositionAndAccuracy();
  /**
   * <pre>
   * Position and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.PositionAndAccuracy position_and_accuracy = 2;</code>
   */
  org.sensoris.types.spatial.PositionAndAccuracyOrBuilder getPositionAndAccuracyOrBuilder();

  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   */
  boolean hasInclinationAndCurvature();
  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   */
  org.sensoris.categories.roadattribution.InclinationAndCurvature getInclinationAndCurvature();
  /**
   * <pre>
   * Inclination and curvature.
   * </pre>
   *
   * <code>.sensoris.protobuf.categories.roadattribution.InclinationAndCurvature inclination_and_curvature = 3;</code>
   */
  org.sensoris.categories.roadattribution.InclinationAndCurvatureOrBuilder getInclinationAndCurvatureOrBuilder();

  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  java.util.List<org.sensoris.categories.roadattribution.SurfaceMaterialAndConfidence> 
      getMaterialAndConfidenceList();
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceMaterialAndConfidence getMaterialAndConfidence(int index);
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  int getMaterialAndConfidenceCount();
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  java.util.List<? extends org.sensoris.categories.roadattribution.SurfaceMaterialAndConfidenceOrBuilder> 
      getMaterialAndConfidenceOrBuilderList();
  /**
   * <pre>
   * Material and confidence.
   * </pre>
   *
   * <code>repeated .sensoris.protobuf.categories.roadattribution.SurfaceMaterialAndConfidence material_and_confidence = 4;</code>
   */
  org.sensoris.categories.roadattribution.SurfaceMaterialAndConfidenceOrBuilder getMaterialAndConfidenceOrBuilder(
      int index);

  /**
   * <pre>
   * International Roughness Index (IRI).
   * &#64;unit MilliMeter per KiloMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy road_roughness_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  boolean hasRoadRoughnessAndAccuracy();
  /**
   * <pre>
   * International Roughness Index (IRI).
   * &#64;unit MilliMeter per KiloMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy road_roughness_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracy getRoadRoughnessAndAccuracy();
  /**
   * <pre>
   * International Roughness Index (IRI).
   * &#64;unit MilliMeter per KiloMeter
   * &#64;resolution 1
   * &#64;range [0, )
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.Int64ValueAndAccuracy road_roughness_and_accuracy = 5 [(.sensoris.protobuf.types.base.exponent) = 0];</code>
   */
  org.sensoris.types.base.Int64ValueAndAccuracyOrBuilder getRoadRoughnessAndAccuracyOrBuilder();
}