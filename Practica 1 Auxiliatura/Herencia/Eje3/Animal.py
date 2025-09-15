# Clase base Animal
class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def desplazarse(self):
        print(f"{self.nombre} se está desplazando.")



class Leon(Animal):
    def desplazarse(self):
        print(f"{self.nombre} camina majestuosamente por la sabana.")



class Pinguino(Animal):
    def desplazarse(self):
        print(f"{self.nombre} nada ágilmente en el agua.")



class Canguro(Animal):
    def desplazarse(self):
        print(f"{self.nombre} salta rápidamente usando sus patas traseras.")


# tipo main
if __name__ == "__main__":
    animales = [
        Leon("Simba", 5),
        Pinguino("Pingu", 3),
        Canguro("Kanga", 4)
    ]

    for a in animales:
        a.desplazarse()

