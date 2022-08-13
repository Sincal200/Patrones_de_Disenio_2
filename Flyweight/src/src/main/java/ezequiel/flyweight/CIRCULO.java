/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main.java.ezequiel.flyweight;

/**
 *
 * @author bayro
 */
public class CIRCULO  implements FIGURA{
    
    private String color;
    private int x;
    private int y;
    private int radio;
    
    public CIRCULO (String color){
        this.color = color;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void SetRadio(int radio){
        this.radio = radio;
    }
    public void dibujar() {
        System.out.println("Circulo "+color+", eje x: "+x+", eje y: "+y+", radio: "+radio);
    }
}

