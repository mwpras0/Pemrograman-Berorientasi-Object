/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4;

/**
 *
 * @author mwpras
 */
public class main {
    public static void main(String[] args) {
        Processor p = new Processor("intel i5", 3);
        Laptop l = new Laptop("ROG",p);
        Processor p1 = new Processor();
        Laptop l1 = new Laptop();
        
        l.info();
        p1.setMerk("Intel i5");
        p1.setCache(4);

        l1.setMerk("Thinkpad");
        l1.setProc(p1);
        l1.info();
        
    }
}
