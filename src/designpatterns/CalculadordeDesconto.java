/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class CalculadordeDesconto {
    
    public double calcula(Orcamento orcamento){
        
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoQuinhentosReais();
        Desconto d3 = new SemDesconto();
        
        d1.setProximo(d2);
        d2.setProximo(d3);
        
        return d1.desconta(orcamento);
    }
    
}
