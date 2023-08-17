/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class Aprovado implements EstadodeUmOrcamento{
    
    public void aplicaDescontoExtra(Orcamento orcamento){
        orcamento.valor -= orcamento.valor * 0.02;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("ORÇAMENTO JÁ APROVADO!"); 
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("JÁ ESTÁ APROVADO NÃO PODE SER REPROVADO!"); 
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
    
}
