package Practica9;

public class Galeria extends Boleto {
    public Galeria(int numero, int diasAnticipacion) {
        super(numero);
        if (diasAnticipacion >= 10) {
            this.precio = 25.0; // 50% de Bs. 50
        } else {
            this.precio = 30.0; // 50% de Bs. 60
        }
    }
}

