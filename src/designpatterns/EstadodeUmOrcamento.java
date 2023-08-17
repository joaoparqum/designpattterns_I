/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public interface EstadodeUmOrcamento {
    
    void aplicaDescontoExtra(Orcamento orcamento);
    void aprova(Orcamento orcamento);
    void reprova(Orcamento orcamento);
    void finalizado(Orcamento orcamento);
    
}
