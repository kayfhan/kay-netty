// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Frame.proto

package me.kay.protobuf.proto;

public interface TransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:me.kay.proto.Transaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string hash = 1;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <code>string hash = 1;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <code>int64 timestamp = 2;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>.me.kay.proto.Transaction.ContractType type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.me.kay.proto.Transaction.ContractType type = 3;</code>
   * @return The type.
   */
  me.kay.protobuf.proto.Transaction.ContractType getType();

  /**
   * <code>.me.kay.proto.Transfer transfer = 4;</code>
   * @return Whether the transfer field is set.
   */
  boolean hasTransfer();
  /**
   * <code>.me.kay.proto.Transfer transfer = 4;</code>
   * @return The transfer.
   */
  me.kay.protobuf.proto.Transfer getTransfer();
  /**
   * <code>.me.kay.proto.Transfer transfer = 4;</code>
   */
  me.kay.protobuf.proto.TransferOrBuilder getTransferOrBuilder();

  /**
   * <code>.me.kay.proto.CreateContract CreateContract = 5;</code>
   * @return Whether the createContract field is set.
   */
  boolean hasCreateContract();
  /**
   * <code>.me.kay.proto.CreateContract CreateContract = 5;</code>
   * @return The createContract.
   */
  me.kay.protobuf.proto.CreateContract getCreateContract();
  /**
   * <code>.me.kay.proto.CreateContract CreateContract = 5;</code>
   */
  me.kay.protobuf.proto.CreateContractOrBuilder getCreateContractOrBuilder();

  /**
   * <code>.me.kay.proto.TriggerContract TriggerContract = 6;</code>
   * @return Whether the triggerContract field is set.
   */
  boolean hasTriggerContract();
  /**
   * <code>.me.kay.proto.TriggerContract TriggerContract = 6;</code>
   * @return The triggerContract.
   */
  me.kay.protobuf.proto.TriggerContract getTriggerContract();
  /**
   * <code>.me.kay.proto.TriggerContract TriggerContract = 6;</code>
   */
  me.kay.protobuf.proto.TriggerContractOrBuilder getTriggerContractOrBuilder();

  /**
   * <code>string sign = 7;</code>
   * @return The sign.
   */
  java.lang.String getSign();
  /**
   * <code>string sign = 7;</code>
   * @return The bytes for sign.
   */
  com.google.protobuf.ByteString
      getSignBytes();

  public me.kay.protobuf.proto.Transaction.ContractCase getContractCase();
}