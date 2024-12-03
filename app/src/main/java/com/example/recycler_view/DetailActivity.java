package com.example.recycler_view;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView dogImageDetail = findViewById(R.id.dogImageDetail);
        TextView dogNameDetail = findViewById(R.id.dogNameDetail);
        TextView dogDescriptionDetail = findViewById(R.id.dogDescriptionDetail);

        DogBreed dogBreed = (DogBreed) getIntent().getSerializableExtra("dogBreed");
        if (dogBreed != null) {
            dogNameDetail.setText(dogBreed.getName());
            dogDescriptionDetail.setText(dogBreed.getDescription());
            dogImageDetail.setImageResource(dogBreed.getImageResId());
        }
    }
}
