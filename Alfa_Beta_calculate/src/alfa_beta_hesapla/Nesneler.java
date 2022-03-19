/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa_beta_hesapla;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alperen
 */
class Nesneler {

    public void sonuc() {
        try {
            Alfa alfa1 = new Alfa();
            Beta beta1 = new Beta();
            char karakter1 = 'A';
            File file1 = new File("Giris.txt");
            String okunan = null;
            Scanner okuyucu = new Scanner(file1);
            while (okuyucu.hasNext()) {
                okunan = okuyucu.next();
                if (karakter1 == okunan.charAt(0)) {
                    System.out.print(okunan + " ");
                    okunan = okuyucu.next();
                    System.out.print(okunan + " ");
                    alfa1.deger1 = Integer.valueOf(okunan);
                    okunan = okuyucu.next();
                    System.out.println(okunan + " ");
                    alfa1.deger2 = Integer.valueOf(okunan);
                    alfa1.sonuc(alfa1.deger1, alfa1.deger2);
                    alfa1.sayac1 += +1;
                } else {
                    System.out.print(okunan + " ");
                    okunan = okuyucu.next();
                    System.out.println(okunan + " ");
                    beta1.deger3 = Integer.valueOf(okunan);
                    beta1.sonuc(beta1.deger3);
                    beta1.sayac2 += 1;
                }
            }
            okuyucu.close();
            System.out.println("Oluşturulan Alfa Object Sayısı: " + alfa1.sayac1);
            System.out.println("Oluşturulan Beta Object Sayısı: " + beta1.sayac2);
            System.out.println("Alfa Toplam: " + alfa1.toplam1);
            System.out.println("Beta Toplam: " + beta1.toplam2);
            System.out.println("TOTAL Toplam: " + (alfa1.toplam1 + beta1.toplam2));
            
        } catch (FileNotFoundException ex) {

        }
    }
}
