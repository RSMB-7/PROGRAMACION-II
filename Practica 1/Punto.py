import math
class Punto:
    def _init_(self, x, y):
        self.x=x
        self.y=y
    def coord_cartesianas (self):
        return self.x, self.y
    def coord_polares(self):
        radio= math.sqrt(self.x*self.x +self.y*self.y )
        angulo=math.atan(self.y/self.x)
        return radio, angulo
    def _str_ (self):
        return str (self.x)+" "+str(self.y)
p1 = Punto(2,3)
x,y = p1.coord_cartesianas()
print(x,y)
r,a = p1.coord_polares()
print(r,a)
print(p1)
