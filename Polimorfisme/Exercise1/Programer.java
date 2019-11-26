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
public class Programer extends Pegawai{
    private int bonus;
    
    public Programer(int bonus, String nama, int gaji) {
        super(nama, gaji);
        this.bonus = bonus;
    }
    
    @Override
  public int getGaji(){
      return gaji;
    }
  
  public int getBonus(){
      return bonus;
  }
}
