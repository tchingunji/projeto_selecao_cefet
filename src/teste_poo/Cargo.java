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
public abstract class Cargo {
    
    private float salario;
    private int beneficio;
    private TypeCargo cargo;
    private float subsidio;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    public TypeCargo getCargo() {
        return cargo;
    }

    public void setCargo(TypeCargo cargo) {
        this.cargo = cargo;
    }

    public float getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(float subsidio) {
        this.subsidio = subsidio;
    }
        
    public Cargo(TypeCargo cargo) {
        this.cargo = cargo;
        this.beneficio = (cargo==TypeCargo.SECRETARIO ? 20:cargo==TypeCargo.VENDEDOR?30:0);
        this.salario =   (cargo==TypeCargo.SECRETARIO ? 7000:cargo==TypeCargo.VENDEDOR?12000:20000);
        this.subsidio = (cargo==TypeCargo.SECRETARIO ? 1000:cargo==TypeCargo.VENDEDOR?1800:3000);
    }
    
}
