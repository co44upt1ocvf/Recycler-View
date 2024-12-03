package com.example.recycler_view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        List<DogBreed> dogBreedList = new ArrayList<>();
        dogBreedList.add(new DogBreed("Лабрадор-ретривер ", R.drawable.dog1, "Лабрадоры известны своей дружелюбностью, интеллектом и преданностью. Они отличные семейные собаки и хорошо ладят с детьми. Лабрадоры также известны своей любовью к воде и часто используются в качестве спасателей и поводырей."));
        dogBreedList.add(new DogBreed("Немецкая овчарка", R.drawable.dog2, "Немецкие овчарки — это умные, преданные и работоспособные собаки. Они часто используются в полиции, армии и в качестве поводырей. Овчарки нуждаются в регулярных физических и умственных нагрузках."));
        dogBreedList.add(new DogBreed("Золотистый ретривер", R.drawable.dog3, "Золотистые ретриверы известны своей добротой, терпением и интеллектом. Они отличные семейные собаки и хорошо ладят с детьми и другими животными. Золотистые ретриверы также часто используются в качестве терапевтических собак."));
        dogBreedList.add(new DogBreed("Бульдог", R.drawable.dog4, "Бульдоги — это спокойные, дружелюбные и преданные собаки. Они известны своим упрямством, но также очень ласковы и любят проводить время с семьей. Бульдоги нуждаются в умеренных физических нагрузках."));
        dogBreedList.add(new DogBreed("Бигль", R.drawable.dog5, "Бигли — это энергичные, любопытные и дружелюбные собаки. Они известны своим отличным обонянием и часто используются в качестве охотничьих собак. Бигли нуждаются в регулярных физических нагрузках и умственных стимулах."));
        dogBreedList.add(new DogBreed("Сибирский хаски", R.drawable.dog6, "Сибирские хаски — это энергичные, дружелюбные и независимые собаки. Они известны своей выносливостью и часто используются в качестве ездовых собак. Хаски нуждаются в регулярных физических нагрузках и умственных стимулах."));
        dogBreedList.add(new DogBreed("Доберман", R.drawable.dog7, "Доберманы — это сильные, преданные и защитные собаки. Они известны своей элегантной внешностью и часто используются в качестве охранных и полицейских собак. Доберманы нуждаются в регулярных физических нагрузках и социализации."));

        RecyclerAdapter dogBreedAdapter = new RecyclerAdapter(dogBreedList);
        recyclerView.setAdapter(dogBreedAdapter);

        dogBreedAdapter.setOnItemClickListener(dogBreed -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("dogBreed", dogBreed);
            startActivity(intent);
        });
    }
}