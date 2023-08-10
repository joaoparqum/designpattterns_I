/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author João P. Arquim
 */
public class NotasMusicais {
    
    public static Map<String, Nota> notas = new HashMap<String, Nota>();
    
    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());
    }
    public Nota pega(String nome) {
        return notas.get(nome);
    }
            
}
