package Practica_5;

public class Aerolinea {
	public String nombre;
	public String paisOrigen;
	public int cantidadAviones;
		
	public Aerolinea (String nombre, String paisOrigen, int cantidadAviones) {
		this.nombre=nombre;
		this.paisOrigen=paisOrigen;
		this.cantidadAviones=cantidadAviones;
	}
	public void programarVuelo() {
		System.out.println("La aerolinea "+ this.nombre + " ha programado un nuevo vuelo.");
	}

	public void Salida() {
		System.out.println("Salida de:"+ this.paisOrigen );
	}
	public void Disponibilidad() {
		System.out.println("Aviones de la aerolinea "+this.nombre +" Cantidad disponibles: "+ this.cantidadAviones );
	}
	@Override
	public String toString() {
	    return "Aerolínea: " + this.nombre + " | País: " + this.paisOrigen + " | Aviones disponibles: " + this.cantidadAviones;
	}

}
