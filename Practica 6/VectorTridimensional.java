package Practica6;

public class VectorTridimensional {
	 public double x, y, z;
	    
	    public VectorTridimensional(double x, double y, double z) {
	        this.x = x;
	        this.y = y;
	        this.z = z;
	    }
	    
	    public VectorTridimensional sumar(VectorTridimensional b) {
	        return new VectorTridimensional(this.x + b.x, this.y + b.y, this.z + b.z);
	    }
	    
	    public VectorTridimensional multiplicar(double r) {
	        return new VectorTridimensional(r * this.x, r * this.y, r * this.z);
	    }
	    
	    public double longitud() {
	        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
	    }
	    
	    public VectorTridimensional normalizar() {
	        double norm = this.longitud();
	        return new VectorTridimensional(this.x / norm, this.y / norm, this.z / norm);
	    }
	    
	    public double productoEscalar(VectorTridimensional b) {
	        return this.x * b.x + this.y * b.y + this.z * b.z;
	    }
	    
	    public VectorTridimensional productoVectorial(VectorTridimensional b) {
	        return new VectorTridimensional(
	            this.y * b.z - this.z * b.y,
	            this.z * b.x - this.x * b.z,
	            this.x * b.y - this.y * b.x
	        );
	    }
	    
	    public boolean esPerpendicular(VectorTridimensional b) {
	        return this.productoEscalar(b) == 0;
	    }
	    
	    public boolean esParalelo(VectorTridimensional b) {
	        VectorTridimensional cruz = this.productoVectorial(b);
	        return cruz.x == 0 && cruz.y == 0 && cruz.z == 0;
	    }
	    
	    public VectorTridimensional proyeccion(VectorTridimensional b) {
	        double escalar = this.productoEscalar(b) / (b.longitud() * b.longitud());
	        return new VectorTridimensional(escalar * b.x, escalar * b.y, escalar * b.z);
	    }
	    
	    public double componente(VectorTridimensional b) {
	        return this.productoEscalar(b) / b.longitud();
	    }
}
