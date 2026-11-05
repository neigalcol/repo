import java.util.Scanner;
public class ejercicio1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 2 valores enteros: ");
        System.out.println("Valor 1: ");
        int n = sc.nextInt();

        System.out.println("Valor 2: ");
        int m = sc.nextInt();

        int[] b ;
        b = new int[n];

        for (int i = 0; i < b.length; i++){
            b[i] = m;
            System.out.print(b[i] + " ");

        }
    }
}
