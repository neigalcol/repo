import java.util.Scanner;

public  class ejercicio20_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un múmero entero: ");
        int n= sc.nextInt();


        int i= 0;
        int o= n;

        while(n>0){
            int cifra = n % 10;
            i = i * 10 + cifra;
            n = n / 10;

        }
        System.out.println("Tu número al revés es: " + i);
        if (o==i){
            System.out.println("El número es capicua");
        }else{
            System.out.println("El número no es capicua");
        }

    }
}