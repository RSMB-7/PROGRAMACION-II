package Practica1;

public class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public String toString() {
        return "Círculo con centro en " + this.centro + " y radio " + String.format("%.2f", this.radio);
    }

    public void dibujaCirculo() {
        System.out.println("Dibujando círculo con centro en " + this.centro + " y radio " + String.format("%.2f", this.radio));
    }

    public static void main(String[] args) {
        Punto c = new Punto(5, 5);
        Circulo circulo = new Circulo(c, 3);
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
