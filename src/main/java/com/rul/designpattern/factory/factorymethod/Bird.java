package com.rul.designpattern.factory.factorymethod;

/**
 * 具体产品角色
 *
 * @author LuoRu
 */
public class Bird implements Animal {

    public Bird() {
        System.out.println("new Bird");
    }

    @Override
    public void sound() {
        System.out.println("chirp~~~");
    }
}
