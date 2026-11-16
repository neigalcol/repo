
import java.util.Scanner;

public class hundir_la_flota {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("""
                =======================
                    Hundir La Flota
                   Neizan Gálvez Coll
                    DAW 2026/2027
                =======================
                """);

        char[][] tableroJugador = new char[10][10];
        char[][] tableroDisparos = new char[10][10];
        char[][] tableroPC = new char[10][10];
        char[][] tableroDisparosPc = new char[10][10];

        int[] longitudBarco = {4, 3, 3, 2, 2, 1};

        String usuario = leerNombre();


        inicializarTablero(tableroJugador);
        inicializarTablero(tableroDisparos);
        inicializarTablero(tableroPC);
        inicializarTablero(tableroDisparosPc);

        visualizarTablero(tableroJugador, tableroDisparos);

        int[] coordenadas = leerCoordenada("""
                
                Introduce la coordenada (fila, columna):""");

        int orientacion = leerOrientacion();
        cabeBarco(tableroJugador, longitudBarco[0], coordenadas[0], coordenadas[1], orientacion);
        hayColision(tableroJugador, longitudBarco[0], coordenadas[0], coordenadas[1], orientacion);
        boolean colocarBarcoJugador = colocarBarco(tableroJugador, longitudBarco[0], coordenadas[0], coordenadas[1], orientacion, jugador);
    }
    // ===== ENTRADA =====

    public static String leerNombre() {

        String jugador;

        do {
            System.out.println("Introduce tu nombre: ");
            jugador = teclado.nextLine();
        } while (jugador.length() == 0);

        return jugador;
    }

    public static int[] leerCoordenada(String mensaje) {

        int fila = -1;
        int columna = -1;

        boolean valida = false;

        do {
            System.out.println(mensaje);

            String coordenada = teclado.nextLine();
            coordenada = coordenada.toUpperCase();

            if (coordenada.length() == 2) {
                if (coordenada.charAt(0) >= 'A' &&
                        coordenada.charAt(0) <= 'J') {

                    if (coordenada.charAt(1) >= '0' &&
                            coordenada.charAt(1) <= '9') {

                        fila = coordenada.charAt(0) - 'A';
                        columna = coordenada.charAt(1) - '0';

                        valida = true;
                    }
                }
            }

            if (!valida) {
                System.out.println(
                        "Coordenadas no detectadas, vuelve a introducirlas");
            }

        } while (!valida);

        return new int[]{fila, columna};
    }

    public static int leerOrientacion() {

        int orientacion = 0;
        boolean orient = false;

        do {
            System.out.println(
                    "¿Hacia dónde quieres orientar el barco? (H, V)");

            String elegirOrientacion = teclado.nextLine();
            elegirOrientacion = elegirOrientacion.toUpperCase();

            if (elegirOrientacion.equals("H")) {
                orientacion = 1;
                orient = true;

            } else if (elegirOrientacion.equals("V")) {
                orientacion = 0;
                orient = true;

            } else {
                System.out.println(
                        "Dirección no válida, introdúcela de nuevo");
            }
        } while (!orient);

        return orientacion;
    }
    // ===== TABLERO =====

    public static void inicializarTablero(char[][] tablero) {

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '~';
            }
        }
    }
    public static void visualizarTablero(
            char[][] tableroJugador, char[][] tableroDisparos) {

        char letra = 'A';

        System.out.print("      TU FLOTA ");
        System.out.print("               TUS DISPAROS");
        System.out.println();

        for (int i = 0; i < tableroJugador.length; i++) {

            System.out.print((char) (letra + i) + " ");

            for (int j = 0; j < tableroJugador[i].length; j++) {
                System.out.print(tableroJugador[i][j] + " ");
            }

            System.out.print("    ");
            System.out.print((char) (letra + i) + " ");

            for (int j = 0; j < tableroDisparos[i].length; j++) {
                System.out.print(tableroDisparos[i][j] + " ");
            }

            System.out.println();
        }
        // Números mapa 1

        System.out.print("  ");
        int numeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros + i + " ");
        }
        // Números mapa 2

        System.out.print("      ");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros + i + " ");
        }
    }

    public static boolean cabeBarco(char[][] tableroJugador, int longitudBarco, int fila, int columna, int orientacion) {
        switch (orientacion) {
            case 1:
                if (columna + longitudBarco > tableroJugador[0].length) {
                    return false;
                }
                break;
            case 0:
                if (fila + longitudBarco > tableroJugador.length) {
                    return false;
                }
                break;
        }
        return true;
    }

    public static boolean hayColision(char[][] tableroJugador, int longitudBarco, int fila, int columna, int orientacion) {
        switch (orientacion) {
            case 1:
                for (int i = 0; i < longitudBarco; i++)
                        if (tableroJugador[fila][columna + i] == 'B') {
                            return true;
                        }
                break;
            case 0:
                    for (int i = 0; i < longitudBarco; i++)
                        if (tableroJugador[fila + i][columna] == 'B') {
                            return true;
                        }
                    break;
        }
        return false;
    }
    public static boolean colocarBarco(char[][] tableroJugador, int longitudBarco, int fila, int columna, int orientacion, boolean jugador){
        if (!cabeBarco(tableroJugador, longitudBarco, fila, columna, orientacion)){
            if (jugador){
                System.out.println("El barco no cabe ");
            }
            return false;
        }
        if (hayColision(tableroJugador, longitudBarco, fila, columna, orientacion)){
            if (jugador){
                System.out.println("El barco choca con otro");
            }
            return false;
        }
        switch (orientacion){
            case 1:
                for (int i = 0; i < longitudBarco; i++){
                    tableroJugador[fila][columna + i] = 'B';
                }
                break;
            case 0:
                for (int i = 0; i < longitudBarco; i++){
                    tableroJugador[fila + i][columna] = 'B';
                }
                break;
        }


        return true;
    }

}


