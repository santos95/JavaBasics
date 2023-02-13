package lamda;

public enum PersonType {
    NATURAL("N"),
    JURIDICO("J");

        String tipo;

        PersonType(
                String tipo) {
            this.tipo = tipo;
        }

    @Override
    public String toString() {
        return tipo;
    }
}
