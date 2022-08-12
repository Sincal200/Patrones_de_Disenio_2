package Patron;

public class main {
    public void motor_comun (){
        MotorComun motor1 = new MotorComun();
        motor1.encender();
        motor1.acelerar();
        motor1.apagar();
    }
    public void motor_economico(){
        MotorEconomico motor1 = new MotorEconomico();
        motor1.encender();
        motor1.acelerar();
        motor1.apagar();
    }
    public void  motor_electrico (){
        MotorElectrico motorElectricoAdapter = new MotorElectrico();
        motorElectricoAdapter.activar();
        motorElectricoAdapter.moverse();
        motorElectricoAdapter.deternse();
        motorElectricoAdapter.desconectar();
    }
    public static void main(String[] args) {
        main M1 = new main();
        M1.motor_comun();
        M1.motor_economico();
        M1.motor_electrico();






            }
        }



