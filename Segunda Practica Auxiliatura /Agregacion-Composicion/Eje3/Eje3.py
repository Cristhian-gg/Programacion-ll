# INCISO A
class Parte:
    def __init__(self, nombre, peso):
        self._nombre = nombre
        self._peso = peso

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def get_peso(self):
        return self._peso

    def set_peso(self, peso):
        self._peso = peso

    def mostrar_info(self):
        print(f"Parte: {self._nombre} - Peso: {self._peso} kg")


class Avion:
    def __init__(self, modelo, fabricante):
        self._modelo = modelo
        self._fabricante = fabricante
        self._partes = []

    def get_modelo(self):
        return self._modelo

    def set_modelo(self, modelo):
        self._modelo = modelo

    def get_fabricante(self):
        return self._fabricante

    def set_fabricante(self, fabricante):
        self._fabricante = fabricante

    def agregar_parte(self, parte):
        self._partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo del avión: {self._modelo}")
        print(f"Fabricante: {self._fabricante}")
        print("Partes del avión:")
        for parte in self._partes:
            parte.mostrar_info()


# INCISO B
avion = Avion("Boeing 747", "Boeing")
avion.agregar_parte(Parte("Motor", 5000))
avion.agregar_parte(Parte("Ala Izquierda", 3000))
avion.agregar_parte(Parte("Ala Derecha", 3000))
avion.agregar_parte(Parte("Tren de Aterrizaje", 1500))

# INCISO C
avion.mostrar_avion()
