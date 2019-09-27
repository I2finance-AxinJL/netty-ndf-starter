package com.renh.ndf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName OnBinary
 * @Description 当weboscket接收到二进制信息时调用，入参为Session、byte[]
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OnBinary {
}