package variables;

import java.util.Locale;

public class VariablesMain {
    public static void main(String[] args) {
        //java - variables fuertemente tipado
        //se debe definir su tipo - primitivo - int, float ..
        //o bien del tipo de un objeto - entidad
        //las variables
        //one of the most important features of java
        //represent - business logic - the data
        //tipo dato - objeto - instancia de una clase
        //estructura - tipo nombreVariable
        //si el tipo es de la clase usuario - tipo es usuario
        //se puede definir una variable con var variable - a partir de la version 10 - dinamico
        //el tipo de dato determina los datos u objetos que puede contener una variable
        //asi mismo el tipo determina el tipo de operaciones que se pueden realizar con las variables
        //el tipo determina el comportamiento al que puede ser sometida la variable u objeto

        //los tipos pueden ser:
        //primitivos
        // - no son objetos son valores
        //contienen un solo valor que puede ser int, float, string, char, boolean...

        //referenciados
        //Tipos de clase, objetos - instancia de una clase
        //Tipo de datos complejos - no solo almacena un valor
        //almacena una entidad completa - asociada con atributos y metodos
        //incluye tambien los arreglos, interfaces, enums
        //interfaces - tipo de dato para indicar comportamiento - el tipo de operaciones que puede realizar el objeto

        int edad = 10; //primitivo
        Integer edadObject = 10; // de la clase Integer - de referencia
        String nombre = "Santos";

        //convenciones
        //-variable debe iniciar con minuscula
        //-no puede contener caracteres especiales - al inicio - puede incluir _
        //No debe iniciar con caracter especial o digito
        //puede iniciar con _ y $ o bien con letra alfabetica a-z
        //luego pueden ir numeros o letras
        //camelcase nNombre
        //si ya existe - evitar usar los mismos nombres dentro de un mismo contexto

        //define el tipo en base al dato que se le asigna
        var helloWorld = "Hello World";

        String name = "Santos"; //es un objeto - por debajo se crea la referencia al objeto
        Integer age = 27;
        Double balance = 17000.20;

        System.out.println(helloWorld + " " + name.toUpperCase() + " " + age);
        //tipos primitivos
        //int - 32
        //byte
        //short
        //long
        //char
        //byte b = 0;
        //short a = 0;
        //with the type Integer - allow many methods to work with the data - wrappers
        int age1 = 27;
        System.out.println(age1);


        boolean state = true;
        if(state){
            age1 = 10;
        }

        System.out.println(age1);



    }
}
