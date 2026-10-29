import java.util.Scanner;

public  class ejercicio16_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número para sumarlo");
        int n= sc.nextInt();

        int suma=0;
        int contador= 1;

        while(contador<=n){
            suma += contador;
            contador++;
        }
        System.out.println("Suma= "+suma);
        System.out.printf("Media= %.2f%n", suma/(double)n);
        sc.close();
    }
}
