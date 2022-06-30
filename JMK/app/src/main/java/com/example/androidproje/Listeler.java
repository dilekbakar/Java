package com.example.androidproje;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class Listeler extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Integer[] sayilarim = {10, 20 , 30 , 40, 50, 60};
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.addAll(Arrays.asList(sayilarim)); //diziyi list'e aktarma.
        sayilar.add(121); //listeye eleman ekleme.
        //System.out.println(sayilar.get(5));

        ArrayList<String> meslekler = new ArrayList<>();
        meslekler.add("Bilgisayar Müh");
        meslekler.add("Yazılım Müh");
        meslekler.add("Endüstri Müh");
        meslekler.add("Makine Müh");
        meslekler.add("Jeoloji Müh");
        meslekler.add("Metalurji Müh");

        ArrayList<String> kullanicilar = new ArrayList<>();
        kullanicilar.add("User1");
        kullanicilar.add("User2");
        kullanicilar.add("User3");
        kullanicilar.add("User4");
       //for döngüsüyle arraylist kullanımı
     /*   for(int i = 0; i < sayilar.size(); i++){
            System.out.println(sayilar.get(i));
        }*/
      /*  int i = 0;
        while (i < sayilar.size()){
            System.out.println(sayilar.get(i));
            i++;
        }*/

        //For Each Döngüsüyle ArrayList kullanımı
       /* for(int sayi : sayilar){
            System.out.println(sayi);
        }*/

       //for döngüsüyle arraylist kullanımı
       /* for(int m = 0; m < meslekler.size(); m++){
            System.out.println(meslekler.get(m));
        }*/

        //while döngüsüyle Arraylist kullanımı
       /* int m = 0;
        while (m < meslekler.size()){
            System.out.println(meslekler.get(m));
            m++;
        }*/

        //For Each Döngüsüyle ArrayList kullanımı
       /* for (String s : meslekler){
            System.out.println(s);
        }*/

      /*boolean result = kullanicilar.contains("User33");

      if(result){
          System.out.println("Giriş Başarılı");
      }else{
          System.out.println("Giriş Başarısız");
      }*/

        int r = kullanicilar.indexOf("User33"); //bu int değeri eğer girdiyi listede bulursa bulduğu indexin değerini döndürür.bulamazsa -1 döndürür.

        if(r != -1){
            System.out.println(r);
        }else{
            System.out.println(r);
        }
    }
}
