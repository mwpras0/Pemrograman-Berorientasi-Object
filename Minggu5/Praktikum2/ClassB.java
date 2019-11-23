/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5.Praktikum2;

/**
 *
 * @author mwpras
 */
public class ClassB extends ClassA{
    int z;
    
    /*public void setZ(int z){
        this.z = z;
    }
    public void getNilaiz(){
        System.out.println("nilai z: "+z);
    }
    public void getJumlah(){
        System.out.println("jumlah: "+(x+y+z));
    }*/

    public ClassB() {
    }

    public ClassB(int z) {
        this.z = z;
    }

    public ClassB(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }
    public void getJumlah(){
        super.getNilai();
        System.out.println("nilai z : "+z);
        System.out.println("jumlah: "+(x+y+z));
    }
}
