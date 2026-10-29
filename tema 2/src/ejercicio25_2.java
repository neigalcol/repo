import java.util.Scanner;
public class ejercicio25_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int c=0;
        do {
            System.out.println("Cuantos años tienes? ");
            n = sc.nextInt();
            c++;
            if (n < 0 || n > 120){
                System.out.println("Edad no válida");
            }else{
                if (n>=18) {
                    System.out.println("Eres mayor de edad.");
                }else{
                    System.out.println("Eres menor de edad");
                }

            }

        }while (n < 0 || n > 120);
        System.out.println("Intentos: "+c);
    }


    public static class ejercicio18_2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe un número 1-10 para ver su tabla de multiplicar: ");
            int n = sc.nextInt();
            sc.close();

            int m = 1;
            int c= 0;

            while (c<10){
                m= n*c+n;
                c++;
                System.out.println(n+"x"+c+"= "+m);
            }

        }
    }

    public static class ejercicio17_21_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un número: ");
            int n = sc.nextInt();

            int c = 1;
            int m;
            for (m = 1; c <= n; m = m * c) {
                c++;

            }
            System.out.println(m);


        }
    }
}
