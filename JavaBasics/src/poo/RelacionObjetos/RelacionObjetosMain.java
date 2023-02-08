package poo.RelacionObjetos;

import java.lang.reflect.Parameter;
import java.util.Arrays;

public class RelacionObjetosMain {
    public static void main(String[] args) {
        Automovil audi = new Automovil("Audi", "R8", ColorEnum.NEGRO, TipoAutomovil.DEPORTIVO);
        Motor motorAudi = new Motor(8, TIpoMotorEnum.GASOLINA);
        //Tanque tanqueAudi = new Tanque(50);
        Persona driverAudi = new Persona("Santos", "Ortiz");
        Rueda[] audiRuedas = new Rueda[4];

        for(int i = 0; i < 4; i++) {
            audiRuedas[i] = new Rueda("Pirelli", 18, 7.5);
        }

        audi.setMotor(motorAudi);
       // audi.setTanque(tanqueAudi);
        audi.setConductor(driverAudi);
        audi.setRuedas(audiRuedas);

        Rueda[] corollaRuedas = {
                new Rueda("Michelline", 18, 8),
                new Rueda("Michelline", 18, 8),
                new Rueda("Pirelli", 18, 8),
                new Rueda("Pirelli", 18, 8)
        };

        Automovil corrolla = new Automovil("Toyota", "Corolla 2023", ColorEnum.AZUL, TipoAutomovil.DEPORTIVO,
                new Motor(4, TIpoMotorEnum.GASOLINA), new Persona("Peter", "Parker"), new Tanque(), corollaRuedas);

        Automovil porche = new Automovil("Porche", "911 Turbo", ColorEnum.NEGRO, TipoAutomovil.DEPORTIVO,
                new Motor(8, TIpoMotorEnum.GASOLINA), new Persona("Peter", "Quil"), new Tanque());

        Rueda[] porcheRuedas = {
                new Rueda("Michelline", 18, 8),
                new Rueda("Michelline", 18, 8),
                new Rueda("Michelline", 18, 8),
                new Rueda("Michelline", 18, 8)
        };

        porche.setRuedas(porcheRuedas);


        System.out.println(audi);
        System.out.println("Audi motor: " + audi.getMotor().getTipoMotor() +  " cilindros: " + audi.getMotor().getCilindros());
        System.out.println(corrolla);
        System.out.println(porche);

        System.out.println("---------------------------------------------------------");
        System.out.println("Automoviles sorted by fabricante: ");

        Automovil[] cars = new Automovil[3];

        cars[0] = corrolla;
        cars[1] = audi;
        cars[2] = porche;

        Arrays.sort(cars);

        for (Automovil car : cars) {
            System.out.println(car);
        }


    }
}
