package com.rul.designpattern.singleton;

/**
 * 枚举类
 * 优点：多线程下能保证单例，能防止反序列化
 * 缺点：不容易理解
 *
 * @author LuoRu
 */
public enum Manager07 {
    //使用Manager07.INSTANCE.method()调用成员方法
    INSTANCE;

    //成员方法
    public void method() {

    }
}
