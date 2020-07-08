package com.rul.designpattern.singleton;

/**
 * 饿汉式
 * 优点：写法简单
 * 缺点：即使不使用也会实例化一个对象，不能防止反序列化
 *
 * @author LuoRu
 */
public class Manager01 {
    private static Manager01 INSTANCE = new Manager01();

    //构造方法私有化
    private Manager01() {
    }

    public static Manager01 getInstance() {
        return INSTANCE;
    }

    //成员方法
    public void method() {

    }
}
