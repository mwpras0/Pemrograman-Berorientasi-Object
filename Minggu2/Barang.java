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
public class Barang {
    String namaBrg;
    String jenisBrg;
    int stok;
    
    public void tampilBarang(){
        System.out.println("Nama Barang     : "+namaBrg);
        System.out.println("Jenis barang    : "+jenisBrg);
        System.out.println("Stok            : "+stok);        
    }
    
    public int tambahStok(int brgMasuk){
        int stokbaru = brgMasuk+stok;
        return brgMasuk;
    }
}
