import java.util.Scanner;
public class ejercicio24_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Sumar dos números ");
            System.out.println("2. ¿Es par? ");
            System.out.println("3. Factorial ");
            System.out.println("0. Salir ");
            System.out.println("Opción: ");

            m = sc.nextInt();
            if (m < 1 || m > 3) {
                System.out.println("Opción no válida");
            }

            switch (m) {
                case 1:
                    if (m == 1) {
                        System.out.println("Primer número: ");
                        int n1 = sc.nextInt();
                        System.out.println("Segundo número: ");
                        int n2 = sc.nextInt();
                        System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
                        break;
                    }
                case 2:
                    if (m == 2) {
                        System.out.println("¿Que número quieres comprovar?");
                        int n1 = sc.nextInt();
                        if (n1 % 2 == 0) {
                            System.out.println("Tú número es par");
                        } else {
                            System.out.println("Tú número es impar");
                        }
                        break;
                    }
                case 3:
                    if (m == 3) {
                        System.out.println("De que número quieres saber su factorial: ");
                        long n = sc.nextLong();
                        if (n >= 1) {
                            int c = 1;
                            int r = 1;
                            while (c <= n) {
                                r = r * c;
                                c++;
                            }
                            System.out.println("Resultado:" + r);
                        } else {
                            System.out.println("Número no válido, introduce un número positivo");
                        }
                        break;

                    }
                case 4:
                    if (m == 0) {
                        System.out.println("Fin del código");
                        while (m == 0) {
                            m++;
                        }

                    }
                    break;
            }
        } while (m != 0);
    }
}









