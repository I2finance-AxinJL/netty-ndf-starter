package com.renh.ndf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName OnEvent
 * @Description 当netty触发时调用，入参为Session、Object
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OnEvent {
}