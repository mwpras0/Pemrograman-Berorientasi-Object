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
public class pVideoGameTest {
    public static void main(String[] args) {
        pVideoGame pvg = new pVideoGame();
        
        pvg.id = 001;
        pvg.nama = "M. Wahyu P";
        pvg.namaGame = "Pro Evolution Soccer 2019";
        pvg.harga = 250000;
        pvg.sewa = 7;
        pvg.tampilData();
        System.out.println("Harga yang Harus dibayar : "
                +pvg.hargaDibayar()+" ribu");
    }
}
