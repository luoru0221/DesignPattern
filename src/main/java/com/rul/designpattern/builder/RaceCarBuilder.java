package com.rul.designpattern.builder;

/**
 * 赛车抽象建造者类
 *
 * @author LuoRu
 */
public abstract class RaceCarBuilder {

    protected RaceCar raceCar = new RaceCar();

    public abstract void buildBody();

    public abstract void buildEngine();

    public abstract void buildTire();

    public abstract void buildGearbox();

    public RaceCar getRaceCar() {
        return this.raceCar;
    }
}
