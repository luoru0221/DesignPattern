package com.rul.designpattern.factory.abstractfactory;

/**
 * 具体产品角色
 * M416枪械类
 *
 * @author LuoRu
 */
public class M416Gun implements Gun {
    @Override
    public void shoot() {
        System.out.println("M416 shoot...");
    }
}
