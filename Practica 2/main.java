public class main {
    public static void main (String[] args) {

        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(50, 50);

        //Linea
        Linea linea = new Linea(p1, p2);
        System.out.println(linea);
        linea.dibujaLinea();

        //Circulo
        Circulo circulo = new Circulo(new Punto(0, 0), 50);
        System.out.println(circulo);
        circulo.dibujaCirculo();
    }
}
