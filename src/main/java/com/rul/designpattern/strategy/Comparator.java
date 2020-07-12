package com.rul.designpattern.strategy;

/**
 * 比较策略接口
 *
 * @param <T>对需要进行比较对象的类型
 * @author LuoRu
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T t1, T t2);
}
