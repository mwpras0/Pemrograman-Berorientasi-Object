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
public class BarangTest {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        
        brg1.namaBrg ="pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        
        System.out.println("Stok baru adalah  "+brg1.tambahStok(20));
    }
}
