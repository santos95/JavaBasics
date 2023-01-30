package poo.RelacionObjetos;

public class Persona {

    private String firstName;
    private String lastName;

    public Persona() {
    }

    public Persona(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName;
    }
}
