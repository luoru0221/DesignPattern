package com.rul.designpattern.factory.abstractfactory;

/**
 * 具体产品角色
 * AK枪械类
 *
 * @author LuoRu
 */
public class AKGun implements Gun {
    @Override
    public void shoot() {
        System.out.println("AK shoot...");
    }
}
