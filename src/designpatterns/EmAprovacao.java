/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class EmAprovacao implements EstadodeUmOrcamento{
    
    public void aplicaDescontoExtra(Orcamento orcamento){
        orcamento.valor -= orcamento.valor * 0.05;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();
    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        throw new RuntimeException("ORÇAMENTOS EM APROVAÇÃO NÃO PODE SER FINALIZADOS!"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
