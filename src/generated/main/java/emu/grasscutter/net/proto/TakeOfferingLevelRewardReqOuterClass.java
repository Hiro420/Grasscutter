// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeOfferingLevelRewardReq.proto

package emu.grasscutter.net.proto;

public final class TakeOfferingLevelRewardReqOuterClass {
  private TakeOfferingLevelRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeOfferingLevelRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeOfferingLevelRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 offeringId = 8;</code>
     * @return The offeringId.
     */
    int getOfferingId();
  }
  /**
   * <pre>
   *enum AEDJIPDGBNO {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 2909;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *	EAJIABGAOCI = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code TakeOfferingLevelRewardReq}
   */
  public static final class TakeOfferingLevelRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeOfferingLevelRewardReq)
      TakeOfferingLevelRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeOfferingLevelRewardReq.newBuilder() to construct.
    private TakeOfferingLevelRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeOfferingLevelRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeOfferingLevelRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeOfferingLevelRewardReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              level_ = input.readUInt32();
              break;
            }
            case 64: {

              offeringId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.internal_static_TakeOfferingLevelRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.internal_static_TakeOfferingLevelRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq.class, emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 2;
    private int level_;
    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int OFFERINGID_FIELD_NUMBER = 8;
    private int offeringId_;
    /**
     * <code>uint32 offeringId = 8;</code>
     * @return The offeringId.
     */
    @java.lang.Override
    public int getOfferingId() {
      return offeringId_;
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
      if (level_ != 0) {
        output.writeUInt32(2, level_);
      }
      if (offeringId_ != 0) {
        output.writeUInt32(8, offeringId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, level_);
      }
      if (offeringId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, offeringId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq other = (emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getOfferingId()
          != other.getOfferingId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + OFFERINGID_FIELD_NUMBER;
      hash = (53 * hash) + getOfferingId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq prototype) {
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
     *enum AEDJIPDGBNO {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 2909;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *	EAJIABGAOCI = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code TakeOfferingLevelRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeOfferingLevelRewardReq)
        emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.internal_static_TakeOfferingLevelRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.internal_static_TakeOfferingLevelRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq.class, emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq.newBuilder()
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
        level_ = 0;

        offeringId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.internal_static_TakeOfferingLevelRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq build() {
        emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq buildPartial() {
        emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq result = new emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq(this);
        result.level_ = level_;
        result.offeringId_ = offeringId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq other) {
        if (other == emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getOfferingId() != 0) {
          setOfferingId(other.getOfferingId());
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
        emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 2;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int offeringId_ ;
      /**
       * <code>uint32 offeringId = 8;</code>
       * @return The offeringId.
       */
      @java.lang.Override
      public int getOfferingId() {
        return offeringId_;
      }
      /**
       * <code>uint32 offeringId = 8;</code>
       * @param value The offeringId to set.
       * @return This builder for chaining.
       */
      public Builder setOfferingId(int value) {
        
        offeringId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 offeringId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferingId() {
        
        offeringId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TakeOfferingLevelRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeOfferingLevelRewardReq)
    private static final emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq();
    }

    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeOfferingLevelRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeOfferingLevelRewardReq>() {
      @java.lang.Override
      public TakeOfferingLevelRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeOfferingLevelRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeOfferingLevelRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeOfferingLevelRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeOfferingLevelRewardReqOuterClass.TakeOfferingLevelRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeOfferingLevelRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeOfferingLevelRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n TakeOfferingLevelRewardReq.proto\"?\n\032Ta" +
      "keOfferingLevelRewardReq\022\r\n\005level\030\002 \001(\r\022" +
      "\022\n\nofferingId\030\010 \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeOfferingLevelRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeOfferingLevelRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeOfferingLevelRewardReq_descriptor,
        new java.lang.String[] { "Level", "OfferingId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}