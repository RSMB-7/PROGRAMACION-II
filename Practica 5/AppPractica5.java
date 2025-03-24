package Practica_5;

public class AppPractica5 {

    public static void main(String[] args) {
        Equipo E1 = new Equipo("Internazionale de Milan", "Milano", "Rafa Marquez", 15);
        E1.Convocar();
        E1.Jugar();
        System.out.println(E1);
        
        Monitor M1= new Monitor ("Samsung", 27, "4K");
        M1.Encender();
        M1.CambiarResolucion();
        M1.CambiarEntrada();
        System.out.println(M1);
        
        Aerolinea A1 = new Aerolinea ("TAMEP", "Bolivia", 10);
        A1.programarVuelo();
        A1.Salida();
        A1.Disponibilidad();
        System.out.println(A1);
    }
}