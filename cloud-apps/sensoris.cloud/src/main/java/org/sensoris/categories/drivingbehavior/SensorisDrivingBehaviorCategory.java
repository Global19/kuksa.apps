// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/driving_behavior.proto

package org.sensoris.categories.drivingbehavior;

public final class SensorisDrivingBehaviorCategory {
  private SensorisDrivingBehaviorCategory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_StatusAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_StatusAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_DirectionAndConfidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_DirectionAndConfidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3sensoris/protobuf/categories/driving_b" +
      "ehavior.proto\022,sensoris.protobuf.categor" +
      "ies.drivingbehavior\032\"sensoris/protobuf/t" +
      "ypes/base.proto\"\204\007\n\rParkingStatus\022=\n\010env" +
      "elope\030\001 \001(\0132+.sensoris.protobuf.types.ba" +
      "se.EventEnvelope\022n\n\025status_and_confidenc" +
      "e\030\002 \001(\0132O.sensoris.protobuf.categories.d" +
      "rivingbehavior.ParkingStatus.StatusAndCo" +
      "nfidence\022t\n\030direction_and_confidence\030\003 \001" +
      "(\0132R.sensoris.protobuf.categories.drivin" +
      "gbehavior.ParkingStatus.DirectionAndConf" +
      "idence\022X\n\025duration_and_accuracy\030\004 \001(\01323." +
      "sensoris.protobuf.types.base.Int64ValueA" +
      "ndAccuracyB\004\210\265\030\000\032\354\001\n\023StatusAndConfidence" +
      "\022b\n\004type\030\001 \001(\0162T.sensoris.protobuf.categ" +
      "ories.drivingbehavior.ParkingStatus.Stat" +
      "usAndConfidence.Type\022<\n\nconfidence\030\002 \001(\013" +
      "2(.sensoris.protobuf.types.base.Confiden" +
      "ce\"3\n\004Type\022\020\n\014UNKNOWN_TYPE\020\000\022\013\n\007PARK_IN\020" +
      "\001\022\014\n\010PARK_OUT\020\002\032\204\002\n\026DirectionAndConfiden" +
      "ce\022e\n\004type\030\001 \001(\0162W.sensoris.protobuf.cat" +
      "egories.drivingbehavior.ParkingStatus.Di" +
      "rectionAndConfidence.Type\022<\n\nconfidence\030" +
      "\002 \001(\0132(.sensoris.protobuf.types.base.Con" +
      "fidence\"E\n\004Type\022\020\n\014UNKNOWN_TYPE\020\000\022\020\n\014LON" +
      "GITUDINAL\020\001\022\013\n\007LATERAL\020\002\022\014\n\010DIAGONAL\020\003\"\260" +
      "\001\n\027DrivingBehaviorCategory\022@\n\010envelope\030\001" +
      " \001(\0132..sensoris.protobuf.types.base.Cate" +
      "goryEnvelope\022S\n\016parking_status\030\002 \003(\0132;.s" +
      "ensoris.protobuf.categories.drivingbehav" +
      "ior.ParkingStatusBO\n\'org.sensoris.catego" +
      "ries.drivingbehaviorB\037SensorisDrivingBeh" +
      "aviorCategoryP\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.sensoris.types.base.SensorisBaseTypes.getDescriptor(),
        }, assigner);
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_descriptor,
        new java.lang.String[] { "Envelope", "StatusAndConfidence", "DirectionAndConfidence", "DurationAndAccuracy", });
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_StatusAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_StatusAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_StatusAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_DirectionAndConfidence_descriptor =
      internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_descriptor.getNestedTypes().get(1);
    internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_DirectionAndConfidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_drivingbehavior_ParkingStatus_DirectionAndConfidence_descriptor,
        new java.lang.String[] { "Type", "Confidence", });
    internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_categories_drivingbehavior_DrivingBehaviorCategory_descriptor,
        new java.lang.String[] { "Envelope", "ParkingStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.sensoris.types.base.SensorisBaseTypes.exponent);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.sensoris.types.base.SensorisBaseTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
