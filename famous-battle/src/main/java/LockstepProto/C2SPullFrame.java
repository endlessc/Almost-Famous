// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NetMessage.proto

package LockstepProto;

/**
 * Protobuf type {@code LockstepProto.C2SPullFrame}
 */
public  final class C2SPullFrame extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LockstepProto.C2SPullFrame)
        C2SPullFrameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use C2SPullFrame.newBuilder() to construct.
  private C2SPullFrame(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private C2SPullFrame() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private C2SPullFrame(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
          case 8: {

            frameIdBegin_ = input.readUInt32();
            break;
          }
          case 16: {

            frameIdEnd_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SPullFrame_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SPullFrame_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            C2SPullFrame.class, Builder.class);
  }

  public static final int FRAMEIDBEGIN_FIELD_NUMBER = 1;
  private int frameIdBegin_;
  /**
   * <code>uint32 frameIdBegin = 1;</code>
   */
  public int getFrameIdBegin() {
    return frameIdBegin_;
  }

  public static final int FRAMEIDEND_FIELD_NUMBER = 2;
  private int frameIdEnd_;
  /**
   * <code>uint32 frameIdEnd = 2;</code>
   */
  public int getFrameIdEnd() {
    return frameIdEnd_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (frameIdBegin_ != 0) {
      output.writeUInt32(1, frameIdBegin_);
    }
    if (frameIdEnd_ != 0) {
      output.writeUInt32(2, frameIdEnd_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (frameIdBegin_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, frameIdBegin_);
    }
    if (frameIdEnd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, frameIdEnd_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof C2SPullFrame)) {
      return super.equals(obj);
    }
    C2SPullFrame other = (C2SPullFrame) obj;

    if (getFrameIdBegin()
        != other.getFrameIdBegin()) return false;
    if (getFrameIdEnd()
        != other.getFrameIdEnd()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FRAMEIDBEGIN_FIELD_NUMBER;
    hash = (53 * hash) + getFrameIdBegin();
    hash = (37 * hash) + FRAMEIDEND_FIELD_NUMBER;
    hash = (53 * hash) + getFrameIdEnd();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static C2SPullFrame parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static C2SPullFrame parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static C2SPullFrame parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static C2SPullFrame parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static C2SPullFrame parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static C2SPullFrame parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static C2SPullFrame parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static C2SPullFrame parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static C2SPullFrame parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static C2SPullFrame parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static C2SPullFrame parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static C2SPullFrame parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(C2SPullFrame prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code LockstepProto.C2SPullFrame}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LockstepProto.C2SPullFrame)
      LockstepProto.C2SPullFrameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SPullFrame_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SPullFrame_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              C2SPullFrame.class, Builder.class);
    }

    // Construct using LockstepProto.C2SPullFrame.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      frameIdBegin_ = 0;

      frameIdEnd_ = 0;

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return LockstepProto.NetMessageOuterClass.internal_static_LockstepProto_C2SPullFrame_descriptor;
    }

    @Override
    public C2SPullFrame getDefaultInstanceForType() {
      return C2SPullFrame.getDefaultInstance();
    }

    @Override
    public C2SPullFrame build() {
      C2SPullFrame result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public C2SPullFrame buildPartial() {
      C2SPullFrame result = new C2SPullFrame(this);
      result.frameIdBegin_ = frameIdBegin_;
      result.frameIdEnd_ = frameIdEnd_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof C2SPullFrame) {
        return mergeFrom((C2SPullFrame)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(C2SPullFrame other) {
      if (other == C2SPullFrame.getDefaultInstance()) return this;
      if (other.getFrameIdBegin() != 0) {
        setFrameIdBegin(other.getFrameIdBegin());
      }
      if (other.getFrameIdEnd() != 0) {
        setFrameIdEnd(other.getFrameIdEnd());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      C2SPullFrame parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (C2SPullFrame) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int frameIdBegin_ ;
    /**
     * <code>uint32 frameIdBegin = 1;</code>
     */
    public int getFrameIdBegin() {
      return frameIdBegin_;
    }
    /**
     * <code>uint32 frameIdBegin = 1;</code>
     */
    public Builder setFrameIdBegin(int value) {
      
      frameIdBegin_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 frameIdBegin = 1;</code>
     */
    public Builder clearFrameIdBegin() {
      
      frameIdBegin_ = 0;
      onChanged();
      return this;
    }

    private int frameIdEnd_ ;
    /**
     * <code>uint32 frameIdEnd = 2;</code>
     */
    public int getFrameIdEnd() {
      return frameIdEnd_;
    }
    /**
     * <code>uint32 frameIdEnd = 2;</code>
     */
    public Builder setFrameIdEnd(int value) {
      
      frameIdEnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 frameIdEnd = 2;</code>
     */
    public Builder clearFrameIdEnd() {
      
      frameIdEnd_ = 0;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LockstepProto.C2SPullFrame)
  }

  // @@protoc_insertion_point(class_scope:LockstepProto.C2SPullFrame)
  private static final C2SPullFrame DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new C2SPullFrame();
  }

  public static C2SPullFrame getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<C2SPullFrame>
      PARSER = new com.google.protobuf.AbstractParser<C2SPullFrame>() {
    @Override
    public C2SPullFrame parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new C2SPullFrame(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<C2SPullFrame> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<C2SPullFrame> getParserForType() {
    return PARSER;
  }

  @Override
  public C2SPullFrame getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
