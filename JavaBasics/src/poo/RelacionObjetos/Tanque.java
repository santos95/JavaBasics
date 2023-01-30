package poo.RelacionObjetos;

public class Tanque {
    private float capacidad;

    public Tanque(){
        this.capacidad = 40;
    }

    public Tanque(float capacidad) {
        this.capacidad = capacidad;
    }

    public float getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "capacidad=" + capacidad +
                '}';
    }
}
