class Producto:
    def __init__(self, nombre, precio, stock):
        self.nombre = nombre
        self.precio = precio
        self.stock = stock

    def vender(self, cantidad):
        if cantidad <= self.stock:
            self.stock -= cantidad
            total = cantidad * self.precio
            print(f"Se vendieron {cantidad} unidades de {self.nombre}. Total: ${total:.2f}")
        else:
            print(f"No hay suficiente stock para vender {cantidad} unidades de {self.nombre}.")

    def reabastecer(self, cantidad):
        self.stock += cantidad
        print(f"Se reabastecieron {cantidad} unidades de {self.nombre}. Stock actual: {self.stock}")

    def get_stock(self):
        return self.stock

    def get_nombre(self):
        return self.nombre


# tipo main
if __name__ == "__main__":
    p1 = Producto("Laptop", 3500.0, 10)

    p1.vender(3)
    p1.vender(8)
    p1.reabastecer(5)
    p1.vender(4)

