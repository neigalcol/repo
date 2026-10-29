import java.util.Scanner;
public class ejercicio28_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe algo: ");
        String prohibidos ="«\\|@#~€¬!»·$%&/()=»";
        String r = sc.nextLine();

        boolean encontrado = false;

        for (int c= 0; c<r.length(); c++){
            for (int i = 0; i<prohibidos.length();i++){
                if (r.charAt(c) == prohibidos.charAt(i)) {
                    encontrado = true;
                }else{
                    encontrado=false;
                }
            }
        }
        if (encontrado){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }


    public static class ejercicio26_2 {
    }
}
