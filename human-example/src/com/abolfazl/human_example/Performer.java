package com.abolfazl.human_example;

import java.util.List;

public class Performer extends Human implements Actor, Musician, Artist {

    private String musicSchool;
    private String genre;
    private List <String> songs;
    private String actingSchool;
    private List <String> films;

    @Override
    public String getSchool() {
        return musicSchool;
    }

    @Override
    public void setSchool(String school) {
        this.musicSchool=school;
    }

    public Performer(String name, int age, Gender gender, float height) {
        super(name, age, gender, height);
    }

    @Override
    public String getActingSchool() {
        return actingSchool;
    }

    @Override
    public void setActingSchool(String actingSchool) {
        this.actingSchool=actingSchool;
    }

    @Override
    public List<String> getFilms() {
        return films;
    }

    @Override
    public void setFilms(List<String> films) {
        this.films=films;
    }

    @Override
    public void addFilm(String filmName) {
        this.films.add(filmName);
    }

    @Override
    public int getTimeToLive() {
        return (LIFESPAN-getAge())/2;
    }

    @Override
    public String getMusicSchool() {
        return musicSchool;
    }

    @Override
    public void setMusicSchool(String musicSchool) {
        this.musicSchool=musicSchool;
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }

    @Override
    public void getSongs(List<String> songs) {
        this.songs=songs;
    }

    public void setSongs (List<String> songs){
        this.songs=songs;
    }

    public void addSong(String song){
        this.songs.add(song);
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public void setGenere() {
    this.genre=genre;
    }
}
