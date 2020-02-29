package me.kay.protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import me.kay.protobuf.proto.CreateContract;
import me.kay.protobuf.proto.Transaction;
import me.kay.protobuf.proto.Transfer;
import me.kay.protobuf.proto.TriggerContract;

import java.util.Random;

public class ClientHandler extends SimpleChannelInboundHandler<Transaction> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Transaction msg) throws Exception {
        System.out.println("channelRead0");

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("mesg ------- from client");
        int random = new Random().nextInt(3);
        Transaction.Builder transaction = null;
        if (random == 1) {
            CreateContract.Builder createContract = CreateContract.newBuilder()
                    .setContractAbi("\"abi\": [\n" +
                            "    {\n" +
                            "      \"constant\": false,\n" +
                            "      \"inputs\": [\n" +
                            "        {\n" +
                            "          \"name\": \"_x\",\n" +
                            "          \"type\": \"uint256\"\n" +
                            "        }\n" +
                            "      ],\n" +
                            "      \"name\": \"set\",\n" +
                            "      \"outputs\": [],\n" +
                            "      \"payable\": false,\n" +
                            "      \"stateMutability\": \"nonpayable\",\n" +
                            "      \"type\": \"function\"\n" +
                            "    }\n" +
                            "  ]")
                    .setContractCode("34325354354")
                    .setOwnerAddress("0xbf82d20cfdae003f4b14379204d791aa69dffc5b")
                    .setContractParams("000000000000000000000000000000000000000000000000000000005e2d64280000000000000000000000000000000000000000000000000000000005f5e100");
            transaction = Transaction.newBuilder()
                    .setType(Transaction.ContractType.CreateContractType)
                    .setCreateContract(createContract.build());
        } else if (random == 2) {
            Transfer.Builder transfer = Transfer.newBuilder()
                    .setToAddress("0x91a0f895f9d806e863b86c2099ead3859fc6310c")
                    .setOwnerAddress("0xbf82d20cfdae003f4b14379204d791aa69dffc5b")
                    .setAmount(100);
            transaction = Transaction.newBuilder()
                    .setType(Transaction.ContractType.CreateContractType)
                    .setTransfer(transfer.build());
        } else {
            TriggerContract.Builder triggerContract = TriggerContract.newBuilder()
                    .setContractAddress("0x91a0f895f9d806e863b86c2099ead3859fc6310c")
                    .setOwnerAddress("0xbf82d20cfdae003f4b14379204d791aa69dffc5b")
                    .setContractParams("000000000000000000000000000000000000000000000000000000005e2d64280000000000000000000000000000000000000000000000000000000005f5e100");
            transaction = Transaction.newBuilder()
                    .setType(Transaction.ContractType.CreateContractType)
                    .setTriggerContract(triggerContract.build());
        }
        transaction.setHash("d8d91202a3d759c1e0fb8778ab2087c09ef3451b850e823ee3ad455b76540414")
                .setTimestamp(15267282929L)
                .setSign("89240756de3c57a73505914dc1151dd7ba11c98439f4077ee616083420b64a82b48b28073e9ee15e4849baa9fa50e7c812c69be8720118d98178dd276e583643");
        ctx.channel().writeAndFlush(transaction.build());
    }
}
