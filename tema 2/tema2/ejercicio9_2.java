import java.util.Scanner;
public class ejercicio9_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int normal= 9;
        int especial= 6;
        int descuento= 2;
        System.out.println("Calcula el precio de la entrada. ¿Para que día quieres la entrada? (1 lunes, 2 martes,...");
        int u= sc.nextInt();
        if(u == 3) {
            System.out.println("¿Cuantos años tienes?");
            int u2 = sc.nextInt();
            if (u2 <= 14 || u2 >= 65) {
                System.out.println("Precio: 4");
            }else if (u2 >= 14 || u2 <= 65){
                System.out.println("Precio: 7");
                sc.close();

            }}else{
            System.out.println("¿Cuantos años tienes?");
            int edad = sc.nextInt();
            if (edad <= 14 || edad>= 65) {
                System.out.println("Precio: 6");
            }else if (edad >= 14 || edad <= 65) {
                System.out.println("Precio: 9");
                sc.close();
            }
        }}
}
