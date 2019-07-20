package com.abolfazl.human_example;

import java.util.List;

public interface Musician extends Artist {
    String getMusicSchool();
    void setMusicSchool(String musicSchool);
    List<String> getSongs();
    void getSongs(List<String> songs);
    String getGener();
    void setGenere();

//This is for when you are a class
//    private String name;
//    private int age;
//    private float height;
//    private String musicSchool;
//    private String genre;
//    private List<String> songs;
//
//
//    public Musician(String name, int age,Gender gender, float height, String musicSchool, String genre){
//        super (name,age,gender,height);
//        this.musicSchool=musicSchool;
//        this.genre=genre;
//    }
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
//    public String getMusicSchool() {
//        return musicSchool;
//    }
//
//    public void setMusicSchool(String musicSchool) {
//        this.musicSchool = musicSchool;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public List<String> getSongs() {
//        return songs;
//    }
//
//    public void setSongs(List<String> songs) {
//        this.songs = songs;
//    }
}


