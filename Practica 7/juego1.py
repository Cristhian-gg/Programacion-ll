import random

# Clase principal
class Juego:
    def __init__(self):
        self.vidas = 3
        self.puntos = 0

    def reiniciar(self):
        self.vidas = 3
        print("Juego iniciado. Tienes", self.vidas, "vidas.")

    def perder_vida(self):
        self.vidas -= 1
        print("Vida perdida. Te quedan", self.vidas, "vidas.")
        return self.vidas > 0

    def sumar_punto(self):
        self.puntos += 1
        print("¡Ganaste un punto! Total puntos:", self.puntos)

# Clase hija
class AdivinaNumero(Juego):
    def __init__(self):
        super().__init__()
        self.numero = 0

    def jugar(self):
        self.reiniciar()
        self.numero = random.randint(0, 10)

        while self.vidas > 0:
            try:
                intento = int(input("Adivina el número (0 al 10): "))
            except ValueError:
                print("Solo se aceptan números.")
                continue

            if intento == self.numero:
                print("¡Correcto!")
                self.sumar_punto()
                break
            else:
                print("Incorrecto.")
                if intento < self.numero:
                    print("Pista: el número es mayor.")
                else:
                    print("Pista: el número es menor.")
                if not self.perder_vida():
                    print("Perdiste el juego.")
                    break

# Ejecucion
if __name__ == "__main__":
    juego = AdivinaNumero()
    juego.jugar()
