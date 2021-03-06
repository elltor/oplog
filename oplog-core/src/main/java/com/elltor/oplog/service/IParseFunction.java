package com.elltor.oplog.service;

import java.lang.reflect.Method;

/**
 * 解析函数接口
 */

public interface IParseFunction {

    /**
     * 是否在aop织入方法执行前执行，织入前执行上下文中无法使用返回值和错误消息
     *
     * @return  boolean/false
     */
    default boolean executeBefore() {
        return false;
    }

    /**
     * 返回自定义SpEL的静态方法的方法对象
     *
     * @return
     */
    Method functionMethod();

}