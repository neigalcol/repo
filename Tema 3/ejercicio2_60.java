import java.util.Scanner;
public class ejercicio2_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        if (b <= a) {
            System.out.println("B tiene que ser mayor que A.");
        } else{
            mostrarNumeros(a, b);
        }
    }

    public static int mostrarNumeros(int a, int b){
        for (int i = a; i <= b; i++) {
            System.out.print(i + (i < b ? " " : ""));
        }
        System.out.println();
        return 0;
    }
}

