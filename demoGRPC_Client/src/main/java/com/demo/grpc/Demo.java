// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: demo.proto

package com.demo.grpc;

public final class Demo {
  private Demo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_demoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_demoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ndemo.proto\"(\n\013demoRequest\022\n\n\002id\030\001 \001(\005\022" +
      "\r\n\005label\030\002 \001(\t\"7\n\014demoResponse\022\021\n\terrorC" +
      "ode\030\001 \001(\005\022\024\n\014errorMessage\030\002 \001(\t28\n\013demoS" +
      "ervice\022)\n\ndemoInsert\022\014.demoRequest\032\r.dem" +
      "oResponseB\021\n\rcom.demo.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_demoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_demoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demoRequest_descriptor,
        new java.lang.String[] { "Id", "Label", });
    internal_static_demoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_demoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_demoResponse_descriptor,
        new java.lang.String[] { "ErrorCode", "ErrorMessage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
