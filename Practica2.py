import math
class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def coord_cartesianas(self):
        return self.x, self.y
    def coord_polares(self):
        radio = math.sqrt(self.x * self.x + self.y * self.y)
        angulo = math.atan(self.y/self.y)
        angulo = math.degrees(angulo)
        return radio, angulo
    def __str__(self):
        return "({:.2f},{:.2f})".format(self.x, self.y)
p1 = Punto(0,3)
print(p1)
x,y = p1.coord_cartesianas()
print(x,y)
r,a = p1.coord_polares()
print(r,a)

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return "[{} - {}]".format(self.p1, self.p2)

    def dibujaLinea(self):
        print("Dibujando línea de {} a {}".format(self.p1, self.p2))
a = Punto(1, 2)
b = Punto(3, 4)
linea = Linea(a, b)
print(linea)
linea.dibujaLinea()

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio
    def __str__(self):
        return "Círculo con centro en {} y radio {:.2f}".format(self.centro, self.radio)

    def dibujaCirculo(self):
        print("Dibujando círculo con centro en {} y radio {:.2f}".format(self.centro, self.radio))
c = Punto(5, 5)
circulo = Circulo(c, 3)
print(circulo)
circulo.dibujaCirculo()

