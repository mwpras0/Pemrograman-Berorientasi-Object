/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5.Praktikum1;

import Minggu5.Praktikum2.ClassB;

/**
 *
 * @author mwpras
 */
public class Percobaan1 {
    public static void main(String[] args) {
        ClassB hitung = new ClassB();
        
        hitung.x=20;
        hitung.y=30;
        hitung.z=5;
                
        hitung.getNilai();
        hitung.getNilaiz();
        hitung.getJumlah();
    }
}
