package ejercicio1;

import java.util.Scanner;
public class ejercicio1_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Positivos: " + contarPositivos(sc) + " de 10.");
    }
    public static int contarPositivos(Scanner sc) {
        int positivos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();
            if (n > 0) {
                positivos++;
            }
        }
        sc.close();
        return positivos;
    }
}







