/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class TesteDeImpostosCompletos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECORATOR
        Imposto iss = new ISS(new ICMS(new ICPP()));
        
        Orcamento orcamento = new Orcamento(500);
        
        double valor = iss.calcula(orcamento);
        System.out.println(valor);
    }
    
}
