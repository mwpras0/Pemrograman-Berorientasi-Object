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
public class pVideoGame {
    int id;
    String nama;
    String namaGame;
    int harga;
    int sewa; 
   
    public void tampilData(){
        System.out.println("Id              : "+id);
        System.out.println("Nama            : "+nama);
        System.out.println("Nama Game       : "+namaGame);
        System.out.println("Harga           : "+harga);
        System.out.println("Sewa brp hari   : "+sewa);
    }
    
    public int harga(){
        return sewa*harga;
    }

    String hargaDibayar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
