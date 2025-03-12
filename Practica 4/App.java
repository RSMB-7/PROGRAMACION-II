public class App {
    public static void main(String[] args) throws Exception {
       FiguraGeometrica f1 = new FiguraGeometrica();
       FiguraGeometrica f2 = new FiguraGeometrica();
       System.out.println("Circulo: "+f1.area(5));
       System.out.println("Rectangulo: "+f2.area(4,6));
       FiguraGeometrica f3 = new FiguraGeometrica();
       System.out.println("Triangulo Rectangulo: "+ f3.area(3, 4));
       FiguraGeometrica f4 = new FiguraGeometrica();
       System.out.println("Trapecio: "+f4.area(4, 3, 5));
       FiguraGeometrica f5 = new FiguraGeometrica();
       System.out.println("Pentagono: "+f5.area(3.0, 4));
    }
}
