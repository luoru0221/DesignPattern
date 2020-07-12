package com.rul.designpattern.strategy;

/**
 * 自定义类型，我们想要通过排序器对该类型的数组进行排序
 *
 * @author LuoRu
 */
public class Cat implements Comparable<Cat> {
    int age;
    int weight;

    public Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
