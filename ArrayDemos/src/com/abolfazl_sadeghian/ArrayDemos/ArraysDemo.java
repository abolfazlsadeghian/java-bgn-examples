package com.abolfazl_sadeghian.ArrayDemos;

import java.lang.reflect.Array;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {

        int array[] = new int[2];
        array[0] = 5;
        array[1] = 7;

        int another[] = {1, 4, 3, 2, 5};

        if (array == null) {
            System.out.println("Array is unusable");

        } else {

            System.out.println("Array was initialized with ");
        }


        abolfazl(array);
        abolfazl(another);


    }


    public static void abolfazl(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array[" + i + "]" + array[i]);

        }

        System.out.println("=======================");
    }

}
