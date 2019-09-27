package com.renh.ndf.autuconfigure;

import com.renh.ndf.annotation.EnableWebSocket;
import com.renh.ndf.manger.ServerEndpointExporter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;

/**
 * @ClassName NettyWebSocketAutoConfigure
 * @Description 开启netty-websocket starter
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
@EnableWebSocket
@ConditionalOnMissingBean(ServerEndpointExporter.class)
public class NettyWebSocketAutoConfigure {
}
