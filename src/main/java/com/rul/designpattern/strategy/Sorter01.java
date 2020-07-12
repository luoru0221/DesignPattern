package com.rul.designpattern.strategy;

import java.util.Arrays;

/**
 * 简单插入排序排序器
 *
 * @author LuoRu
 */
public class Sorter01 {

    public void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                //元素向后移动
                array[j] = array[j - 1];
                j--;
            }
            //插入元素
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 5, 3, 4};

        Sorter01 sorter = new Sorter01();
        sorter.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
