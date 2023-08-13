/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class ICMS extends Imposto{

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
    }
    
}
