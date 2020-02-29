package me.kay.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    private Server server;

    private void start(int port) throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new StudentServiceImpl())
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            GrpcServer.this.shutdown();
        }));
    }

    private void shutdown() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        GrpcServer server = new GrpcServer();
        server.start(50051);
        server.blockUntilShutdown();
    }
}
