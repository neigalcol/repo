import java.util.Scanner;
public class ejercicio1_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hayNegativo = false;
        System.out.println(hayNegativo(sc) ? "Sí, había algún negativo." : "No, ninguno era negativo.");

    }

    public static boolean hayNegativo(Scanner sc) {
        boolean hayNegativo = false;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número" + i + ": ");
            int n = sc.nextInt();
            if (n < 0) {
                hayNegativo = true;
            }
        }
        sc.close();
        return hayNegativo;
    }
}



