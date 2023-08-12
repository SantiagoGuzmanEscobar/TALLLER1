import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String h1,h2,h3;
        int n1, n2, n3;

        System.out.print("Introduzca nombre del hermano 1: ");
        h1 = teclado.next();
        System.out.print("Introduzca edad hermano 1: ");
        n1 = teclado.nextInt();
        System.out.print("Introduzca nombre del hermano 2: ");
        h2 = teclado.next();
        System.out.print("Introduzca edad hermano 2: ");
        n2 = teclado.nextInt();
        System.out.print("Introduzca nombre del hermano 3: ");
        h3 = teclado.next();
        System.out.print("Introduzca edad hermano 3: ");
        n3 = teclado.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                System.out.println("El hermano mayor es: " + h1 + " con "+ n1 +" años");
            } else {
                System.out.println("El hermano mayor es: " + h3 + " con "+ n3 +" años");
            }
        } else if (n2 > n3) {
            System.out.println("El hermano mayor es: " + h2 + " con "+ n2 +" años");
        } else {
            System.out.println("El hermano mayor es: " + h3 + " con "+ n3 +" años");
        }
    }
}
