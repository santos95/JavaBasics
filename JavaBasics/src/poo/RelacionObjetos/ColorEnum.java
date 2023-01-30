package poo.RelacionObjetos;

public enum ColorEnum {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    GRIS("Gris"),
    NEGRO("Negro"),
    BLANCO("Blanco");

    private String name;

    ColorEnum(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
