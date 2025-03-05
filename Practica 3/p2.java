public class Cola {
    private long[] arreglo;  
    private int inicio;      
    private int fin;         
    private int n;           

    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;  
    }

    public void insert(long e) {
        if (isFull()) {
            throw new IllegalStateException("La cola está llena");
        }
        fin = (fin + 1) % n;  
        arreglo[fin] = e;
    }

    public long remove() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        long elemento = arreglo[inicio];
        if (inicio == fin) {  
            inicio = 0;
            fin = -1;
        } else {
            inicio = (inicio + 1) % n;  
        }
        return elemento;
    }

    public long peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return arreglo[inicio];
    }

    public boolean isEmpty() {
        
        return fin == -1;
    }

    public boolean isFull() {
        
        
        return !isEmpty() && (fin + 1) % n == inicio;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
    
        if (fin >= inicio) {
            return fin - inicio + 1;
        } else {
            return n - inicio + fin + 1;
        }
    }

    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        System.out.println(cola.remove());  // Salida: 10
        System.out.println(cola.peek());    // Salida: 20
        System.out.println(cola.isEmpty()); // Salida: false
        System.out.println(cola.isFull());  // Salida: false
        System.out.println(cola.size());    // Salida: 2
    }
}