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
public class Barang1 {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    
    
    float hargJual(int hargaDasar, float diskon){
        float hargaJual = hargaDasar - ((diskon*hargaDasar)/100);
        return hargaJual;
    }
    
    void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : "+hargaDasar);
        System.out.println("Diskon : "+diskon+" %");
    }
}
