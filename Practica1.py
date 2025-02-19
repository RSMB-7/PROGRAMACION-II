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

