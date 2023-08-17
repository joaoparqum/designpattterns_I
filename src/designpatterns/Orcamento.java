/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author João P. Arquim
 */
public class Orcamento {
    
    double valor;
    private List<Item> itens;
    
    protected EstadodeUmOrcamento estadoAtual; 
    
    public Orcamento(double valor){
        this.valor = valor;
        itens = new ArrayList<Item>();
        estadoAtual = new EmAprovacao();
    }

    public double getValor() {
        return valor;
    }
    
    public void adicionaItem(Item item){
        itens.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void aplicaOrcamentoExtra() {
        estadoAtual.aplicaDescontoExtra(this);
    }
    
    public void aprova(){
        estadoAtual.aprova(this);
    }
    
    public void reprova(){
        estadoAtual.reprova(this);
    }
    
    public void finaliza(){
        estadoAtual.finalizado(this);
    }
    
}
