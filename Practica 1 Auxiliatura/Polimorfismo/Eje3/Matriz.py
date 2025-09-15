class Matriz:
    def __init__(self, valores):

        if isinstance(valores, int):
            n = valores
            self.matriz = [[1 if i == j else 0 for j in range(n)] for i in range(n)]
        else:

            filas = len(valores)
            cols = len(valores[0])
            self.matriz = [[valores[i][j] for j in range(cols)] for i in range(filas)]

    def sumar(self, otra):
        filas = len(self.matriz)
        cols = len(self.matriz[0])
        resultado = [[self.matriz[i][j] + otra.matriz[i][j] for j in range(cols)] for i in range(filas)]
        return Matriz(resultado)

    def restar(self, otra):
        filas = len(self.matriz)
        cols = len(self.matriz[0])
        resultado = [[self.matriz[i][j] - otra.matriz[i][j] for j in range(cols)] for i in range(filas)]
        return Matriz(resultado)

    def igual(self, otra):
        filas = len(self.matriz)
        cols = len(self.matriz[0])
        for i in range(filas):
            for j in range(cols):
                if self.matriz[i][j] != otra.matriz[i][j]:
                    return False
        return True

    def mostrar(self):
        for fila in self.matriz:
            print("\t".join(str(x) for x in fila))


# Tipo main
if __name__ == "__main__":
    identidad = Matriz(3)
    print("Matriz identidad:")
    identidad.mostrar()

    valores = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    m1 = Matriz(valores)
    print("\nMatriz m1:")
    m1.mostrar()

    valores2 = [
        [9, 8, 7],
        [6, 5, 4],
        [3, 2, 1]
    ]
    m2 = Matriz(valores2)
    print("\nMatriz m2:")
    m2.mostrar()

    print("\nm1 + m2:")
    suma = m1.sumar(m2)
    suma.mostrar()

    print("\nm1 - m2:")
    resta = m1.restar(m2)
    resta.mostrar()

    print("\n¿m1 == m2?", m1.igual(m2))
    print("¿m1 == m1?", m1.igual(m1))

