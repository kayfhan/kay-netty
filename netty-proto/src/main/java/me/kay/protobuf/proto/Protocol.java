// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Frame.proto

package me.kay.protobuf.proto;

public final class Protocol {
  private Protocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_me_kay_proto_Transaction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_me_kay_proto_Transaction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Frame.proto\022\014me.kay.proto\032\016Contract.pr" +
      "oto\"\357\002\n\013Transaction\022\014\n\004hash\030\001 \001(\t\022\021\n\ttim" +
      "estamp\030\002 \001(\003\0224\n\004type\030\003 \001(\0162&.me.kay.prot" +
      "o.Transaction.ContractType\022*\n\010transfer\030\004" +
      " \001(\0132\026.me.kay.proto.TransferH\000\0226\n\016Create" +
      "Contract\030\005 \001(\0132\034.me.kay.proto.CreateCont" +
      "ractH\000\0228\n\017TriggerContract\030\006 \001(\0132\035.me.kay" +
      ".proto.TriggerContractH\000\022\014\n\004sign\030\007 \001(\t\"Q" +
      "\n\014ContractType\022\020\n\014TransferType\020\000\022\026\n\022Crea" +
      "teContractType\020\001\022\027\n\023TriggerContractType\020" +
      "\002B\n\n\010ContractB#\n\025me.kay.protobuf.protoB\010" +
      "ProtocolP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          me.kay.protobuf.proto.Contract.getDescriptor(),
        });
    internal_static_me_kay_proto_Transaction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_me_kay_proto_Transaction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_me_kay_proto_Transaction_descriptor,
        new java.lang.String[] { "Hash", "Timestamp", "Type", "Transfer", "CreateContract", "TriggerContract", "Sign", "Contract", });
    me.kay.protobuf.proto.Contract.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
