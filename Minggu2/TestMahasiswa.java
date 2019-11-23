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
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        
        mhs.nim=161;
        mhs.nama="Lestari";
        mhs.alamat="Jl. Vinolia No 1A";
        mhs.kelas="1A";
        mhs.tampilBiodata();
        System.out.println("-----------------");
        mhs1.nim=162;
        mhs1.nama="Lilian";
        mhs1.alamat="Jl. Ninaja No 23";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        System.out.println("-----------------");
        mhs2.nim=163;
        mhs2.nama="Mentari";
        mhs2.alamat="Jl. Vinolia No 5A";
        mhs2.kelas="1A";
        mhs2.tampilBiodata();
        System.out.println("-----------------");
    }
}
