/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa_beta_hesapla;


import java.util.*;

/**
 *
 * @author Alperen
 */
public class Alfa_Beta_Hesapla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alfa alfa1 = new Alfa();
        Beta beta1 = new Beta();
        alfa1.metineCevir();
        beta1.metineCevir();
        Nesneler Abstract = new Nesneler();
        Abstract.sonuc();
    }

}
