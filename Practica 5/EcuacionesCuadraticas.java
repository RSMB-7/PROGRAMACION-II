package Practica5;

public class EcuacionesCuadraticas {
	public double a, b, c;
	
	 public EcuacionesCuadraticas (double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	    }
	 
	  public double getDiscriminante() {
	        return (b * b) - (4 * a * c);
	    }
	  
	  public Double getRaiz1() {
	        double d = getDiscriminante();
	        if (d >= 0) {
	            return (-b + Math.sqrt(d)) / (2 * a);
	        }
	        return null;
	    }

	    public Double getRaiz2() {
	        double d = getDiscriminante();
	        if (d > 0) {
	            return (-b - Math.sqrt(d)) / (2 * a);
	        }
	        return null;
	    }
}
