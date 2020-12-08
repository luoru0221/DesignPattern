package com.rul.designpattern.builder;

/**
 * 指挥者
 * 统一指挥建造者去建造赛车，具体建造者由用户指定
 *
 * @author LuoRu
 */
public class BuilderDirector {

    private RaceCarBuilder builder;

    public void setBuilder(RaceCarBuilder builder) {
        this.builder = builder;
    }

    /**
     * 建造过程
     *
     * @return RaceCar
     */
    public RaceCar construct() {
        builder.buildBody();
        builder.buildEngine();
        builder.buildTire();
        builder.buildGearbox();
        return builder.getRaceCar();
    }
}
