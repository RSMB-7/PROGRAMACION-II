import tkinter as tk
class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return self.x, self.y

    def __str__(self):
        return "({:.2f}, {:.2f})".format(self.x, self.y)

class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return "[{} - {}]".format(self.p1, self.p2)

    def dibujaLinea(self):
        ventana = tk.Tk()
        ventana.title("Línea")

        ancho = 400
        alto = 400
        lienzo = tk.Canvas(ventana, width=ancho, height=alto, bg='white')
        lienzo.pack()
        # Definir el centro
        centro_x = ancho // 2
        centro_y = alto // 2
        # Ajustar coordenadas
        x1 = centro_x + self.p1.x
        y1 = centro_y - self.p1.y  
        x2 = centro_x + self.p2.x
        y2 = centro_y - self.p2.y
        # Dibujar la línea
        lienzo.create_line(x1, y1, x2, y2, fill='red', width=2)
        # Dibujar el eje X y eje Y
        lienzo.create_line(centro_x, 0, centro_x, alto, fill="black", dash=(4, 2))
        lienzo.create_line(0, centro_y, ancho, centro_y, fill="black", dash=(4, 2))

        ventana.mainloop()
p1 = Punto(0, 0)
p2 = Punto(50, 50)
linea = Linea(p1, p2)
print(linea)
linea.dibujaLinea()
