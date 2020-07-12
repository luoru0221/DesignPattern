package com.rul.designpattern.strategy;

/**
 * 规定每个需要使用Sorter02进行排序的类必须实现Comparable接口
 *
 * @param <T>实现类的类型
 * @author LuoRu
 */
@FunctionalInterface
public interface Comparable<T> {
    int compareTo(T o);
}
