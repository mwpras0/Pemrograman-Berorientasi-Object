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
public class Lingkaran {
    double r;
    
    double keliling(){
        return 3.14*r;
    }
    
    double luas(){
        return 2*3.14*r;
    }
    
    void output(){
        System.out.println("Masukkan jari-jari : "+r);
    }
}
