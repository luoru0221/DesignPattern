package com.rul.designpattern.factory.abstractfactory;

/**
 * 抽象工厂角色
 * 兵器工厂接口
 *
 * @author LuoRu
 */
public interface WeaponsFactory {
    Gun createGun();

    Bullet createBullet();
}
