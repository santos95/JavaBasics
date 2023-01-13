package poo;

public class Automovil {
    //un objeto se encuentra almacenado en memoria
    //por tanto en las variables se almacena una referencia a los objetos o datos


    String fabricante;
    String color;
    String modelo;
    double cilindraje;

    //definir la firma del metodo - declaracion del metodo
    //tipo de retorno - primitivo u objeto asociado a un tipo de dato
    //void - retorna nada
    // nombre del metodo
    // parametros del metodo - 0 a n parametros
    // this - hace referencia al mismo objeto - al objeto que lo invoca
    // referencia al objeto propio de la clase
    // aunque no es necesario el this - ya se hace referencia que es metodo del objeto de la clase
    // para evitar errores por variables locales con mismos nombres o algo asi
    // this - para diferenciar los atributos del objeto de la clase a las variables locales
    public void detalle(){
        System.out.println("fabricante: " + this.fabricante);
        System.out.println("modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("cilindraje: " + this.cilindraje);
    }

    public String detalleAutomovil(){

        StringBuilder sb = new StringBuilder();
        sb.append("\nfabricante: " + this.fabricante);
        sb.append("\nmodelo: " + this.modelo);
        sb.append("\ncolor: " + this.color);
        sb.append("\ncilindraje: " + this.cilindraje);
        return sb.toString();

    }

    //los metodos no deben usarse para imprimir los datos de una entidad u objeto
    //como buena practica retornar los datos para que se imprima en consola
    //se envie por correo o a algun documento
    //que retorne los datos y se impriman en alguna otra parte

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void serModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCilindraje(double cilindraje){
        this.cilindraje = cilindraje;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public String getColor(){
        return this.color;
    }

    public String getModelo(){
        return this.modelo;
    }

    public double getCilindraje(){
        return this.cilindraje;
    }
}
