package com.rul.designpattern.singleton;

/**
 * 懒汉式静态内部类
 * 优点：写法简单，只有使用到才会实例化一个对象,多线程环境下能保证单例
 * 缺点：不能防止反序列化
 *
 * @author LuoRu
 */
public class Manager06 {

    //使用静态内部类保证只有使用到才实例化一个对象
    private static class ManagerHolder {
        private static Manager06 INSTANCE = new Manager06();
    }

    //构造方法私有化
    private Manager06() {
    }

    public static Manager06 getInstance() {
        return ManagerHolder.INSTANCE;
    }

    //成员方法
    public void method() {

    }
}
