package poo.RelacionObjetos;

public enum TIpoMotorEnum {
    GASOLINA(1, "Gasolina"),
    DIESEL(2, "Diesel"),
    ELECTRICO(1, "Electrico"),
    OTRO(1, "Otro");

    private int id;
    private String desc;

    TIpoMotorEnum(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }
}
