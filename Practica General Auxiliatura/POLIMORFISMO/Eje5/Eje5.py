class Oficina:
    def __init__(self, nroSillas, nroEscritorios, nroEstanterias):
        self.nroSillas = nroSillas
        self.nroEscritorios = nroEscritorios
        self.nroEstanterias = nroEstanterias

    def mostrar(self):
        print(f"Oficina: {self.nroSillas} sillas, {self.nroEscritorios} escritorios, {self.nroEstanterias} estanterías")

    def cantidadMuebles(self):
        return self.nroSillas + self.nroEscritorios + self.nroEstanterias


class Aula:
    def __init__(self, nombre, capacidad, nropupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nropupitres = nropupitres

    def mostrar(self):
        print(f"Aula {self.nombre}: capacidad {self.capacidad} personas, {self.nropupitres} pupitres")

    def cantidadMuebles(self):
        return self.nropupitres


class Laboratorio:
    def __init__(self, nombre, capacidad, nroMesas, nroSillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = nroMesas
        self.nroSillas = nroSillas

    def mostrar(self):
        print(f"Laboratorio {self.nombre}: capacidad {self.capacidad} personas, {self.nroMesas} mesas, {self.nroSillas} sillas")

    def cantidadMuebles(self):
        return self.nroMesas + self.nroSillas


oficina1 = Oficina(10, 5, 3)
oficina2 = Oficina(12, 6, 4)
aula1 = Aula("Matemáticas", 30, 20)
aula2 = Aula("Física", 25, 18)
laboratorio = Laboratorio("Química", 20, 12, 20)
oficina1.mostrar()
oficina2.mostrar()
aula1.mostrar()
aula2.mostrar()
laboratorio.mostrar()

print(f"\nCantidad de muebles en Oficina 1: {oficina1.cantidadMuebles()}")
print(f"Cantidad de muebles en Oficina 2: {oficina2.cantidadMuebles()}")
print(f"Cantidad de muebles en Aula 1: {aula1.cantidadMuebles()}")
print(f"Cantidad de muebles en Aula 2: {aula2.cantidadMuebles()}")
print(f"Cantidad de muebles en Laboratorio: {laboratorio.cantidadMuebles()}")
