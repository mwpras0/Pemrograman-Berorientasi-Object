/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

/**
 *
 * @author mwpras
 */
public class LingkaranTest {
    public static void main(String[] args) {
        Lingkaran L = new Lingkaran();
        
        L.r = 4;
        L.output();
        System.out.println("Keliling : "+L.keliling());
        System.out.println("Luas     : "+L.luas());
    }
}
