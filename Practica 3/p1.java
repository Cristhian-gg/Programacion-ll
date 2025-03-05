public class Pila {
    private long[] arreglo;
    private int top;
    private int n;

    public Pila(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.top = -1;
    }

    public void push(long e) {
        if (isFull()) {
            throw new IllegalStateException("La pila está llena");
        }
        top++;
        arreglo[top] = e;
    }

    public long pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        long elemento = arreglo[top];
        top--;
        return elemento;
    }

    public long peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return arreglo[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == n - 1;
    }

    public static void main(String[] args) {
        Pila pila = new Pila(5);
        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.pop());  // Salida: 30
        System.out.println(pila.peek()); // Salida: 20
        System.out.println(pila.isEmpty()); // Salida: false
        System.out.println(pila.isFull());  // Salida: false
    }
}