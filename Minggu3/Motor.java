package Minggu3;

/**
 *
 * @author mwpras
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan(){
        if(kontakOn = true){
            kecepatan +=5;
        }else{
            System.out.println("Kecepatan tidak dapat bertambah karena masin OFF");
        }
    }
    
    public void kurangKecepatan(){
        if(kontakOn = true){
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidakbisa berkurang karena Mesin OFF");
        }
    }
    
    public void printStatus(){
        if(kontakOn = true){
            System.out.println("Kontak on");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan : "+kecepatan);
    }
}