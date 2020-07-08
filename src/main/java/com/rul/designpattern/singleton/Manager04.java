package com.rul.designpattern.singleton;

/**
 * 懒汉式加锁
 * 优点：写法简单，只有使用到才会实例化一个对象,多线程环境下能保证单例
 * 缺点：加锁影响效率，不能防止反序列化
 *
 * @author LuoRu
 */
public class Manager04 {
    private static Manager04 INSTANCE;

    //构造方法私有化
    private Manager04() {
    }

    //加锁，防止多线程环境下不止实例化一个对象问题
    public static synchronized Manager04 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Manager04();
        }
        return INSTANCE;
    }

    //成员方法
    public void method() {

    }
}
