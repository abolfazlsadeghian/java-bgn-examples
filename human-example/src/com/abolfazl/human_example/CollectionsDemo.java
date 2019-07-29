package com.abolfazl.human_example;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        List objList = new ArrayList();
        objList.add("Temp");
        objList.add(Integer.valueOf(5));
        objList.add(new Performer("John",33,Gender.MALE,1.9f));

        for (Object obj : objList) {
            if (obj instanceof String) {
                System.out.println("String object = " + obj.toString());

            } else if (obj instanceof Integer) {
                Integer i = (Integer) obj;
                System.out.println("Integer object = " + obj.toString());
            } else {
                Performer p = (Performer) obj;
                System.out.println("Performer object = " + p.getName());
            }
        }
            List<String> stringList = new ArrayList<String>();
            stringList.add("One");
            stringList.add("Two");
            stringList.add("Three");

            stringList.forEach(element -> System.out.println(element));

//            for (String s: stringList){
//                System.out.println(s);
//            }

    }

}
