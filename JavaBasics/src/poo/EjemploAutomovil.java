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

        //todos los objetos en java son distintos y unicos
        //incluso aunque existan objetos que tengan los mismos estados o estados similares
        //estado - valores de los atributos de un objeto en un momento determinado
        //toda clase en java extiende de la clase object

        Automovil auto = new Automovil();
        Automovil lambo = new Automovil();

        //al ser privados ya no se pueden acceder directament
        //auto.color ....
        System.out.println("fabricante: " + auto.getFabricante());
        System.out.println("modelo: " + auto.getModelo());
        System.out.println("Color: " + auto.getColor());
        System.out.println("cilindraje: " + auto.getCilindraje());

        //por defecto - si se imprimen sin definir un valor para los atributos del objeto,
        //ya sea mediante set o el constructor o directamente
        //strings - default - null, double - 0.0

//
//        auto.fabricante = "Toyota";
//        auto.modelo = "Corolla";
//        auto.color = "rojo";
//        auto.cilindraje = 4.0;
        auto.setFabricante("Toyota");


        System.out.println("fabricante: " + auto.getFabricante());
        System.out.println("modelo: " + auto.getModelo());
        System.out.println("Color: " + auto.getColor());
        System.out.println("cilindraje: " + auto.getCilindraje());

        lambo.setFabricante("Lambo");
        lambo.setModelo("Aventador");
        lambo.setColor("rojo");
        lambo.setCilindraje(8.0);

        System.out.println("fabricante: " + lambo.getFabricante());
        System.out.println("modelo: " + lambo.getModelo());
        System.out.println("Color: " + lambo.getColor());
        System.out.println("cilindraje: " + lambo.getCilindraje());

        System.out.println(lambo.detalleAutomovil());

        System.out.println(lambo.acelerar(1000));
        System.out.println(auto.acelerar(100));
        System.out.println(lambo.frenar());
        System.out.println(lambo.acelerarFrenar(10000));
        System.out.println("Kilometro por litro: " + lambo.calculoConsumo(200, 0.6f));
        System.out.println("Kilometro por litro: " + lambo.calculoConsumo(200, 60));

        Automovil porche = new Automovil("Porche", "911 Turbo");
        porche.setColor("Rojo");
        System.out.println("porche = " + porche.detalleAutomovil());

        Automovil porche1 = new Automovil("Porche", "911 Turbo");
        porche1.setColor("Rojo");

        System.out.println("porche == porche1 with equals? " + porche.equals(porche1));

    }
}
