package ejercicio5_4;

import java.util.Scanner;
public class ejercicio5_4_1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas cadenas quieres reproducir?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        String[] reproducir = reprod(cantidad, sc);
    }

    public static String[] reprod(int cantidad, Scanner sc){

        String[] reproducir;
        reproducir = new String[cantidad];

        for (int i = 0; i < reproducir.length; i++){
            System.out.println("Rellena: ");
            reproducir[i] = sc.nextLine();
        }

        for (int i = 0; i < reproducir.length; i++) {
            System.out.print(reproducir[i] + " ");
        }

        return reproducir;
    }
}
