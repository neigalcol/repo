import java.util.Scanner;

public class ejercicio29_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número para ver el factorial de todos los anteriores: ");
        int n = sc.nextInt();

        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
            System.out.println(i + "! = " + f);
        }
    }
}