class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    def es_mayor_de_edad(self):
        return self.edad >= 18

personas = [
    Persona("Juan", 15, "La Paz"),
    Persona("Ana", 17, "El Alto"),
    Persona("Luis", 25, "Cochabamba")
]
for p in personas:
    print(p.saludo())
    print("Mayor de edad:", p.es_mayor_de_edad())
