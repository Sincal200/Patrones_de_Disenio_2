/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package src.main.java.ezequiel.flyweight;
/**
 *
 * @author bayro
 */
public class FLYWEIGHT {
    private static final String colores[] = {"Negro", "Azul", "Verde"};
    public static void main(String[] args){
        for(int i=0; i < 9; i++){
            CIRCULO circulo = (CIRCULO)FIGURAS.getCirculo(getRandomColor());
            circulo.setX(getRandomX());
            circulo.setY(getRandomY());
            circulo.SetRadio(6);
            circulo.dibujar();
        }
    }
        private static String getRandomColor(){
            return colores[(int)(Math.random()*colores.length)];
        }
        private static int getRandomX(){
            return (int)(Math.random()*10);
        }
        private static int getRandomY(){
            return (int)(Math.random()*10);
        }
}
