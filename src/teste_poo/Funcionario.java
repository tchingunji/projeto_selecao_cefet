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
public class Funcionario extends Cargo{
    private String nome;
    private Data contratacao;

    public Funcionario(String nome, Data contratacao, TypeCargo cargo) {
        super(cargo);
        this.nome = nome;
        this.contratacao = contratacao;
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getContratacao() {
        return contratacao;
    }

    public void setContratacao(Data contratacao) {
        this.contratacao = contratacao;
    }
    
    public static float wageBenefitMonth(ArrayList<Funcionario> funcionarios, int mes, int ano){
        float valorTotal=0;
        for (Funcionario f : funcionarios) {
            int df=ano-f.getContratacao().getAno();
            if(f.getContratacao().getMes()>mes)
                df--;            
            valorTotal=valorTotal + (f.getBeneficio()!=0 ?((f.getSalario()+f.getSubsidio()*df)+(f.getSalario()+f.getSubsidio()*df*f.getBeneficio()/100)) : (f.getSalario()+f.getSubsidio()*df));
        }
        return valorTotal;
    }    
    public static float wageMonth(ArrayList<Funcionario> funcionarios, int mes, int ano){
        float valorTotal=0;
        for (Funcionario f : funcionarios) {
            int df=ano-f.getContratacao().getAno();
            if(f.getContratacao().getMes()>mes)
                df--;
            valorTotal=valorTotal + f.getSalario()+f.getSubsidio()*df;
        }
        return valorTotal;
    }    
    public static Funcionario highWage(ArrayList<Funcionario> funcionarios, int mes, int ano){
        int i=0;
        int df=ano-funcionarios.get(0).getContratacao().getAno();
        if(funcionarios.get(0).getContratacao().getMes()>mes)
            df--;            
        float altoValor= (funcionarios.get(0).getBeneficio()!=0 ?((funcionarios.get(0).getSalario()+funcionarios.get(0).getSubsidio()*df)+(funcionarios.get(0).getSalario()+funcionarios.get(0).getSubsidio()*df*funcionarios.get(0).getBeneficio()/100)) : (funcionarios.get(0).getSalario()+funcionarios.get(0).getSubsidio()*df));
        int pos=0;
        
        for (Funcionario f : funcionarios) {
            df=ano-f.getContratacao().getAno();
            if(f.getContratacao().getMes()>mes)
                df--;            
            float valorTotal=(f.getBeneficio()!=0 ?((f.getSalario()+f.getSubsidio()*df)+((f.getSalario()+f.getSubsidio()*df)*f.getBeneficio()/100)) : (f.getSalario()+f.getSubsidio()*df));
            if(altoValor<valorTotal){
                altoValor=valorTotal;
                pos=i;
            }
            i++;
        }
        return funcionarios.get(pos);
    }     
    public static String highBenefit(List<Funcionario> f, int ano, int mes){
        List <Funcionario>funcBene=f.stream().filter(q->q.getBeneficio()!=0).collect(Collectors.toList());
        
        String name=funcBene.get(0).getNome();
        int df=ano-funcBene.get(0).getContratacao().getAno();
        if(funcBene.get(0).getContratacao().getMes()>mes)
            df--;            
        float altoValor= ((funcBene.get(0).getSalario()+funcBene.get(0).getSubsidio()*df)*funcBene.get(0).getBeneficio()/100);
       
        for(Funcionario funcionario : funcBene){
            
            df=ano-funcionario.getContratacao().getAno();
            if(funcionario.getContratacao().getMes()>mes)
                df--;            
            
            float value = ((funcionario.getSalario()+funcionario.getSubsidio()*df)*funcionario.getBeneficio()/100);
            if(altoValor<value){
                altoValor=value;
                name = funcionario.getNome();
            }
        }
        
        return name;
    }
    public static float monthBenefit(List<Funcionario> f, int ano, int mes){
        List <Funcionario>funcBene=f.stream().filter(q->q.getBeneficio()!=0).collect(Collectors.toList());
        
        int df;          
        float altoValor= 0;
        
        for(Funcionario funcionario : funcBene){
            df=ano-funcionario.getContratacao().getAno();
            if(funcionario.getContratacao().getMes()>mes)
                df--;                        
            altoValor += ((funcionario.getSalario()+funcionario.getSubsidio()*df)*funcionario.getBeneficio()/100);            
        }
        
        return altoValor;
    }    
    public static Venda bestSeller(ArrayList<Venda> sellers, int ano,int mes){
        
        float valueSeller=0;
        int pos=0,location=0;
        for(Venda seller: sellers){
            float v=0;
            for(Compras buy : seller.getCompras()){
                if(buy.getDate().getAno()==ano && buy.getDate().getMes()==mes)
                    v+=buy.getValor();
            }
            if(v>valueSeller){
                valueSeller=v;
                location=pos;
            }
            pos++;
        }
        return sellers.get(location);
    }
}
