package com.Gomes.ScreenMatch.Models;

import com.Gomes.ScreenMatch.Domain.Movie.dadosRegisterMovie;

public class Movies {
    private String name;
    private Integer duration;
    private Integer realeaseDate;
    private String gender;

    public Movies(dadosRegisterMovie dados) {
        this.name = dados.name();
        this.duration = dados.duration();
        this.realeaseDate = dados.realeaseDate();
        this.gender = dados.gender();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getRealeaseDate() {
        return realeaseDate;
    }

    public void setRealeaseDate(Integer realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Movie {" + "name = ( " + name + " )" +
                ", duration = " + duration +
                "min, realease date = " + realeaseDate +
                ", gender = " + gender +
                " }";
    }
}
