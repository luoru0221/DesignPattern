package com.rul.designpattern.factory.abstractfactory;

/**
 * 具体产品角色
 * M416子弹类
 *
 * @author LuoRu
 */
public class M416Bullet implements Bullet {
    @Override
    public void describe() {
        System.out.println("M416 Bullet");
    }
}
