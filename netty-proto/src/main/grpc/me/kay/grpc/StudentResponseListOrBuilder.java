// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PbStudent.proto

package me.kay.grpc;

public interface StudentResponseListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:me.kay.proto.StudentResponseList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .me.kay.proto.StudentResponse studentResponse = 1;</code>
   */
  java.util.List<me.kay.grpc.StudentResponse> 
      getStudentResponseList();
  /**
   * <code>repeated .me.kay.proto.StudentResponse studentResponse = 1;</code>
   */
  me.kay.grpc.StudentResponse getStudentResponse(int index);
  /**
   * <code>repeated .me.kay.proto.StudentResponse studentResponse = 1;</code>
   */
  int getStudentResponseCount();
  /**
   * <code>repeated .me.kay.proto.StudentResponse studentResponse = 1;</code>
   */
  java.util.List<? extends me.kay.grpc.StudentResponseOrBuilder> 
      getStudentResponseOrBuilderList();
  /**
   * <code>repeated .me.kay.proto.StudentResponse studentResponse = 1;</code>
   */
  me.kay.grpc.StudentResponseOrBuilder getStudentResponseOrBuilder(
      int index);
}