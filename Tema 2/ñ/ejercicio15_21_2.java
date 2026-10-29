import java.util.Scanner;

public  class ejercicio15_21_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un número: ");

        int numero= sc.nextInt();

        for ( int a = 1; a <= numero; a++){
            System.out.println(a);
        }

        System.out.println("Al revés");
        for ( int n= numero; numero >= 1; numero-- ) {
            System.out.println(numero);


        }

    }
}

