import java.util.Scanner;
public class ejercicio30_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un número para sumar sus factoriales: ");
        int n= sc.nextInt();

        long f=1;
        long suma=0;

        for (int i=1; i<n; i++){
           f *= i;
           suma+=f;

            System.out.println(suma);

        }
    }
}
