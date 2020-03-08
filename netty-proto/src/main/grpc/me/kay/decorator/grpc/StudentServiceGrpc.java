package me.kay.decorator.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.0)",
    comments = "Source: PbStudent.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "me.kay.proto.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<NameRequest,
          StudentResponse> getGetStudentByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentByName",
      requestType = NameRequest.class,
      responseType = StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<NameRequest,
          StudentResponse> getGetStudentByNameMethod() {
    io.grpc.MethodDescriptor<NameRequest, StudentResponse> getGetStudentByNameMethod;
    if ((getGetStudentByNameMethod = StudentServiceGrpc.getGetStudentByNameMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentByNameMethod = StudentServiceGrpc.getGetStudentByNameMethod) == null) {
          StudentServiceGrpc.getGetStudentByNameMethod = getGetStudentByNameMethod =
              io.grpc.MethodDescriptor.<NameRequest, StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  NameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentByName"))
              .build();
        }
      }
    }
    return getGetStudentByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AgeRequest,
          StudentResponse> getGetStudentByAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentByAge",
      requestType = AgeRequest.class,
      responseType = StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<AgeRequest,
          StudentResponse> getGetStudentByAgeMethod() {
    io.grpc.MethodDescriptor<AgeRequest, StudentResponse> getGetStudentByAgeMethod;
    if ((getGetStudentByAgeMethod = StudentServiceGrpc.getGetStudentByAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentByAgeMethod = StudentServiceGrpc.getGetStudentByAgeMethod) == null) {
          StudentServiceGrpc.getGetStudentByAgeMethod = getGetStudentByAgeMethod =
              io.grpc.MethodDescriptor.<AgeRequest, StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentByAge"))
              .build();
        }
      }
    }
    return getGetStudentByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<AgeRequest,
          StudentResponseList> getGetStudentsWrapperByAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentsWrapperByAge",
      requestType = AgeRequest.class,
      responseType = StudentResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<AgeRequest,
          StudentResponseList> getGetStudentsWrapperByAgeMethod() {
    io.grpc.MethodDescriptor<AgeRequest, StudentResponseList> getGetStudentsWrapperByAgeMethod;
    if ((getGetStudentsWrapperByAgeMethod = StudentServiceGrpc.getGetStudentsWrapperByAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentsWrapperByAgeMethod = StudentServiceGrpc.getGetStudentsWrapperByAgeMethod) == null) {
          StudentServiceGrpc.getGetStudentsWrapperByAgeMethod = getGetStudentsWrapperByAgeMethod =
              io.grpc.MethodDescriptor.<AgeRequest, StudentResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentsWrapperByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  AgeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StudentResponseList.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentsWrapperByAge"))
              .build();
        }
      }
    }
    return getGetStudentsWrapperByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<StreamRequest,
          StreamResponse> getBiTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BiTalk",
      requestType = StreamRequest.class,
      responseType = StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<StreamRequest,
          StreamResponse> getBiTalkMethod() {
    io.grpc.MethodDescriptor<StreamRequest, StreamResponse> getBiTalkMethod;
    if ((getBiTalkMethod = StudentServiceGrpc.getBiTalkMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getBiTalkMethod = StudentServiceGrpc.getBiTalkMethod) == null) {
          StudentServiceGrpc.getBiTalkMethod = getBiTalkMethod =
              io.grpc.MethodDescriptor.<StreamRequest, StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BiTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("BiTalk"))
              .build();
        }
      }
    }
    return getBiTalkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub>() {
        @java.lang.Override
        public StudentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceStub(channel, callOptions);
        }
      };
    return StudentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub>() {
        @java.lang.Override
        public StudentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceBlockingStub(channel, callOptions);
        }
      };
    return StudentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub>() {
        @java.lang.Override
        public StudentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceFutureStub(channel, callOptions);
        }
      };
    return StudentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStudentByName(NameRequest request,
                                 io.grpc.stub.StreamObserver<StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentByNameMethod(), responseObserver);
    }

    /**
     */
    public void getStudentByAge(AgeRequest request,
                                io.grpc.stub.StreamObserver<StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudentByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<AgeRequest> getStudentsWrapperByAge(
        io.grpc.stub.StreamObserver<StudentResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentsWrapperByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiTalkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStudentByNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      NameRequest,
                      StudentResponse>(
                  this, METHODID_GET_STUDENT_BY_NAME)))
          .addMethod(
            getGetStudentByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                      AgeRequest,
                      StudentResponse>(
                  this, METHODID_GET_STUDENT_BY_AGE)))
          .addMethod(
            getGetStudentsWrapperByAgeMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                      AgeRequest,
                      StudentResponseList>(
                  this, METHODID_GET_STUDENTS_WRAPPER_BY_AGE)))
          .addMethod(
            getBiTalkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                      StreamRequest,
                      StreamResponse>(
                  this, METHODID_BI_TALK)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractAsyncStub<StudentServiceStub> {
    private StudentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStudentByName(NameRequest request,
                                 io.grpc.stub.StreamObserver<StudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStudentByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentByAge(AgeRequest request,
                                io.grpc.stub.StreamObserver<StudentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStudentByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<AgeRequest> getStudentsWrapperByAge(
        io.grpc.stub.StreamObserver<StudentResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetStudentsWrapperByAgeMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiTalkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public StudentResponse getStudentByName(NameRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStudentByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<StudentResponse> getStudentByAge(
        AgeRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStudentByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<StudentResponse> getStudentByName(
        NameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStudentByNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT_BY_NAME = 0;
  private static final int METHODID_GET_STUDENT_BY_AGE = 1;
  private static final int METHODID_GET_STUDENTS_WRAPPER_BY_AGE = 2;
  private static final int METHODID_BI_TALK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT_BY_NAME:
          serviceImpl.getStudentByName((NameRequest) request,
              (io.grpc.stub.StreamObserver<StudentResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_BY_AGE:
          serviceImpl.getStudentByAge((AgeRequest) request,
              (io.grpc.stub.StreamObserver<StudentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENTS_WRAPPER_BY_AGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentsWrapperByAge(
              (io.grpc.stub.StreamObserver<StudentResponseList>) responseObserver);
        case METHODID_BI_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biTalk(
              (io.grpc.stub.StreamObserver<StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return PbStudent.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetStudentByNameMethod())
              .addMethod(getGetStudentByAgeMethod())
              .addMethod(getGetStudentsWrapperByAgeMethod())
              .addMethod(getBiTalkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
