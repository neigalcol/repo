import java.util.Scanner;
public class ejercicio6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije un número de 1 al 10 y dale a enter");
        int num = (int) ((Math.random() * 10) + 1);
        String u = sc.nextLine();
        if (u.equals("")) {
            System.out.println("¿El número que has escogido es " + num + "? (s/n)");
        }

        //Primer intento

        String u1 = sc.nextLine();
        if (u1.equals("s")) {
            System.out.println("Gané, inténtalo a la próxima.");
        } else if (u1.equals("n")) {
            System.out.println("Vale, ¿tu número es (M)ayor o (m)enor?");
        }

        //Segundo intento

        String u2 = sc.nextLine();
        if (u2.equals("M")) {
            int num1;
            int num2;
            int num3 = 0;
            num1 = (int) (Math.random() * (10 - num)) + num + 1;
            System.out.println("Perfecto, ¿tu número es " + num1 + "?, ¿o es (M)ayor o (m)enor?");
            String u3 = sc.nextLine();
            if (u3.equals("s")) {
                System.out.println("Gané, me lo has puesto difícil, ¡vuelve a intentarlo cuando quieras!");
            }
            if (u3.equals("m")) {
                num2 = (int) (Math.random() * (num1 - num - 1)) + num + 1;
                System.out.println("Último intento, ¿tu número es " + num2 + "?, ¿o es (M)ayor o (m)enor?");
                String u4 = sc.nextLine();
                if (u4.equals("s")) {
                    System.out.println("¡Gané en la última!, suerte a la próxima vez!");
                } else {
                    if (u4.equals("M")) {
                        num3 = (int) (Math.random() * (num1 - num2 - 1)) + num2 + 1;
                    }
                    if (u4.equals("m")) {
                        num3 = (int) (Math.random() * (num2 - num - 1)) + num + 1;
                    }
                    System.out.println("Venga, me la juego, ¿tu número es " + num3 + "? (s/n)");
                    String u5 = sc.nextLine();
                    if (u5.equals("s")) {
                        System.out.println("¡Gané en la última!, suerte a la próxima vez!");
                    }
                    if (u5.equals("n")) {
                        System.out.println("Me ganaste, ¡enhorabuena!");
                    }
                }
            }
            if (u3.equals("M")) {
                num2 = (int) (Math.random() * (10 - num1)) + num1 + 1;
                System.out.println("Último intento, ¿tu número es " + num2 + "?, ¿o es (M)ayor o (m)enor?");
                String u4 = sc.nextLine();
                if (u4.equals("s")) {
                    System.out.println("¡Gané en la última!, suerte a la próxima vez!");
                } else {
                    if (u4.equals("M")) {
                        num3 = (int) (Math.random() * (10 - num2)) + num2 + 1;
                    }
                    if (u4.equals("m")) {
                        num3 = (int) (Math.random() * (num2 - num1 - 1)) + num1 + 1;
                    }
                    System.out.println("Venga, me la juego, ¿tu número es " + num3 + "? (s/n)");
                    String u5 = sc.nextLine();
                    if (u5.equals("s")) {
                        System.out.println("¡Gané en la última!, suerte a la próxima vez!");
                    }
                    if (u5.equals("n")) {
                        System.out.println("Me ganaste, ¡enhorabuena!");
                    }
                }
            }
        }

        //Tercer intento + última jugada

        if (u2.equals("m")) {
            int num1;
            int num2;
            int num3=0;
            num1 = (int) (Math.random() * (num - 1)) + 1;
            System.out.println("Perfecto, ¿tu número es " + num1 + "?(s), ¿o es (M)ayor o (m)enor?");
            String u3 = sc.nextLine();
            if (u3.equals("s")) {
                System.out.println("Gané, me lo has puesto difícil, ¡vuelve a intentarlo cuando quieras!");
            }
            if (u3.equals("m")) {
                num2 = (int) (Math.random() * (num1 - 1)) + 1;
                System.out.println("Último intento, ¿tu número es " + num2 + "?, ¿o es (M)ayor o (m)enor?");
                String u4 = sc.nextLine();
                if (u4.equals("s")) {
                    System.out.println("¡Gané en la última!, suerte a la próxima vez!");
                } else {
                    if (u4.equals("M")) {
                        num3 = (int) (Math.random() * (num1 - num2 - 1)) + num2 + 1;
                    }
                    if (u4.equals("m")) {
                        num3 = (int) (Math.random() * (num2 - 1)) + 1;
                    }
                    System.out.println("Venga, me la juego, ¿tu número es " + num3 + "? (s/n)");
                    String u5 = sc.nextLine();
                    if (u5.equals("s")) {
                        System.out.println("¡Gané en la última!, suerte a la próxima vez!");
                    }
                    if (u5.equals("n")) {
                        System.out.println("Me ganaste, ¡enhorabuena!");
                    }
                }
            }
            if (u3.equals("M")) {
                num2 = (int) (Math.random() * (num - num1 - 1)) + num1 + 1;
                System.out.println("Último intento, ¿tu número es " + num2 + "?, ¿o es (M)ayor o (m)enor?");
                String u4 = sc.nextLine();
                if (u4.equals("s")) {
                    System.out.println("¡Gané en la última!, suerte a la próxima vez!");
                } else {
                    if (u4.equals("M")) {
                        num3 = (int) (Math.random() * (num - num2 - 1)) + num2 + 1;
                    }
                    if (u4.equals("m")) {
                        num3 = (int) (Math.random() * (num2 - num1 - 1)) + num1 + 1;
                    }
                    System.out.println("Venga, me la juego, ¿tu número es " + num3 + "? (s/n)");
                    String u5 = sc.nextLine();
                    if (u5.equals("s")) {
                        System.out.println("¡Gané en la última!, suerte a la próxima vez!");
                    }
                    if (u5.equals("n")) {
                        System.out.println("Me ganaste, ¡enhorabuena!");
                    }
                }
            }
        }
    }
}
