import java.util.Scanner;
public class ejercicio2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 números: ");
        double[] diez = new double[10];
        double suma = 0;

        double pos = 0;
        double neg = 0;

        double media = 0;


        for (int i = 0; i < diez.length; i++){
            System.out.println("Numero " + (i+1) + ":");
            diez[i] = sc.nextDouble();
        }
        double max = diez[0];
        double min = diez[0];

        for (int i = 0; i < diez.length; i++){
            suma = suma + diez[i];
        }
        for (int i = 0; i < diez.length; i++){
            max = Math.max(max, diez[i]);
            min = Math.min(min, diez[i]);
        }
        for (int i = 0; i < diez.length; i++){
            if (diez[i] > 0){
                pos = pos + diez[i];
            }else if (diez[i] < 0){
                neg = neg + diez[i];
            }
        }
        for (int i = 0; i < diez.length; i++){
            media = suma/10;
        }
        System.out.println("Suma = " + suma);
        System.out.println("Máximo = " + max);
        System.out.println("Mínimo = " + min);
        System.out.println("Suma positivos = "+ pos);
        System.out.println("Suma negativos = "+ neg);
        System.out.println("Media = "+ media);


    }
}
