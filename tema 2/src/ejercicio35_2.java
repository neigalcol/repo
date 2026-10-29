import java.util.Scanner;
public class ejercicio35_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número para hacer la escalera invertida: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for (int m = 1; m <= n - i; m++){
                System.out.print(" ");
            }
            for (int m = 1; m<= 2 * i - 1; m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n-1; i>=1; i--){
            for (int m = 1; m <= n - i ; m++){
                System.out.print(" ");
            }
            for (int m = 1; m<= 2 * i - 1; m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}