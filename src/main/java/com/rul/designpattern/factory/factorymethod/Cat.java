package com.rul.designpattern.factory.factorymethod;

/**
 * 具体产品角色
 *
 * @author LuoRu
 */
public class Cat implements Animal {

    public Cat() {
        System.out.println("new Cat");
    }

    @Override
    public void sound() {
        System.out.println("mew~~~");
    }
}
