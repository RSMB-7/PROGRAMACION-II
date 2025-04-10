package Practica7;

public class Juego {
    int numeroDeVidas;
    int record;

    public void reiniciaPartida() {
        numeroDeVidas = 3;
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}
