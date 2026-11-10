import java.util.Scanner;

public class hundir_la_flota {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                =======================
                    Hundir La Flota
                   Neizan Gálvez Coll
                    DAW 2026/2027
                =======================
                """);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        char[][] tableroJugador = new char[10][10];
        char[][] tableroDisparos = new char[10][10];

        System.out.println("""
                Mapa de """ + " " + nombre);

       inicializarTablero(tableroJugador);
       inicializarTablero(tableroDisparos);
       visualizarTablero(tableroJugador, tableroDisparos);

    }
                //TABLERO:

    public static void inicializarTablero(char[][] tableroJugador){
        for (int i = 0; i < tableroJugador.length; i++){
            for (int j = 0; j < tableroJugador[i].length; j++)
                tableroJugador[i][j] = '~';
        }
    }
    public static void visualizarTablero(char[][] tableroJugador, char[][] tableroDisparos){

        for (int i = 0; i < tableroDisparos.length; i++){
            for (int j = 0; j < tableroDisparos[i].length; j++){
                System.out.print(tableroDisparos[i][j] + " ");
            }
            System.out.println();
        }

        int numeros = 0;
        for (int i = 0; i < tableroDisparos.length; i++){
            System.out.print(numeros + i + " ");
        }
    }
}
