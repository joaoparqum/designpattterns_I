/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class Finalizado implements EstadodeUmOrcamento{

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("FINALIZADOS NAO PODE RECEBER DESCONTO!");
    }

    @Override
    public void aprova(Orcamento orcamento) {
         throw new RuntimeException("JÁ ESTÁ FINALIZADO!");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("JÁ ESTÁ FINALIZADO!");
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        throw new RuntimeException("JÁ ESTÁ FINALIZADO!");
    }
    
}
