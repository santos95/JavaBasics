package poo;

public class Automovil {
    //un objeto se encuentra almacenado en memoria
    //por tanto en las variables se almacena una referencia a los objetos o datos
    //ocultacion de atributos
    //la idea es que los atributos sean siempre privados
    //y que solo puedan ser accedidos por atributos de la clase
    //getters and setters
    //o bien, que sean protected - respecto a la herencia
    //al cambiar a private - los atributos no pueden ser accedidos
    //para lectura o modificacion da error para otras clases, incluso el main
    //por tanto para obtenerlos o modificarlos - getters and setters
    //orden definicion de clase atributos > constructores > getters setters > metodos operaciones > sobreescrituras

    private String fabricante;
    private String color;
    private String modelo;
    private double cilindraje;
    private int capacidadTanque = 40;

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

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar(){
        return "el auto " + fabricante + " frenando";
    }

    public String acelerarFrenar(int rpm){

        String acelerar = this.acelerar(10000);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;

    }

    public float calculoConsumo(int km, float porcentajeGas) {

        return km / (this.capacidadTanque * porcentajeGas);

    }
    //ocultacion - se refiere al acceso a datos private, public, protected ..
    //polimorfismo - diferentes implementaciones de un mismo comportamiento
    //se puede aplicar con clases de la clase padre
    //sobreescribiendo un metodo de la clase padre
    //encapsulacion se refiere al hermeticidad
    //un metodo - no se sabe como se implementa
    //asi los atributos solo pueden ser modificados o accesados a traves de los metodos
    //sobrecarga - se refiere a diferentes implementaciones de un mismo metodo
    //sobrecarga - mismo tipo retorno and nombre pero diferentes parametros ya sea en numero o tipo dato
    public float calculoConsumo(int km, int porcentajeGas){

        return km / (this.capacidadTanque * (porcentajeGas / 100f));

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

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCilindraje(double cilindraje){
        this.cilindraje = cilindraje;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
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

    //constructor
    //metodo especial de la clase que permite instanciar objetos de una clase
    //por defecto para una clase existe un constructor sin parametros
    //proceso de inicializacion para el objeto y que pueda ser utilizado
    //se puede asi mismo inicializar los atributos al crear el objeto
    //cuando se implementa un constructor con parametros, el constructor
    //en el constructor se pueden definir valores por defecto
    //definir los valores para los atributos
    //incluso - jdbc - recursos - clse conexion a la bd e inicializar la conexion con el constructor
    //abrir archivo, conectar con un servidor
    //por defecto deja de existir, por tanto se debe definir
    //sobrecarga constructor
    public Automovil(){}
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cilindraje = 4;
    }
    public int getCapacidadTanque() {
        return this.capacidadTanque;
    }

    public double getCilindraje(){
        return this.cilindraje;
    }

    //customizar el equals

    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()) &&
                this.cilindraje == a.getCilindraje() && this.capacidadTanque == a.getCapacidadTanque() &&
                this.color.equals(a.getColor());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
