package com.demo.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author Rosemary
 * @title: GateWayFilter
 * @projectName cloud2020
 * @description: gateway过滤
 * @date 2020/11/2717:23
 */
@Component
public class GateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("----------------------------------------come in----------------------------------------");
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if(uname == null){
            System.out.println("用户名为null");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    /**
     * 顺序控制
     * */
    @Override
    public int getOrder() {
        return 0;
    }
}
