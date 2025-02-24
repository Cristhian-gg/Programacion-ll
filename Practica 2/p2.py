import math
import matplotlib.pyplot as plt
import numpy as np

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return self.x, self.y

    def coord_polares(self):
        radio = math.sqrt(self.x ** 2 + self.y ** 2)
        angulo = math.degrees(math.atan2(self.y, self.x))
        return radio, angulo

    def __str__(self):
        return "({:.2f},{:.2f})".format(self.x, self.y)

class Linea:
    def __init__(self, punto1, punto2):
        self.punto1 = punto1
        self.punto2 = punto2
    
    def longitud(self):
        return math.sqrt((self.punto2.x - self.punto1.x) ** 2 + (self.punto2.y - self.punto1.y) ** 2)
    
    def __str__(self):
        return "Linea desde {} hasta {}".format(self.punto1, self.punto2)

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = radio
    
    def area(self):
        return math.pi * self.radio ** 2
    
    def perimetro(self):
        return 2 * math.pi * self.radio
    
    def __str__(self):
        return "Circulo con centro en {} y radio {:.2f}".format(self.centro, self.radio)

# Función para graficar

def graficar(p1, p2, linea, circulo):
    fig, ax = plt.subplots()
    
    # Graficar línea
    ax.plot([p1.x, p2.x], [p1.y, p2.y], 'ro-', label="Línea")
    
    # Graficar círculo
    circle = plt.Circle((circulo.centro.x, circulo.centro.y), circulo.radio, color='b', fill=False, label="Círculo")
    ax.add_patch(circle)
    
    ax.text(p1.x, p1.y, "P1", fontsize=12, verticalalignment='bottom', horizontalalignment='right')
    ax.text(p2.x, p2.y, "P2", fontsize=12, verticalalignment='bottom', horizontalalignment='left')
    ax.text(circulo.centro.x, circulo.centro.y, "Centro", fontsize=12, verticalalignment='top', horizontalalignment='left')
    
    ax.set_xlim(min(p1.x, p2.x, circulo.centro.x - circulo.radio) - 2, max(p1.x, p2.x, circulo.centro.x + circulo.radio) + 2)
    ax.set_ylim(min(p1.y, p2.y, circulo.centro.y - circulo.radio) - 2, max(p1.y, p2.y, circulo.centro.y + circulo.radio) + 2)
    ax.set_aspect('equal')
    ax.grid(True)
    ax.legend()
    plt.show()

p1 = Punto(0, 3)
p2 = Punto(4, 0)
linea = Linea(p1, p2)
circulo = Circulo(p1, 5)

graficar(p1, p2, linea, circulo)
