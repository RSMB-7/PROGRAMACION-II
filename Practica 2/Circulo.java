import javax.swing.*;
import java.awt.*;

    public class Circulo {
    public Punto centro;
    public float radio;

    public Circulo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Centro: " + centro + ", Radio: " + String.format("%.2f", radio);
    }

    public void dibujaCirculo() {
        JFrame ventana = new JFrame("Dibujo de Círculo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.add(new LienzoCirculo(centro, radio));
        ventana.setVisible(true);
    }
}

class LienzoCirculo extends JPanel {
    private Punto centro;
    private float radio;

    public LienzoCirculo(Punto centro, float radio) {
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int ancho = getWidth();
        int alto = getHeight();

        int centroX = ancho / 2;
        int centroY = alto / 2;

        int x = centroX + (int) centro.coord_cartesianas()[0] - (int) radio;
        int y = centroY - (int) centro.coord_cartesianas()[1] - (int) radio;
        int diametro = (int) (radio * 2);

        g.setColor(Color.BLACK);
        g.drawLine(centroX, 0, centroX, alto); // Eje Y
        g.drawLine(0, centroY, ancho, centroY); // Eje X

        g.setColor(Color.BLUE);
        g.drawOval(x, y, diametro, diametro);
    }
}
