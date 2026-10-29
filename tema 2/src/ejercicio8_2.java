import java.util.Scanner;
public class ejercicio8_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Elije un año, te diré si es bisiesto o si no.");
        int u= sc.nextInt();
        if ((u % 4 == 0 && u % 100 != 0) || u % 400 == 0) {
            System.out.println("Tu año es bisiesto");
        }else{
            System.out.println("Tu año no es bisiesto");
    }
    }
}
