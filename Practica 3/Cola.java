package Practica3;

public class Cola {
    	private long[] arreglo;
    	private int inicio, fin, n;
    
    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
    }
    
    public void insert(long e) {
        if (!isFull()) {
            arreglo[++fin] = e;
        }
    }
    
    public long remove() {
        return isEmpty() ? -1 : arreglo[inicio++];
    }
    
    public long peek() {
        return isEmpty() ? -1 : arreglo[inicio];
    }
    
    public boolean isEmpty() {
        return inicio > fin;
    }
    
    public boolean isFull() {
        return fin == n - 1;
    }
    
    public int size() {
        return fin - inicio + 1;
    }
}