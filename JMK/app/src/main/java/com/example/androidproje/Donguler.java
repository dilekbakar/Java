package com.example.androidproje;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Scanner;

public class Donguler extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scanner sc = new Scanner(System.in);
        int i = 0;

        /* for(i = 0; i < 10; i++){
            System.out.println(i);
        }*/

        /*while(i < 10){
            System.out.println(i);
            i++;
        }*/
        String isim = "Dilek Bakar Karali";
        int bulunanHarf = 0;

        for(char harf : isim.toCharArray()){

            if(harf == 'a'){
                bulunanHarf++;
            }
        }
        System.out.println(bulunanHarf);


    }
}
