/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5.Tugas;

/**
 *
 * @author mwpras
 */
public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;
    
    public Komputer(){
        
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData(){
        System.out.println("============ Komputer =============");
        System.out.println("Merk                : "+merk);
        System.out.println("Kecepatan Prosessor : "+kecProsesor);
        System.out.println("Size Memory         : "+sizeMemory);
        System.out.println("Jenis Prosessor     : "+jnsProsesor);
    }
}
