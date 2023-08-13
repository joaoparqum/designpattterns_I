/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public interface Desconto {
    
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
    
}
