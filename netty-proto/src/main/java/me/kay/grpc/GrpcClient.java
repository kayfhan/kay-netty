package me.kay.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import me.kay.grpc.proto.StudentRequest;
import me.kay.grpc.proto.StudentResponse;

import java.util.concurrent.TimeUnit;

public class GrpcClient {

    private final ManagedChannel channel;
    private final StudentServiceGrpc.StudentServiceBlockingStub stub;

    public GrpcClient(String host, int port){
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext());
    }

    GrpcClient(ManagedChannelBuilder<?> channelBuilder){
        channel = channelBuilder.build();
        stub = StudentServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void getStudentById(int id){
        StudentRequest request = StudentRequest.newBuilder().setStudentId(id).build();
        StudentResponse response;
        try {
            response = stub.getStudentById(request);
        } catch (StatusRuntimeException e){
            e.printStackTrace();
            return;
        }
        System.out.println(response.getStudentId());
        System.out.println(response.getStudentName());
    }

    public static void main(String[] args) {

        GrpcClient client = new GrpcClient("localhost", 50051);
        client.getStudentById(1001);
    }
}
