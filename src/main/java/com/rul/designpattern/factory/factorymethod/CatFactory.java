package com.rul.designpattern.factory.factorymethod;

/**
 * 具体工厂角色
 *
 * @author LuoRu
 */
public class CatFactory implements AnimalFactory {
    @Override
    public Animal create() {
        return new Cat();
    }
}
