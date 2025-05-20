from datetime import datetime

# INCISO A

class Persona:
    def __init__(self, ci="0000", nombre="SinNombre", apellido="SinApellido", celular="00000000", fecha_Nac="2000-01-01"):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac  

    def calcular_edad(self):
        anio_nac = int(self.fecha_Nac.split("-")[0])
        anio_actual = datetime.now().year
        return anio_actual - anio_nac

    def mostrar(self):
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha de Nacimiento: {self.fecha_Nac}")

class Estudiante(Persona):
    def __init__(self, ci="0000", nombre="SinNombre", apellido="SinApellido", celular="00000000", fecha_Nac="2000-01-01",
                 ru="RU0000", fecha_Ingreso="2023-01-01", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}")
        print(f"Fecha de Ingreso: {self.fecha_Ingreso}")
        print(f"Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci="0000", nombre="SinNombre", apellido="SinApellido", celular="00000000", fecha_Nac="2000-01-01",
                 nit="NIT0000", profesion="Ninguna", especialidad="General", sexo="M"):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo  

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")
        print(f"Sexo: {self.sexo}")


# INCISO B

estudiantes = [
    Estudiante("123", "Luis", "Perez", "78945612", "1998-05-21", "RU001", "2021-01-01", 6),
    Estudiante("124", "Maria", "Lopez", "78945613", "2002-08-15", "RU002", "2022-02-01", 4),
]

docentes = [
    Docente("200", "Juan", "Garcia", "75683912", "1980-04-11", "NIT01", "Ingeniero", "Software", "M"),
    Docente("201", "Lucia", "Lopez", "75683913", "1985-06-23", "NIT02", "Arquitecta", "Diseño", "F"),
]


# INCISO C

print("Estudiantes mayores de 25 años:")
for e in estudiantes:
    if e.calcular_edad() > 25:
        e.mostrar()
        print(f"Edad: {e.calcular_edad()}")
        print("------------")


# INCISO D

mayor_ingeniero = None
for d in docentes:
    if d.profesion.lower() == "ingeniero" and d.sexo.upper() == "M":
        if mayor_ingeniero is None or d.calcular_edad() > mayor_ingeniero.calcular_edad():
            mayor_ingeniero = d

print("Docente varón con profesión 'Ingeniero' y mayor edad:")
if mayor_ingeniero:
    mayor_ingeniero.mostrar()
    print(f"Edad: {mayor_ingeniero.calcular_edad()}")
print("------------")


# INCISO E

print("Estudiantes y docentes con el mismo apellido:")
for e in estudiantes:
    for d in docentes:
        if e.apellido.lower() == d.apellido.lower():
            print(f"Apellido coincidente: {e.apellido}")
            print("Estudiante:")
            e.mostrar()
            print("Docente:")
            d.mostrar()
            print("------------")
