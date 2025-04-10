class Videojuego:
    def __init__(self, nombre, plataforma, cantidadjugadores=1):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidadjugadores = cantidadjugadores

    def mostrar(self):
        print(f"Nombre del videojuego: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de jugadores: {self.cantidadjugadores}")

    def agregarJugadores(self, cantidad=1):
        self.cantidadjugadores += cantidad
        print(f"Ahora el videojuego {self.nombre} tiene {self.cantidadjugadores} jugadores.")

videojuego1 = Videojuego("FIFA 23", "PlayStation 5", 2)
videojuego2 = Videojuego("Minecraft", "PC", 1)

videojuego1.mostrar()
videojuego2.mostrar()

videojuego1.agregarJugadores()
videojuego2.agregarJugadores(3)

videojuego1.mostrar()
videojuego2.mostrar()
