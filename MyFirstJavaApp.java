/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstjavaapp;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class MyFirstJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        System.out.println("Hola Mundo!");
        
        Drinks d = new Bottle(10);
        System.out.println("Size = " + d.getSize()+" ml");
        
        ArrayList <String> a = new ArrayList();
        if (a.isEmpty()){
            System.out.println("List is empty");
        }
        
    }
    
}
