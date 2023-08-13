/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class ICPP extends TemplateImpostoCondicional{   

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public double minimaTaxacao(Orcamento orcamento) {
       return orcamento.getValor() * 0.05;
    }
    
    
}
