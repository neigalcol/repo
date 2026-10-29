import java.util.Scanner;
public class ejercicio11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura: ");
        int n = sc.nextInt();
        System.out.print("Carácter: ");
        char simbolo = sc.next().charAt(0);
        int res = piramide(n, simbolo);


    }
    public static int piramide(int n, char simbolo){
        for (int f = 1; f <= n; f++) {
            for (int e = 1; e <= n - f; e++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= 2 * f - 1; a++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
        return n;
    }
}


