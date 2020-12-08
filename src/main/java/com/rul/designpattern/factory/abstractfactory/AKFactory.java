package com.rul.designpattern.factory.abstractfactory;

/**
 * 具体工厂角色
 * AK工厂类
 *
 * @author LuoRu
 */
public class AKFactory implements WeaponsFactory {
    @Override
    public Gun createGun() {
        return new AKGun();
    }

    @Override
    public Bullet createBullet() {
        return new AKBullet();
    }
}
