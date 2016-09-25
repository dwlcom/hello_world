/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjavaapp;

/**
 *
 * @author david
 */
public class Drinks {
    
    public Drinks(int s){
        size = s;
        System.out.println("Drinks size set to : "+ s);
    }
    
    int size = 500;
    String colour = "clear";
    String top = "screw";
    
    int getSize(){
        return size;
    }
    
}
