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
public class TestMesin {
    public static void main(String[] args) {
        MesinMotor mm1 = new MesinMotor();
        MesinMotor mm2 = new MesinMotor();
        AddKarburator mk = new AddKarburator();
        
        mm1.Merek("Honda Megapro");
        mm1.NokenAs("Tiger");
        mm1.Piston("Megapro");
        mm1.KrukAs("CRF");
        mm1.Status();
        
        mm2.Merek("Honda CRF");
        mm2.NokenAs("CBR");
        mm2.Piston("Megapro");
        mm2.KrukAs("CRF");
        mm2.Status();
        
        mk.Merek("Honda Tiger Revolution");
        mk.NokenAs("Tiger");
        mk.Piston("Megapro");
        mk.KrukAs("Tiger");
        mk.Karburator("PWK 28");
        mk.Status();
    }
}
