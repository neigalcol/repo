import java.util.Scanner;

public class ejercicio7_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        int n = sc.nextInt();

        int[] tabla = tablaDel(n);

        for (int i = 0; i < n; i++){
            System.out.print(tabla[i]);
        }

    }
    public static int[] tablaDel (int n){
        int[] v;
        v = new int[10];

        for (int i = 0; i < v.length; i++){
            n += n * 2;
        }
        return v;
    }
}
