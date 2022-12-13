/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_poo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Tchingunji
 */
public class Teste_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Funcionario f1=new Funcionario("Jorge Carvalho", new Data(01, 2018), TypeCargo.SECRETARIO);
        Funcionario f2=new Funcionario("Maria Souza", new Data(12, 2015), TypeCargo.SECRETARIO);
        Funcionario f3=new Funcionario("Ana Silva", new Data(01, 2021), TypeCargo.VENDEDOR);
        Funcionario f4=new Funcionario("João Mendes", new Data(12, 2021), TypeCargo.VENDEDOR);
        Funcionario f5=new Funcionario("Juliana Alves", new Data(07, 2017), TypeCargo.GERENTE);
        Funcionario f6=new Funcionario("Bento Albino", new Data(03, 2014), TypeCargo.GERENTE);
               
        ArrayList<Funcionario>listaF=new ArrayList<>();
        listaF.add(f1);
        listaF.add(f2);
        listaF.add(f3);
        listaF.add(f4);
        listaF.add(f5);
        listaF.add(f6);
            
       ArrayList<Venda> vendas=new ArrayList<>();
       
       //Vendas da vendedora Ana Silva
       ArrayList<Compras>cp=new ArrayList<>();
       cp.add(new Compras(new Data(12,2021), 5200));
       cp.add(new Compras(new Data(01,2022), 4000));
       cp.add(new Compras(new Data(02,2022), 4200));
       cp.add(new Compras(new Data(03,2022), 5850));
       cp.add(new Compras(new Data(04,2022), 7000));
       Venda vd=new Venda(cp, f3);
       vendas.add(vd);
       //Vendas do vendedor João Mendes
       cp=new ArrayList<>();
       cp.add(new Compras(new Data(12,2021), 3400));
       cp.add(new Compras(new Data(01,2022), 7700));
       cp.add(new Compras(new Data(02,2022), 5000));
       cp.add(new Compras(new Data(03,2022), 5900));
       cp.add(new Compras(new Data(04,2022), 6500));
       vd=new Venda(cp, f4);
       vendas.add(vd);  
       
       
        Funcionario teste;
        System.out.println(Funcionario.highWage(listaF, 12, 2022).getNome());
        System.out.println(Funcionario.highBenefit(listaF, 2022, 12));
        System.out.println(Funcionario.monthBenefit(listaF, 2022, 12));
        System.out.println(Funcionario.wageMonth(listaF, 12, 2022));
        System.out.println(Funcionario.wageBenefitMonth(listaF, 12, 2022));
        System.out.println(Funcionario.bestSeller(vendas, 2022, 3).getVendedor().getNome());
    }
    
}
