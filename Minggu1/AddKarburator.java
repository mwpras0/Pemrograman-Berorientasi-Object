/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu1;

/**
 *
 * @author mwpras
 */
public class AddKarburator extends MesinMotor{
    private String Karburator;
    
    public void Karburator(String newValue){
        Karburator = newValue;
    }
    
    public void Status(){
        super.Status();
        System.out.println("Karburator: "+Karburator);
    }
}