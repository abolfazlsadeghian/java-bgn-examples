package com.abolfazl.human_example;

import java.util.List;

public class Performer extends Human implements Actor, Musician {
    public Performer(String name, int age, Gender gender, float height) {
        super(name, age, gender, height);
    }

    @Override
    public String getActingSchool() {
        return null;
    }

    @Override
    public void setActingSchool(String actingSchool) {

    }

    @Override
    public List<String> getFilms() {
        return null;
    }

    @Override
    public void setFilms(List<String> films) {

    }

    @Override
    public void addFilm(String fileName) {

    }

    @Override
    public int getTimeToLive() {
        return 0;
    }

    @Override
    public String getMusicSchool() {
        return null;
    }

    @Override
    public void setMusicSchool(String musicSchool) {

    }

    @Override
    public List<String> getSongs() {
        return null;
    }

    @Override
    public void getSongs(List<String> songs) {

    }

    @Override
    public String getGener() {
        return null;
    }

    @Override
    public void setGenere() {

    }
}
