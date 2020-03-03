package me.kay.protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ServerHandler extends SimpleChannelInboundHandler<Transaction> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Transaction msg) throws Exception {
        System.out.println("msg: from client");
        System.out.println(msg.toString());
//        if (msg.getType() == Transaction.ContractType.CreateContractType){
//            CreateContract createContract = msg.getCreateContract();
//            System.out.println(createContract.getContractAbi());
//            System.out.println(createContract.getContractCode());
//            System.out.println(createContract.getContractParams());
//            System.out.println(createContract.getOwnerAddress());
//        } else if (msg.getType() == Transaction.ContractType.TransferType){
//            Transfer transfer = msg.getTransfer();
//            System.out.println(transfer.getAmount());
//            System.out.println(transfer.getOwnerAddress());
//            System.out.println(transfer.getToAddress());
//        }else {
//            TriggerContract triggerContract = msg.getTriggerContract();
//            System.out.println(triggerContract.getContractAddress());
//            System.out.println(triggerContract.getOwnerAddress());
//            System.out.println(triggerContract.getContractParams());
//        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        System.out.println("mesg ------- from server");
    }
}
