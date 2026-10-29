import java.util.Scanner;
public class ejercicio10_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame números para saber el mayor");

        System.out.println("Num 1: ");
        int num1 = sc.nextInt();

        System.out.println("Num 2: ");
        int num2 = sc.nextInt();

        System.out.println("Num 3");
        int num3 = sc.nextInt();

        int resultado = mayor(num1, num2);
        resultado = mayor(resultado, num3);

        System.out.println("Los mayores son " + resultado);
    }

    public static int mayor(int num1, int num2){
        return num1 > num2 ? num1:num2;
    }
}
