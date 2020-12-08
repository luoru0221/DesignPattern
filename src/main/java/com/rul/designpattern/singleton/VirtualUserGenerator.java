package com.rul.designpattern.singleton;

/**
 * 枚举类写法
 * 优点：多线程下能保证单例，能防止反序列化
 * 缺点：不容易理解
 *
 * @author LuoRu
 */
public enum VirtualUserGenerator {
    //使用VirtualUserGenerator.INSTANCE.method()调用成员方法
    INSTANCE;

    //成员方法
    public void method() {
        System.out.println("枚举类单例模式");
    }
}