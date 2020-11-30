package com.demo.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rosemary
 * @title: GatewayConfig
 * @projectName cloud2020
 * @description: gateway配置
 * @date 2020/11/2716:27
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//转发网址
        routes.route("path_route_atguigu",
                r -> r.path("/guoji")//这个path是访问地址后面的后缀，比如localhost:9527/guonei
                        .uri("http://news.baidu.com/guoji")).build();

        return routes.build();
    }

//    @Bean
//    public RouteLocator customerRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
////转发网址
//        routes.route("path_route_atguigu",
//                r -> r.path("/guonji")//这个path是访问地址后面的后缀，比如localhost:9527/guonei
//                        .uri("http://news.baidu.com/guonji")).build();
//
//        return routes.build();
//    }

}
