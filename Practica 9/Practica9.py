import random
import math
from abc import ABC, abstractmethod

class Coloreado(ABC):
    @abstractmethod
    def como_colorear(self):
        pass

class Figura(ABC):
    def __init__(self, color):
        self.color = color

    def set_color(self, color):
        self.color = color

    def get_color(self):
        return self.color

    def __str__(self):
        return f"Color: {self.color}"

    @abstractmethod
    def area(self):
        pass

    @abstractmethod
    def perimetro(self):
        pass

class Cuadrado(Figura, Coloreado):
    def __init__(self, lado, color):
        super().__init__(color)
        self.lado = lado

    def area(self):
        return self.lado ** 2

    def perimetro(self):
        return 4 * self.lado

    def como_colorear(self):
        return "Colorear los cuatro lados"

    def __str__(self):
        return f"Cuadrado - Color: {self.color}, Lado: {self.lado}"

class Circulo(Figura):
    def __init__(self, radio, color):
        super().__init__(color)
        self.radio = radio

    def area(self):
        return math.pi * self.radio ** 2

    def perimetro(self):
        return 2 * math.pi * self.radio

    def __str__(self):
        return f"Círculo - Color: {self.color}, Radio: {self.radio}"

def crear_figuras():
    figuras = []
    for _ in range(5):
        tipo = random.randint(1, 2)  # 1: Cuadrado, 2: Círculo
        color = random.choice(["Rojo", "Azul", "Verde"])
        if tipo == 1:
            lado = random.randint(1, 10)
            figura = Cuadrado(lado, color)
        else:
            radio = random.randint(1, 10)
            figura = Circulo(radio, color)
        figuras.append(figura)
    return figuras

def mostrar_datos(figuras):
    for figura in figuras:
        print(figura)
        print(f"Área: {figura.area():.2f}")
        print(f"Perímetro: {figura.perimetro():.2f}")
        if isinstance(figura, Coloreado):
            print("Colorear: " + figura.como_colorear())
        print("-" * 30)

figuras = crear_figuras()
mostrar_datos(figuras)
