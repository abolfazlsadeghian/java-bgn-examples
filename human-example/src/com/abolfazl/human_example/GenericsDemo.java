package com.abolfazl.human_example;


public class GenericsDemo {

    public static void main(String[] args) {
        Performer john = new Performer("John",40,Gender.MALE,1.9f);
        Performer jane = new Performer("Jane",34, Gender.FEMALE,1.591f);

        Pair <Performer, Performer> performerPair = Pair.of(john,jane);
        System.out.println(performerPair);
    }
}
