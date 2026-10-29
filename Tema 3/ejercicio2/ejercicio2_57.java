package ejercicio2;

import java.util.Scanner;

class ejercicio2_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número entero: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número no es válido: tiene que ser positivo.");
        } else if (n == 1) {
            System.out.println("El 1 no se considera primo.");
        } else {
            System.out.println(n + (primo(n) ? " es primo." : " no es primo."));
        }

        sc.close();
    }

    public static boolean primo(int n) {
        for (int d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }

        return true;
    }
}





