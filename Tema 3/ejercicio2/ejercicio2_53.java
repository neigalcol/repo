package ejercicio2;

import java.util.Scanner;
    class Ejercicio2_53 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("A (base): ");
            int a = sc.nextInt();

            System.out.print("B (exponente, 0 o más): ");
            int b = sc.nextInt();
            if (b < 0) {
                System.out.println("Con exponente negativo el resultado no es entero.");
            }

            System.out.println(a + " elevado a " + b + " = " + potencia(a, b));
            System.out.println("Y para que se vea: " + a + " ^ " + b + " en Java vale " + (a ^ b) + ", que es el XOR.");
        }

        public static long potencia(int a, int b) {
            Scanner sc= new Scanner(System.in);
            long resultado = 1;                  // producto: empieza en 1

            for (int i = 1; i <= b; i++) {
                resultado = resultado * a;
            }

            return resultado;
        }
    }


