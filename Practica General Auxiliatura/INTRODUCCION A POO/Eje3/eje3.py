class Coche:
    def __init__(self, marca, modelo, velocidad=0):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10
        print(f"El coche {self.marca} {self.modelo} ha acelerado. Velocidad: {self.velocidad} km/h.")

    def frenar(self):
        self.velocidad -= 5
        print(f"El coche {self.marca} {self.modelo} ha frenado. Velocidad: {self.velocidad} km/h.")


coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Fiesta")

coche1.acelerar()
coche1.frenar()

coche2.acelerar()
coche2.frenar()
