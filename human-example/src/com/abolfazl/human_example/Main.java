package com.abolfazl.human_example;

import java.util.List;

public class Main{
    public static void main(String[] args) {

        //That is for when they were classes
//        Actor abolfazl = new Actor("Abolfazl",23, Gender.UNDEFINED,1.9f,"Harvard");
//        abolfazl.setName("ABOLFAZL");
//
//        Human abolfazl_three = new Actor("Abolfazl",23,Gender.MALE,1.9f,"Monash");
//        System.out.println(abolfazl.getName());
//        Human abolfazl_two = new Musician("abolfazl",25,Gender.FEMALE,1.8f,"Monash","test");
//        abolfazl_two.setAge(42);
//        abolfazl_two.setName("ABOLFAZL SADEGHIAN");
//        System.out.println(abolfazl_two.getAge());
//        System.out.println(abolfazl_two.getTimeToLive());
//        System.out.println(abolfazl_two.getName());
//        System.out.println(abolfazl_two.getTimeToLive());

        Performer abolfaz = new Performer("Abolfazl",23,Gender.MALE,1.9f);
        System.out.println(abolfaz.isCreative());
        System.out.println(abolfaz.getName()+" "+ abolfaz.getAge() +" "+ abolfaz.getGender());

        System.out.println(Gender.FEMALE.comment());
        System.out.println(Gender.MALE.comment());
        System.out.println(Gender.UNDEFINED.comment());


    }

}
