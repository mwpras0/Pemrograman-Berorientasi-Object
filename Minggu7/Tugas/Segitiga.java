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
public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        System.out.println("Sudut : "+sudut);
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA - sudutB);
        System.out.println("Sudut : "+sudut);
        return sudut;
    }
    
    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling : "+keliling);
        return keliling;
    }
    
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow((double)sisiA, 2)) 
                + Math.sqrt(Math.pow((double)sisiB, 2));
        System.out.println("Keliling : "+ c);
        return c;   
    }
}
