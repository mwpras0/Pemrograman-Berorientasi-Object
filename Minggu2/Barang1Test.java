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
public class Barang1Test {
    public static void main(String[] args) {
        Barang1 b1 = new Barang1();
        
        b1.kode = "13124KTPNS";
        b1.namaBarang = "Kotak Pensil";
        b1.hargaDasar = 20000;
        b1.diskon = 50;
        b1.tampilData();
        
        System.out.println("Total Harga Yang Harus Dibayar : "+b1.hargJual(b1.hargaDasar, b1.diskon));
        
    }
}
