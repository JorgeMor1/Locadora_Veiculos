package Gerenciadores_E_Entidades;

public enum Marcas {
    KAWASAKI(8000.0),
    HYUNDAI(40000.0);

    private final double valor;

    Marcas(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }
}
