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
public class Kendaraan {
     private String merek;
    private String platnomor;
    
    public Kendaraan(){
        
    }

    public Kendaraan(String merek, String platnomor) {
        this.merek = merek;
        this.platnomor = platnomor;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getPlatnomor() {
        return platnomor;
    }

    public void setPlatnomor(String platnomor) {
        this.platnomor = platnomor;
    }
    
   public String info() {
       String infoK = "";
       infoK += "Merek : " + this.merek +"\n";
       infoK += "Plat Nomor : "+ this.platnomor+"\n";
       
       return infoK;
    }   
}
