package com.rul.designpattern.factory.simplefactory;

/**
 * 抽象产品
 *
 * @author LuoRu
 */
public interface Shape {
}


/**
 * 具体产品
 *
 * @author LuoRu
 */
class Circle implements Shape {
    Circle() {
        System.out.println("circle");
    }
}

class Rectangle implements Shape {
    Rectangle() {
        System.out.println("rectangle");
    }
}

class Triangle implements Shape {
    Triangle() {
        System.out.println("triangle");
    }
}
