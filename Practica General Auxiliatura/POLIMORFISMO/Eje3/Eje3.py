class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)

    def mostrarSueldo(self, sueldo):
        if self.sueldoMes == sueldo:
            print(f"Cocinero {self.nombre} tiene un sueldo mensual de {self.sueldoMes}")


class Mesero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina

    def mostrarSueldo(self, sueldo):
        if self.sueldoMes == sueldo:
            print(f"Mesero {self.nombre} tiene un sueldo mensual de {self.sueldoMes}")


class Administrativo:
    def __init__(self, nombre, sueldoMes, cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo

    def sueldoTotal(self):
        return self.sueldoMes

    def mostrarSueldo(self, sueldo):
        if self.sueldoMes == sueldo:
            print(f"Administrativo {self.nombre}, cargo: {self.cargo}, tiene un sueldo mensual de {self.sueldoMes}")


cocinero = Cocinero("Carlos", 2000, 20, 15)
mesero1 = Mesero("Juan", 1500, 30, 12, 200)
mesero2 = Mesero("Ana", 1500, 25, 12, 180)
administrativo1 = Administrativo("Luis", 2500, "Gerente")
administrativo2 = Administrativo("Maria", 2200, "Contadora")

print(f"Sueldo total Cocinero {cocinero.nombre}: {cocinero.sueldoTotal()}")
print(f"Sueldo total Mesero {mesero1.nombre}: {mesero1.sueldoTotal()}")
print(f"Sueldo total Mesero {mesero2.nombre}: {mesero2.sueldoTotal()}")
print(f"Sueldo total Administrativo {administrativo1.nombre}: {administrativo1.sueldoTotal()}")
print(f"Sueldo total Administrativo {administrativo2.nombre}: {administrativo2.sueldoTotal()}")

sueldo_buscar = 1500
print("\nEmpleados con sueldo igual a", sueldo_buscar)
cocinero.mostrarSueldo(sueldo_buscar)
mesero1.mostrarSueldo(sueldo_buscar)
mesero2.mostrarSueldo(sueldo_buscar)
administrativo1.mostrarSueldo(sueldo_buscar)
administrativo2.mostrarSueldo(sueldo_buscar)
