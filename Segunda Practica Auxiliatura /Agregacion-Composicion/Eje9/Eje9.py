# INCISO A

class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def get_precio(self):
        return self._precio

    def set_precio(self, precio):
        self._precio = precio

    def mostrar_info(self):
        print(f"Producto: {self._nombre} | Precio: ${self._precio:.2f}")

class CarritoCompras:
    def __init__(self):
        self._productos = []

    def agregar_producto(self, producto):
        if len(self._productos) < 10:
            self._productos.append(producto)
        else:
            print("¡No se pueden agregar más de 10 productos al carrito!")

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        if not self._productos:
            print("El carrito está vacío.")
        else:
            for producto in self._productos:
                producto.mostrar_info()

# INCISO B
p1 = Producto("Laptop", 1500.00)
p2 = Producto("Mouse", 25.50)
p3 = Producto("Teclado", 45.00)
p4 = Producto("Monitor", 300.00)
p5 = Producto("Auriculares", 60.00)
p6 = Producto("Webcam", 40.00)
p7 = Producto("Silla Gamer", 200.00)
p8 = Producto("Alfombrilla", 15.00)
p9 = Producto("Cargador", 20.00)
p10 = Producto("Memoria USB", 10.00)
p11 = Producto("Hub USB", 18.00)

carrito = CarritoCompras()
carrito.agregar_producto(p1)
carrito.agregar_producto(p2)
carrito.agregar_producto(p3)
carrito.agregar_producto(p4)
carrito.agregar_producto(p5)
carrito.agregar_producto(p6)
carrito.agregar_producto(p7)
carrito.agregar_producto(p8)
carrito.agregar_producto(p9)
carrito.agregar_producto(p10)
carrito.agregar_producto(p11)  

# INCISO C
carrito.mostrar_carrito()
