class Cola:
    def __init__(self, n):
        self.arreglo = [None] * n  
        self.inicio = 0         
        self.fin = -1              
        self.n = n                 

    def insert(self, e):
        if self.isFull():
            raise Exception("La cola está llena")
        self.fin = (self.fin + 1) % self.n  
        self.arreglo[self.fin] = e

    def remove(self):
        if self.isEmpty():
            raise Exception("La cola está vacía")
        elemento = self.arreglo[self.inicio]
        if self.inicio == self.fin:  
            self.inicio = 0
            self.fin = -1
        else:
            self.inicio = (self.inicio + 1) % self.n  
        return elemento

    def peek(self):
        if self.isEmpty():
            raise Exception("La cola está vacía")
        return self.arreglo[self.inicio]

    def isEmpty(self):
        return self.fin == -1

    def isFull(self):
        
        return not self.isEmpty() and (self.fin + 1) % self.n == self.inicio

    def size(self):
        if self.isEmpty():
            return 0
        
        if self.fin >= self.inicio:
            return self.fin - self.inicio + 1
        else:
            return self.n - self.inicio + self.fin + 1
        
cola = Cola(5)
cola.insert(10)
cola.insert(20)
cola.insert(30)
print(cola.remove())  # Salida: 10
print(cola.peek())   # Salida: 20
print(cola.isEmpty()) # Salida: False
print(cola.isFull())  # Salida: False
print(cola.size())    # Salida: 2