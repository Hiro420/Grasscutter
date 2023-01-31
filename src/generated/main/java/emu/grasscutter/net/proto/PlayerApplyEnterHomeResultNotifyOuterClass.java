// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerApplyEnterHomeResultNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerApplyEnterHomeResultNotifyOuterClass {
  private PlayerApplyEnterHomeResultNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerApplyEnterHomeResultNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerApplyEnterHomeResultNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 targetUid = 2;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>.Reason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.Reason reason = 3;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.ReasonOuterClass.Reason getReason();

    /**
     * <code>bool isAgreed = 10;</code>
     * @return The isAgreed.
     */
    boolean getIsAgreed();

    /**
     * <code>string targetNickname = 9;</code>
     * @return The targetNickname.
     */
    java.lang.String getTargetNickname();
    /**
     * <code>string targetNickname = 9;</code>
     * @return The bytes for targetNickname.
     */
    com.google.protobuf.ByteString
        getTargetNicknameBytes();
  }
  /**
   * <pre>
   *enum KEHLDHBMMFM {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 4642;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code PlayerApplyEnterHomeResultNotify}
   */
  public static final class PlayerApplyEnterHomeResultNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerApplyEnterHomeResultNotify)
      PlayerApplyEnterHomeResultNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerApplyEnterHomeResultNotify.newBuilder() to construct.
    private PlayerApplyEnterHomeResultNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerApplyEnterHomeResultNotify() {
      reason_ = 0;
      targetNickname_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerApplyEnterHomeResultNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerApplyEnterHomeResultNotify(
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

              targetUid_ = input.readUInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              reason_ = rawValue;
              break;
            }
            case 74: {
              java.lang.String s = input.readStringRequireUtf8();

              targetNickname_ = s;
              break;
            }
            case 80: {

              isAgreed_ = input.readBool();
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
      return emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.class, emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Builder.class);
    }

    public static final int TARGETUID_FIELD_NUMBER = 2;
    private int targetUid_;
    /**
     * <code>uint32 targetUid = 2;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int REASON_FIELD_NUMBER = 3;
    private int reason_;
    /**
     * <code>.Reason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.Reason reason = 3;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ReasonOuterClass.Reason getReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.ReasonOuterClass.Reason result = emu.grasscutter.net.proto.ReasonOuterClass.Reason.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.ReasonOuterClass.Reason.UNRECOGNIZED : result;
    }

    public static final int ISAGREED_FIELD_NUMBER = 10;
    private boolean isAgreed_;
    /**
     * <code>bool isAgreed = 10;</code>
     * @return The isAgreed.
     */
    @java.lang.Override
    public boolean getIsAgreed() {
      return isAgreed_;
    }

    public static final int TARGETNICKNAME_FIELD_NUMBER = 9;
    private volatile java.lang.Object targetNickname_;
    /**
     * <code>string targetNickname = 9;</code>
     * @return The targetNickname.
     */
    @java.lang.Override
    public java.lang.String getTargetNickname() {
      java.lang.Object ref = targetNickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetNickname_ = s;
        return s;
      }
    }
    /**
     * <code>string targetNickname = 9;</code>
     * @return The bytes for targetNickname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTargetNicknameBytes() {
      java.lang.Object ref = targetNickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetNickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (targetUid_ != 0) {
        output.writeUInt32(2, targetUid_);
      }
      if (reason_ != emu.grasscutter.net.proto.ReasonOuterClass.Reason.REASON_SUCC.getNumber()) {
        output.writeEnum(3, reason_);
      }
      if (!getTargetNicknameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 9, targetNickname_);
      }
      if (isAgreed_ != false) {
        output.writeBool(10, isAgreed_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, targetUid_);
      }
      if (reason_ != emu.grasscutter.net.proto.ReasonOuterClass.Reason.REASON_SUCC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, reason_);
      }
      if (!getTargetNicknameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, targetNickname_);
      }
      if (isAgreed_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isAgreed_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify other = (emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (reason_ != other.reason_) return false;
      if (getIsAgreed()
          != other.getIsAgreed()) return false;
      if (!getTargetNickname()
          .equals(other.getTargetNickname())) return false;
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
      hash = (37 * hash) + TARGETUID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + ISAGREED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgreed());
      hash = (37 * hash) + TARGETNICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getTargetNickname().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify prototype) {
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
     *enum KEHLDHBMMFM {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 4642;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code PlayerApplyEnterHomeResultNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerApplyEnterHomeResultNotify)
        emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.class, emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.newBuilder()
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
        targetUid_ = 0;

        reason_ = 0;

        isAgreed_ = false;

        targetNickname_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.internal_static_PlayerApplyEnterHomeResultNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify build() {
        emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify result = new emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify(this);
        result.targetUid_ = targetUid_;
        result.reason_ = reason_;
        result.isAgreed_ = isAgreed_;
        result.targetNickname_ = targetNickname_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getIsAgreed() != false) {
          setIsAgreed(other.getIsAgreed());
        }
        if (!other.getTargetNickname().isEmpty()) {
          targetNickname_ = other.targetNickname_;
          onChanged();
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
        emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 targetUid = 2;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 targetUid = 2;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 targetUid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.Reason reason = 3;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.Reason reason = 3;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Reason reason = 3;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ReasonOuterClass.Reason getReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.ReasonOuterClass.Reason result = emu.grasscutter.net.proto.ReasonOuterClass.Reason.valueOf(reason_);
        return result == null ? emu.grasscutter.net.proto.ReasonOuterClass.Reason.UNRECOGNIZED : result;
      }
      /**
       * <code>.Reason reason = 3;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.ReasonOuterClass.Reason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Reason reason = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private boolean isAgreed_ ;
      /**
       * <code>bool isAgreed = 10;</code>
       * @return The isAgreed.
       */
      @java.lang.Override
      public boolean getIsAgreed() {
        return isAgreed_;
      }
      /**
       * <code>bool isAgreed = 10;</code>
       * @param value The isAgreed to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgreed(boolean value) {
        
        isAgreed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isAgreed = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgreed() {
        
        isAgreed_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object targetNickname_ = "";
      /**
       * <code>string targetNickname = 9;</code>
       * @return The targetNickname.
       */
      public java.lang.String getTargetNickname() {
        java.lang.Object ref = targetNickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetNickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string targetNickname = 9;</code>
       * @return The bytes for targetNickname.
       */
      public com.google.protobuf.ByteString
          getTargetNicknameBytes() {
        java.lang.Object ref = targetNickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetNickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string targetNickname = 9;</code>
       * @param value The targetNickname to set.
       * @return This builder for chaining.
       */
      public Builder setTargetNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetNickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string targetNickname = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetNickname() {
        
        targetNickname_ = getDefaultInstance().getTargetNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string targetNickname = 9;</code>
       * @param value The bytes for targetNickname to set.
       * @return This builder for chaining.
       */
      public Builder setTargetNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetNickname_ = value;
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


      // @@protoc_insertion_point(builder_scope:PlayerApplyEnterHomeResultNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerApplyEnterHomeResultNotify)
    private static final emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify();
    }

    public static emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerApplyEnterHomeResultNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerApplyEnterHomeResultNotify>() {
      @java.lang.Override
      public PlayerApplyEnterHomeResultNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerApplyEnterHomeResultNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerApplyEnterHomeResultNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerApplyEnterHomeResultNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerApplyEnterHomeResultNotifyOuterClass.PlayerApplyEnterHomeResultNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerApplyEnterHomeResultNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerApplyEnterHomeResultNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&PlayerApplyEnterHomeResultNotify.proto" +
      "\032\014Reason.proto\"x\n PlayerApplyEnterHomeRe" +
      "sultNotify\022\021\n\ttargetUid\030\002 \001(\r\022\027\n\006reason\030" +
      "\003 \001(\0162\007.Reason\022\020\n\010isAgreed\030\n \001(\010\022\026\n\016targ" +
      "etNickname\030\t \001(\tB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ReasonOuterClass.getDescriptor(),
        });
    internal_static_PlayerApplyEnterHomeResultNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerApplyEnterHomeResultNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerApplyEnterHomeResultNotify_descriptor,
        new java.lang.String[] { "TargetUid", "Reason", "IsAgreed", "TargetNickname", });
    emu.grasscutter.net.proto.ReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}