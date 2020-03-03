package me.kay.grpc;

import io.grpc.stub.StreamObserver;

import java.util.UUID;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getStudentByName(NameRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println(request.getStudentName());
        responseObserver.onNext(StudentResponse.newBuilder().setStudentAge(10001).setStudentName("kay.hann").build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStudentByAge(AgeRequest request, StreamObserver<StudentResponse> responseObserver) {
        responseObserver.onNext(StudentResponse.newBuilder().setStudentAge(10001).setStudentName("kay.hann").build());
        responseObserver.onNext(StudentResponse.newBuilder().setStudentAge(10002).setStudentName("tom").build());
        responseObserver.onNext(StudentResponse.newBuilder().setStudentAge(10003).setStudentName("kitty").build());
        responseObserver.onNext(StudentResponse.newBuilder().setStudentAge(10004).setStudentName("jock").build());
        responseObserver.onNext(StudentResponse.newBuilder().setStudentAge(10005).setStudentName("marry").build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<AgeRequest> getStudentsWrapperByAge(StreamObserver<StudentResponseList> responseObserver) {
        return new StreamObserver<AgeRequest>() {
            @Override
            public void onNext(AgeRequest value) {
                System.out.println("------server --------onNext-------------");
                System.out.println("onNext: " + value.getStudentAge());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("----------------- on Completed -----------------");
                // 客户端发流试的数据给服务器，客户端最后会调用onCompleted 方法表示数据发送结束，因此在服务器端收到了客户端的onCompleted之后对客户端作出响应
                StudentResponse response = StudentResponse.newBuilder().setStudentAge(10001).setStudentName("kay.hann").build();
                StudentResponse response1 = StudentResponse.newBuilder().setStudentAge(20001).setStudentName("kkkkkk").build();
                StudentResponse response2 = StudentResponse.newBuilder().setStudentAge(30001).setStudentName("aaaaaa").build();
                StudentResponseList studentResponseList = StudentResponseList.newBuilder()
                        .addStudentResponse(response)
                        .addStudentResponse(response1)
                        .addStudentResponse(response2).build();

                responseObserver.onNext(studentResponseList);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<StreamRequest> biTalk(StreamObserver<StreamResponse> responseObserver) {
        return new StreamObserver<StreamRequest>() {
            @Override
            public void onNext(StreamRequest value) {
                System.out.println("----------------- on next. -----------------");
                System.out.println(value.getRequestInfo());

                responseObserver.onNext(StreamResponse.newBuilder()
                        .setRequestInfo(UUID.randomUUID().toString())
                        .build());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("----------------- on completed. -----------------");
                responseObserver.onCompleted();
            }
        };
    }
}
