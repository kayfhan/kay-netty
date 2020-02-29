package me.kay.grpc;

import io.grpc.stub.StreamObserver;
import me.kay.grpc.proto.StudentRequest;
import me.kay.grpc.proto.StudentResponse;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getStudentById(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println(request.getStudentId());
        responseObserver.onNext(StudentResponse.newBuilder().setStudentId(10001).setStudentName("kay.hann").build());
        responseObserver.onCompleted();
    }
}
