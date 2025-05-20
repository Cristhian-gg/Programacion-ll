# INCISO A

class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def get_carrera(self):
        return self._carrera

    def set_carrera(self, carrera):
        self._carrera = carrera

    def get_semestre(self):
        return self._semestre

    def set_semestre(self, semestre):
        self._semestre = semestre

    def mostrar_info(self):
        print(f"Estudiante: {self._nombre} | Carrera: {self._carrera} | Semestre: {self._semestre}")

class Universidad:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def agregar_estudiante(self, estudiante):
        self._estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        print("Estudiantes:")
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()

# INCISO B
e1 = Estudiante("Ana López", "Ingeniería de Sistemas", 3)
e2 = Estudiante("Juan Pérez", "Derecho", 2)
e3 = Estudiante("María García", "Medicina", 5)

uni = Universidad("Universidad Nacional")
uni.agregar_estudiante(e1)
uni.agregar_estudiante(e2)
uni.agregar_estudiante(e3)

# INCISO C
uni.mostrar_universidad()
