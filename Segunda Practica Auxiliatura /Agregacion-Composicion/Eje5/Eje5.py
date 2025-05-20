# INCISO A

class Jugador:
    def __init__(self, nombre, numero, posicion):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def get_numero(self):
        return self._numero

    def set_numero(self, numero):
        self._numero = numero

    def get_posicion(self):
        return self._posicion

    def set_posicion(self, posicion):
        self._posicion = posicion

    def mostrar_info(self):
        print(f"{self._posicion}: {self._nombre} | Nº: {self._numero}")

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        print(f"Portero: {self._nombre} | Nº: {self._numero} | Habilidad: {self._habilidad_especial}")

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        print(f"Defensa: {self._nombre} | Nº: {self._numero} | Habilidad: {self._habilidad_especial}")

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        print(f"Mediocampista: {self._nombre} | Nº: {self._numero} | Habilidad: {self._habilidad_especial}")

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        print(f"Delantero: {self._nombre} | Nº: {self._numero} | Habilidad: {self._habilidad_especial}")

class Equipo:
    def __init__(self, nombre):
        self._nombre = nombre
        self._jugadores = []

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def agregar_jugador(self, jugador):
        self._jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Equipo: {self._nombre}")
        print("Jugadores:")
        for jugador in self._jugadores:
            jugador.mostrar_info()

# INCISO B
equipo = Equipo("Los Titanes")
equipo.agregar_jugador(Portero("Carlos Pérez", 1, "Atajadas"))
equipo.agregar_jugador(Defensa("Luis García", 4, "Marcaje"))
equipo.agregar_jugador(Mediocampista("José Díaz", 8, "Pases"))
equipo.agregar_jugador(Delantero("Andrés Romero", 9, "Goles"))

# INCISO C
equipo.mostrar_equipo()
