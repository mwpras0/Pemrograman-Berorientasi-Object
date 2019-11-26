/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme.Exercise2;

/**
 *
 * @author mwpras
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik e){
        int volt = e.getVoltase();
        
        if (e instanceof TelevisiJadul) {
            System.out.println("Nyalakan Televisi Jadul dengan input : "+((TelevisiJadul) e).getModeInput());
            System.out.println("Voltase Televisi : "+volt);
        } else if (e instanceof TelevisiModern) {
            System.out.println("Nyalakan Televisi Modern dengan input : "+((TelevisiModern) e).getModeInput());
            System.out.println("Voltase Televisi : "+volt);
        }
    }
}
