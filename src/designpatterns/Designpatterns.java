/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class Designpatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        
        Orcamento orcamento = new Orcamento(500.0);
        
        CalculadordeImposto calculo = new CalculadordeImposto();
        
        calculo.realizaCalculo(orcamento, icms);
        calculo.realizaCalculo(orcamento, iss);
    }
    
}
