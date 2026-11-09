import java.util.Scanner;

public class ejercicio6_4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor: ");
        int valor = sc.nextInt();

        int[] v;
        v = new int[5];

        rellenar(v, valor);

        for (int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }

        duplicar(v);

        for (int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }

        int suma = sumar(v);
        System.out.print(suma);
    }

    public static void rellenar (int[] v, int valor){
        for (int i = 0; i < v.length; i++){
            v[i] = valor;
        }
    }

    public static void duplicar (int[] v){
        for (int i = 0; i < v.length; i++){
            v[i] = v[i] * 2;
        }
    }

    public static int sumar (int[] v){
        int suma = 0;
        for (int i = 0; i < v.length; i++){
           suma += v[i];
        }
        return suma;
    }
}
