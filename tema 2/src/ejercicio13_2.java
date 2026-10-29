import java.util.Scanner;
public class ejercicio13_2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tu nota a continuación:");
        double u= sc.nextDouble();

        switch ((int) u) {
            case 0, 1, 2, 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("Nota no válida");

        }
        System.out.println(u >= 5 ? "Aprobado" : "Suspenso");
    }
}