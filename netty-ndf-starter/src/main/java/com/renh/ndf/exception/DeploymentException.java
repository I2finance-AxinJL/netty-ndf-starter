package com.renh.ndf.exception;

/**
 * @ClassName DeploymentException
 * @Description 异常处理类
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
public class DeploymentException extends Exception {

    private static final long serialVersionUID = 1L;

    public DeploymentException(String message) {
        super(message);
    }

    public DeploymentException(String message, Throwable cause) {
        super(message, cause);
    }
}