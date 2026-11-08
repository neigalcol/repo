import java.util.Scanner;
public class ejercicio3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos hay en tu clase? ");
        int alumnos = sc.nextInt();
        sc.nextLine();

        double[] num;
        num = new double[alumnos];

        String[] nombres;
        nombres = new String[alumnos];

        double[] altura;
        altura = new double[alumnos];

        System.out.println("Como se llaman?");
        for (int i = 0; i < alumnos; i++){
            System.out.println("Alumno "+ (i+1) + ": ");
            nombres[i] = sc.nextLine();
        }

        for (int i = 0; i < alumnos; i++) {
            System.out.println("Cuanto mide " + nombres[i] + "?");
            altura[i] = sc.nextDouble();
        }

        double max = altura[0];

        for (int i = 0; i < alumnos; i++){
            max = Math.max(max, altura[i]);
        }
        System.out.println("El alumno más alto mide " + max);
        for (int i = 0; i < alumnos; i++){
            if (altura[i] == max){
                System.out.println("El alumno es " + nombres[i]);
            }
        }

        double media = 0;

        for (int i = 0; i < alumnos; i++){
            media = media + altura[i];
        }
        media = media/alumnos;
        System.out.println("La media de altura de la clase es de: " + media);
    }
}
