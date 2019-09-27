package com.renh.ndf.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName ServerEndpoint
 * @Description 注解参数
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ServerEndpoint {

    /* 路径 */
    @AliasFor("path")
    String value() default "/";

    /* 值域 */
    @AliasFor("value")
    String path() default "/";

    /* ip */
    String host() default "0.0.0.0";

    /* 端口 */
    int port() default 80;

    /* 正在获取连接的loop */
    int bossLoopGroupThreads() default 0;

    /* 已经过去连接的loop */
    int workerLoopGroupThreads() default 0;

    boolean useCompressionHandler() default false;

    /* 前缀 */
    String prefix() default "";

    /* 超时时间 */
    int optionConnectTimeoutMillis() default 30000;

    /* 三次握手连接等待队列值 */
    int optionSoBacklog() default 128;

    /* 最大分片数 */
    int childOptionWriteSpinCount() default 16;

    /* 写时缓冲区上水位 */
    int childOptionWriteBufferHighWaterMark() default 64 * 1024;

    /* 写时缓冲区下水位 */
    int childOptionWriteBufferLowWaterMark() default 32 * 1024;

    /* 接收缓冲区大小 */
    int childOptionSoRcvbuf() default -1;

    /* 发送缓冲区大小 */
    int childOptionSoSndbuf() default -1;

    /* 是否开启nagle算法 */
    boolean childOptionTcpNodelay() default true;

    /* 是否开启心跳，心跳2小时 */
    boolean childOptionSoKeepalive() default false;

    /*  */
    int childOptionSoLinger() default -1;

    /* 客户端连接关闭服务端连接是否保持 */
    boolean childOptionAllowHalfClosure() default false;

    /* 读超时时间，单位秒 */
    int readerIdleTimeSeconds() default 0;

    /* 写超时时间，单位秒 */
    int writerIdleTimeSeconds() default 0;

    /* 读写超时时间，单位秒 */
    int allIdleTimeSeconds() default 0;

    /* 最大帧载荷 */
    int maxFramePayloadLength() default 65536;

}
