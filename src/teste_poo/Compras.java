/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_poo;

/**
 *
 * @author Tchingunji
 */
public class Compras {
    private Data date;
    private float valor;

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Compras(Data date, float valor) {
        this.date = date;
        this.valor = valor;
    }
    
}
