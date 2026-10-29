import java.util.Scanner;
public class ejercicio7_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tu nota a continuación:");
        double u= sc.nextDouble();
        if(u<0 || u>10){
            System.out.println("Nota no válida, introduce un valor del 1-10.");
        } else if (u>=0 && u<=4.999){
            System.out.println("Insuficiente");
        } else if (u>=5 && u<=5.999){
            System.out.println("Suficiente");
        } else if (u>=6 && u<=6.999){
            System.out.println("Bien");
        } else if (u>=7 && u<=8.999){
            System.out.println("Notable");
        } else if (u>=9 && u<=10){
            System.out.println("¡Excelente, enhorabuena!");
        }
    }
}