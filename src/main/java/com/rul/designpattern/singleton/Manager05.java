package com.rul.designpattern.singleton;

/**
 * 懒汉式双重判断加锁
 * 优点：只有使用到才会实例化一个对象,多线程环境下能保证单例
 * 缺点：写法稍复杂，不能防止反序列化
 *
 * @author LuoRu
 */
public class Manager05 {
    //volatile防止指令重排序
    private static volatile Manager05 INSTANCE;

    //构造方法私有化
    private Manager05() {
    }

    //双重判断加锁
    public static Manager05 getInstance() {
        //外层判断保证只有未实例化时才加锁
        if (INSTANCE == null) {
            synchronized (Manager05.class) {
                //内层判断防止多线程环境下不止实例化一个对象
                if (INSTANCE == null) {
                    INSTANCE = new Manager05();
                }
            }
        }
        return INSTANCE;
    }

    //成员方法
    public void method() {

    }
}
