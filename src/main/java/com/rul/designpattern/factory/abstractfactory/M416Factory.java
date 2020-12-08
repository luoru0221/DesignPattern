package com.rul.designpattern.factory.abstractfactory;

/**
 * 具体工厂角色
 * AK工厂类
 *
 * @author LuoRu
 */
public class M416Factory implements WeaponsFactory {
    @Override
    public Gun createGun() {
        return new M416Gun();
    }

    @Override
    public Bullet createBullet() {
        return new M416Bullet();
    }
}
