class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad

    def calcular_salario(self):
        
        return self.salario_base + (self.salario_base * 0.05 * self.anios_antiguedad)

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        
        return super().calcular_salario() + self.bono_gerencial

class Desarrollador(Empleado):
    PAGO_POR_HORA_EXTRA = 20  

    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        
        return super().calcular_salario() + (self.horas_extras * self.PAGO_POR_HORA_EXTRA)


# Inciso b
gerente1 = Gerente("Carlos", "Lopez", 4000, 3, "Ventas", 1200)
gerente2 = Gerente("Ana", "Martinez", 4500, 5, "Marketing", 900)

dev1 = Desarrollador("Luis", "Perez", 3000, 2, "Java", 12)
dev2 = Desarrollador("Maria", "Gomez", 3200, 4, "Python", 8)

print(f"Salario gerente1: {gerente1.calcular_salario()}")
print(f"Salario gerente2: {gerente2.calcular_salario()}")
print(f"Salario desarrollador1: {dev1.calcular_salario()}")
print(f"Salario desarrollador2: {dev2.calcular_salario()}")

# Inciso c
print("\nGerentes con bono gerencial mayor a 1000:")
gerentes = [gerente1, gerente2]
for g in gerentes:
    if g.bono_gerencial > 1000:
        print(f"{g.nombre} {g.apellido} - Bono: {g.bono_gerencial}")

# Inciso d
print("\nDesarrolladores con más de 10 horas extras:")
desarrolladores = [dev1, dev2]
for d in desarrolladores:
    if d.horas_extras > 10:
        print(f"{d.nombre} {d.apellido} - Horas extras: {d.horas_extras}")
