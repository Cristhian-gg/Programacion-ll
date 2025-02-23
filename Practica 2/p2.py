import math

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

# Ejemplo de uso:
p1 = Punto(0, 3)
p2 = Punto(4, 0)
linea = Linea(p1, p2)
circulo = Circulo(p1, 5)

print(linea)
print("Longitud de la línea:", linea.longitud())
print(circulo)
print("Área del círculo:", circulo.area())
print("Perímetro del círculo:", circulo.perimetro())
