package org.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *  WATCHLIST SERVICE
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: system.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WatchlistServiceGrpc {

  private WatchlistServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "movies.WatchlistService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.AddToWatchlistRequest,
      org.example.grpc.WatchlistDto> getAddToWatchlistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddToWatchlist",
      requestType = org.example.grpc.AddToWatchlistRequest.class,
      responseType = org.example.grpc.WatchlistDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.AddToWatchlistRequest,
      org.example.grpc.WatchlistDto> getAddToWatchlistMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.AddToWatchlistRequest, org.example.grpc.WatchlistDto> getAddToWatchlistMethod;
    if ((getAddToWatchlistMethod = WatchlistServiceGrpc.getAddToWatchlistMethod) == null) {
      synchronized (WatchlistServiceGrpc.class) {
        if ((getAddToWatchlistMethod = WatchlistServiceGrpc.getAddToWatchlistMethod) == null) {
          WatchlistServiceGrpc.getAddToWatchlistMethod = getAddToWatchlistMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.AddToWatchlistRequest, org.example.grpc.WatchlistDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddToWatchlist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.AddToWatchlistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.WatchlistDto.getDefaultInstance()))
              .setSchemaDescriptor(new WatchlistServiceMethodDescriptorSupplier("AddToWatchlist"))
              .build();
        }
      }
    }
    return getAddToWatchlistMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.GetWatchlistRequest,
      org.example.grpc.WatchlistDto> getGetWatchlistMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWatchlist",
      requestType = org.example.grpc.GetWatchlistRequest.class,
      responseType = org.example.grpc.WatchlistDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.GetWatchlistRequest,
      org.example.grpc.WatchlistDto> getGetWatchlistMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.GetWatchlistRequest, org.example.grpc.WatchlistDto> getGetWatchlistMethod;
    if ((getGetWatchlistMethod = WatchlistServiceGrpc.getGetWatchlistMethod) == null) {
      synchronized (WatchlistServiceGrpc.class) {
        if ((getGetWatchlistMethod = WatchlistServiceGrpc.getGetWatchlistMethod) == null) {
          WatchlistServiceGrpc.getGetWatchlistMethod = getGetWatchlistMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.GetWatchlistRequest, org.example.grpc.WatchlistDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWatchlist"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.GetWatchlistRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.WatchlistDto.getDefaultInstance()))
              .setSchemaDescriptor(new WatchlistServiceMethodDescriptorSupplier("GetWatchlist"))
              .build();
        }
      }
    }
    return getGetWatchlistMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WatchlistServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatchlistServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatchlistServiceStub>() {
        @java.lang.Override
        public WatchlistServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatchlistServiceStub(channel, callOptions);
        }
      };
    return WatchlistServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WatchlistServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatchlistServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatchlistServiceBlockingStub>() {
        @java.lang.Override
        public WatchlistServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatchlistServiceBlockingStub(channel, callOptions);
        }
      };
    return WatchlistServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WatchlistServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WatchlistServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WatchlistServiceFutureStub>() {
        @java.lang.Override
        public WatchlistServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WatchlistServiceFutureStub(channel, callOptions);
        }
      };
    return WatchlistServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *  WATCHLIST SERVICE
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void addToWatchlist(org.example.grpc.AddToWatchlistRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.WatchlistDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddToWatchlistMethod(), responseObserver);
    }

    /**
     */
    default void getWatchlist(org.example.grpc.GetWatchlistRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.WatchlistDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWatchlistMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WatchlistService.
   * <pre>
   *  WATCHLIST SERVICE
   * </pre>
   */
  public static abstract class WatchlistServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WatchlistServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WatchlistService.
   * <pre>
   *  WATCHLIST SERVICE
   * </pre>
   */
  public static final class WatchlistServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WatchlistServiceStub> {
    private WatchlistServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchlistServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatchlistServiceStub(channel, callOptions);
    }

    /**
     */
    public void addToWatchlist(org.example.grpc.AddToWatchlistRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.WatchlistDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddToWatchlistMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWatchlist(org.example.grpc.GetWatchlistRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.WatchlistDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWatchlistMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WatchlistService.
   * <pre>
   *  WATCHLIST SERVICE
   * </pre>
   */
  public static final class WatchlistServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WatchlistServiceBlockingStub> {
    private WatchlistServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchlistServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatchlistServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc.WatchlistDto addToWatchlist(org.example.grpc.AddToWatchlistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddToWatchlistMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.WatchlistDto getWatchlist(org.example.grpc.GetWatchlistRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWatchlistMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WatchlistService.
   * <pre>
   *  WATCHLIST SERVICE
   * </pre>
   */
  public static final class WatchlistServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WatchlistServiceFutureStub> {
    private WatchlistServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WatchlistServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WatchlistServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.WatchlistDto> addToWatchlist(
        org.example.grpc.AddToWatchlistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddToWatchlistMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.WatchlistDto> getWatchlist(
        org.example.grpc.GetWatchlistRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWatchlistMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_TO_WATCHLIST = 0;
  private static final int METHODID_GET_WATCHLIST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_TO_WATCHLIST:
          serviceImpl.addToWatchlist((org.example.grpc.AddToWatchlistRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.WatchlistDto>) responseObserver);
          break;
        case METHODID_GET_WATCHLIST:
          serviceImpl.getWatchlist((org.example.grpc.GetWatchlistRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.WatchlistDto>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddToWatchlistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.grpc.AddToWatchlistRequest,
              org.example.grpc.WatchlistDto>(
                service, METHODID_ADD_TO_WATCHLIST)))
        .addMethod(
          getGetWatchlistMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.grpc.GetWatchlistRequest,
              org.example.grpc.WatchlistDto>(
                service, METHODID_GET_WATCHLIST)))
        .build();
  }

  private static abstract class WatchlistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WatchlistServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.MoviesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WatchlistService");
    }
  }

  private static final class WatchlistServiceFileDescriptorSupplier
      extends WatchlistServiceBaseDescriptorSupplier {
    WatchlistServiceFileDescriptorSupplier() {}
  }

  private static final class WatchlistServiceMethodDescriptorSupplier
      extends WatchlistServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WatchlistServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WatchlistServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WatchlistServiceFileDescriptorSupplier())
              .addMethod(getAddToWatchlistMethod())
              .addMethod(getGetWatchlistMethod())
              .build();
        }
      }
    }
    return result;
  }
}
