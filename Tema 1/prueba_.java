import java.util.Arrays; // 1. Importar la clase necesaria

public class prueba_ {
    public static void main(String[] args) {

        // Arreglo original desordenado
        int[] numeros = {45, 12, 89, 3, 27};

        // 2. ORDENAR: Se ejecuta usando Arrays.sort()
        Arrays.sort(numeros);

        // Imprimimos para comprobar el orden: [3, 12, 27, 45, 89]
        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));

        // 3. BUSCAR: Se ejecuta usando Arrays.binarySearch()
        int numeroBuscado = 27;
        int posicion = Arrays.binarySearch(numeros, numeroBuscado);

        // 4. VALIDAR EL RESULTADO
        if (posicion >= 0) {
            System.out.println("El número " + numeroBuscado + " está en el índice: " + posicion);
        } else {
            System.out.println("El número no se encontró en el arreglo.");
        }
    }
}

    public static void main(String[] args) {
        int numero = 12;
        long resultado = fibonacci(numero);
        System.out.println("El Fibonacci de " + numero + " es: " + resultado);
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
