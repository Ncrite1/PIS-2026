package org.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *  MOVIE SERVICE
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.63.0)",
    comments = "Source: system.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovieServiceGrpc {

  private MovieServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "movies.MovieService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.SearchMoviesRequest,
      org.example.grpc.SearchMoviesResponse> getSearchMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchMovies",
      requestType = org.example.grpc.SearchMoviesRequest.class,
      responseType = org.example.grpc.SearchMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.SearchMoviesRequest,
      org.example.grpc.SearchMoviesResponse> getSearchMoviesMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.SearchMoviesRequest, org.example.grpc.SearchMoviesResponse> getSearchMoviesMethod;
    if ((getSearchMoviesMethod = MovieServiceGrpc.getSearchMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getSearchMoviesMethod = MovieServiceGrpc.getSearchMoviesMethod) == null) {
          MovieServiceGrpc.getSearchMoviesMethod = getSearchMoviesMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.SearchMoviesRequest, org.example.grpc.SearchMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.SearchMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.SearchMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("SearchMovies"))
              .build();
        }
      }
    }
    return getSearchMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.GetMovieRequest,
      org.example.grpc.MovieDto> getGetMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMovie",
      requestType = org.example.grpc.GetMovieRequest.class,
      responseType = org.example.grpc.MovieDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.GetMovieRequest,
      org.example.grpc.MovieDto> getGetMovieMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.GetMovieRequest, org.example.grpc.MovieDto> getGetMovieMethod;
    if ((getGetMovieMethod = MovieServiceGrpc.getGetMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMovieMethod = MovieServiceGrpc.getGetMovieMethod) == null) {
          MovieServiceGrpc.getGetMovieMethod = getGetMovieMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.GetMovieRequest, org.example.grpc.MovieDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.GetMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.MovieDto.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("GetMovie"))
              .build();
        }
      }
    }
    return getGetMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.grpc.CreateMovieRequest,
      org.example.grpc.MovieDto> getCreateMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMovie",
      requestType = org.example.grpc.CreateMovieRequest.class,
      responseType = org.example.grpc.MovieDto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.grpc.CreateMovieRequest,
      org.example.grpc.MovieDto> getCreateMovieMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.CreateMovieRequest, org.example.grpc.MovieDto> getCreateMovieMethod;
    if ((getCreateMovieMethod = MovieServiceGrpc.getCreateMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getCreateMovieMethod = MovieServiceGrpc.getCreateMovieMethod) == null) {
          MovieServiceGrpc.getCreateMovieMethod = getCreateMovieMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.CreateMovieRequest, org.example.grpc.MovieDto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.CreateMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.MovieDto.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("CreateMovie"))
              .build();
        }
      }
    }
    return getCreateMovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub>() {
        @java.lang.Override
        public MovieServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceStub(channel, callOptions);
        }
      };
    return MovieServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub>() {
        @java.lang.Override
        public MovieServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceBlockingStub(channel, callOptions);
        }
      };
    return MovieServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub>() {
        @java.lang.Override
        public MovieServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceFutureStub(channel, callOptions);
        }
      };
    return MovieServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *  MOVIE SERVICE
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void searchMovies(org.example.grpc.SearchMoviesRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.SearchMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMoviesMethod(), responseObserver);
    }

    /**
     */
    default void getMovie(org.example.grpc.GetMovieRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.MovieDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMovieMethod(), responseObserver);
    }

    /**
     */
    default void createMovie(org.example.grpc.CreateMovieRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.MovieDto> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMovieMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MovieService.
   * <pre>
   *  MOVIE SERVICE
   * </pre>
   */
  public static abstract class MovieServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MovieServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MovieService.
   * <pre>
   *  MOVIE SERVICE
   * </pre>
   */
  public static final class MovieServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MovieServiceStub> {
    private MovieServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchMovies(org.example.grpc.SearchMoviesRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.SearchMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMovie(org.example.grpc.GetMovieRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.MovieDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMovie(org.example.grpc.CreateMovieRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.MovieDto> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMovieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MovieService.
   * <pre>
   *  MOVIE SERVICE
   * </pre>
   */
  public static final class MovieServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MovieServiceBlockingStub> {
    private MovieServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc.SearchMoviesResponse searchMovies(org.example.grpc.SearchMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.MovieDto getMovie(org.example.grpc.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.MovieDto createMovie(org.example.grpc.CreateMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMovieMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MovieService.
   * <pre>
   *  MOVIE SERVICE
   * </pre>
   */
  public static final class MovieServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MovieServiceFutureStub> {
    private MovieServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.SearchMoviesResponse> searchMovies(
        org.example.grpc.SearchMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.MovieDto> getMovie(
        org.example.grpc.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.MovieDto> createMovie(
        org.example.grpc.CreateMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_MOVIES = 0;
  private static final int METHODID_GET_MOVIE = 1;
  private static final int METHODID_CREATE_MOVIE = 2;

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
        case METHODID_SEARCH_MOVIES:
          serviceImpl.searchMovies((org.example.grpc.SearchMoviesRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.SearchMoviesResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIE:
          serviceImpl.getMovie((org.example.grpc.GetMovieRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.MovieDto>) responseObserver);
          break;
        case METHODID_CREATE_MOVIE:
          serviceImpl.createMovie((org.example.grpc.CreateMovieRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.MovieDto>) responseObserver);
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
          getSearchMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.grpc.SearchMoviesRequest,
              org.example.grpc.SearchMoviesResponse>(
                service, METHODID_SEARCH_MOVIES)))
        .addMethod(
          getGetMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.grpc.GetMovieRequest,
              org.example.grpc.MovieDto>(
                service, METHODID_GET_MOVIE)))
        .addMethod(
          getCreateMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.grpc.CreateMovieRequest,
              org.example.grpc.MovieDto>(
                service, METHODID_CREATE_MOVIE)))
        .build();
  }

  private static abstract class MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.MoviesProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieService");
    }
  }

  private static final class MovieServiceFileDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier {
    MovieServiceFileDescriptorSupplier() {}
  }

  private static final class MovieServiceMethodDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MovieServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MovieServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieServiceFileDescriptorSupplier())
              .addMethod(getSearchMoviesMethod())
              .addMethod(getGetMovieMethod())
              .addMethod(getCreateMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}
