import java.util.Scanner;
public class ejercicio5_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 piedra 2 papel 3 tijera ");

        System.out.print("Jugada del jugador 1: ");
        int jugador_1 = sc.nextInt();

        System.out.print("Jugada del jugador 2: ");
        int jugador_2 = sc.nextInt();

        if(jugador_1 == jugador_2){
            System.out.println("EMPATE");
        }
        if (jugador_1 == 1 && jugador_2 ==2){
            System.out.println("Ganador: Jugador 2");
        }
        if (jugador_1 == 1 && jugador_2 == 3){
            System.out.println("Ganador: Jugador 1");
        }
        if(jugador_1 == 2 && jugador_2 == 1){
            System.out.println("Ganador: Jugador 1");
        }
        if(jugador_1 == 2 && jugador_2 == 3){
            System.out.println("Ganador: Jugador 2");
        }
        if (jugador_1 == 3 && jugador_2 == 1){
            System.out.println("Ganador: Jugador 1");
        }
        if (jugador_1 == 3 && jugador_2 == 2){
            System.out.println("Ganador: Jugador 2");
        }
        if(jugador_1>3 || jugador_1<1){
            System.out.println("Jugada no válida");
        }
        if (jugador_2>3 || jugador_2<1){
            System.out.println("Jugada no válida");
        }




    }
}
