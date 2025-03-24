package Practica_5;

public class Equipo {
    public String nombre;
    public String ciudad;
    public String entrenador;
    public int numJugadores;

    public Equipo(String Nombre, String Ciudad, String Entrenador, int NumJugadores) {
        this.nombre = Nombre;
        this.ciudad = Ciudad;
        this.entrenador = Entrenador;
        this.numJugadores = NumJugadores;
    }

    public void Convocar() {
        System.out.println("El entrenador " + this.entrenador + " convocó a " + this.numJugadores + " jugadores.");
        System.out.println("Se jugará en la ciudad de " + this.ciudad);
    }

    public void Jugar() {
        System.out.println("El equipo " + this.nombre + " está jugando el partido.");
    }
    @Override
    public String toString() {
        return String.format("Equipo: %s | Ciudad: %s | Entrenador: %s | Jugadores: %d", 
                             this.nombre, this.ciudad, this.entrenador, this.numJugadores);
    }
}
