package com.rul.designpattern.factory.abstractfactory;

/**
 * 具体产品角色
 * AK子弹类
 *
 * @author LuoRu
 */
public class AKBullet implements Bullet {
    @Override
    public void describe() {
        System.out.println("AK Bullet");
    }
}
