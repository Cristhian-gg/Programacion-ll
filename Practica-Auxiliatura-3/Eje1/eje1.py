import pickle
import os


# =======================
# CLASE CHARANGO
# =======================
class Charango:
    def __init__(self, material, cuerdas):
        self.material = material
        self.cuerdas = cuerdas
        self.nro_cuerdas = len(cuerdas)

    def get_material(self):
        return self.material

    def get_nro_cuerdas(self):
        return self.nro_cuerdas

    def get_cuerdas(self):
        return self.cuerdas

    # Equivalente a cantCuerdasFalse()
    def cant_cuerdas_false(self):
        return sum(1 for c in self.cuerdas if not c)

    def __str__(self):
        return f"Charango(material='{self.material}', nroCuerdas={self.nro_cuerdas}, cuerdas={self.cuerdas})"


# =======================
# CLASE ARCHIVOCHARANGO (PERSISTENCIA)
# =======================
class ArchivoCharango:

    def guardar(self, archivo, lista):
        with open(archivo, "wb") as f:
            pickle.dump(lista, f)

    def cargar(self, archivo):
        if not os.path.exists(archivo):
            return []
        with open(archivo, "rb") as f:
            return pickle.load(f)


# =======================
# CLASE OPERACIONESCHARANGO
# =======================
class OperacionesCharango:

    # b) Eliminar charangos con más de 6 cuerdas false
    def eliminar_con_mas_de_6_cuerdas_false(self, lista):
        lista[:] = [c for c in lista if c.cant_cuerdas_false() <= 6]

    # c) Listar charangos por material
    def listar_por_material(self, lista, x):
        for c in lista:
            if c.get_material().lower() == x.lower():
                print(c)

    # d) Buscar charangos con 10 cuerdas
    def buscar_con_10_cuerdas(self, lista):
        for c in lista:
            if c.get_nro_cuerdas() == 10:
                print(c)

    # e) Ordenar alfabéticamente por material
    def ordenar_por_material(self, lista):
        lista.sort(key=lambda c: c.get_material().lower())


# =======================
# USO DIRECTO (OPCIONAL)
# =======================
if __name__ == "__main__":

    archivo = ArchivoCharango()
    op = OperacionesCharango()

    ruta = "charangos.dat"

    # Crear lista de prueba
    lista = [
        Charango("Madera", [True, True, False, True, False, True, True, False, True, False]),
        Charango("Roble",  [True]*10),
        Charango("Cedro",  [False]*10),
    ]

    # Guardar
    archivo.guardar(ruta, lista)

    # Cargar
    lista = archivo.cargar(ruta)

    print("=== Lista cargada ===")
    for c in lista:
        print(c)

    print("\n=== Eliminando charangos con más de 6 cuerdas false ===")
    op.eliminar_con_mas_de_6_cuerdas_false(lista)
    for c in lista:
        print(c)

    print("\n=== Buscar por material: Madera ===")
    op.listar_por_material(lista, "Madera")

    print("\n=== Charangos con 10 cuerdas ===")
    op.buscar_con_10_cuerdas(lista)

    print("\n=== Ordenados por material ===")
    op.ordenar_por_material(lista)
    for c in lista:
        print(c)

    # Guardar cambios finales
    archivo.guardar(ruta, lista)

