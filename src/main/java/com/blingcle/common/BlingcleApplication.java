package com.blingcle.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableWebSocketMessageBroker
public class BlingcleApplication { //extends AbstractWebSocketMessageBrokerConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(BlingcleApplication.class, args);
    }

//    /**
//     * 注册STOMP协议的节点（endpoint），并映射的指定的URL
//     *
//     * @param stompEndpointRegistry
//     */
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
//        //注册一个STOMP的endpoint，并指定使用SockJS协议
//        stompEndpointRegistry.addEndpoint("/endpointWisely").withSockJS();
//    }
//
//    /**
//     * 配置消息代理（MessageBroker）
//     *
//     * @param registry
//     */
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        //广播式应配置一个/topic消息代理
//        registry.enableSimpleBroker("/topic");
//
//    }
}
