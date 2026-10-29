import java.util.Scanner;
public class ejercico3_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Producto: ");
        String producto = sc.next();

        System.out.print("Unidades: ");
        int unidades = sc.nextInt();

        System.out.printf("Precio unitario: ");
        double precio = sc.nextDouble();
        double total = unidades * precio;

        System.out.println();
        System.out.println("---RESUMEN DEL PEDIDO---");
        System.out.println(producto + "x" + unidades);
        System.out.printf("Total: %10.2f euros%n", unidades * precio);


    }

    public static class ejercicio15_2 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Escribe un número: ");
            int numero= sc.nextInt();
            int a = 1;
            while (a <= numero) {
                System.out.println(a);
                a++;
            }
            System.out.println("Al revés");
            while (numero >= 1) {
                System.out.println(numero);
                numero--;

            }

        }
    }
}
