package com.example.gameapi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import com.example.gameapi.Models.Game;
import com.example.gameapi.Services.ApiService;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tv_response;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_response = (TextView)findViewById(R.id.tv_response);

        Tarefa tarefa = new Tarefa();
        tarefa.execute("https://api.rawg.io/api/games?b33f7488ac3d4c268808a11ddf44579a&page_size=5");
    }

    @SuppressLint(value = "StaticFieldLeak")
    protected class Tarefa extends AsyncTask<String, String, List<Game>> {
        @Override
        protected List<Game> doInBackground(String... strings) {
            ApiService http= new ApiService();
            List<Game> retorno;
            retorno = http.search(strings[0]);
            return retorno;
        }

        @Override
        protected void onPostExecute(List<Game> s) {
            tv_response.setText(s.get(1).getName());
        }
    }
}