// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dht.proto

package edu.stevens.cs549.dht.rpc;

public final class Dht {
  private Dht() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Id_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Id_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Key_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Binding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Binding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Bindings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Bindings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NodeBindings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NodeBindings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tdht.proto\032\033google/protobuf/empty.proto" +
      "\"\020\n\002Id\022\n\n\002id\030\001 \001(\005\"\022\n\003Key\022\013\n\003key\030\001 \001(\t\"2" +
      "\n\010NodeInfo\022\n\n\002id\030\001 \001(\005\022\014\n\004host\030\002 \001(\t\022\014\n\004" +
      "port\030\003 \001(\005\"%\n\007Binding\022\013\n\003key\030\001 \001(\t\022\r\n\005va" +
      "lue\030\002 \001(\t\"&\n\010Bindings\022\013\n\003key\030\001 \001(\t\022\r\n\005va" +
      "lue\030\002 \003(\t\"]\n\014NodeBindings\022\027\n\004info\030\001 \001(\0132" +
      "\t.NodeInfo\022\027\n\004succ\030\002 \001(\0132\t.NodeInfo\022\033\n\010b" +
      "indings\030\003 \003(\0132\t.Bindings2\220\003\n\nDhtService\022" +
      "0\n\013getNodeInfo\022\026.google.protobuf.Empty\032\t" +
      ".NodeInfo\022,\n\007getPred\022\026.google.protobuf.E" +
      "mpty\032\t.NodeInfo\022,\n\007getSucc\022\026.google.prot" +
      "obuf.Empty\032\t.NodeInfo\022(\n\026closestPrecedin" +
      "gFinger\022\003.Id\032\t.NodeInfo\022&\n\006notify\022\r.Node" +
      "Bindings\032\r.NodeBindings\022\036\n\013getBindings\022\004" +
      ".Key\032\t.Bindings\022.\n\naddBinding\022\010.Binding\032" +
      "\026.google.protobuf.Empty\0221\n\rdeleteBinding" +
      "\022\010.Binding\032\026.google.protobuf.Empty\022\037\n\rfi" +
      "ndSuccessor\022\003.Id\032\t.NodeInfoB\035\n\031edu.steve" +
      "ns.cs549.dht.rpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_Id_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Id_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Id_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_Key_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Key_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_NodeInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_NodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NodeInfo_descriptor,
        new java.lang.String[] { "Id", "Host", "Port", });
    internal_static_Binding_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Binding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Binding_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_Bindings_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Bindings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Bindings_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_NodeBindings_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_NodeBindings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NodeBindings_descriptor,
        new java.lang.String[] { "Info", "Succ", "Bindings", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
