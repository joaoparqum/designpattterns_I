/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flyweight;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author João P. Arquim
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NotasMusicais notas = new NotasMusicais();
        
        List<Nota> doReMiFa = Arrays.asList(
                
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("mi"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("fa"),
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("do"),
                notas.pega("re"),
                notas.pega("re"),
                notas.pega("re"),
                notas.pega("do"),
                notas.pega("sol"),
                notas.pega("fa"),
                notas.pega("mi"),
                notas.pega("mi"),
                notas.pega("mi")
                );
    }
    
}
