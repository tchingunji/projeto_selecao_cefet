/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_poo;

import java.util.ArrayList;

/**
 *
 * @author Tchingunji
 */
public class Venda {
    private ArrayList<Compras> compras;
    private Funcionario vendedor;

    public ArrayList<Compras> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compras> compras) {
        this.compras = compras;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public Venda(ArrayList<Compras> compras, Funcionario vendedor) {
        this.compras = compras;
        this.vendedor = vendedor;
    }
    
}
