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
public class Calculadora {
    /**
     * 
     * @param n1 numerador
     * @param n2 denominador
     * @return resultado de la division
     * @throws Exception 
     */
    
    public double dividir(int n1, int n2) throws Exception{
        if(n2 == 0){
            throw new Exception("El denominador nunca puede ser 0");
        }
        return n1/n2;
    }
    
    /**
     * 
     * @param a numero 1
     * @param b numero 2
     * @return resultado de la resta
     * @throws Exception 
     */
    public double resta(double a, double b) throws CalculadoraException{
        if(a-b < 0)
            throw new CalculadoraException("tiene que ser positivo", 89);
        return a - b;
    }
    
    public String Aviso() throws Exception{
        throw new Exception("DESPEDIDO");
    }
    
    public double redondeoPositivo(double numero) throws IllegalArgumentException{
        if(numero < 0){
            throw new IllegalArgumentException("EL numero debe ser positivo no negativo " + numero);
        }
        return Math.round(10);
    }
    
}
