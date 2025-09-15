# Clase base Vehiculo
class Vehiculo:
    def __init__(self, conductor, placa, id):
        self.conductor = conductor
        self.placa = placa
        self.id = id

    def mostrar_datos(self):
        print(f"Conductor: {self.conductor} | Placa: {self.placa}")

    def cambiar_conductor(self, nuevo_conductor):
        self.conductor = nuevo_conductor
        print(f"Conductor cambiado a: {self.conductor}")



class Auto(Vehiculo):
    def __init__(self, conductor, placa, id, caballos_fuerza, descapotable):
        super().__init__(conductor, placa, id)
        self.caballos_fuerza = caballos_fuerza
        self.descapotable = descapotable

    def mostrar_auto(self):
        self.mostrar_datos()
        print(f"Caballos de fuerza: {self.caballos_fuerza} | Descapotable: {self.descapotable}")



class Bus(Vehiculo):
    def __init__(self, conductor, placa, id, capacidad, sindicato):
        super().__init__(conductor, placa, id)
        self.capacidad = capacidad
        self.sindicato = sindicato

    def mostrar_bus(self):
        self.mostrar_datos()
        print(f"Capacidad: {self.capacidad} | Sindicato: {self.sindicato}")



class Moto(Vehiculo):
    def __init__(self, conductor, placa, id, cilindrada, casco):
        super().__init__(conductor, placa, id)
        self.cilindrada = cilindrada
        self.casco = casco

    def mostrar_moto(self):
        self.mostrar_datos()
        print(f"Cilindrada: {self.cilindrada} | Casco: {self.casco}")


# tipo main
if __name__ == "__main__":
    bus1 = Bus("Carlos", "BUS-123", 1, 50, "Sindicato A")
    auto1 = Auto("Ana", "AUTO-456", 2, 150, True)
    moto1 = Moto("Luis", "MOTO-789", 3, 250, True)

    print("\n--- Datos de los vehículos ---")
    bus1.mostrar_datos()
    auto1.mostrar_datos()
    moto1.mostrar_datos()

    print("\n--- Cambiando conductor del bus ---")
    bus1.cambiar_conductor("Pedro")
    bus1.mostrar_datos()

