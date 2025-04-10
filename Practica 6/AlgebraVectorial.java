package Practica6;

public class AlgebraVectorial {
	public double x, y, z;
	
	public AlgebraVectorial (double x, double y, double z ){
		this.x=x;
		this.y=y;
		this.z=z;
	}

    public boolean perpendicular(AlgebraVectorial b) {
        return this.x * b.x + this.y * b.y + this.z * b.z == 0;
    }
    
    public boolean perpendicular(AlgebraVectorial b, boolean mutual) {
        return Math.abs(this.x - b.x) == Math.abs(b.x - this.x) &&
               Math.abs(this.y - b.y) == Math.abs(b.y - this.y) &&
               Math.abs(this.z - b.z) == Math.abs(b.z - this.z);
    }
    
    public boolean perpendicular(AlgebraVectorial b, int type) {
        double normA = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        double normB = Math.sqrt(b.x * b.x + b.y * b.y + b.z * b.z);
        double sumNorms = Math.pow(normA + normB, 2);
        return sumNorms == (normA * normA + normB * normB);
    }
    
    public boolean perpendicular(AlgebraVectorial b, double check) {
        double normSum = Math.sqrt(Math.pow(this.x + b.x, 2) + Math.pow(this.y + b.y, 2) + Math.pow(this.z + b.z, 2));
        double normDiff = Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2) + Math.pow(this.z - b.z, 2));
        return normSum == normDiff;
    }
    
    public boolean paralela(AlgebraVectorial b) {
        return this.x / b.x == this.y / b.y && this.y / b.y == this.z / b.z;
    }
    
    public boolean paralela(AlgebraVectorial b, boolean cross) {
        return (this.y * b.z - this.z * b.y == 0) &&
               (this.z * b.x - this.x * b.z == 0) &&
               (this.x * b.y - this.y * b.x == 0);
    }
    
    public AlgebraVectorial proyeccion(AlgebraVectorial b) {
        double escalar = (this.x * b.x + this.y * b.y + this.z * b.z) /
                         (b.x * b.x + b.y * b.y + b.z * b.z);
        return new AlgebraVectorial(escalar * b.x, escalar * b.y, escalar * b.z);
    }
    
    public double componente(AlgebraVectorial b) {
        double normB = Math.sqrt(b.x * b.x + b.y * b.y + b.z * b.z);
        return (this.x * b.x + this.y * b.y + this.z * b.z) / normB;
    }
}
