/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.propagar;

/**
 *
 * @author user
 */
public class CalcularNomina {
    
    public void generarNomina(int nom, int act){
        double total;
        Calculadora herr = new Calculadora();
        CalculadoraException herr2 = new CalculadoraException("ERROR",61);
        total = nom + act;
        System.out.println("Tienes en tu ");
    }
    
    public static void main(String[] args) throws Exception {
        int sb = 400000;
        int meses = 12;
        Calculadora p = new Calculadora();
        try{
            p.resta(sb, 899999);
        }
        catch(Exception ex){
            System.out.println("Error " + ex.getMessage());
        }
    }
}
