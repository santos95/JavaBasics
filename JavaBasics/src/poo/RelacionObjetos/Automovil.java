package poo.RelacionObjetos;

import java.util.Arrays;

public class Automovil {
    private int id;
    private String fabricante;
    private String modelo;
    private TipoAutomovil tipoAutomovil;
    private ColorEnum color;
    private Motor motor;
    private Persona conductor;
    private Rueda[] ruedas;
    private Tanque tanque;
    private static int lastId = 0;

    private static final int VELOCIDAD_MAXIMA_CARRETERA = 120;
    private static final int VELOCIDAD_MAXIMA_CIUDAD = 50;

    public Automovil() {
        this.id = ++lastId;
    }

    public Automovil(String fabricante, String modelo, ColorEnum color, TipoAutomovil tipoAutomovil) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.tipoAutomovil = tipoAutomovil;
    }

    public Automovil(String fabricante, String modelo, ColorEnum color,  TipoAutomovil tipoAutomovil, Motor motor, Persona conductor,  Tanque tanque) {
        this(fabricante, modelo, color, tipoAutomovil);
        this.motor = motor;
        this.conductor = conductor;
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, ColorEnum color,  TipoAutomovil tipoAutomovil, Motor motor, Persona conductor,  Tanque tanque, Rueda[] ruedas) {
        this(fabricante, modelo, color, tipoAutomovil, motor, conductor, tanque);
        this.ruedas = ruedas;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public Motor getMotor() {
        if (motor == null)
            return new Motor();
        else
            return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Persona getConductor() {
        if(conductor == null) {
            return new Persona();
        }

        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Tanque getTanque() {
        if (tanque == null){
            return new Tanque();
        }

        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String stringAutomovil = "Automovil{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color=" + color.getName() +
                ", motor=" + ((motor != null) ? "".concat(motor.getTipoMotor().getDesc() + " cilindros=" + motor.getCilindros()) : "S/Info") +
                ", conductor=" + ((conductor != null) ? conductor : this.getConductor()) +
                ", tanque=" + ((tanque != null)? tanque.getCapacidad(): this.getTanque()) +
                ", ruedas={";
        if(ruedas != null) {
            for (Rueda r : ruedas) {
                stringAutomovil += r;
            }
        }

        return stringAutomovil + "}}";
    }

    public float consumo(int km, float porcentajeCombustible){
        return km / (this.tanque.getCapacidad() * porcentajeCombustible);
    }
}
