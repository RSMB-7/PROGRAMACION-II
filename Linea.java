package Practica1;
public class Linea {
    public Punto p1;
    public Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return String.format(this.p1 + " - " + this.p2 );
    }

    public void dibujaLinea() {
        System.out.println("Dibujando línea de " + this.p1 + " a " + this.p2);
    }

    public static void main(String[] args) {
        Punto a = new Punto(1, 2);
        Punto b = new Punto(3, 4);
        Linea linea = new Linea(a, b);
        System.out.println(linea);
        linea.dibujaLinea();
    }
}
