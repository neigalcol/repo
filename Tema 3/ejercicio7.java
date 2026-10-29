import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos años tienes?");
        int a = sc.nextInt();
        boolean resultado = esMayorEdad(a);

        System.out.println(resultado);
    }

    public static boolean esMayorEdad(int a){
        boolean my = false;
        if (a <= 18){
            my = false;

        } else {
             my = true;
        }
        return my;
    }
}
