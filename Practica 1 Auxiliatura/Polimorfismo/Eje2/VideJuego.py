class VideoJuego:
    def __init__(self, nombre="Desconocido", plataforma="Desconocida", jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.jugadores = jugadores

    def mostrar_info(self):
        print(f"Videojuego: {self.nombre} | Plataforma: {self.plataforma} | Jugadores: {self.jugadores}")


    def agregar_jugadores(self, cantidad=1):
        self.jugadores += cantidad
        if cantidad == 1:
            print(f"Se agregó 1 jugador. Total: {self.jugadores}")
        else:
            print(f"Se agregaron {cantidad} jugadores. Total: {self.jugadores}")


    def agregar_jugadores_teclado(self):
        cantidad = int(input("Ingrese la cantidad de jugadores a agregar: "))
        self.jugadores += cantidad
        print(f"Se agregaron {cantidad} jugadores desde teclado. Total: {self.jugadores}")


# tipo  main
if __name__ == "__main__":
    v1 = VideoJuego("FIFA 23", "PlayStation", 2)
    v2 = VideoJuego("Minecraft")
    v3 = VideoJuego()

    v1.mostrar_info()
    v2.mostrar_info()
    v3.mostrar_info()

    v1.agregar_jugadores()         # Agrega 1 jugador
    v1.agregar_jugadores(3)        # Agrega 3 jugadores
    v1.agregar_jugadores_teclado() # Agrega jugadores desde teclado

    v1.mostrar_info()

