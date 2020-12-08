package com.rul.designpattern.factory.simplefactory;

/**
 * 简单工厂类
 *
 * @author LuoRu
 */
public class ShapeFactory {

    public static Shape createShape(String type) {
        if (type == null) {
            return null;
        } else if (type.equals("Circle")) {
            return new Circle();
        } else if (type.equals("Rectangle")) {
            return new Rectangle();
        } else if (type.equals("Triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}
