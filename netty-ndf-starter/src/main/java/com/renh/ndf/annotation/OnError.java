package com.renh.ndf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName OnError
 * @Description 当weboscket发生异常时调用，入参为Session、Throwable
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OnError {
}