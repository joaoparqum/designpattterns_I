/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class TestedeDescontoExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //STATE
        Orcamento reforma = new Orcamento(500.0);
        
        reforma.aplicaOrcamentoExtra();
        System.out.println(reforma.getValor());
        
        reforma.aprova();
        reforma.aplicaOrcamentoExtra();
        System.out.println(reforma.getValor());
    }
    
}
