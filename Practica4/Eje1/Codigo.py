from abc import ABC, abstractmethod

class Empleado(ABC):
    def __init__(self, nombre):
        self.nombre = nombre

    @abstractmethod
    def calcular_salario_mensual(self):
        pass

    def __str__(self):
        return f"Empleado: {self.nombre}"


class EmpleadoTiempoCompleto(Empleado):
    def __init__(self, nombre, salario_anual):
        super().__init__(nombre)
        self.salario_anual = salario_anual

    def calcular_salario_mensual(self):
        return self.salario_anual / 12

    def __str__(self):
        return (f"{super().__str__()} | Salario Anual: {self.salario_anual} "
                f"| Salario Mensual: {self.calcular_salario_mensual()}")


class EmpleadoTiempoHorario(Empleado):
    def __init__(self, nombre, horas_trabajadas, tarifa_por_hora):
        super().__init__(nombre)
        self.horas_trabajadas = horas_trabajadas
        self.tarifa_por_hora = tarifa_por_hora

    def calcular_salario_mensual(self):
        return self.horas_trabajadas * self.tarifa_por_hora

    def __str__(self):
        return (f"{super().__str__()} | Horas: {self.horas_trabajadas} "
                f"| Tarifa: {self.tarifa_por_hora} "
                f"| Salario Mensual: {self.calcular_salario_mensual()}")


def main():
    empleados = []


    for i in range(3):
        nombre = input(f"Ingrese el nombre del empleado tiempo completo #{i+1}: ")
        salario_anual = float(input(f"Ingrese el salario anual de {nombre}: "))
        empleados.append(EmpleadoTiempoCompleto(nombre, salario_anual))

    for i in range(2):
        nombre = input(f"Ingrese el nombre del empleado por horas #{i+1}: ")
        horas = float(input(f"Ingrese las horas trabajadas de {nombre}: "))
        tarifa = float(input(f"Ingrese la tarifa por hora de {nombre}: "))
        empleados.append(EmpleadoTiempoHorario(nombre, horas, tarifa))

    print("\nLista de empleados:")
    for emp in empleados:
        print(emp)

if __name__ == "__main__":
    main()

