package com.example.demo.grpc.board;

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
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: board.proto")
public final class BoardServiceGrpc {

  private BoardServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.grpc.board.BoardService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardRequest,
      com.example.demo.grpc.board.BoardResponse> getBoardInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "boardInsert",
      requestType = com.example.demo.grpc.board.BoardRequest.class,
      responseType = com.example.demo.grpc.board.BoardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardRequest,
      com.example.demo.grpc.board.BoardResponse> getBoardInsertMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardRequest, com.example.demo.grpc.board.BoardResponse> getBoardInsertMethod;
    if ((getBoardInsertMethod = BoardServiceGrpc.getBoardInsertMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getBoardInsertMethod = BoardServiceGrpc.getBoardInsertMethod) == null) {
          BoardServiceGrpc.getBoardInsertMethod = getBoardInsertMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.grpc.board.BoardRequest, com.example.demo.grpc.board.BoardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.grpc.board.BoardService", "boardInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.board.BoardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.board.BoardResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("boardInsert"))
                  .build();
          }
        }
     }
     return getBoardInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardRequest,
      com.example.demo.grpc.board.BoardResponse> getBoardUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "boardUpdate",
      requestType = com.example.demo.grpc.board.BoardRequest.class,
      responseType = com.example.demo.grpc.board.BoardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardRequest,
      com.example.demo.grpc.board.BoardResponse> getBoardUpdateMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardRequest, com.example.demo.grpc.board.BoardResponse> getBoardUpdateMethod;
    if ((getBoardUpdateMethod = BoardServiceGrpc.getBoardUpdateMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getBoardUpdateMethod = BoardServiceGrpc.getBoardUpdateMethod) == null) {
          BoardServiceGrpc.getBoardUpdateMethod = getBoardUpdateMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.grpc.board.BoardRequest, com.example.demo.grpc.board.BoardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.grpc.board.BoardService", "boardUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.board.BoardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.board.BoardResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("boardUpdate"))
                  .build();
          }
        }
     }
     return getBoardUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardId,
      com.example.demo.grpc.board.BoardStatus> getBoardReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "boardRead",
      requestType = com.example.demo.grpc.board.BoardId.class,
      responseType = com.example.demo.grpc.board.BoardStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardId,
      com.example.demo.grpc.board.BoardStatus> getBoardReadMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardId, com.example.demo.grpc.board.BoardStatus> getBoardReadMethod;
    if ((getBoardReadMethod = BoardServiceGrpc.getBoardReadMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getBoardReadMethod = BoardServiceGrpc.getBoardReadMethod) == null) {
          BoardServiceGrpc.getBoardReadMethod = getBoardReadMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.grpc.board.BoardId, com.example.demo.grpc.board.BoardStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.grpc.board.BoardService", "boardRead"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.board.BoardId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.board.BoardStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("boardRead"))
                  .build();
          }
        }
     }
     return getBoardReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardId,
      com.example.demo.grpc.board.BoardStatus> getBoardDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "boardDelete",
      requestType = com.example.demo.grpc.board.BoardId.class,
      responseType = com.example.demo.grpc.board.BoardStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardId,
      com.example.demo.grpc.board.BoardStatus> getBoardDeleteMethod() {
    io.grpc.MethodDescriptor<com.example.demo.grpc.board.BoardId, com.example.demo.grpc.board.BoardStatus> getBoardDeleteMethod;
    if ((getBoardDeleteMethod = BoardServiceGrpc.getBoardDeleteMethod) == null) {
      synchronized (BoardServiceGrpc.class) {
        if ((getBoardDeleteMethod = BoardServiceGrpc.getBoardDeleteMethod) == null) {
          BoardServiceGrpc.getBoardDeleteMethod = getBoardDeleteMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.grpc.board.BoardId, com.example.demo.grpc.board.BoardStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.grpc.board.BoardService", "boardDelete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.board.BoardId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.grpc.board.BoardStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new BoardServiceMethodDescriptorSupplier("boardDelete"))
                  .build();
          }
        }
     }
     return getBoardDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BoardServiceStub newStub(io.grpc.Channel channel) {
    return new BoardServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BoardServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BoardServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BoardServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BoardServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BoardServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void boardInsert(com.example.demo.grpc.board.BoardRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBoardInsertMethod(), responseObserver);
    }

    /**
     */
    public void boardUpdate(com.example.demo.grpc.board.BoardRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBoardUpdateMethod(), responseObserver);
    }

    /**
     */
    public void boardRead(com.example.demo.grpc.board.BoardId request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getBoardReadMethod(), responseObserver);
    }

    /**
     */
    public void boardDelete(com.example.demo.grpc.board.BoardId request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getBoardDeleteMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBoardInsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.board.BoardRequest,
                com.example.demo.grpc.board.BoardResponse>(
                  this, METHODID_BOARD_INSERT)))
          .addMethod(
            getBoardUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.board.BoardRequest,
                com.example.demo.grpc.board.BoardResponse>(
                  this, METHODID_BOARD_UPDATE)))
          .addMethod(
            getBoardReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.board.BoardId,
                com.example.demo.grpc.board.BoardStatus>(
                  this, METHODID_BOARD_READ)))
          .addMethod(
            getBoardDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.grpc.board.BoardId,
                com.example.demo.grpc.board.BoardStatus>(
                  this, METHODID_BOARD_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class BoardServiceStub extends io.grpc.stub.AbstractStub<BoardServiceStub> {
    private BoardServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoardServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BoardServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoardServiceStub(channel, callOptions);
    }

    /**
     */
    public void boardInsert(com.example.demo.grpc.board.BoardRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBoardInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void boardUpdate(com.example.demo.grpc.board.BoardRequest request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBoardUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void boardRead(com.example.demo.grpc.board.BoardId request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBoardReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void boardDelete(com.example.demo.grpc.board.BoardId request,
        io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBoardDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BoardServiceBlockingStub extends io.grpc.stub.AbstractStub<BoardServiceBlockingStub> {
    private BoardServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoardServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BoardServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoardServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.demo.grpc.board.BoardResponse boardInsert(com.example.demo.grpc.board.BoardRequest request) {
      return blockingUnaryCall(
          getChannel(), getBoardInsertMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.grpc.board.BoardResponse boardUpdate(com.example.demo.grpc.board.BoardRequest request) {
      return blockingUnaryCall(
          getChannel(), getBoardUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.grpc.board.BoardStatus boardRead(com.example.demo.grpc.board.BoardId request) {
      return blockingUnaryCall(
          getChannel(), getBoardReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.demo.grpc.board.BoardStatus boardDelete(com.example.demo.grpc.board.BoardId request) {
      return blockingUnaryCall(
          getChannel(), getBoardDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BoardServiceFutureStub extends io.grpc.stub.AbstractStub<BoardServiceFutureStub> {
    private BoardServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BoardServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BoardServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BoardServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.board.BoardResponse> boardInsert(
        com.example.demo.grpc.board.BoardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBoardInsertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.board.BoardResponse> boardUpdate(
        com.example.demo.grpc.board.BoardRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBoardUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.board.BoardStatus> boardRead(
        com.example.demo.grpc.board.BoardId request) {
      return futureUnaryCall(
          getChannel().newCall(getBoardReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.demo.grpc.board.BoardStatus> boardDelete(
        com.example.demo.grpc.board.BoardId request) {
      return futureUnaryCall(
          getChannel().newCall(getBoardDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOARD_INSERT = 0;
  private static final int METHODID_BOARD_UPDATE = 1;
  private static final int METHODID_BOARD_READ = 2;
  private static final int METHODID_BOARD_DELETE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BoardServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BoardServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOARD_INSERT:
          serviceImpl.boardInsert((com.example.demo.grpc.board.BoardRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardResponse>) responseObserver);
          break;
        case METHODID_BOARD_UPDATE:
          serviceImpl.boardUpdate((com.example.demo.grpc.board.BoardRequest) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardResponse>) responseObserver);
          break;
        case METHODID_BOARD_READ:
          serviceImpl.boardRead((com.example.demo.grpc.board.BoardId) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardStatus>) responseObserver);
          break;
        case METHODID_BOARD_DELETE:
          serviceImpl.boardDelete((com.example.demo.grpc.board.BoardId) request,
              (io.grpc.stub.StreamObserver<com.example.demo.grpc.board.BoardStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BoardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BoardServiceBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.grpc.board.Board.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BoardService");
    }
  }

  private static final class BoardServiceFileDescriptorSupplier
      extends BoardServiceBaseDescriptorSupplier {
    BoardServiceFileDescriptorSupplier() {}
  }

  private static final class BoardServiceMethodDescriptorSupplier
      extends BoardServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BoardServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BoardServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BoardServiceFileDescriptorSupplier())
              .addMethod(getBoardInsertMethod())
              .addMethod(getBoardUpdateMethod())
              .addMethod(getBoardReadMethod())
              .addMethod(getBoardDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
