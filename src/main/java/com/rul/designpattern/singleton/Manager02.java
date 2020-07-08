package com.rul.designpattern.singleton;

/**
 * 饿汉式
 * 优点：写法简单，与Manager01写法本质一样
 * 缺点：即使不使用也会实例化一个对象，不能防止反序列化
 *
 * @author LuoRu
 */
public class Manager02 {
    private static Manager02 INSTANCE;

    static {
        INSTANCE = new Manager02();
    }

    //构造方法私有化
    private Manager02() {
    }

    public static Manager02 getInstance() {
        return INSTANCE;
    }

    //成员方法
    public void method() {

    }
}
