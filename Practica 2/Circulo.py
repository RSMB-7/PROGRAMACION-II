import tkinter as tk
import math

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return self.x, self.y

    def coord_polares(self):
        radio = math.sqrt(self.x * self.x + self.y * self.y)
        angulo = math.atan2(self.y, self.x)
        angulo = math.degrees(angulo)
        return radio, angulo

    def __str__(self):
        return "({:.2f},{:.2f})".format(self.x, self.y)

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return "Círculo con centro en {} y radio {:.2f}".format(self.centro, self.radio)

    def dibujaCirculo(self):
        ventana = tk.Tk()
        ventana.title("Círculo con Ejes")
        # Tamaño de la ventana
        ancho = 350
        alto = 350
        # Crear una ventana
        lienzo = tk.Canvas(ventana, width=ancho, height=alto, bg='white')
        lienzo.pack()
        # Dibujar ejes
        centro_x = ancho // 2   #se divide entre 2 para encontrar el centro
        centro_y = alto // 2
        
        x0, y0 = self.centro.coord_cartesianas()
        x0 += centro_x  
        y0 = centro_y - y0

        # Dibujar el círculo
        lienzo.create_oval(
            x0 - self.radio, y0 - self.radio,  
            x0 + self.radio, y0 + self.radio,  
            outline='blue', width=2
        )
        lienzo.create_line(0, centro_y, ancho, centro_y, fill='black', width=2)  
        lienzo.create_line(centro_x, 0, centro_x, alto, fill='black', width=2)  
        # Marcar el origen
        lienzo.create_oval(centro_x - 4, centro_y - 4, centro_x + 4, centro_y + 4, fill='red')
        
        ventana.mainloop()

c = Punto(50, 50)
circulo = Circulo(c, 50)  # Radio
print(circulo)
radio, angulo = c.coord_polares()
circulo.dibujaCirculo()
