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
public class Penumpang {
    private String nama;
    private Driver driver;
    private Kendaraan kendaraan;
    private Tujuan tujuan;
    
    public Penumpang(){
        
    }

    public Penumpang(String nama, Driver driver, Kendaraan kendaraan, Tujuan tujuan) {
        this.nama = nama;
        this.driver = driver;
        this.kendaraan = kendaraan;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
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
        System.out.println("Nama Penumpang: "+ this.nama);
        System.out.println("Nama Driver : "+ this.driver.getNama());
        System.out.println("Tujuan : "+ this.tujuan.info());
    }
}
