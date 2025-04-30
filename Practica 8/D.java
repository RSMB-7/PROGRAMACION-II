package Practica8;

public class D extends A implements B {
    private int y;

    public D(int x, int y, int z) {
        super(x, z);
        this.y = y;
    }

    @Override
    public void incrementaYZ() {
        y++;
        z++;
    }

    @Override
    public void incrementaZ() {
        z++;
    }

    public void incrementaXYZ() {
        x++;
        y++;
        z++;
    }

    public void mostrar() {
        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }
}
