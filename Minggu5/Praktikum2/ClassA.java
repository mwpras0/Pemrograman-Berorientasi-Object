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
public class ClassA {
    int x;
    int  y;
    
    /*public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void getNilai(){
        System.out.println("nilai x : "+x);
        System.out.println("nilai y : "+y);
    }*/
    public ClassA() {
    }

    public ClassA(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void getNilai(){
        System.out.println("nilai x : "+x);
        System.out.println("nilai y : "+y);
    }    
}
    
