package enums;

public enum Marca {
    MAZDA(150),
    TOYOTA(220),
    FORD(150),
    KIA(420);
    
    private int valor;

    private Marca(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
