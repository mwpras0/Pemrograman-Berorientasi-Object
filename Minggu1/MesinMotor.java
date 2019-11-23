package Minggu1;

/**
 *
 * @author mwpras
 */
public class MesinMotor {
    private String NokenAs;
    private String Piston;
    private String KrukAs;
    private String Merek;
    
    public void Merek (String newValue){
        Merek = newValue;
    }
    
    public void NokenAs (String newValue){
        NokenAs = newValue;
    }
    
    public void Piston (String newValue){
        Piston = newValue;
    }
    
    public void KrukAs (String newValue){
        KrukAs = newValue;
    }
    
    public void Status(){
        System.out.println("Merek Motor: "+Merek);
        System.out.println("Noken As: "+NokenAs);
        System.out.println("Piston: "+Piston);
        System.out.println("Kruk As: "+KrukAs);
    }
}
