public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 3; i++) {
            contador = sumarUno(contador);
        }
        System.out.println("contador = " + contador);
        int i = 100;
        int incrementar1 = incrementar(i);
        System.out.println("i = " + incrementar1 );
    }
public static int sumarUno(int contador) {
    return contador + 1;
}
public static int incrementar(int i) {
    i = i + 1;
    return i;
}

