package Practica9;

public class Boleto {
    protected int numero;
    protected double precio;

    public Boleto(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Número: " + numero + ", Precio: " + precio;
    }
}

