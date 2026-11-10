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

        char[][] tablero = new char[10][10];
        char[][] tableroDisparos = new char[10][10];

        System.out.println("""
                Mapa de """ + " " + nombre);

       inicializarTablero(tablero);
       visualizarTablero(tablero, tableroDisparos);

    }
                //TABLERO:

    public static void inicializarTablero(char[][] tablero){
        for (int i = 0; i < tablero.length; i++){
            for (int j = 0; j < tablero[i].length; j++)
                tablero[i][j] = '~';
        }
    }
    public static void visualizarTablero(char[][] tablero, char[][] tableroDisparos){
        char letra = 'A';
        char siguienteLetra = (char) (letra+1);
        for (int i = 0; i < tableroDisparos.length; i++){
            System.out.print((char) (letra + 1));
        }
        for (int i = 0; i < tableroDisparos.length; i++){
            for (int j = 0; j < tableroDisparos[i].length; j++){
                System.out.print(tableroDisparos[i][j]);
            }
            System.out.println();
        }
    }
}
