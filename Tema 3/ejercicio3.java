import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase: ");

        String frase = sc.nextLine();
        System.out.println("Tú frase es palíndromo");
    }

    public static boolean esPalindromo(String frase) {


        for (int i = 0; i < frase.length() / 2; i++) {
            if (frase.charAt(i) == ' ') {
                continue;
            }
            if (frase.charAt(i) != frase.charAt(frase.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
