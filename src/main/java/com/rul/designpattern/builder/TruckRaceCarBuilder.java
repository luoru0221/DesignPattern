package com.rul.designpattern.builder;

/**
 * 卡车赛车具体建造者类
 *
 * @author LuoRu
 */
public class TruckRaceCarBuilder extends RaceCarBuilder {
    @Override
    public void buildBody() {
        this.raceCar.setBody("Truck body");
    }

    @Override
    public void buildEngine() {
        this.raceCar.setEngine("Truck engine");
    }

    @Override
    public void buildTire() {
        this.raceCar.setTire("Truck tire");
    }

    @Override
    public void buildGearbox() {
        this.raceCar.setGearbox("Truck gearbox");
    }
}
