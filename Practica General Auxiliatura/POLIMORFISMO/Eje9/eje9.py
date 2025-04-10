class Bloque:
    def colocar(self, orientacion="suelo"):
        print(f"Bloque colocado en la orientación: {orientacion}")


class BloqueCofre(Bloque):
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo

    def accion(self):
        print(f"Bloque Cofre ({self.tipo}) abre su inventario con capacidad de {self.capacidad} ítems.")

    def romper(self):
        print(f"Bloque Cofre ({self.tipo}) roto. Todos los objetos almacenados se esparcen.")

class BloqueTnt(Bloque):
    def __init__(self, tipo, daño):
        self.tipo = tipo
        self.daño = daño

    def accion(self):
        print(f"Bloque TNT ({self.tipo}) ha sido activado... ¡BOOM!")

    def romper(self):
        print(f"Bloque TNT ({self.tipo}) roto. ¡Puede explotar si está encendido!")


class BloqueHorno(Bloque):
    def __init__(self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida

    def accion(self):
        print(f"Bloque Horno de color {self.color} cocinando hasta {self.capacidadComida} alimentos.")

    def romper(self):
        print(f"Bloque Horno de color {self.color} roto. Se pierden los objetos cocinando.")


cofre1 = BloqueCofre(27, 100, "Cofre normal")
cofre2 = BloqueCofre(54, 120, "Cofre doble")

tnt1 = BloqueTnt("TNT pequeña", 50)
tnt2 = BloqueTnt("TNT grande", 100)

horno1 = BloqueHorno("Gris", 5)
horno2 = BloqueHorno("Negro", 10)


print("==> Acciones:")
cofre1.accion()
tnt1.accion()
horno1.accion()

print("\n==> Colocar bloques:")
cofre1.colocar()  
tnt2.colocar("pared")
horno2.colocar("techo")

print("\n==> Romper bloques:")
cofre2.romper()
tnt2.romper()
horno2.romper()
