import math

class Figura:
    def calcular_area(self):
        pass

class Circulo(Figura):
    def __init__(self, radio):
        self.radio = radio

    def calcular_area(self):
        return math.pi * self.radio ** 2

class Rectangulo(Figura):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return self.base * self.altura

class TrianguloRectangulo(Figura):
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        return (self.base * self.altura) / 2

class Trapecio(Figura):
    def __init__(self, base_mayor, base_menor, altura):
        self.base_mayor = base_mayor
        self.base_menor = base_menor
        self.altura = altura

    def calcular_area(self):
        return ((self.base_mayor + self.base_menor) * self.altura) / 2

class Pentagono(Figura):
    def __init__(self, lado, apotema):
        self.lado = lado
        self.apotema = apotema

    def calcular_area(self):
        perimetro = self.lado * 5
        return (perimetro * self.apotema) / 2

# Resultados
figuras = [
    Circulo(5),
    Rectangulo(4, 6),
    TrianguloRectangulo(3, 4),
    Trapecio(6, 4, 5),
    Pentagono(5, 3)
]

for figura in figuras:
    print(f"Área de {figura.__class__.__name__}: {figura.calcular_area()}")
