/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4.Tugas;

/**
 *
 * @author mwpras
 */
public class Grab {
     public static void main(String[] args) {
        
        System.out.println();
        Kendaraan k1 = new Kendaraan();
        k1.setMerek("Motor Vario");
        k1.setPlatnomor("N 1234 AB");
        k1.info();
        
        System.out.println();
        Tujuan t1 = new Tujuan();
        t1.setBiaya(10000);
        t1.setTujuan("Polinema");
        t1.setAwal("Sengkaling");
        t1.info();
        
        Driver d1 = new Driver();
        d1.setNama("Ojan");
        d1.setKendaraan(k1);
        d1.setTujuan(t1);
        d1.info();
        
        System.out.println();
        Penumpang p1 = new Penumpang();
        p1.setNama("Bunga");
        p1.setDriver(d1);
        p1.setKendaraan(k1);
        p1.setTujuan(t1);
        p1.info();
    }
}
