package Practica5;
import java.util.Scanner;
import java.util.Locale;
public class AppPractica5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);  // Permitir ingreso con punto decimal

        System.out.println("Seleccione una opción:");
        System.out.println("1. Resolver ecuación cuadrática");
        System.out.println("2. Calcular promedio y desviación estándar");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.println("Ingrese a, b, c:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            EcuacionesCuadraticas ecuacion = new EcuacionesCuadraticas(a, b, c);
            double d = ecuacion.getDiscriminante();

            if (d > 0) {
                System.out.printf("La ecuación tiene dos raíces %.5f y %.5f%n", 
                                   ecuacion.getRaiz1(), ecuacion.getRaiz2());
            } else if (d == 0) {
                System.out.printf("La ecuación tiene una raíz %.5f%n", ecuacion.getRaiz1());
            } else {
                System.out.println("La ecuación no tiene raíces reales");
            }

        } else if (opcion == 2) {
            System.out.println("Ingrese 10 números:");
            double[] numeros = new double[10];
            for (int i = 0; i < 10; i++) {
                numeros[i] = sc.nextDouble();
            }

            Estadisticas estadisticas = new Estadisticas(numeros);
            System.out.printf("El promedio es %.2f%n", estadisticas.promedio());
            System.out.printf("La desviación estándar es %.5f%n", estadisticas.desviacion());
        }

        sc.close();
    }
}
