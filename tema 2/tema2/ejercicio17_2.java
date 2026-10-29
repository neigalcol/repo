import java.util.Scanner;

public  class ejercicio17_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime un número: ");
        int n= sc.nextInt();
        int m= 1;
        int c= 1;

        while(c<=n){
            m= m*c;
            c++;
        }
        System.out.println(m);
    }
}