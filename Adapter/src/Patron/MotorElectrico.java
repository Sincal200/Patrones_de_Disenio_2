package Patron;

public class MotorElectrico {

        private boolean conectado = false;

        public MotorElectrico(){
            System.out.print("Creando Motor Electrico\n");
            this.conectado = false;
        }
        public void conectar() {
            System.out.println("Conectando Motor Electrico");
            this.conectado = true;
        }
        public void activar(){
            if (this.conectado){
                System.out.println("Motor no conectado");
            }
            else {
                System.out.println("Motor conectado");
            }
        }
        public void moverse (){
            if (this.conectado){
                System.out.println("Motor no conectado");
            }
            else {
                System.out.println("Motor en  movimiento");
            }
        }
        public void deternse (){
            if (this.conectado){
                System.out.println("Motor no conectado");
            }
            else {
                System.out.println("Motor Deteniendose");
            }
        }
        public void desconectar (){
            System.out.println("Desconectando motor\n");
            this.conectado = false;
        }
    }


