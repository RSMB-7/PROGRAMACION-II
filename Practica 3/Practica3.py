class Pila:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.top = -1

    def push(self, e):
        if not self.is_full():
            self.top += 1
            self.arreglo[self.top] = e

    def pop(self):
        if not self.is_empty():
            valor = self.arreglo[self.top]
            self.top -= 1
            return valor
        return -1

    def peek(self):
        return -1 if self.is_empty() else self.arreglo[self.top]

    def is_empty(self):
        return self.top == -1

    def is_full(self):
        return self.top == self.n - 1

class Cola:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1

    def insert(self, e):
        if not self.is_full():
            self.fin += 1
            self.arreglo[self.fin] = e

    def remove(self):
        if not self.is_empty():
            valor = self.arreglo[self.inicio]
            self.inicio += 1
            return valor
        return -1

    def peek(self):
        return -1 if self.is_empty() else self.arreglo[self.inicio]

    def is_empty(self):
        return self.inicio > self.fin

    def is_full(self):
        return self.fin == self.n - 1

    def size(self):
        return self.fin - self.inicio + 1

class AppPython:
    def main():
        pila = Pila(5)
        pila.push(10)
        pila.push(20)
        pila.push(30)
        print("Elemento en la cima:", pila.peek())
        print("Eliminando:", pila.pop())
        print("Elemento en la cima:", pila.peek())
        
        cola = Cola(5)
        cola.insert(40)
        cola.insert(50)
        cola.insert(60)
        print("Elemento al frente:", cola.peek())
        print("Eliminando:", cola.remove())
        print("Elemento al frente:", cola.peek())

    if __name__ == "__main__":
        main()
