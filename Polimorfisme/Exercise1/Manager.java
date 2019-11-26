/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme.Exercise1;

/**
 *
 * @author mwpras
 */
public class Manager extends Pegawai{
    private int tunjangan;

    public Manager(int tunjangan, String nama, int gaji) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public int getGaji(){
        return gaji;
    }
    
    public int getTunjangan(){
        return tunjangan;
    }
}
