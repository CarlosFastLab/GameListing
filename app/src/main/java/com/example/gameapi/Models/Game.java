package com.example.gameapi.Models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    int id;
    String name;
    float rating;
    int rating_top;
    String background_image;
    int metacritic;
    List<GenreList> genres = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getRating_top() {
        return rating_top;
    }

    public void setRating_top(int rating_top) {
        this.rating_top = rating_top;
    }

    public String getBackground_image() {
        return background_image;
    }

    public void setBackground_image(String background_image) {
        this.background_image = background_image;
    }

    public int getMetacritic() {
        return metacritic;
    }

    public void setMetacritic(int metacritic) {
        this.metacritic = metacritic;
    }

    public List<GenreList> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreList> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", rating_top=" + rating_top +
                ", background_image='" + background_image + '\'' +
                ", metacritic=" + metacritic + '\'' +
                ", genres=" + genres +
                 '}';
    }
}
