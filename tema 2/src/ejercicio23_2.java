import java.util.Scanner;
public class ejercicio23_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        int pares = 0;
        int impares = 0;

        for ( int i = 100; i<= 200; i++){
            if (i % 2 == 0){
                pares += i;
            }else{
                impares += i;
            }
        }
        System.out.println("Suma de pares: "+ pares);
        System.out.println("Suma de los impares: "+ impares);
    }
}