package com.rul.designpattern.builder;

/**
 * 赛车产品类
 *
 * @author LuoRu
 */
public class RaceCar {

    //车身
    private String body;
    //发动机
    private String engine;
    //轮胎
    private String tire;
    //变速箱
    private String gearbox;

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }
}
