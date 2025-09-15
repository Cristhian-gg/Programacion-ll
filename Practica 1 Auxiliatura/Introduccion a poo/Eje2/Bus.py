class Bus:
    def __init__(self, capacidad):
        self.capacidad = capacidad
        self.pasajeros = 0
        self.costo_pasaje = 1.50

    def subir_pasajeros(self, cantidad):
        if self.pasajeros + cantidad <= self.capacidad:
            self.pasajeros += cantidad
            print(f"{cantidad} pasajeros subieron al bus.")
        else:
            disponibles = self.capacidad - self.pasajeros
            print(f"Solo pueden subir {disponibles} pasajeros. Bus lleno.")
            self.pasajeros = self.capacidad

    def cobrar_pasaje(self):
        return self.pasajeros * self.costo_pasaje

    def asientos_disponibles(self):
        return self.capacidad - self.pasajeros

    def mostrar_estado(self):
        print(f"Pasajeros actuales: {self.pasajeros}")
        print(f"Asientos disponibles: {self.asientos_disponibles()}")
        print(f"Total recaudado: Bs. {self.cobrar_pasaje():.2f}")


# main
if __name__ == "__main__":
    mi_bus = Bus(40)

    mi_bus.subir_pasajeros(15)
    mi_bus.mostrar_estado()

    mi_bus.subir_pasajeros(30)
    mi_bus.mostrar_estado()
