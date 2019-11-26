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
public class Test {
     public static void main(String[] args) {
        Manager man = new Manager(50, "Agus", 800);
        Programer prg = new Programer(30, "Budi", 600);
        Bayaran hr = new Bayaran();
        
        System.out.println("Bayaran Manajer : "+hr.hitungBayaran(man));
        System.out.println("Bayaran Programmer : "+hr.hitungBayaran(prg));
    }
}
