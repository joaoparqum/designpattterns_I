/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public abstract class Imposto {
    
    protected Imposto outroImposto;
    
    public Imposto(Imposto outroImposto){
        this.outroImposto = outroImposto;
    }
    
    public Imposto (){
    }
    
    public abstract double calcula(Orcamento orcamento);
    
    protected double calculoDoOutroImposto(Orcamento orcamento) {
        if(outroImposto == null) return 0;
        return outroImposto.calcula(orcamento);
    }
    
}
