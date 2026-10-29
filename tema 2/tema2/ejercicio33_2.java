import java.util.Scanner;
public class ejercicio33_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número para hacer la escalera invertida: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            for (int m = 1; m <= n - i + 1; m++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}



