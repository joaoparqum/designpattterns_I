/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class TestedeDescontos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CHAIN OF RESPONSIBILTY
        CalculadordeDesconto descontos = new CalculadordeDesconto();
        
        Orcamento orcamento = new Orcamento(500.0);
        orcamento.adicionaItem(new Item("Caneta", 250.0));
        orcamento.adicionaItem(new Item("Lapis", 250.0));
        
        double descontaFinal = descontos.calcula(orcamento);
        System.out.println(descontaFinal);
        
    }
    
}
