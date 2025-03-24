import math

class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def get_discriminante(self):
        return self.b ** 2 - 4 * self.a * self.c

    def get_raiz1(self):
        discriminante = self.get_discriminante()
        if discriminante >= 0:
            return (-self.b + math.sqrt(discriminante)) / (2 * self.a)
        return None

    def get_raiz2(self):
        discriminante = self.get_discriminante()
        if discriminante > 0:
            return (-self.b - math.sqrt(discriminante)) / (2 * self.a)
        return None

    def resolver(self):
        discriminante = self.get_discriminante()
        if discriminante > 0:
            return f"La ecuación tiene dos raíces: {self.get_raiz1()} y {self.get_raiz2()}"
        elif discriminante == 0:
            return f"La ecuación tiene una raíz: {self.get_raiz1()}"
        else:
            return "La ecuación no tiene raíces reales"

class Estadisticas:
    def __init__(self, numeros):
        self.numeros = numeros
    
    def promedio(self):
        return sum(self.numeros) / len(self.numeros)
    
    def desviacion_estandar(self):
        promedio = self.promedio()
        suma_cuadrados = sum((x - promedio) ** 2 for x in self.numeros)
        return math.sqrt(suma_cuadrados / (len(self.numeros) - 1))
    
    def calcular(self):
        return f"El promedio es {self.promedio():.2f}\nLa desviación estándar es {self.desviacion_estandar():.5f}"

if __name__ == "__main__":
    opcion = int(input("Seleccione el ejercicio (1: Ecuación Cuadrática, 2: Estadísticas): "))
    
    if opcion == 1:
        a, b, c = map(float, input("Ingrese a, b, c: ").split())
        ecuacion = EcuacionCuadratica(a, b, c)
        print(ecuacion.resolver())
    elif opcion == 2:
        numeros = list(map(float, input("Ingrese 10 números separados por espacio: ").split()))
        if len(numeros) != 10:
            print("Debe ingresar exactamente 10 números.")
        else:
            estadisticas = Estadisticas(numeros)
            print(estadisticas.calcular())
