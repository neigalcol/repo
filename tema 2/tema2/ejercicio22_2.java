import java.util.Scanner;

public class ejercicio22_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un número para la cuenta atras: ");
        int n= sc.nextInt();

        for (int i = n; i >= 0; i-=2){
            System.out.println(i);
        }
        System.out.println("¡Despegue!");


    }
}
