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
public class Driver {
    private String nama;
    private Kendaraan kendaraan;
    private Tujuan tujuan;
    
    public Driver(){
        
    }

    public Driver(String nama, Kendaraan kendaraan, Tujuan tujuan) {
        this.nama = nama;
        this.kendaraan = kendaraan;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Tujuan getTujuan() {
        return tujuan;
    }

    public void setTujuan(Tujuan tujuan) {
        this.tujuan = tujuan;
    }
    
    public void info() {
        System.out.println("Nama Driver : "+ this.nama);
        System.out.println("Kendaraan : "+ this.kendaraan.info());
        System.out.println("Tujuan : "+ this.tujuan.info());
    }   
}