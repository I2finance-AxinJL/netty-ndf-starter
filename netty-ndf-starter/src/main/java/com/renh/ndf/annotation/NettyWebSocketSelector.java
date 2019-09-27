package com.renh.ndf.annotation;

import com.renh.ndf.manger.ServerEndpointExporter;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.Ordered;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName NettyWebSocketSelector
 * @Description 将websocket交给netty托管
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
public class NettyWebSocketSelector implements ImportSelector, Ordered {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return of(ServerEndpointExporter.class.getName());
    }

    private static <T> T[] of(T... values) {
        return values;
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }
}
