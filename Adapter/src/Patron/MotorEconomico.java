package Patron;

public class MotorEconomico extends Motor {

    public MotorEconomico() {
        super();
        System.out.println("Creando el motor economico");
    }
    @Override
    public void encender (){
        System.out.println("encendiendo motor economico");
    }
    @Override
    public void acelerar (){
        System.out.println("acelerando motor economico");
    }
    @Override
    public void apagar (){
        System.out.println("apagando motor economico\n");
    }
}

