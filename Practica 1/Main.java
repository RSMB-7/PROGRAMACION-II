public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);

        float[] cartesianas = p1.coordCartesianas();
        System.out.println(cartesianas[0] + " " + cartesianas[1]);
        float[] polares = p1.coordPolares();
        System.out.println(polares[0] + " " + polares[1]);
        System.out.println(p1);
    }
}
