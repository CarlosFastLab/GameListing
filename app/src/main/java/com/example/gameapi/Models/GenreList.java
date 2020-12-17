package com.example.gameapi.Models;

import java.util.ArrayList;
import java.util.List;

public class GenreList {
    List<Game> gameList = new ArrayList<>();
    int id;
    String name;

    @Override
    public String toString() {
        return "GenreList{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
