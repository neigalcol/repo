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

        inicializarTablero(tableroJugador);
        inicializarTablero(tableroDisparos);
        visualizarTablero(tableroJugador, tableroDisparos, nombre);
    }
    //CHAR DEL TABLERO

    public static void inicializarTablero(char[][] tableroJugador){
        for (int i = 0; i < tableroJugador.length; i++){
            for (int j = 0; j < tableroJugador[i].length; j++)
                tableroJugador[i][j] = '~';
        }
    }

    public static void visualizarTablero(char[][] tableroJugador, char[][] tableroDisparos, String nombre){
        //PRIMER MAPA
        char letra = 'A';
        System.out.print("    Mapa de " + nombre);
        System.out.print("            Mapa del Rival");
        System.out.println();
        for (int i = 0; i < tableroJugador.length; i++){
            System.out.print((char) (letra + i) + " ");
            for (int j = 0; j < tableroJugador[i].length; j++){
                System.out.print(tableroJugador[i][j] + " ");
            }
            //SEGUNDO MAPA
            System.out.print("    ");
            System.out.print((char) (letra + i) + " ");
            for (int j = 0; j < tableroDisparos[i].length; j++){
                System.out.print(tableroDisparos[i][j] + " ");
            }
            System.out.println();
        }

        //Números mapa 1

        System.out.print("  ");
        int numeros = 0;
        for (int i = 0; i < 10; i++){
            System.out.print(numeros + i + " ");
        }

        //Números mapa 2

        System.out.print("  ");
        System.out.print("    ");
        for (int i = 0; i < 10; i++){
            System.out.print(numeros + i + " ");

        }
    }
}
