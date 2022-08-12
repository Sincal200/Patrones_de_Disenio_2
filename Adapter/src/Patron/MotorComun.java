package Patron;

public class MotorComun extends Motor {

    public MotorComun() {
        super();
        System.out.println("Crean motor comun");
    }
    @Override
    public void encender (){
        System.out.print("encendiendo motor comun\n");
    }
    @Override
    public void acelerar (){
        System.out.println("acelerando motor comun");
    }
    @Override
    public void apagar(){
        System.out.println("apagando motor comun\n");
    }
}



