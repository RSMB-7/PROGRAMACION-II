package Practica7;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego {
    int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Adivina un número entre 0 y 10:");
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Intenta de nuevo.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es mayor.");
                    } else {
                        System.out.println("El número a adivinar es menor.");
                    }
                } else {
                    System.out.println("Se acabaron las vidas.");
                    break;
                }
            }
        }
    }
}

