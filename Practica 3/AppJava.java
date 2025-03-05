package Practica3;

public class AppJava {
    public static void main(String[] args) {
        Pila pila = new Pila(5);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        
        System.out.println("Elemento en la cima: " + pila.peek());
        System.out.println("Eliminando: " + pila.pop());
        System.out.println("Elemento en la cima: " + pila.peek());
        
        Cola cola = new Cola(5);
        cola.insert(100);
        cola.insert(200);
        cola.insert(300);
        
        System.out.println("Elemento al frente: " + cola.peek());
        System.out.println("Eliminando: " + cola.remove());
        System.out.println("Elemento al frente: " + cola.peek());
    }
}
