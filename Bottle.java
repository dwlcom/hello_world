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
public class Bottle extends Drinks{
    
//constructor takes value to send to Drinks (size)
  public Bottle(int s){
      
      //pass to super class Drinks
      super(s);
  }
    
    @Override
    int getSize(){
        return size + 10;
    }
    
}
