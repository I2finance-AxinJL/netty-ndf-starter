package com.renh.ndf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName OnOpen
 * @Description 当websocket开启时调用，入参为Session、Httpheaders、ParameterMap
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OnOpen {
}