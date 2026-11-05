import java.util.Scanner;
public class ejercicio1_4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas cadenas quieres reproducir?: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        String[] reproducir;
        reproducir = new String[cantidad];

        for (int i = 0; i < reproducir.length; i++){
            System.out.println("Rellena: ");
            reproducir[i] = sc.nextLine();
        }
        for (int i = 0; i < reproducir.length; i++) {
            System.out.print(reproducir[i] + " ");
        }
    }
}
