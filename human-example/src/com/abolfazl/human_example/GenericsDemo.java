package com.abolfazl.human_example;


public class GenericsDemo {

    public static void main(String[] args) {
        Performer john = new Performer("John",40,Gender.MALE,1.9f);
        Performer jane = new Performer("Jane",34, Gender.FEMALE,1.591f);

        Pair <Performer, Performer> performerPair = Pair.of(john,jane);
        System.out.println(performerPair);

        Pair <String, String> stringPair = Pair.of("John","Jane");
        System.out.println(stringPair);

        Pair <String, Performer> spPair = Pair.of("John", john);
        System.out.println(spPair);

        System.out.println("All Good");
    }
}
