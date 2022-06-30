package com.example.androidproje;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Diziler extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* String[] personeller = new String[]{"Ali", "Ayşe", "Fatma"};
        System.out.println(personeller.length);
        System.out.println(personeller[0]);
        System.out.println(personeller[1]);
        System.out.println(personeller[2]);

        //for döngüsüyle dizi kullanımı
        for(int p = 0; p < personeller.length; p++){
            System.out.println((p+1) + "-" + personeller[p]);*/

        //while döngüsü ile dizi kullanımı
     /*   int i = 0;
        while (i < personeller.length){
            System.out.println((i+1) + "-" + personeller[i]);
            i++;
        }*/

        //for each döngüsü ile dizi kullanımı
      /* for(String personel : personeller){
            System.out.println(personel);
        }
       int[] sayilar = {10, 20, 30, 40, 50};

        for (int sayi : sayilar) {
            System.out.println(sayi);
        }
       char[] harfler = {'E', 'n', 'e', 's'};

        for(char harf: harfler){
            System.out.println(harf);
        }
      /*  float[] notlar = new float[5];
        for(int n = 0; n < notlar.length; n++){
            notlar[n] = 23.5f * (n+1);
        }

        for(float not: notlar){
            System.out.println(not);
        }*/

       /* int[] dizi = new int[10];

        for(int i = 0; i < dizi.length; i++){
            dizi[i] = ( i + 1 ) * 3;
            if(dizi[i] % 2 == 0)
           System.out.println(dizi[i]);
        }*/
//Haftanın günlerini bir dizi içine atma ve ardından ekrana for each ile tersten yazdırma
    /*    String[] gunlerim = {"Pazartesi", "Salı", "Çarşamba","Perşembe", "Cuma", "Cumartesi", "Pazar"};
        String[] gunler = new String[7];
        int tGun = (gunler.length - 1);

        for(int g = 0; g<gunlerim.length; g++){
            gunler[tGun] = gunlerim[g];
            tGun--;
        }
        for(String gun : gunler){
            System.out.println(gun);
        }*/
//char dizisi içinde aranan harfi bulup kaç adet olduğunu yazdırma:
      /*  char[] harflerim = {'e', 'n', 'e', 's', 'd', 'i', 'l', 'e', 'k'};
        char arananHarf = 'e';
        int h = 0;
        int harfMiktari= 0 ;

        while(h < harflerim.length){
            if (arananHarf == harflerim[h] ){
                harfMiktari++;
            }
            h++;
        }
        System.out.println("Dizide " + harfMiktari + " adet " + arananHarf + " harfi vardır." );
*/
        //10 elemanlı bir dizi içerisine 0 ile 100 arasındaki sayıları random olarak atayan ve 50 den büyük gelen random sayı miktarını ekrana yazdıran program.
        int[] randomSayilar = new int[10];
        int randomGelenSayi , randomMiktar = 0;
        Random random = new Random();

        for(int i = 0; i < randomSayilar.length; i++){
            randomGelenSayi = random.nextInt(100);  //5 den başlatsaydık  + 5 diyecektik en sona.
            randomSayilar[i] = randomGelenSayi;

            if(randomSayilar[i] > 50){
                randomMiktar++;
            }
        }

        for(int sayi: randomSayilar){
            System.out.println(sayi);
        }
        System.out.println("50'den büyük gelen random sayı miktarı: " + randomMiktar);

    }
}
