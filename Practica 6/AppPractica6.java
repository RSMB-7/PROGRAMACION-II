package Practica6;

public class AppPractica6 {

	public static void main(String[] args) {
		 AlgebraVectorial v1 = new AlgebraVectorial(3, 4, 0);
	     AlgebraVectorial v2 = new AlgebraVectorial(5, 3, 0);
	     System.out.println("----- EJERCICIO 1 -----");
	     System.out.println("¿Son perpendiculares? " + v1.perpendicular(v2));
	     System.out.println("¿Son mutuamente ortogonales? " + v1.perpendicular(v2, true));
	     System.out.println("¿Cumplen |a + b| = |a - b|? " + v1.perpendicular(v2, 0.0));
	     System.out.println("¿Son paralelos? " + v1.paralela(v2));
	       
	     AlgebraVectorial proy = v1.proyeccion(v2);
	     System.out.println("Proyección de v1 sobre v2: (" + proy.x + ", " + proy.y + ", " + proy.z + ")");
	        
	     System.out.println("Componente de v1 en dirección de v2: " + v1.componente(v2));
	     
	     VectorTridimensional vt1 = new VectorTridimensional(3, 4, 0);
	     VectorTridimensional vt2 = new VectorTridimensional(1, 3, 0);
	       
	     System.out.println("----- EJERCICIO 2 -----");
	     System.out.println("Suma de vt1 y vt2: " + vt1.sumar(vt2));
	     System.out.println("Multiplicación de vt1 por 2: " + vt1.multiplicar(2));
	     System.out.println("Longitud de vt1: " + vt1.longitud());
	     System.out.println("Vector normalizado vt1: " + vt1.normalizar());
	     System.out.println("Producto escalar vt1 y vt2: " + vt1.productoEscalar(vt2));
	     System.out.println("Producto vectorial vt1 y vt2: " + vt1.productoVectorial(vt2));
	     System.out.println("¿Son perpendiculares? " + vt1.esPerpendicular(vt2));
	     System.out.println("¿Son paralelos? " + vt1.esParalelo(vt2));
	     System.out.println("Proyección de vt1 sobre vt2: " + vt1.proyeccion(vt2));
	     System.out.println("Componente de vt1 en dirección de vt2: " + vt1.componente(vt2));
	   }
}
