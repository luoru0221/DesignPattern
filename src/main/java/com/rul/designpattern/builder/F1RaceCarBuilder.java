package com.rul.designpattern.builder;

/**
 * 方程式赛车具体建造者类
 *
 * @author LuoRu
 */
public class F1RaceCarBuilder extends RaceCarBuilder {
    @Override
    public void buildBody() {
        this.raceCar.setBody("F1 body");
    }

    @Override
    public void buildEngine() {
        this.raceCar.setEngine("F1 engine");
    }

    @Override
    public void buildTire() {
        this.raceCar.setTire("F1 tire");
    }

    @Override
    public void buildGearbox() {
        this.raceCar.setGearbox("F1 gearbox");
    }
}
