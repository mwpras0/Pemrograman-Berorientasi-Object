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
public class Main {
    public static void main(String[] args) {
        Manusia m = new Manusia();
        Dosen d = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        m.makan();
        m.bernafas();
        
        d.makan();
        d.lembur();
        
        mhs.makan();
        mhs.tidur();
        
        Manusia mm = new Mahasiswa();
        mm.makan();
    }
}
