package me.kay.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class GrpcClient {

    private final static Logger logger = LoggerFactory.getLogger(GrpcClient.class);

    private final ManagedChannel channel;
    private final StudentServiceGrpc.StudentServiceBlockingStub blockingStub; // 同步调用
    private final StudentServiceGrpc.StudentServiceStub asyncStub; // 异步调用

    public GrpcClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext());
    }

    private GrpcClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        blockingStub = StudentServiceGrpc.newBlockingStub(channel);
        asyncStub = StudentServiceGrpc.newStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void getStudentByName(String name) {
        NameRequest request = NameRequest.newBuilder().setStudentName(name).build();
        StudentResponse response;
        try {
            response = blockingStub.getStudentByName(request);
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
            return;
        }
        System.out.println(response.getStudentAge());
        System.out.println(response.getStudentName());
    }

    public void getStudentByAge(int age) {
        AgeRequest request = AgeRequest.newBuilder().setStudentAge(age).build();
        Iterator<StudentResponse> response;
        try {
            response = blockingStub.getStudentByAge(request);
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
            return;
        }
        while (response.hasNext()) {
            StudentResponse response1 = response.next();
            System.out.println(response1.getStudentAge());
            System.out.println(response1.getStudentName());
        }
    }

    public void getStudentsWrapperByAge() {
        System.out.println("-----------getStudentsWrapperByAge-----------");


        StreamObserver<StudentResponseList> responseListStreamObserver = new StreamObserver<StudentResponseList>() {
            @Override
            public void onNext(StudentResponseList value) {
                logger.info("--------client------------onNext-----------------");
                value.getStudentResponseList().forEach(studentResponse -> {
                    System.out.println(studentResponse.getStudentName());
                    System.out.println(studentResponse.getStudentAge());
                    System.out.println("******************************");
                });

            }

            @Override
            public void onError(Throwable t) {
                System.out.println("onError" + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("onCompleted");
            }
        };
        StreamObserver<AgeRequest> streamObserver = asyncStub.getStudentsWrapperByAge(responseListStreamObserver);
        try {
            System.out.println("dfsdafdsfd");
            streamObserver.onNext(AgeRequest.newBuilder().setStudentAge(11).build());
            streamObserver.onNext(AgeRequest.newBuilder().setStudentAge(22).build());
            streamObserver.onNext(AgeRequest.newBuilder().setStudentAge(33).build());
            System.out.println("dfsdafdsf222222d");
            streamObserver.onCompleted();
        } catch (RuntimeException e) {
            streamObserver.onError(e);
            System.out.println(e.getMessage());
            throw e;
        }
        try {
            Thread.sleep(5000);  // 由于是异步的客户端数据发送完就会关闭，因此需要等待几秒才会看到服务器发送回来的数据
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void biTalk(){
        StreamObserver<StreamRequest> streamObserver = asyncStub.biTalk(new StreamObserver<StreamResponse>() {
            @Override
            public void onNext(StreamResponse value) {
                System.out.println("----------------- on next. -----------------");
                System.out.println(value.getRequestInfo());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("----------------- on completed. -----------------");
            }
        });

        streamObserver.onNext(StreamRequest.newBuilder().setRequestInfo(UUID.randomUUID().toString()).build());
        streamObserver.onNext(StreamRequest.newBuilder().setRequestInfo(UUID.randomUUID().toString()).build());
        streamObserver.onCompleted();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        GrpcClient client = new GrpcClient("localhost", 50051);

//        client.getStudentByName("kay");
//
//        client.getStudentByAge(11);

//        client.getStudentsWrapperByAge();

        client.biTalk();
//        client.shutdown();


    }
}
