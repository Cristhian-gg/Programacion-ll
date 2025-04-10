
class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza

    def hacerSonido(self):
        print(f"{self.nombre} dice: ¡Guau guau!")

    def moverse(self):
        print(f"{self.nombre} corre con sus patas.")


class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color

    def hacerSonido(self):
        print(f"{self.nombre} dice: ¡Miau!")

    def moverse(self):
        print(f"{self.nombre} salta ágilmente.")


class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    def hacerSonido(self):
        print(f"{self.nombre} dice: ¡Pío pío!")

    def moverse(self):
        print(f"{self.nombre} vuela por los cielos.")



perro = Perro("Firulais", 3, "Labrador")
gato = Gato("Michi", "Blanco")
pajaro = Pajaro("Piolín", "Canario")


print(">>> Sonidos:")
perro.hacerSonido()
gato.hacerSonido()
pajaro.hacerSonido()

print("\n>>> Movimiento:")
perro.moverse()
gato.moverse()
pajaro.moverse()
