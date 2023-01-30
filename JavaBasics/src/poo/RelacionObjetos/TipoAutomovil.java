package poo.RelacionObjetos;

public enum TipoAutomovil {
    SEDAN("Sedan"),
    DEPORTIVO("Deportivo"),
    PICKUP("Pickup"),
    COMPACTO("Compacto");

    private String name;

    TipoAutomovil(String name) {
        this.name = name;
    }
}
