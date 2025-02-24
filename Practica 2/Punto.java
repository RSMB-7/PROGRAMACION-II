import java.text.DecimalFormat;

    public class Punto {
    private float x;
    private float y;

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] coord_cartesianas() {
        return new float[]{x, y};
    }

    public float[] coord_polares() {
        float radio = (float) Math.sqrt(x * x + y * y);
        float angulo = (float) Math.toDegrees(Math.atan2(y, x));
        return new float[]{radio, angulo};
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "(" + df.format(x) + ", " + df.format(y) + ")";
    }
}
