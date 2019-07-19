package com.abolfazl.human_example;

import java.util.List;

public interface Actor {

    String getActingSchool();
    void setActingSchool(String actingSchool);
    List<String> getFilms();
    void setFilms (List<String> films);
    void addFilm (String fileName);




//That is for when it is a class.
//    private String name;
//    private int age;
//    private float height;
//    private String actingSchool;
//    private List<String> films;
//
//
//    public Actor (String name, int age, Gender gender,float height, String actingSchool){
//        super (name,age,gender,height);
//        this.actingSchool=actingSchool;
//
//    }
//
//
//    @Override
//    public int getTimeToLive() {
//        return (LIFESPAN-getAge())/2;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public float getHeight() {
//        return height;
//    }
//
//    @Override
//    public void setHeight(float height) {
//        this.height = height;
//    }
//
//    public String getActingSchool() {
//        return actingSchool;
//    }
//
//    public void setActingSchool(String actingSchool) {
//        this.actingSchool = actingSchool;
//    }
//
//    public List<String> getFilms() {
//        return films;
//    }
//
//    public void setFilms(List<String> films) {
//        this.films = films;
//    }
}
