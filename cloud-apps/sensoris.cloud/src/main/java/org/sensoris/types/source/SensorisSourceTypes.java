// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/source.proto

package org.sensoris.types.source;

public final class SensorisSourceTypes {
  private SensorisSourceTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_source_NavigationSatelliteSystem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_source_NavigationSatelliteSystem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_source_Sensor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_source_Sensor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_source_Sensor_MountingPositionAndOrientation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_source_Sensor_MountingPositionAndOrientation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_source_SensorFusion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_source_SensorFusion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensoris_protobuf_types_source_Source_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensoris_protobuf_types_source_Source_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$sensoris/protobuf/types/source.proto\022\036" +
      "sensoris.protobuf.types.source\032\031google/p" +
      "rotobuf/any.proto\032\036google/protobuf/wrapp" +
      "ers.proto\032\"sensoris/protobuf/types/base." +
      "proto\032%sensoris/protobuf/types/spatial.p" +
      "roto\"\332\010\n\031NavigationSatelliteSystem\022c\n\020sa" +
      "tellite_system\030\001 \003(\0162I.sensoris.protobuf" +
      ".types.source.NavigationSatelliteSystem." +
      "SatelliteSystem\022\207\001\n#satellite_based_augm" +
      "entation_system\030\002 \003(\0162Z.sensoris.protobu" +
      "f.types.source.NavigationSatelliteSystem" +
      ".SatelliteBasedAugmentationSystem\022\201\001\n gr" +
      "ound_based_augmentation_system\030\003 \003(\0162W.s" +
      "ensoris.protobuf.types.source.Navigation" +
      "SatelliteSystem.GroundBasedAugmentationS" +
      "ystem\0229\n\016elevation_mask\030\004 \001(\0132\033.google.p" +
      "rotobuf.Int64ValueB\004\210\265\030\000\022Z\n\033antenna_offs" +
      "et_and_accuracy\030\005 \001(\01325.sensoris.protobu" +
      "f.types.spatial.XyzVectorAndAccuracy\022\'\n\t" +
      "extension\030\017 \003(\0132\024.google.protobuf.Any\"\203\001" +
      "\n\017SatelliteSystem\022\034\n\030UNKNOWN_SATELLITE_S" +
      "YSTEM\020\000\022\007\n\003GPS\020\001\022\013\n\007GLONASS\020\002\022\013\n\007GALILEO" +
      "\020\003\022\014\n\010BEIDOU_1\020\004\022\014\n\010BEIDOU_2\020\005\022\t\n\005NAVIC\020" +
      "\006\022\010\n\004QZSS\020\007\"\342\001\n SatelliteBasedAugmentati" +
      "onSystem\022\033\n\027UNKNOWN_SATELLITE_BASED\020\000\022\023\n" +
      "\017SATELLITE_BASED\020\001\022\010\n\004WAAS\020\002\022\t\n\005EGNOS\020\003\022" +
      "\010\n\004MSAS\020\004\022\030\n\024QZSS_SATELLITE_BASED\020\005\022\t\n\005G" +
      "AGAN\020\006\022\010\n\004SDCM\020\007\022\010\n\004SNAS\020\010\022\010\n\004WAGE\020\t\022\r\n\t" +
      "STAR_FIRE\020\n\022\014\n\010STAR_FIX\020\013\022\r\n\tOMNI_STAR\020\014" +
      "\"\236\001\n\035GroundBasedAugmentationSystem\022\030\n\024UN" +
      "KNOWN_GROUND_BASED\020\000\022\020\n\014GROUND_BASED\020\001\022\010" +
      "\n\004GBAS\020\002\022\t\n\005NDGPS\020\003\022\t\n\005SAPOS\020\004\022\007\n\003ALF\020\005\022" +
      "\014\n\010AXIO_NET\020\006\022\013\n\007VRS_NOW\020\007\022\r\n\tSMART_NET\020" +
      "\010\"\273\003\n\006Sensor\022p\n!mounting_position_and_or" +
      "ientation\030\001 \001(\0132E.sensoris.protobuf.type" +
      "s.source.Sensor.MountingPositionAndOrien" +
      "tation\022`\n\033navigation_satellite_system\030\002 " +
      "\001(\01329.sensoris.protobuf.types.source.Nav" +
      "igationSatelliteSystemH\000\032\320\001\n\036MountingPos" +
      "itionAndOrientation\022V\n\030translation_and_a" +
      "ccuracy\030\001 \001(\01324.sensoris.protobuf.types." +
      "spatial.PositionAndAccuracy\022V\n\030orientati" +
      "on_and_accuracy\030\002 \001(\01324.sensoris.protobu" +
      "f.types.spatial.RotationAndAccuracyB\n\n\010s" +
      "pecific\">\n\014SensorFusion\022.\n\tsensor_id\030\001 \003" +
      "(\0132\033.google.protobuf.Int64Value\"\347\002\n\006Sour" +
      "ce\022\'\n\002id\030\001 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\0224\n\006entity\030\002 \001(\0132$.sensoris.protobuf." +
      "types.base.Entity\022J\n\022sampling_frequency\030" +
      "\003 \001(\0132(.sensoris.protobuf.types.base.Int" +
      "64ValueB\004\210\265\030\003\0228\n\006sensor\030\004 \001(\0132&.sensoris" +
      ".protobuf.types.source.SensorH\000\022E\n\rsenso" +
      "r_fusion\030\005 \001(\0132,.sensoris.protobuf.types" +
      ".source.SensorFusionH\000\022\'\n\textension\030\017 \003(" +
      "\0132\024.google.protobuf.AnyB\010\n\006sourceB5\n\031org" +
      ".sensoris.types.sourceB\023SensorisSourceTy" +
      "pesP\001\370\001\001b\006proto3"
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
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          org.sensoris.types.base.SensorisBaseTypes.getDescriptor(),
          org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor(),
        }, assigner);
    internal_static_sensoris_protobuf_types_source_NavigationSatelliteSystem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensoris_protobuf_types_source_NavigationSatelliteSystem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_source_NavigationSatelliteSystem_descriptor,
        new java.lang.String[] { "SatelliteSystem", "SatelliteBasedAugmentationSystem", "GroundBasedAugmentationSystem", "ElevationMask", "AntennaOffsetAndAccuracy", "Extension", });
    internal_static_sensoris_protobuf_types_source_Sensor_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensoris_protobuf_types_source_Sensor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_source_Sensor_descriptor,
        new java.lang.String[] { "MountingPositionAndOrientation", "NavigationSatelliteSystem", "Specific", });
    internal_static_sensoris_protobuf_types_source_Sensor_MountingPositionAndOrientation_descriptor =
      internal_static_sensoris_protobuf_types_source_Sensor_descriptor.getNestedTypes().get(0);
    internal_static_sensoris_protobuf_types_source_Sensor_MountingPositionAndOrientation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_source_Sensor_MountingPositionAndOrientation_descriptor,
        new java.lang.String[] { "TranslationAndAccuracy", "OrientationAndAccuracy", });
    internal_static_sensoris_protobuf_types_source_SensorFusion_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sensoris_protobuf_types_source_SensorFusion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_source_SensorFusion_descriptor,
        new java.lang.String[] { "SensorId", });
    internal_static_sensoris_protobuf_types_source_Source_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sensoris_protobuf_types_source_Source_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensoris_protobuf_types_source_Source_descriptor,
        new java.lang.String[] { "Id", "Entity", "SamplingFrequency", "Sensor", "SensorFusion", "Extension", "Source", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.sensoris.types.base.SensorisBaseTypes.exponent);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    org.sensoris.types.base.SensorisBaseTypes.getDescriptor();
    org.sensoris.types.spatial.SensorisSpatialTypes.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
