/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class Reprovado implements EstadodeUmOrcamento{

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("NÃO PODE TER DESCONTO!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("ESTÁ REPROVADO NÃO PODE SER APROVAO!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("JÁ ESTÁ REPROVADO!"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
    
}
