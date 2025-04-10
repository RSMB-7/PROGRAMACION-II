package Practica7;

public class AppJuego {
	 public static void main(String[] args) {
	 JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3);
	 JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
     JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
     JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

     juego.juega();
     juego1.juega();
     juego2.juega();
     juego3.juega();
     
 		}
}	