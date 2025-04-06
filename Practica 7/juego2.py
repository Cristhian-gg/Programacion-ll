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
class ParOImpar(Juego):
    def __init__(self):
        super().__init__()

    def jugar(self):
        self.reiniciar()

        while self.vidas > 0:
            eleccion = input("Elige (P)ar o (I)mpar: ").upper()
            if eleccion not in ["P", "I"]:
                print("Opción inválida.")
                continue

            jugador = random.randint(1, 5)
            maquina = random.randint(1, 5)
            total = jugador + maquina

            print(f"Tú sacaste {jugador}, la máquina sacó {maquina}. Suma = {total}")

            if total % 2 == 0:
                resultado = "P"
            else:
                resultado = "I"

            if eleccion == resultado:
                print("¡Ganaste!")
                self.sumar_punto()
            else:
                print("Perdiste.")
                if not self.perder_vida():
                    print("Te quedaste sin vidas.")
                    break

# Ejecutar
if __name__ == "__main__":
    juego = ParOImpar()
    juego.jugar()
