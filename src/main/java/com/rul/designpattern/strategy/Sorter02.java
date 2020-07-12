package com.rul.designpattern.strategy;

import java.util.Arrays;

/**
 * 对实现了Comparable接口的对象进行排序
 *
 * @author LuoRu
 */
public class Sorter02 {
    public void sort(Comparable[] array) {

        for (int i = 1; i < array.length; i++) {
            Comparable temp = array[i];
            int j = i;
            while (j > 0 && temp.compareTo(array[j - 1]) < 0) {
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

        Sorter02 sorter = new Sorter02();
        sorter.sort(cats);

        System.out.println(Arrays.toString(cats));
    }
}

