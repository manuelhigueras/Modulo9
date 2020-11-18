/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exeption;

/**
 *
 * @author user
 */
public class ControlCheck {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(args[9]); //ArrayIndexOutOfBoundsException
        for(String lista: args){
            System.out.println(lista);
        }
    }
    
}
