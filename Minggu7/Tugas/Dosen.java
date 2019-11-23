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
public class Dosen extends Manusia{
    @Override
    public void makan() {
        System.out.println("Dosen Makan 3x Sehari");
    }
    
    public void lembur() {
        System.out.println("Dosen Mendapat Kerja Lembur Tambahan");
    }
}
