import math

class FiguraGeometrica:
    def area(self, *args):
        if len(args) == 1:  # Círculo
            return math.pi * args[0] * args[0]
        elif len(args) == 2:  # Rectángulo
            base, altura = args
            if isinstance(base, (int, float)) and isinstance(altura, (int, float)):
                return (base * altura) / 2  # Triángulo Rectángulo
            return base * altura  
        elif len(args) == 3:  # Trapecio
            a, b, h = args
            return (a + b) * h / 2
        elif len(args) == 2 and isinstance(args[0], float) and isinstance(args[1], (int, float)):  # Pentágono
            apotema, perimetro = args
            return (apotema * perimetro) / 2
        else:
            raise ValueError("Número de argumentos no válido")

f = FiguraGeometrica()
print("Círculo:", f.area(5))             
print("Rectángulo:", f.area(4.0, 6.0))   
print("Triángulo Rectángulo:", f.area(3, 4)) 
print("Trapecio:", f.area(4, 3, 5))      
print("Pentágono:", f.area(3.0, 4))      
