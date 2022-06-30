package com.example.androidproje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView MerhabaMetni ;
     Button MerhabaButonu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MerhabaMetni = findViewById(R.id.txt_Merhaba);
        MerhabaButonu = findViewById(R.id.btn_Merhaba);

        MerhabaButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    MerhabaMetni.setText("Merhaba Dünya");
            }
        });

    }
}