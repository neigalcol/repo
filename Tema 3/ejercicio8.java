import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número: ");
        int num = sc.nextInt();

        int respuesta = resultado(num);
        System.out.println(respuesta);
    }

    public static int resultado(int num){
        if (num<0){
            num = -1;
        }
        if (num == 0){
            num = 0;
        }
        if (num > 0){
            num = 1;
        }
        return num;
    }
}
