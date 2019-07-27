package com.abolfazl.human_example;

import java.lang.reflect.Array;

public class PerformerArrayDemo {
    public static void main(String[] args) {
        Performer[] array = new Performer[2];
    array[0] = new Performer("John",40,Gender.MALE,1.9f);
    array[1] = new Performer("Juliana",35, Gender.FEMALE,1.61f);
    ListIterator(array);
    }

    public static void ListIterator (Performer [] array){
        for (int i=0; i < array.length; i++){
            System.out.println("Performer["+i+"]= "+ array[i]);
        }
    }
}
