/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class DescontoPorCincoItens implements Desconto{
    
    private Desconto proximo;
    
    public double desconta(Orcamento orcamento){
        if(orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;
        }else{
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
    
}
