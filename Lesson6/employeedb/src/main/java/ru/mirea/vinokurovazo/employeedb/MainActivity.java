package ru.mirea.vinokurovazo.employeedb;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listViewHeroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewHeroes = findViewById(R.id.listViewHeroes);

        AppDatabase db = App.getInstance().getDatabase();

        if (db.superheroDao().getAll().isEmpty()) {
            db.superheroDao().insert(new Superhero("Batman", "Detective Skills", "Gotham City"));
            db.superheroDao().insert(new Superhero("Superman", "Super Strength", "Metropolis"));
            db.superheroDao().insert(new Superhero("Wonder Woman", "Superhuman Abilities", "Themyscira"));
        }

        List<Superhero> heroes = db.superheroDao().getAll();
        List<String> heroDescriptions = new ArrayList<>();

        for (Superhero h : heroes) {
            heroDescriptions.add(h.name + " : " + h.superpower + ", " + h.city);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                heroDescriptions
        );
        listViewHeroes.setAdapter(adapter);
    }
}