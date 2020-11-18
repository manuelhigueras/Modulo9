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

public class MainException {

    public static void AddArguments3(String[] args){

        int sum = 0;
        for ( int i = 0; i < args.length; i++ ) {
            try {
                sum += Integer.parseInt(args[i]);
            }
            catch (NumberFormatException nfe) {
                System.err.println("[" + args[i] + "] no es un entero"+ " y no se incluirá en la suma.");
            }
        }
        System.out.println("Sum = " + sum);

    }
    
    //Argumento variable los puntos suspensivos
    public static void suma(String titulo, int... numeros){
        int total=0;
        for(int n: numeros){
            total+=n;
            try{
                System.out.println(titulo.toUpperCase());
                System.out.println("...................");
                System.out.println("Total: " + total);
            }
            catch (Exception e) {
                System.out.println("Has indicado mal el titulo");
                return;
            }
            finally{
                System.out.println("FIN DEL EJERCICIO");
                System.exit(0);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AddArguments3(args);
        suma("dfghdfgdfjkgfjkl", 24);
    }
    
}
