package com.example.androidproje;
import android.view.View;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class KontrolYapilari extends AppCompatActivity {


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int tekHaneli = 100, ciftHaneli = 150, odaNo = 8, gun = 2;
        int toplamFiyat = 0;

        if(odaNo % 2 == 0){
            switch (gun){
                case 1 :
                    toplamFiyat = (ciftHaneli * odaNo) * gun;
                    break;
                case 2 :
                    toplamFiyat = (ciftHaneli * odaNo) * gun;
                    break;
                case 3 :
                    toplamFiyat = (ciftHaneli * odaNo) * gun;
                    break;
                case 4 :
                    toplamFiyat = (ciftHaneli * odaNo) * gun;
                    break;
            }
        }else{
            switch (gun){
                case 1 :
                    toplamFiyat = (tekHaneli * odaNo) * gun;
                    break;
                case 2 :
                    toplamFiyat = (tekHaneli * odaNo) * gun;
                    break;
                case 3 :
                    toplamFiyat = (tekHaneli * odaNo) * gun;
                    break;
                case 4 :
                    toplamFiyat = (tekHaneli * odaNo) * gun;
                    break;
            }
        }
        System.out.println(toplamFiyat);

    }
}
