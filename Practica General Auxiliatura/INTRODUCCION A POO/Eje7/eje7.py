class Celular:
    def __init__(self):
        self.aplicaciones = []
        self.espacio_total = 1024  # 1024MB
        self.espacio_usado = 0
        self.bateria = 100

    def instalar_aplicacion(self, nombre, tamano):
        if len(self.aplicaciones) < 20 and self.espacio_usado + tamano <= self.espacio_total:
            self.aplicaciones.append({'nombre': nombre, 'tamano': tamano})
            self.espacio_usado += tamano
            print(f"Aplicación {nombre} instalada con éxito.")
        else:
            print("No hay suficiente espacio o límite de aplicaciones alcanzado.")

    def utilizar_aplicacion(self, nombre, minutos):
        if self.bateria <= 0:
            print("Celular apagado")
            return
        
        app = next((app for app in self.aplicaciones if app['nombre'] == nombre), None)
        if app:
            tamano = app['tamano']
            if tamano > 250:
                consumo_bateria = 5 * (minutos // 10)
            elif tamano > 100:
                consumo_bateria = 2 * (minutos // 10)
            else:
                consumo_bateria = 1 * (minutos // 10)

            self.bateria -= consumo_bateria
            if self.bateria < 0:
                self.bateria = 0

            print(f"Usaste {nombre} por {minutos} minutos. Batería restante: {self.bateria}%")
        else:
            print("Aplicación no encontrada.")

    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria}%")

celular = Celular()
celular.instalar_aplicacion("Facebook", 150)
celular.instalar_aplicacion("WhatsApp", 80)
celular.instalar_aplicacion("Juegos", 300)

celular.utilizar_aplicacion("Facebook", 30)
celular.utilizar_aplicacion("Juegos", 20)
celular.mostrar_bateria()
