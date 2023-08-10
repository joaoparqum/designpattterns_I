/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;

/**
 *
 * @author João P. Arquim
 */
public class CalculadordeImposto {
    
    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer){
        double resultado = impostoQualquer.calcula(orcamento);
        System.out.println(resultado);
    }
}
