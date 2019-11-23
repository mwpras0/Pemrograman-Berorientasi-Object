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
public class Tujuan {
    int biaya;
    private String tujuan;
    private String awal;
    
    public Tujuan(){
        
    }

    public Tujuan(int biaya, String tujuan, String awal) {
        this.biaya = biaya;
        this.tujuan = tujuan;
        this.awal = awal;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getAwal() {
        return awal;
    }

    public void setAwal(String awal) {
        this.awal = awal;
    }
    
    public String info() {
        String infoT = "";
        infoT += "Biaya : "+ this.biaya + "\n";
        infoT += "Tujuan : "+ this.tujuan+"\n";
        infoT += "Tempat Awal : "+ this.awal+"\n";
        
        return infoT;
    }  
}
