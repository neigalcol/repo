import java.util.Scanner;
public class ejercicio32_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println(" ");

            for (int m = 0; m<n; m++) {
                if (i == 0 || i == n - 1 || m == 0 || m == n - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
        }
    }
}
