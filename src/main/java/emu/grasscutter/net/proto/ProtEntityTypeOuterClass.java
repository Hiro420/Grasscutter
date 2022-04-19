// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtEntityType.proto

package emu.grasscutter.net.proto;

public final class ProtEntityTypeOuterClass {
  private ProtEntityTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ProtEntityType}
   */
  public enum ProtEntityType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ProtEntityNone = 0;</code>
     */
    ProtEntityNone(0),
    /**
     * <code>ProtEntityAvatar = 1;</code>
     */
    ProtEntityAvatar(1),
    /**
     * <code>ProtEntityMonster = 2;</code>
     */
    ProtEntityMonster(2),
    /**
     * <code>ProtEntityNpc = 3;</code>
     */
    ProtEntityNpc(3),
    /**
     * <code>ProtEntityGadget = 4;</code>
     */
    ProtEntityGadget(4),
    /**
     * <code>ProtEntityRegion = 5;</code>
     */
    ProtEntityRegion(5),
    /**
     * <code>ProtEntityWeapon = 6;</code>
     */
    ProtEntityWeapon(6),
    /**
     * <code>ProtEntityWeather = 7;</code>
     */
    ProtEntityWeather(7),
    /**
     * <code>ProtEntityScene = 8;</code>
     */
    ProtEntityScene(8),
    /**
     * <code>ProtEntityTeam = 9;</code>
     */
    ProtEntityTeam(9),
    /**
     * <code>ProtEntityMassiveEntity = 10;</code>
     */
    ProtEntityMassiveEntity(10),
    /**
     * <code>ProtEntityMpLevel = 11;</code>
     */
    ProtEntityMpLevel(11),
    /**
     * <code>ProtEntityPlayTeamEntity = 12;</code>
     */
    ProtEntityPlayTeamEntity(12),
    /**
     * <code>ProtEntityEyePoint = 13;</code>
     */
    ProtEntityEyePoint(13),
    /**
     * <code>ProtEntityMax = 14;</code>
     */
    ProtEntityMax(14),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ProtEntityNone = 0;</code>
     */
    public static final int ProtEntityNone_VALUE = 0;
    /**
     * <code>ProtEntityAvatar = 1;</code>
     */
    public static final int ProtEntityAvatar_VALUE = 1;
    /**
     * <code>ProtEntityMonster = 2;</code>
     */
    public static final int ProtEntityMonster_VALUE = 2;
    /**
     * <code>ProtEntityNpc = 3;</code>
     */
    public static final int ProtEntityNpc_VALUE = 3;
    /**
     * <code>ProtEntityGadget = 4;</code>
     */
    public static final int ProtEntityGadget_VALUE = 4;
    /**
     * <code>ProtEntityRegion = 5;</code>
     */
    public static final int ProtEntityRegion_VALUE = 5;
    /**
     * <code>ProtEntityWeapon = 6;</code>
     */
    public static final int ProtEntityWeapon_VALUE = 6;
    /**
     * <code>ProtEntityWeather = 7;</code>
     */
    public static final int ProtEntityWeather_VALUE = 7;
    /**
     * <code>ProtEntityScene = 8;</code>
     */
    public static final int ProtEntityScene_VALUE = 8;
    /**
     * <code>ProtEntityTeam = 9;</code>
     */
    public static final int ProtEntityTeam_VALUE = 9;
    /**
     * <code>ProtEntityMassiveEntity = 10;</code>
     */
    public static final int ProtEntityMassiveEntity_VALUE = 10;
    /**
     * <code>ProtEntityMpLevel = 11;</code>
     */
    public static final int ProtEntityMpLevel_VALUE = 11;
    /**
     * <code>ProtEntityPlayTeamEntity = 12;</code>
     */
    public static final int ProtEntityPlayTeamEntity_VALUE = 12;
    /**
     * <code>ProtEntityEyePoint = 13;</code>
     */
    public static final int ProtEntityEyePoint_VALUE = 13;
    /**
     * <code>ProtEntityMax = 14;</code>
     */
    public static final int ProtEntityMax_VALUE = 14;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProtEntityType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProtEntityType forNumber(int value) {
      switch (value) {
        case 0: return ProtEntityNone;
        case 1: return ProtEntityAvatar;
        case 2: return ProtEntityMonster;
        case 3: return ProtEntityNpc;
        case 4: return ProtEntityGadget;
        case 5: return ProtEntityRegion;
        case 6: return ProtEntityWeapon;
        case 7: return ProtEntityWeather;
        case 8: return ProtEntityScene;
        case 9: return ProtEntityTeam;
        case 10: return ProtEntityMassiveEntity;
        case 11: return ProtEntityMpLevel;
        case 12: return ProtEntityPlayTeamEntity;
        case 13: return ProtEntityEyePoint;
        case 14: return ProtEntityMax;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProtEntityType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProtEntityType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProtEntityType>() {
            public ProtEntityType findValueByNumber(int number) {
              return ProtEntityType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ProtEntityTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProtEntityType[] VALUES = values();

    public static ProtEntityType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ProtEntityType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ProtEntityType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ProtEntityType.proto*\343\002\n\016ProtEntityTyp" +
      "e\022\022\n\016ProtEntityNone\020\000\022\024\n\020ProtEntityAvata" +
      "r\020\001\022\025\n\021ProtEntityMonster\020\002\022\021\n\rProtEntity" +
      "Npc\020\003\022\024\n\020ProtEntityGadget\020\004\022\024\n\020ProtEntit" +
      "yRegion\020\005\022\024\n\020ProtEntityWeapon\020\006\022\025\n\021ProtE" +
      "ntityWeather\020\007\022\023\n\017ProtEntityScene\020\010\022\022\n\016P" +
      "rotEntityTeam\020\t\022\033\n\027ProtEntityMassiveEnti" +
      "ty\020\n\022\025\n\021ProtEntityMpLevel\020\013\022\034\n\030ProtEntit" +
      "yPlayTeamEntity\020\014\022\026\n\022ProtEntityEyePoint\020" +
      "\r\022\021\n\rProtEntityMax\020\016B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}