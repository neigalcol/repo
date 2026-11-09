package ejercicio5_4;

import java.util.Scanner;

public class ejercicio5_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 10 números: ");
        double[] diez = new double[10];
        double suma = 0;
        double pos = 0;
        double neg = 0;
        double med = 0;
        double max = diez[0];
        double min = diez[0];


        for (int i = 0; i < diez.length; i++) {
                System.out.println("Numero " + (i + 1) + ":");
                diez[i] = sc.nextDouble();
            }

        double res = suma(suma, diez);
        double maximo = max(max, diez);
        double minimo = min(min, diez);
        double media = medi(med, res, diez);
        double positivo = posi(pos, diez);
        double negativo = nega(neg, diez);


        System.out.println("Suma = " + res);
        System.out.println("Máximo = " + maximo);
        System.out.println("Mínimo = " + minimo);
        System.out.println("Suma positivos = " + positivo);
        System.out.println("Suma negativos = " + negativo);
        System.out.println("Media = " + media);
    }



    public static double suma(double suma, double[] diez){
        for (int i = 0; i < diez.length; i++) {
            suma = suma + diez[i];
        }
        return suma;
    }

    public static double max (double max, double[] diez){
        for (int i = 0; i < diez.length; i++) {
            max = Math.max(max, diez[i]);
        }
        return max;
    }

    public static double min (double min, double[] diez){
        for (int i = 0; i < diez.length; i++){
            min = Math.min(min, diez[i]);
        }
        return min;
    }

    public static double posi (double pos, double[] diez){
        for (int i = 0; i < diez.length; i++) {
            if (diez[i] > 0) {
                pos = pos + diez[i];
            }
        }
        return pos;
    }

    public static double nega (double neg, double[] diez){
        for (int i = 0; i < diez.length; i++){
            if (diez[i] < 0) {
                neg = neg + diez[i];
            }
        }
        return neg;
    }

    public static double medi (double med, double res, double[] diez){
        for (int i = 0; i < diez.length; i++){
            med = res/10;
        }
        return med;
    }
}