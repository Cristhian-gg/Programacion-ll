class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def calcular_promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def verificar_aprobacion(self):
        promedio = self.calcular_promedio()
        if promedio >= 6:
            return True
        else:
            return False

estudiante1 = Estudiante("Juan", 7, 8)
estudiante2 = Estudiante("Maria", 5, 6)
estudiante3 = Estudiante("Carlos", 4, 4)

for estudiante in [estudiante1, estudiante2, estudiante3]:
    promedio = estudiante.calcular_promedio()
    aprobado = estudiante.verificar_aprobacion()
    print(f"{estudiante.nombre} - Promedio: {promedio} - Aprobó: {'Sí' if aprobado else 'No'}")
