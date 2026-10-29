import java.util.Scanner;
public class ejercicio12_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu DNI sin letra: ");
        int DNI = sc.nextInt();

        char letra = res(DNI);
        System.out.println("Tu letra es " + letra);
    }

    public static char res(int DNI){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int letra = DNI % 23;
        return letras.charAt(letra);
    }
}
