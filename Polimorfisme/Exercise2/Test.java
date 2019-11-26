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
public class Test {
    public static void main(String[] args) {
        Manusia indro = new Manusia();
        TelevisiJadul tj = new TelevisiJadul();
        TelevisiModern tm = new TelevisiModern();
        
        indro.nyalakanPerangkat(tj);
        indro.nyalakanPerangkat(tm);
    }
}
