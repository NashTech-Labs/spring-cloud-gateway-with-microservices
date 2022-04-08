package com.spring.cloud.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

/**
 * This is the configuration act as a gateway to the first microservice and second microservice. We have done
 * the configuration to route both microservices' requests from this gateway.
 */

@Configuration
public class GatewayMicroservicesConfig {

    public RouteLocator gatewayConfig(RouteLocatorBuilder locatorBuilder) {

        return locatorBuilder.routes()
                .route(r -> r.path("/first/microservice/**")
                        .uri("http://localhost:8081/")
                )

                .route( r -> r.path("/second/microservice/**")
                        .uri("http://localhost:8082/")
                )
                .build();
    }

}
