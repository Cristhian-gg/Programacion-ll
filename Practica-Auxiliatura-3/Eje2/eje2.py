import os
import pickle
from typing import List, Optional

# =================================================================
# CLASE TRABAJADOR (Equivalente a Trabajador.java)
# =================================================================
class Trabajador:
    """
    Representa un trabajador con nombre, carnet y salario.
    Implementa Serializable implícitamente en Python (por defecto).
    """
    def __init__(self, nombre: str, carnet: int, salario: float):
        self._nombre = nombre
        self._carnet = carnet
        self._salario = salario

    # Getters
    def get_nombre(self) -> str:
        return self._nombre

    def get_carnet(self) -> int:
        return self._carnet

    def get_salario(self) -> float:
        return self._salario

    # Setter
    def set_salario(self, salario: float):
        self._salario = salario

    # Equivalente a toString() en Java
    def __str__(self) -> str:
        return (f"Trabajador{{nombre='{self._nombre}', carnet={self._carnet}, "
                f"salario={self._salario}}}")

# =================================================================
# CLASE ARCHIVOTRABAJADOR (Equivalente a ArchivoTrabajador.java)
# =================================================================
class ArchivoTrabajador:
    """
    Gestiona la persistencia de una lista de objetos Trabajador 
    utilizando serialización (pickle).
    """
    def __init__(self, nombre_arch: str):
        self.nombre_arch = nombre_arch

    # Métodos privados de soporte

    # Cargar lista desde archivo (Equivalente a cargar() en Java)
    def _cargar(self) -> List[Trabajador]:
        if not os.path.exists(self.nombre_arch) or os.path.getsize(self.nombre_arch) == 0:
            return []

        try:
            # rb: read binary (modo para pickle)
            with open(self.nombre_arch, 'rb') as f:
                # Utiliza pickle.load para deserializar el objeto
                lista: List[Trabajador] = pickle.load(f)
                return lista
        except EOFError:
            # Esto puede ocurrir si el archivo existe pero está corrupto o vacío
            return []
        except Exception as e:
            # Aquí manejamos errores como FileNotFoundError (aunque ya revisamos)
            print(f"Error al cargar el archivo: {e}")
            return []

    # Guardar lista en archivo (Equivalente a guardarLista() en Java)
    def _guardar_lista(self, lista: List[Trabajador]):
        try:
            # wb: write binary (modo para pickle)
            with open(self.nombre_arch, 'wb') as f:
                # Utiliza pickle.dump para serializar la lista
                pickle.dump(lista, f)
        except Exception as e:
            print(f"Error al guardar la lista: {e}")

    # Métodos públicos (Operaciones del archivo)

    # a) Crear archivo (vacío) - No es estrictamente necesario si se usa _guardar_lista con lista vacía
    def crear_archivo(self):
        """Crea el archivo con una lista vacía de Trabajadores."""
        self._guardar_lista([])

    # b) Guardar un trabajador (Equivalente a guardarTrabajador() en Java)
    def guardar_trabajador(self, t: Trabajador):
        """Carga la lista, añade el trabajador y guarda la lista."""
        lista = self._cargar()
        lista.append(t)
        self._guardar_lista(lista)

    # c) Aumentar el salario del trabajador t en "a" (Equivalente a aumentaSalario() en Java)
    def aumenta_salario(self, aumento: int, t_buscado: Trabajador):
        """Busca el trabajador por carnet y aumenta su salario."""
        lista = self._cargar()
        
        # Iteramos y modificamos la lista en memoria
        for x in lista:
            if x.get_carnet() == t_buscado.get_carnet():
                x.set_salario(x.get_salario() + aumento)
                # Opcional: break si sabemos que el carnet es único
                # break 
                
        self._guardar_lista(lista)

    # d) Buscar trabajador con mayor salario (Equivalente a mayorSalario() en Java)
    def mayor_salario(self) -> Optional[Trabajador]:
        """Devuelve el trabajador con el salario más alto."""
        lista = self._cargar()
        if not lista:
            return None

        # Pythonic way: usar la función max con una clave
        # key=lambda t: t.get_salario() indica a max que compare solo el salario
        mayor = max(lista, key=lambda t: t.get_salario())
        return mayor

    # e) Ordenar trabajadores por salario ascendente (Equivalente a ordenarPorSalario() en Java)
    def ordenar_por_salario(self):
        """Ordena la lista de trabajadores por salario y la guarda."""
        lista = self._cargar()
        
        # El método sort() en Python ordena la lista in-place
        lista.sort(key=lambda t: t.get_salario())
        
        self._guardar_lista(lista)

    # Método para mostrar (Equivalente a mostrar() en Java)
    def mostrar(self):
        """Carga la lista y la imprime en consola."""
        lista = self._cargar()
        for t in lista:
            print(t)

# =================================================================
# BLOQUE DE EJECUCIÓN (Equivalente al Main.java)
# =================================================================
if __name__ == '__main__':
    # Nombre del archivo para la serialización
    archivo_nombre = "trabajadores.dat"

    # Eliminar archivo anterior para empezar limpio (Opcional, pero bueno para pruebas)
    if os.path.exists(archivo_nombre):
        os.remove(archivo_nombre)
        
    arch = ArchivoTrabajador(archivo_nombre)

    # Inicializar archivo
    arch.crear_archivo()

    # Guardar trabajadores
    arch.guardar_trabajador(Trabajador("Juan", 123, 2500))
    arch.guardar_trabajador(Trabajador("María", 456, 3000))
    arch.guardar_trabajador(Trabajador("Carlos", 789, 2800))

    print("=== Lista inicial ===")
    arch.mostrar()

    # Aumentar salario a Carlos (solo necesitamos el carnet para buscar)
    print("\n=== Aumentando salario a Carlos ===")
    # En Python, el objeto pasado solo se usa para extraer el carnet
    arch.aumenta_salario(500, Trabajador("", 789, 0.0)) 
    arch.mostrar()

    # Trabajador con mayor salario
    print("\n=== Trabajador con mayor salario ===")
    print(arch.mayor_salario())

    # Ordenar por salario
    print("\n=== Ordenando por salario ===")
    arch.ordenar_por_salario()
    arch.mostrar()
