// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Contract.proto

package me.kay.protobuf.proto;

public interface CreateContractOrBuilder extends
    // @@protoc_insertion_point(interface_extends:me.kay.proto.CreateContract)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner_address = 1;</code>
   * @return The ownerAddress.
   */
  java.lang.String getOwnerAddress();
  /**
   * <code>string owner_address = 1;</code>
   * @return The bytes for ownerAddress.
   */
  com.google.protobuf.ByteString
      getOwnerAddressBytes();

  /**
   * <code>string contract_abi = 2;</code>
   * @return The contractAbi.
   */
  java.lang.String getContractAbi();
  /**
   * <code>string contract_abi = 2;</code>
   * @return The bytes for contractAbi.
   */
  com.google.protobuf.ByteString
      getContractAbiBytes();

  /**
   * <code>string contract_code = 3;</code>
   * @return The contractCode.
   */
  java.lang.String getContractCode();
  /**
   * <code>string contract_code = 3;</code>
   * @return The bytes for contractCode.
   */
  com.google.protobuf.ByteString
      getContractCodeBytes();

  /**
   * <code>string contract_params = 4;</code>
   * @return The contractParams.
   */
  java.lang.String getContractParams();
  /**
   * <code>string contract_params = 4;</code>
   * @return The bytes for contractParams.
   */
  com.google.protobuf.ByteString
      getContractParamsBytes();
}