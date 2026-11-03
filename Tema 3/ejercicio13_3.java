import java.util.Scanner;
public class ejercicio13_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double res = 3.14159;
        int decimales = 2;
        boolean alAlza = false;

        long resultado = respuesta(res);
        double reultado2 = respuesta2(res, decimales);
        double resultado3 = respuesta3(res, decimales, alAlza);
        System.out.println(resultado);
        System.out.println(reultado2);
        System.out.println(resultado3);
    }

    public static long respuesta(double res){
        long resultado1 = Math.round(res);
        return resultado1;
    }
    public static double respuesta2(double res, int decimales){
        double resultado2 = Math.pow(10, decimales);
        double resultado1 = Math.round(res * resultado2);
        return resultado1 / resultado2;
    }
    public static double respuesta3(double res, int decimales, boolean alAlza){
        double resultado2 = Math.pow(10, decimales);
        if (alAlza){
            return Math.ceil(res * resultado2) / resultado2;
        }
        return Math.round(res * resultado2) / resultado2;
    }
}
