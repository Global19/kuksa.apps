// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/categories/localization.proto

package org.sensoris.categories.localization;

/**
 * <pre>
 * Vehicle rotation rate.
 * &#64;relation 1 sensoris.protobuf.categories.trafficmaneuver.Maneuver TRIGGERED_BY 1..* sensoris.protobuf.categories.localization.VehicleRotationRate
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.categories.localization.VehicleRotationRate}
 */
public  final class VehicleRotationRate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.categories.localization.VehicleRotationRate)
    VehicleRotationRateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VehicleRotationRate.newBuilder() to construct.
  private VehicleRotationRate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VehicleRotationRate() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VehicleRotationRate(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.sensoris.types.base.EventEnvelope.Builder subBuilder = null;
            if (envelope_ != null) {
              subBuilder = envelope_.toBuilder();
            }
            envelope_ = input.readMessage(org.sensoris.types.base.EventEnvelope.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(envelope_);
              envelope_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            org.sensoris.types.spatial.RotationRateAndAccuracy.Builder subBuilder = null;
            if (valueAndAccuracy_ != null) {
              subBuilder = valueAndAccuracy_.toBuilder();
            }
            valueAndAccuracy_ = input.readMessage(org.sensoris.types.spatial.RotationRateAndAccuracy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(valueAndAccuracy_);
              valueAndAccuracy_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.sensoris.categories.localization.SensorisLocalizationCategory.internal_static_sensoris_protobuf_categories_localization_VehicleRotationRate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.categories.localization.SensorisLocalizationCategory.internal_static_sensoris_protobuf_categories_localization_VehicleRotationRate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.categories.localization.VehicleRotationRate.class, org.sensoris.categories.localization.VehicleRotationRate.Builder.class);
  }

  public static final int ENVELOPE_FIELD_NUMBER = 1;
  private org.sensoris.types.base.EventEnvelope envelope_;
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  public boolean hasEnvelope() {
    return envelope_ != null;
  }
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  public org.sensoris.types.base.EventEnvelope getEnvelope() {
    return envelope_ == null ? org.sensoris.types.base.EventEnvelope.getDefaultInstance() : envelope_;
  }
  /**
   * <pre>
   * Event envelope.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
   */
  public org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder() {
    return getEnvelope();
  }

  public static final int VALUE_AND_ACCURACY_FIELD_NUMBER = 2;
  private org.sensoris.types.spatial.RotationRateAndAccuracy valueAndAccuracy_;
  /**
   * <pre>
   * Value and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
   */
  public boolean hasValueAndAccuracy() {
    return valueAndAccuracy_ != null;
  }
  /**
   * <pre>
   * Value and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
   */
  public org.sensoris.types.spatial.RotationRateAndAccuracy getValueAndAccuracy() {
    return valueAndAccuracy_ == null ? org.sensoris.types.spatial.RotationRateAndAccuracy.getDefaultInstance() : valueAndAccuracy_;
  }
  /**
   * <pre>
   * Value and accuracy.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
   */
  public org.sensoris.types.spatial.RotationRateAndAccuracyOrBuilder getValueAndAccuracyOrBuilder() {
    return getValueAndAccuracy();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (envelope_ != null) {
      output.writeMessage(1, getEnvelope());
    }
    if (valueAndAccuracy_ != null) {
      output.writeMessage(2, getValueAndAccuracy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (envelope_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnvelope());
    }
    if (valueAndAccuracy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValueAndAccuracy());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.sensoris.categories.localization.VehicleRotationRate)) {
      return super.equals(obj);
    }
    org.sensoris.categories.localization.VehicleRotationRate other = (org.sensoris.categories.localization.VehicleRotationRate) obj;

    boolean result = true;
    result = result && (hasEnvelope() == other.hasEnvelope());
    if (hasEnvelope()) {
      result = result && getEnvelope()
          .equals(other.getEnvelope());
    }
    result = result && (hasValueAndAccuracy() == other.hasValueAndAccuracy());
    if (hasValueAndAccuracy()) {
      result = result && getValueAndAccuracy()
          .equals(other.getValueAndAccuracy());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEnvelope()) {
      hash = (37 * hash) + ENVELOPE_FIELD_NUMBER;
      hash = (53 * hash) + getEnvelope().hashCode();
    }
    if (hasValueAndAccuracy()) {
      hash = (37 * hash) + VALUE_AND_ACCURACY_FIELD_NUMBER;
      hash = (53 * hash) + getValueAndAccuracy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.categories.localization.VehicleRotationRate parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.sensoris.categories.localization.VehicleRotationRate prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Vehicle rotation rate.
   * &#64;relation 1 sensoris.protobuf.categories.trafficmaneuver.Maneuver TRIGGERED_BY 1..* sensoris.protobuf.categories.localization.VehicleRotationRate
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.categories.localization.VehicleRotationRate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.categories.localization.VehicleRotationRate)
      org.sensoris.categories.localization.VehicleRotationRateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.categories.localization.SensorisLocalizationCategory.internal_static_sensoris_protobuf_categories_localization_VehicleRotationRate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.categories.localization.SensorisLocalizationCategory.internal_static_sensoris_protobuf_categories_localization_VehicleRotationRate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.categories.localization.VehicleRotationRate.class, org.sensoris.categories.localization.VehicleRotationRate.Builder.class);
    }

    // Construct using org.sensoris.categories.localization.VehicleRotationRate.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (envelopeBuilder_ == null) {
        envelope_ = null;
      } else {
        envelope_ = null;
        envelopeBuilder_ = null;
      }
      if (valueAndAccuracyBuilder_ == null) {
        valueAndAccuracy_ = null;
      } else {
        valueAndAccuracy_ = null;
        valueAndAccuracyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.categories.localization.SensorisLocalizationCategory.internal_static_sensoris_protobuf_categories_localization_VehicleRotationRate_descriptor;
    }

    @java.lang.Override
    public org.sensoris.categories.localization.VehicleRotationRate getDefaultInstanceForType() {
      return org.sensoris.categories.localization.VehicleRotationRate.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.categories.localization.VehicleRotationRate build() {
      org.sensoris.categories.localization.VehicleRotationRate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.categories.localization.VehicleRotationRate buildPartial() {
      org.sensoris.categories.localization.VehicleRotationRate result = new org.sensoris.categories.localization.VehicleRotationRate(this);
      if (envelopeBuilder_ == null) {
        result.envelope_ = envelope_;
      } else {
        result.envelope_ = envelopeBuilder_.build();
      }
      if (valueAndAccuracyBuilder_ == null) {
        result.valueAndAccuracy_ = valueAndAccuracy_;
      } else {
        result.valueAndAccuracy_ = valueAndAccuracyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.sensoris.categories.localization.VehicleRotationRate) {
        return mergeFrom((org.sensoris.categories.localization.VehicleRotationRate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.categories.localization.VehicleRotationRate other) {
      if (other == org.sensoris.categories.localization.VehicleRotationRate.getDefaultInstance()) return this;
      if (other.hasEnvelope()) {
        mergeEnvelope(other.getEnvelope());
      }
      if (other.hasValueAndAccuracy()) {
        mergeValueAndAccuracy(other.getValueAndAccuracy());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.sensoris.categories.localization.VehicleRotationRate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.categories.localization.VehicleRotationRate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.sensoris.types.base.EventEnvelope envelope_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.EventEnvelope, org.sensoris.types.base.EventEnvelope.Builder, org.sensoris.types.base.EventEnvelopeOrBuilder> envelopeBuilder_;
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    public boolean hasEnvelope() {
      return envelopeBuilder_ != null || envelope_ != null;
    }
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.EventEnvelope getEnvelope() {
      if (envelopeBuilder_ == null) {
        return envelope_ == null ? org.sensoris.types.base.EventEnvelope.getDefaultInstance() : envelope_;
      } else {
        return envelopeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(org.sensoris.types.base.EventEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        envelope_ = value;
        onChanged();
      } else {
        envelopeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    public Builder setEnvelope(
        org.sensoris.types.base.EventEnvelope.Builder builderForValue) {
      if (envelopeBuilder_ == null) {
        envelope_ = builderForValue.build();
        onChanged();
      } else {
        envelopeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    public Builder mergeEnvelope(org.sensoris.types.base.EventEnvelope value) {
      if (envelopeBuilder_ == null) {
        if (envelope_ != null) {
          envelope_ =
            org.sensoris.types.base.EventEnvelope.newBuilder(envelope_).mergeFrom(value).buildPartial();
        } else {
          envelope_ = value;
        }
        onChanged();
      } else {
        envelopeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    public Builder clearEnvelope() {
      if (envelopeBuilder_ == null) {
        envelope_ = null;
        onChanged();
      } else {
        envelope_ = null;
        envelopeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.EventEnvelope.Builder getEnvelopeBuilder() {
      
      onChanged();
      return getEnvelopeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    public org.sensoris.types.base.EventEnvelopeOrBuilder getEnvelopeOrBuilder() {
      if (envelopeBuilder_ != null) {
        return envelopeBuilder_.getMessageOrBuilder();
      } else {
        return envelope_ == null ?
            org.sensoris.types.base.EventEnvelope.getDefaultInstance() : envelope_;
      }
    }
    /**
     * <pre>
     * Event envelope.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.EventEnvelope envelope = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.EventEnvelope, org.sensoris.types.base.EventEnvelope.Builder, org.sensoris.types.base.EventEnvelopeOrBuilder> 
        getEnvelopeFieldBuilder() {
      if (envelopeBuilder_ == null) {
        envelopeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.EventEnvelope, org.sensoris.types.base.EventEnvelope.Builder, org.sensoris.types.base.EventEnvelopeOrBuilder>(
                getEnvelope(),
                getParentForChildren(),
                isClean());
        envelope_ = null;
      }
      return envelopeBuilder_;
    }

    private org.sensoris.types.spatial.RotationRateAndAccuracy valueAndAccuracy_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.spatial.RotationRateAndAccuracy, org.sensoris.types.spatial.RotationRateAndAccuracy.Builder, org.sensoris.types.spatial.RotationRateAndAccuracyOrBuilder> valueAndAccuracyBuilder_;
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    public boolean hasValueAndAccuracy() {
      return valueAndAccuracyBuilder_ != null || valueAndAccuracy_ != null;
    }
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    public org.sensoris.types.spatial.RotationRateAndAccuracy getValueAndAccuracy() {
      if (valueAndAccuracyBuilder_ == null) {
        return valueAndAccuracy_ == null ? org.sensoris.types.spatial.RotationRateAndAccuracy.getDefaultInstance() : valueAndAccuracy_;
      } else {
        return valueAndAccuracyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    public Builder setValueAndAccuracy(org.sensoris.types.spatial.RotationRateAndAccuracy value) {
      if (valueAndAccuracyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueAndAccuracy_ = value;
        onChanged();
      } else {
        valueAndAccuracyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    public Builder setValueAndAccuracy(
        org.sensoris.types.spatial.RotationRateAndAccuracy.Builder builderForValue) {
      if (valueAndAccuracyBuilder_ == null) {
        valueAndAccuracy_ = builderForValue.build();
        onChanged();
      } else {
        valueAndAccuracyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    public Builder mergeValueAndAccuracy(org.sensoris.types.spatial.RotationRateAndAccuracy value) {
      if (valueAndAccuracyBuilder_ == null) {
        if (valueAndAccuracy_ != null) {
          valueAndAccuracy_ =
            org.sensoris.types.spatial.RotationRateAndAccuracy.newBuilder(valueAndAccuracy_).mergeFrom(value).buildPartial();
        } else {
          valueAndAccuracy_ = value;
        }
        onChanged();
      } else {
        valueAndAccuracyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    public Builder clearValueAndAccuracy() {
      if (valueAndAccuracyBuilder_ == null) {
        valueAndAccuracy_ = null;
        onChanged();
      } else {
        valueAndAccuracy_ = null;
        valueAndAccuracyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    public org.sensoris.types.spatial.RotationRateAndAccuracy.Builder getValueAndAccuracyBuilder() {
      
      onChanged();
      return getValueAndAccuracyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    public org.sensoris.types.spatial.RotationRateAndAccuracyOrBuilder getValueAndAccuracyOrBuilder() {
      if (valueAndAccuracyBuilder_ != null) {
        return valueAndAccuracyBuilder_.getMessageOrBuilder();
      } else {
        return valueAndAccuracy_ == null ?
            org.sensoris.types.spatial.RotationRateAndAccuracy.getDefaultInstance() : valueAndAccuracy_;
      }
    }
    /**
     * <pre>
     * Value and accuracy.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.spatial.RotationRateAndAccuracy value_and_accuracy = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.spatial.RotationRateAndAccuracy, org.sensoris.types.spatial.RotationRateAndAccuracy.Builder, org.sensoris.types.spatial.RotationRateAndAccuracyOrBuilder> 
        getValueAndAccuracyFieldBuilder() {
      if (valueAndAccuracyBuilder_ == null) {
        valueAndAccuracyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.spatial.RotationRateAndAccuracy, org.sensoris.types.spatial.RotationRateAndAccuracy.Builder, org.sensoris.types.spatial.RotationRateAndAccuracyOrBuilder>(
                getValueAndAccuracy(),
                getParentForChildren(),
                isClean());
        valueAndAccuracy_ = null;
      }
      return valueAndAccuracyBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.categories.localization.VehicleRotationRate)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.categories.localization.VehicleRotationRate)
  private static final org.sensoris.categories.localization.VehicleRotationRate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.categories.localization.VehicleRotationRate();
  }

  public static org.sensoris.categories.localization.VehicleRotationRate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VehicleRotationRate>
      PARSER = new com.google.protobuf.AbstractParser<VehicleRotationRate>() {
    @java.lang.Override
    public VehicleRotationRate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VehicleRotationRate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VehicleRotationRate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VehicleRotationRate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.categories.localization.VehicleRotationRate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

