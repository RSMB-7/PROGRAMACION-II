public class Punto {
    private float x;
    private float y;
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] coordCartesianas() {
        return new float[]{x, y};
    }
    public float[] coordPolares() {
        float radio = (float) Math.sqrt(x * x + y * y);
        float angulo = (float) Math.atan2(y, x);
        return new float[]{radio, angulo};
    }
    // Método toString para imprimir el punto
    @Override
    public String toString() {
        return x + " " + y;
    }
}
