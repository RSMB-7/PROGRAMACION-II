package Practica3;

public class Pila {
    	private long[] arreglo;
    	private int top;
    	private int n;
    
    public Pila(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.top = -1;
    }
    
    public void push(long e) {
        if (!isFull()) {
            arreglo[++top] = e;
        }
    }
    
    public long pop() {
        return isEmpty() ? -1 : arreglo[top--];
    }
    
    public long peek() {
        return isEmpty() ? -1 : arreglo[top];
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == n - 1;
    }
}
