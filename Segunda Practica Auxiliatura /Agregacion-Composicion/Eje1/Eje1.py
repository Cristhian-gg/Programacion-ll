# INCISO A

class Habitacion:
    def __init__(self, nombre="", tamano=0.0):
        self._nombre = nombre
        self._tamano = tamano  

    def get_nombre(self):
        return self._nombre

    def get_tamano(self):
        return self._tamano

    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_tamano(self, tamano):
        self._tamano = tamano

    def mostrar_info(self):
        print(f"Habitación: {self._nombre}, Tamaño: {self._tamano} m²")


class Casa:
    def __init__(self, direccion=""):
        self._direccion = direccion
        self._habitaciones = []  

    def get_direccion(self):
        return self._direccion

    def set_direccion(self, direccion):
        self._direccion = direccion

    def agregar_habitacion(self, habitacion):
        self._habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Casa en dirección: {self._direccion}")
        print("Habitaciones:")
        for hab in self._habitaciones:
            hab.mostrar_info()


# INCISO B

casa = Casa("Av. Siempre Viva 123")
casa.agregar_habitacion(Habitacion("Sala", 20.5))
casa.agregar_habitacion(Habitacion("Cocina", 12.3))
casa.agregar_habitacion(Habitacion("Dormitorio Principal", 25.0))
casa.agregar_habitacion(Habitacion("Baño", 6.7))

# INCISO C

casa.mostrar_casa()
