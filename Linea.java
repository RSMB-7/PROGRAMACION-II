import javax.swing.*;
import java.awt.*;

    public class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "[" + p1 + " - " + p2 + "]";
    }

    public void dibujaLinea() {
        JFrame ventana = new JFrame("Dibujo de Línea");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.add(new LienzoLinea(p1, p2));
        ventana.setVisible(true);
    }
}

class LienzoLinea extends JPanel {
    private Punto p1, p2;

    public LienzoLinea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int ancho = getWidth();
        int alto = getHeight();

        int centroX = ancho / 2;
        int centroY = alto / 2;

        int x1 = centroX + (int) p1.coord_cartesianas()[0];
        int y1 = centroY - (int) p1.coord_cartesianas()[1];
        int x2 = centroX + (int) p2.coord_cartesianas()[0];
        int y2 = centroY - (int) p2.coord_cartesianas()[1];

        g.setColor(Color.BLACK);
        g.drawLine(centroX, 0, centroX, alto); // Eje Y
        g.drawLine(0, centroY, ancho, centroY); // Eje X

        g.setColor(Color.RED);
        g.drawLine(x1, y1, x2, y2);
    }
}
