package com.rul.designpattern.strategy;

import java.util.Arrays;

/**
 * 将Comparator接口作为排序器的sort方法的参数
 *
 * @param <T>需排序的对象数组的类型
 * @author LuoRu
 */
public class Sorter03<T> {

    public void sort(T[] array, Comparator<T> comparator) {

        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            int j = i;
            while (j > 0 && comparator.compare(temp, array[j - 1]) < 0) {
                //元素向后移动
                array[j] = array[j - 1];
                j--;
            }

            //插入元素
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        Cat[] cats = new Cat[]{new Cat(3, 3), new Cat(1, 1),
                new Cat(4, 4), new Cat(5, 5), new Cat(2, 2)};

        Sorter03<Cat> sorter = new Sorter03<>();

        sorter.sort(cats, ((t1, t2) -> t1.age - t2.age));
        System.out.println("按照age从小到大排序:" + Arrays.toString(cats));

        sorter.sort(cats, ((t1, t2) -> t2.weight - t1.weight));
        System.out.println("按照weight从大到小排序:" + Arrays.toString(cats));
    }
}
