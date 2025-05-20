# INCISO A

class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._anio = anio
        self._precio_base = precio_base

    def get_marca(self):
        return self._marca

    def get_modelo(self):
        return self._modelo

    def get_anio(self):
        return self._anio

    def get_precio_base(self):
        return self._precio_base

    def set_marca(self, marca):
        self._marca = marca

    def set_modelo(self, modelo):
        self._modelo = modelo

    def set_anio(self, anio):
        self._anio = anio

    def set_precio_base(self, precio):
        self._precio_base = precio

    def mostrar_info(self):
        print(f"Marca: {self._marca}")
        print(f"Modelo: {self._modelo}")
        print(f"Año: {self._anio}")
        print(f"Precio base: ${self._precio_base}")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    def get_num_puertas(self):
        return self._num_puertas

    def get_tipo_combustible(self):
        return self._tipo_combustible

    def set_num_puertas(self, num_puertas):
        self._num_puertas = num_puertas

    def set_tipo_combustible(self, tipo_combustible):
        self._tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self._num_puertas}")
        print(f"Tipo de combustible: {self._tipo_combustible}")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    def get_cilindrada(self):
        return self._cilindrada

    def get_tipo_motor(self):
        return self._tipo_motor

    def set_cilindrada(self, cilindrada):
        self._cilindrada = cilindrada

    def set_tipo_motor(self, tipo_motor):
        self._tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self._cilindrada}cc")
        print(f"Tipo de motor: {self._tipo_motor}")


# INCISO B

vehiculos = [
    Coche("Toyota", "Corolla", 2025, 22000, 4, "Gasolina"),
    Coche("Chevrolet", "Spin", 2023, 25000, 5, "Gasolina"),
    Coche("BMW", "Serie 3", 2025, 35000, 2, "Diésel"),
    Moto("Yamaha", "R3", 2025, 12000, 321, "4 tiempos"),
    Moto("Honda", "CBR500R", 2024, 15000, 471, "4 tiempos")
]

print("Información de todos los vehículos:\n")
for v in vehiculos:
    v.mostrar_info()
    print("------------")


# INCISO C

print("Coches con más de 4 puertas:\n")
for v in vehiculos:
    if isinstance(v, Coche) and v.get_num_puertas() > 4:
        v.mostrar_info()
        print("------------")


# INCISO D

print("Vehículos del año 2025:\n")
for v in vehiculos:
    if v.get_anio() == 2025:
        v.mostrar_info()
        print("------------")
