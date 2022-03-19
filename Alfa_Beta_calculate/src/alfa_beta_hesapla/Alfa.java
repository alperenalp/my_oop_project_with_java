/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa_beta_hesapla;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Alfa extends Nesneler{
    
    public int sayac1 = 0;
    public int deger1;
    public int deger2;
    public int toplam1;

    public void sonuc(int a, int b) {
        int sonuc = deger1 * deger2;
        toplam1 = toplam1 + sonuc;
        System.out.println("Alfa: " + sonuc);
    }

    public void metineCevir() {
        try {
            File file1 = new File("Giris.txt");
            //file1.createNewFile();
            FileWriter yazici = new FileWriter(file1);
            Scanner klavye = new Scanner(System.in);
            System.out.print("Kaç adet Alfa istiyorsunuz:");
            int adet = klavye.nextInt();
            for (int i = 0; i < adet; i++) {
                System.out.print("Alfa'nın 1.değeri: ");
                int deger1 = klavye.nextInt();
                System.out.print("Alfa'nın 2.değeri: ");
                int deger2 = klavye.nextInt();
                yazici.write("A " + deger1 + " " + deger2 + "\n");
            }
            yazici.close();
        } catch (IOException ex) {
        }
    }
    
}
