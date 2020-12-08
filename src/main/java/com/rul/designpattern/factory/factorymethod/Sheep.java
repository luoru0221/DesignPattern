package com.rul.designpattern.factory.factorymethod;

/**
 * 具体产品角色
 *
 * @author LuoRu
 */
public class Sheep implements Animal {

    public Sheep() {
        System.out.println("new Sheep");
    }

    @Override
    public void sound() {
        System.out.println("baa~~~");
    }
}