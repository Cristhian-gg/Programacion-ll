class Pila:
    def __init__(self, n):
        self.arreglo = [None] * n  # Arreglo para almacenar los elementos
        self.top = -1              # Inicialmente, la pila está vacía
        self.n = n                 # Tamaño máximo de la pila

    def push(self, e):
        if self.isFull():
            raise Exception("La pila está llena")
        self.top += 1
        self.arreglo[self.top] = e

    def pop(self):
        if self.isEmpty():
            raise Exception("La pila está vacía")
        elemento = self.arreglo[self.top]
        self.top -= 1
        return elemento

    def peek(self):
        if self.isEmpty():
            raise Exception("La pila está vacía")
        return self.arreglo[self.top]

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1

pila = Pila(5)
pila.push(10)
pila.push(20)
pila.push(30)
print(pila.pop())  # Salida: 30
print(pila.peek()) # Salida: 20
print(pila.isEmpty()) # Salida: False
print(pila.isFull())  # Salida: False