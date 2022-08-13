/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package src.main.java.ezequiel.flyweight;

import java.util.HashMap;

/**
 *
 * @author bayro
 */
public class FIGURAS {
    private static final HashMap<String, FIGURA> MapaCirculo = new HashMap();
    
    public static FIGURA getCirculo(String color){
        CIRCULO circulo = (CIRCULO)MapaCirculo.get(color);
        
        if(circulo == null){
            circulo = new CIRCULO(color);
            MapaCirculo.put(color, circulo);
        }
        return circulo;
    }
}