import java.util.Scanner;
public class ejercicio51_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
    }

    public static int a(Scanner sc) {
        System.out.print("Primer número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        System.out.println("Suma:     " + (a + b));
        System.out.println("Producto: " + a * b);

        sc.close();
        return a;
    }
}

