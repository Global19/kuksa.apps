// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sensoris/protobuf/types/base.proto

package org.sensoris.types.base;

/**
 * <pre>
 * Statistic measure of int64 value and accuracy.
 * </pre>
 *
 * Protobuf type {@code sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy}
 */
public  final class Int64StatisticMeasureAndAccuracy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
    Int64StatisticMeasureAndAccuracyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int64StatisticMeasureAndAccuracy.newBuilder() to construct.
  private Int64StatisticMeasureAndAccuracy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int64StatisticMeasureAndAccuracy() {
    type_ = 0;
    value_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Int64StatisticMeasureAndAccuracy(
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
            org.sensoris.types.base.TimestampInterval.Builder subBuilder = null;
            if (timestampInterval_ != null) {
              subBuilder = timestampInterval_.toBuilder();
            }
            timestampInterval_ = input.readMessage(org.sensoris.types.base.TimestampInterval.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timestampInterval_);
              timestampInterval_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 24: {

            value_ = input.readInt64();
            break;
          }
          case 34: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (accuracy_ != null) {
              subBuilder = accuracy_.toBuilder();
            }
            accuracy_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(accuracy_);
              accuracy_ = subBuilder.buildPartial();
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
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.class, org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.Builder.class);
  }

  public static final int TIMESTAMP_INTERVAL_FIELD_NUMBER = 1;
  private org.sensoris.types.base.TimestampInterval timestampInterval_;
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  public boolean hasTimestampInterval() {
    return timestampInterval_ != null;
  }
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  public org.sensoris.types.base.TimestampInterval getTimestampInterval() {
    return timestampInterval_ == null ? org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
  }
  /**
   * <pre>
   * Timestamp interval.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
   */
  public org.sensoris.types.base.TimestampIntervalOrBuilder getTimestampIntervalOrBuilder() {
    return getTimestampInterval();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type.
   * </pre>
   *
   * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
   */
  public org.sensoris.types.base.StatisticMeasureType getType() {
    @SuppressWarnings("deprecation")
    org.sensoris.types.base.StatisticMeasureType result = org.sensoris.types.base.StatisticMeasureType.valueOf(type_);
    return result == null ? org.sensoris.types.base.StatisticMeasureType.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private long value_;
  /**
   * <pre>
   * Value.
   * </pre>
   *
   * <code>int64 value = 3;</code>
   */
  public long getValue() {
    return value_;
  }

  public static final int ACCURACY_FIELD_NUMBER = 4;
  private com.google.protobuf.Int64Value accuracy_;
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   */
  public boolean hasAccuracy() {
    return accuracy_ != null;
  }
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   */
  public com.google.protobuf.Int64Value getAccuracy() {
    return accuracy_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : accuracy_;
  }
  /**
   * <pre>
   * Accuracy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value accuracy = 4;</code>
   */
  public com.google.protobuf.Int64ValueOrBuilder getAccuracyOrBuilder() {
    return getAccuracy();
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
    if (timestampInterval_ != null) {
      output.writeMessage(1, getTimestampInterval());
    }
    if (type_ != org.sensoris.types.base.StatisticMeasureType.UNKNOWN_STATISTIC_MEASURE_TYPE.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (value_ != 0L) {
      output.writeInt64(3, value_);
    }
    if (accuracy_ != null) {
      output.writeMessage(4, getAccuracy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestampInterval_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimestampInterval());
    }
    if (type_ != org.sensoris.types.base.StatisticMeasureType.UNKNOWN_STATISTIC_MEASURE_TYPE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, value_);
    }
    if (accuracy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAccuracy());
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
    if (!(obj instanceof org.sensoris.types.base.Int64StatisticMeasureAndAccuracy)) {
      return super.equals(obj);
    }
    org.sensoris.types.base.Int64StatisticMeasureAndAccuracy other = (org.sensoris.types.base.Int64StatisticMeasureAndAccuracy) obj;

    boolean result = true;
    result = result && (hasTimestampInterval() == other.hasTimestampInterval());
    if (hasTimestampInterval()) {
      result = result && getTimestampInterval()
          .equals(other.getTimestampInterval());
    }
    result = result && type_ == other.type_;
    result = result && (getValue()
        == other.getValue());
    result = result && (hasAccuracy() == other.hasAccuracy());
    if (hasAccuracy()) {
      result = result && getAccuracy()
          .equals(other.getAccuracy());
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
    if (hasTimestampInterval()) {
      hash = (37 * hash) + TIMESTAMP_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getTimestampInterval().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    if (hasAccuracy()) {
      hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
      hash = (53 * hash) + getAccuracy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parseFrom(
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
  public static Builder newBuilder(org.sensoris.types.base.Int64StatisticMeasureAndAccuracy prototype) {
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
   * Statistic measure of int64 value and accuracy.
   * </pre>
   *
   * Protobuf type {@code sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
      org.sensoris.types.base.Int64StatisticMeasureAndAccuracyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.class, org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.Builder.class);
    }

    // Construct using org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.newBuilder()
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
      if (timestampIntervalBuilder_ == null) {
        timestampInterval_ = null;
      } else {
        timestampInterval_ = null;
        timestampIntervalBuilder_ = null;
      }
      type_ = 0;

      value_ = 0L;

      if (accuracyBuilder_ == null) {
        accuracy_ = null;
      } else {
        accuracy_ = null;
        accuracyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.sensoris.types.base.SensorisBaseTypes.internal_static_sensoris_protobuf_types_base_Int64StatisticMeasureAndAccuracy_descriptor;
    }

    @java.lang.Override
    public org.sensoris.types.base.Int64StatisticMeasureAndAccuracy getDefaultInstanceForType() {
      return org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.getDefaultInstance();
    }

    @java.lang.Override
    public org.sensoris.types.base.Int64StatisticMeasureAndAccuracy build() {
      org.sensoris.types.base.Int64StatisticMeasureAndAccuracy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.sensoris.types.base.Int64StatisticMeasureAndAccuracy buildPartial() {
      org.sensoris.types.base.Int64StatisticMeasureAndAccuracy result = new org.sensoris.types.base.Int64StatisticMeasureAndAccuracy(this);
      if (timestampIntervalBuilder_ == null) {
        result.timestampInterval_ = timestampInterval_;
      } else {
        result.timestampInterval_ = timestampIntervalBuilder_.build();
      }
      result.type_ = type_;
      result.value_ = value_;
      if (accuracyBuilder_ == null) {
        result.accuracy_ = accuracy_;
      } else {
        result.accuracy_ = accuracyBuilder_.build();
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
      if (other instanceof org.sensoris.types.base.Int64StatisticMeasureAndAccuracy) {
        return mergeFrom((org.sensoris.types.base.Int64StatisticMeasureAndAccuracy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.sensoris.types.base.Int64StatisticMeasureAndAccuracy other) {
      if (other == org.sensoris.types.base.Int64StatisticMeasureAndAccuracy.getDefaultInstance()) return this;
      if (other.hasTimestampInterval()) {
        mergeTimestampInterval(other.getTimestampInterval());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      if (other.hasAccuracy()) {
        mergeAccuracy(other.getAccuracy());
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
      org.sensoris.types.base.Int64StatisticMeasureAndAccuracy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.sensoris.types.base.Int64StatisticMeasureAndAccuracy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.sensoris.types.base.TimestampInterval timestampInterval_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder> timestampIntervalBuilder_;
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public boolean hasTimestampInterval() {
      return timestampIntervalBuilder_ != null || timestampInterval_ != null;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public org.sensoris.types.base.TimestampInterval getTimestampInterval() {
      if (timestampIntervalBuilder_ == null) {
        return timestampInterval_ == null ? org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
      } else {
        return timestampIntervalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder setTimestampInterval(org.sensoris.types.base.TimestampInterval value) {
      if (timestampIntervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestampInterval_ = value;
        onChanged();
      } else {
        timestampIntervalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder setTimestampInterval(
        org.sensoris.types.base.TimestampInterval.Builder builderForValue) {
      if (timestampIntervalBuilder_ == null) {
        timestampInterval_ = builderForValue.build();
        onChanged();
      } else {
        timestampIntervalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder mergeTimestampInterval(org.sensoris.types.base.TimestampInterval value) {
      if (timestampIntervalBuilder_ == null) {
        if (timestampInterval_ != null) {
          timestampInterval_ =
            org.sensoris.types.base.TimestampInterval.newBuilder(timestampInterval_).mergeFrom(value).buildPartial();
        } else {
          timestampInterval_ = value;
        }
        onChanged();
      } else {
        timestampIntervalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public Builder clearTimestampInterval() {
      if (timestampIntervalBuilder_ == null) {
        timestampInterval_ = null;
        onChanged();
      } else {
        timestampInterval_ = null;
        timestampIntervalBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public org.sensoris.types.base.TimestampInterval.Builder getTimestampIntervalBuilder() {
      
      onChanged();
      return getTimestampIntervalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    public org.sensoris.types.base.TimestampIntervalOrBuilder getTimestampIntervalOrBuilder() {
      if (timestampIntervalBuilder_ != null) {
        return timestampIntervalBuilder_.getMessageOrBuilder();
      } else {
        return timestampInterval_ == null ?
            org.sensoris.types.base.TimestampInterval.getDefaultInstance() : timestampInterval_;
      }
    }
    /**
     * <pre>
     * Timestamp interval.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.TimestampInterval timestamp_interval = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder> 
        getTimestampIntervalFieldBuilder() {
      if (timestampIntervalBuilder_ == null) {
        timestampIntervalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.sensoris.types.base.TimestampInterval, org.sensoris.types.base.TimestampInterval.Builder, org.sensoris.types.base.TimestampIntervalOrBuilder>(
                getTimestampInterval(),
                getParentForChildren(),
                isClean());
        timestampInterval_ = null;
      }
      return timestampIntervalBuilder_;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public org.sensoris.types.base.StatisticMeasureType getType() {
      @SuppressWarnings("deprecation")
      org.sensoris.types.base.StatisticMeasureType result = org.sensoris.types.base.StatisticMeasureType.valueOf(type_);
      return result == null ? org.sensoris.types.base.StatisticMeasureType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public Builder setType(org.sensoris.types.base.StatisticMeasureType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type.
     * </pre>
     *
     * <code>.sensoris.protobuf.types.base.StatisticMeasureType type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     */
    public long getValue() {
      return value_;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value.
     * </pre>
     *
     * <code>int64 value = 3;</code>
     */
    public Builder clearValue() {
      
      value_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int64Value accuracy_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> accuracyBuilder_;
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public boolean hasAccuracy() {
      return accuracyBuilder_ != null || accuracy_ != null;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public com.google.protobuf.Int64Value getAccuracy() {
      if (accuracyBuilder_ == null) {
        return accuracy_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : accuracy_;
      } else {
        return accuracyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public Builder setAccuracy(com.google.protobuf.Int64Value value) {
      if (accuracyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accuracy_ = value;
        onChanged();
      } else {
        accuracyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public Builder setAccuracy(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (accuracyBuilder_ == null) {
        accuracy_ = builderForValue.build();
        onChanged();
      } else {
        accuracyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public Builder mergeAccuracy(com.google.protobuf.Int64Value value) {
      if (accuracyBuilder_ == null) {
        if (accuracy_ != null) {
          accuracy_ =
            com.google.protobuf.Int64Value.newBuilder(accuracy_).mergeFrom(value).buildPartial();
        } else {
          accuracy_ = value;
        }
        onChanged();
      } else {
        accuracyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public Builder clearAccuracy() {
      if (accuracyBuilder_ == null) {
        accuracy_ = null;
        onChanged();
      } else {
        accuracy_ = null;
        accuracyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public com.google.protobuf.Int64Value.Builder getAccuracyBuilder() {
      
      onChanged();
      return getAccuracyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getAccuracyOrBuilder() {
      if (accuracyBuilder_ != null) {
        return accuracyBuilder_.getMessageOrBuilder();
      } else {
        return accuracy_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : accuracy_;
      }
    }
    /**
     * <pre>
     * Accuracy.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value accuracy = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getAccuracyFieldBuilder() {
      if (accuracyBuilder_ == null) {
        accuracyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getAccuracy(),
                getParentForChildren(),
                isClean());
        accuracy_ = null;
      }
      return accuracyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
  }

  // @@protoc_insertion_point(class_scope:sensoris.protobuf.types.base.Int64StatisticMeasureAndAccuracy)
  private static final org.sensoris.types.base.Int64StatisticMeasureAndAccuracy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.sensoris.types.base.Int64StatisticMeasureAndAccuracy();
  }

  public static org.sensoris.types.base.Int64StatisticMeasureAndAccuracy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64StatisticMeasureAndAccuracy>
      PARSER = new com.google.protobuf.AbstractParser<Int64StatisticMeasureAndAccuracy>() {
    @java.lang.Override
    public Int64StatisticMeasureAndAccuracy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Int64StatisticMeasureAndAccuracy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Int64StatisticMeasureAndAccuracy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64StatisticMeasureAndAccuracy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.sensoris.types.base.Int64StatisticMeasureAndAccuracy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

