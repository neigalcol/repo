import java.util.Scanner;

public class hundir_la_flota {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args){

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
        int longitudBarco;
        int fila;
        int columna;
        int orientacion;

        String nombre = leerNombre();
        inicializarTablero(tableroJugador);
        inicializarTablero(tableroDisparos);
        visualizarTablero(tableroJugador, tableroDisparos);
        int[] coordenadas = leerCoordenadas("""
                
                
                Introduce la coordenada (fila, columna): """);
        int guardarOrientacion = leerOrientacion();

    }
    public static String leerNombre(){
        String nombre;
        do {
            System.out.println("Introduce tu nombre: ");
            nombre = teclado.nextLine();
        } while (nombre.length() == 0);
        return nombre;
    }
    //CHAR DEL TABLERO

    public static void inicializarTablero(char[][] tableroJugador){
        for (int i = 0; i < tableroJugador.length; i++){
            for (int j = 0; j < tableroJugador[i].length; j++)
                tableroJugador[i][j] = '~';
        }
    }

    public static void visualizarTablero(char[][] tableroJugador, char[][] tableroDisparos){
        //PRIMER MAPA

        char letra = 'A';
        System.out.print("      TU FLOTA ");
        System.out.print("               TUS DISPAROS");
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
    public static int[] leerCoordenadas(String mensaje){

        int fila = -1;
        int columna = -1;

        boolean valida = false;

        // Leer coordenadas que introduce el usuario, primero fila (letra) y despues columna (numero)
        do {
            System.out.println(mensaje);
            String coordenada = teclado.nextLine();
            coordenada = coordenada.toUpperCase();
            if (coordenada.length() == 2){
                if (coordenada.charAt(0) >= 'A' && coordenada.charAt(0) <= 'J'){
                    if (coordenada.charAt(1) >= '0' && coordenada.charAt(1) <= '9'){
                        fila = coordenada.charAt(0) - 'A';
                        columna = coordenada.charAt(1) - '0';
                        valida = true;

                    }
                }
            }
            if (!valida){
                System.out.println("Coordenadas no detectadas, vuelve a introducirlas");
            }
        }while(!valida);


        return new int []{fila, columna};
    }
    public static int leerOrientacion (){
        int orientacion = 0;
        boolean orient = false;

        do {
            System.out.println("¿Hacia donde quieres orientar el barco? (H, V)");
            String elegirOrientacion = teclado.nextLine();
            elegirOrientacion = elegirOrientacion.toUpperCase();
            if (elegirOrientacion.equals("H")){
                orientacion = 1;
                orient = true;
            } else if (elegirOrientacion.equals("V")){
                orientacion = 0;
                orient = true;
            } else {
                System.out.println("Dirección no válida, introducela de nuevo (H,V)");
            }
        } while (!orient);

        return orientacion;
    }

    public static boolean cabeBarco(char[][] tablero, int longitudBarco, int fila, int columna, int orientacion){
        boolean cabe = false;
        if (orientacion == 1){
            longitudBarco <= tablero[0].length;
        }else if (orientacion == 0){
            tablero.length;

        }
    }


}
