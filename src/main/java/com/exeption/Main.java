/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exeption;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "p";  
        File carta = new File("////7dr/carta.txt");

        try{
            String as;
            int n = Integer.parseInt(a);//java.lang.NumberFormatException
            carta.createNewFile();
        }
        catch(IOException ex){
            System.out.println("Error " + ex.getMessage());
            ex.printStackTrace();
        }
        catch(NumberFormatException ex3){
            System.out.println("ERROR " + ex3);
            ex3.printStackTrace();
        }
        catch(RuntimeException ex){
            System.out.println("ERROR " + ex);
            ex.printStackTrace();
        }

        //RECORDATORIO: NULLPOINTER ES CUANDO ALGO ESTA VACIO
        //ARRAY INDEX ES CUANDO NO SE ASIGNA LA POSICION
        //STACKOVERFLOW ES CUANDO LA MEMORIA DESBORDA
        
        
    }
    
}
