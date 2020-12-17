package com.example.gameapi.Services;

import com.example.gameapi.Models.Game;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApiService {
    public List<Game> search(String uri){
        StringBuilder resposta = new StringBuilder();
        try {
            URL url = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);
            connection.setConnectTimeout(5000);
            connection.connect();

            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                resposta.append(scanner.next());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.getMessage();
            System.err.println(e.getMessage());
        }

        finally {

        }

        Type listType = new TypeToken<ArrayList<Game>>(){}.getType();
        List<Game> gameList = new Gson().fromJson(resposta.toString(), listType);

        return gameList;

//        return new Gson().fromJson(resposta.toString(), Game.class);
    }
}

