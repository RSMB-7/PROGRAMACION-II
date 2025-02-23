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
        # Crear ventana mediante tkinter
        # permite crear interfaces gráficas de usuario.
        ventana = tk.Tk()
        ventana.title("Círculo con Ejes")
        
        # Tamaño de la ventana creada
        ancho = 350
        alto = 350
        
        # Crear una hoja en blanco
        lienzo = tk.Canvas(ventana, width=ancho, height=alto, bg='white')
        lienzo.pack()
        # Dibujar los ejes coordenados
        centro_x = ancho // 2   #se divide entre 2 para encontrar el centro
        centro_y = alto // 2    #se divide entre 2 para encontrar el centro
        
        # Coordenadas del centro del círculo respecto a los ejes
        x0, y0 = self.centro.coord_cartesianas()
        x0 += centro_x  # Ajustar en base al eje X
        y0 = centro_y - y0  # eje Y (invertir porque la Y crece hacia abajo en tkinter)

        # Dibujar el círculo
        lienzo.create_oval(
            x0 - self.radio, y0 - self.radio,  # Esquina superior izquierda
            x0 + self.radio, y0 + self.radio,  # Esquina inferior derecha
            outline='blue', width=2
        )
        # Dibujar los ejes después del círculo
        lienzo.create_line(0, centro_y, ancho, centro_y, fill='black', width=2)  # Eje X de <- a ->
        lienzo.create_line(centro_x, 0, centro_x, alto, fill='black', width=2)  # Eje Y de ▲
        # Marcar el origen (0,0 en el plano cartesiano)
        lienzo.create_oval(centro_x - 4, centro_y - 4, centro_x + 4, centro_y + 4, fill='red')
        
        # Mostrar las coordenadas polares
        radio, angulo = self.centro.coord_polares()
        coordenadas_texto = f"Radio: {radio:.2f}, Ángulo: {angulo:.2f}°"
        lienzo.create_text(10, 10, anchor='nw', text=coordenadas_texto, fill='green', font=('Arial', 9, 'bold'))
        # Mostrar la ventana
        ventana.mainloop()

# Ejemplo
c = Punto(50, 50)  # Coordenadas relativas al origen
circulo = Circulo(c, 30)  # Radio de 40 píxeles
print(circulo)
radio, angulo = c.coord_polares()
print("Coordenadas polares => Radio: {:.2f}, Ángulo: {:.2f}°".format(radio, angulo))
circulo.dibujaCirculo()
