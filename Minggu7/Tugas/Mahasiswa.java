/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu7.Tugas;

/**
 *
 * @author mwpras
 */
public class Mahasiswa extends Manusia{
    @Override
    public void makan() {
        System.out.println("Mahasiswa Makan 2x Sehari");
    }
    
    public void tidur() {
        System.out.println("Mahasiswa Tidur 8 Jam Sehari");
    }
}