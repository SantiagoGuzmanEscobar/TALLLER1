import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int n1, n2, n3, r;

            System.out.println("¿Cuantos estudiantes flacos van?: ");
            n1 = teclado.nextInt();

            System.out.println("¿Cuantos estudiantes gordos van?: ");
            n2 = teclado.nextInt();

            System.out.println("¿Cuantas personas caben en el Bus?: ");
            n3 = teclado.nextInt();

            r = (n1 + n2) / n3;

            System.out.println("El numero de buses que se necesitan son: " + r);
        }
    }
