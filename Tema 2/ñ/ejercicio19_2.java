import java.util.Scanner;

public  class ejercicio19_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un número entero: ");

        long n= sc.nextInt();
        int dig= 0;


        while (n>0){
            n= n/10;
            dig++;
        }
        System.out.println("Tu número tiene "+ dig + " dígitos");
    }
}
