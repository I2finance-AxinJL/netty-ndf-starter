package com.renh.ndf.pojo;

/**
 * @ClassName PojoPathParam
 * @Description 封装class和类别对应实体类
 * @Author AxinJL
 * @Date 2019/9/27 2:50 PM
 * @Version
 **/
public class PojoPathParam {

    private final Class<?> type;
    private final String name;

    public PojoPathParam(Class<?> type, String name) {
        this.type = type;
        this.name = name;
    }

    public Class<?> getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
