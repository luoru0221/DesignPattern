package com.rul.designpattern.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        WeaponsFactory akFactory = new AKFactory();
        Gun akGun = akFactory.createGun();
        Bullet akBullet = akFactory.createBullet();
        akGun.shoot();
        akBullet.describe();

        WeaponsFactory m416Factory = new M416Factory();
        Gun m416Gun = m416Factory.createGun();
        Bullet m416Bullet = m416Factory.createBullet();
        m416Gun.shoot();
        m416Bullet.describe();

    }
}
