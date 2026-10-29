import java.util.Scanner;
public class ejercicio11_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer número: ");
        double a = sc.nextDouble();
        System.out.println("Segundo número: ");
        double b = sc.next().charAt(0);
        int op = sc.nextInt();

        switch (op){
            case '+':
                System.out.printf("%.2f + %.2f = %2f%n", a, b, a+b);
                break;
            case '/':
                if (b==0) {
                    System.out.println("Operación no válida");
                }else{
                    System.out.printf("%.2f + %.2f = %2f%n", a, b, a/b);
                    break;
                }

        }
    }
}
