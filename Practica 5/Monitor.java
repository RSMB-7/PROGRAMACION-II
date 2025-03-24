package Practica_5;

public class Monitor {
	public String marca;
    public int tamaño; // en pulgadas
    public String resolucion;
    
    public Monitor (String marca, int tamaño, String resolucion) {
    	this.marca=marca;
    	this.tamaño=tamaño;
    	this.resolucion=resolucion;
    }
    
    public void Encender() {
        System.out.println(this.marca + " está encendido.");
    }
    public void CambiarResolucion() {
        System.out.println("La resolucion del monitor " + this.marca + " ha sido ajustada a "+this.resolucion);
    }

    public void CambiarEntrada() {
        System.out.println("Se ha cambiado la entrada del monitor " + this.marca);
    }
    @Override
    public String toString() {
        return "Monitor: " + this.marca + " | Tamaño: " + this.tamaño + " pulgadas | Resolución: " + this.resolucion;
    }
}
