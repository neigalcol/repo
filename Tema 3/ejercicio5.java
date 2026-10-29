import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.println("Límite inferior: ");
        int inf = sc.nextInt();

        System.out.println("Límite superior: ");
        int sup = sc.nextInt();

        String resultado = subcadena(frase, inf, sup);

        System.out.println("La subcadena es: " + resultado);
    }

    public static String subcadena(String frase, int inf, int sup) {

        if (inf < 0) {
            inf = 0;
        }

        if (sup >= frase.length()) {
            sup = frase.length() - 1;
        }

        if (inf > sup) {
            return "";
        }

        String resultado = "";

        for (int i = inf; i <= sup; i++) {
            resultado = resultado + frase.charAt(i);
        }

        return resultado;
    }
}