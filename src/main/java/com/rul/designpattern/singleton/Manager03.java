package com.rul.designpattern.singleton;

/**
 * 懒汉式
 * 优点：写法简单，只有使用到才会实例化一个对象
 * 缺点：多线程环境下不能保证单例，不能防止反序列化
 *
 * @author LuoRu
 */
public class Manager03 {
    private static Manager03 INSTANCE;

    //构造方法私有化
    private Manager03() {
    }

    public static Manager03 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Manager03();
        }
        return INSTANCE;
    }

    //成员方法
    public void method() {

    }
}
