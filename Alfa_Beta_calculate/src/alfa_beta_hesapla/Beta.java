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
public class Beta extends Nesneler {
    public int sayac2 = 0;
    public int deger3;
    public int toplam2;

    public void sonuc(int a) {
        int sonuc = 2 * deger3 * deger3;
        System.out.println("Beta: " + sonuc);
        toplam2 = toplam2 + sonuc;
    }

    public void metineCevir() {
        try {
            File file1 = new File("Giris.txt");
            FileWriter yazici = new FileWriter(file1, true);
            Scanner klavye = new Scanner(System.in);
            System.out.print("Kaç adet Beta istiyorsunuz:");
            int adet = klavye.nextInt();
            for (int i = 0; i < adet; i++) {
                System.out.print("Beta'nın 1.değeri:");
                int deger1 = klavye.nextInt();
                yazici.write("B " + deger1 + "\n");
            }
            yazici.close();
        } catch (IOException ex) {
        }
    }

    
}
