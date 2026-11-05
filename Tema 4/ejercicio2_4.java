import java.util.Scanner;
public class ejercicio2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 números: ");
        double[] diez = new double[10];
        double[] suma;


        for (int i = 0; i < diez.length; i++){
            System.out.println("Numero " + (i+1) + ":");
            diez[i] = sc.nextDouble();
            suma = suma + diez;
            sc.nextDouble();
        }
        for (int i = 0; i < diez.length; i++){
            System.out.println(suma[i]);
        }
    }
}
