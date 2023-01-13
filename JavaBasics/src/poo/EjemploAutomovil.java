package poo;
//una clase solo puede ser publica o default
//publica se refiere que puede ser accesidada en cualquier parte
//default solo puede ser accedida desde el paquete
public class EjemploAutomovil {

    //los atributos - variables contenidas, propias de una clase
    //si un atributo es estatica - atributo de la clase y no del objeto como tal
    //atributo - tipoDato nombre
    //final - este modificador hace que el atributo se convierte en algo similar a una constante - no puede ser modificado su valor
    //static - este modificador - metodo estaticos se pueden invocar sin crear objectos de la clase
    //un metodo puede ser estatico y final - no puede ser modificado por otras clases - con el final

    public static void main(String[] args) {

        Automovil auto = new Automovil();
        Automovil lambo = new Automovil();

        System.out.println("fabricante: " + auto.fabricante);
        System.out.println("modelo: " + auto.modelo);
        System.out.println("Color: " + auto.color);
        System.out.println("cilindraje: " + auto.cilindraje);

        //por defecto - si se imprimen sin definir un valor para los atributos del objeto,
        //ya sea mediante set o el constructor o directamente
        //strings - default - null, double - 0.0

        auto.fabricante = "Toyota";
        auto.modelo = "Corolla";
        auto.color = "rojo";
        auto.cilindraje = 4.0;

        System.out.println("fabricante: " + auto.fabricante);
        System.out.println("modelo: " + auto.modelo);
        System.out.println("Color: " + auto.color);
        System.out.println("cilindraje: " + auto.cilindraje);

        lambo.fabricante = "Lambo";
        lambo.modelo = "Aventador";
        lambo.color = "rojo";
        lambo.cilindraje = 8.0;

        System.out.println("fabricante: " + lambo.fabricante);
        System.out.println("modelo: " + lambo.modelo);
        System.out.println("Color: " + lambo.color);
        System.out.println("cilindraje: " + lambo.cilindraje);

        System.out.println(lambo.detalleAutomovil());


    }
}
