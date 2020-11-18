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
class CalculadoraException extends Exception{
    
    private double numeroMal;
    
    public CalculadoraException(String msg, double numeroMal){
        super(msg);
        this.numeroMal = numeroMal;
    }
    
}
