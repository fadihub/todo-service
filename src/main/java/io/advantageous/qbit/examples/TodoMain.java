package io.advantageous.qbit.examples;

import io.advantageous.qbit.server.ServiceEndpointServer;
import io.advantageous.qbit.server.EndpointServerBuilder;

public class TodoMain {

    public static void main(String... args) {
        ServiceEndpointServer server = new EndpointServerBuilder().setHost("localhost").setPort(8080).build();
        server.initServices(new TodoService());
        server.start();
    }

}