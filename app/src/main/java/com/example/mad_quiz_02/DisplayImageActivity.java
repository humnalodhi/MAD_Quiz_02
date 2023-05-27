package com.example.mad_quiz_02;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_image);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.text_view);

        int imageResId = getIntent().getIntExtra("imageResId", 0);
        String itemText = getIntent().getStringExtra("itemText");
        imageView.setImageResource(imageResId);
        textView.setText(itemText);
    }
}
