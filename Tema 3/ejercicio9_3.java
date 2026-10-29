import java.util.Scanner;
public class ejercicio9_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número de millas para pasarlas a km: ");
        int millas = sc.nextInt();

        double respuesta = millasAKilometro(millas);
    }

    public static double millasAKilometro(int millas){
        double km = millas * 1.60934;
        System.out.println(millas + " millas equivalen a " + km + " kilómetros");
        return km;
    }
}
