/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public abstract class TemplateImpostoCondicional implements Imposto{

    //TEMPLATE METHOD
    @Override
    public double calcula(Orcamento orcamento) {
        if(deveUsarMaximaTaxacao(orcamento)){
            return maximaTaxacao(orcamento);
        }else{
            return minimaTaxacao(orcamento);
        }
    }

    public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

    public abstract double maximaTaxacao(Orcamento orcamento);

    public abstract double minimaTaxacao(Orcamento orcamento);
       
}
