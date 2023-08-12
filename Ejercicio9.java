import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        System.out.println("ingresa 2 numeros");
        a = teclado.nextInt();
        b = teclado.nextInt();
        if (a == b) {
            System.out.println("Los numeros son iguales");
        } else {
            if (a > b) {
                System.out.println("El numero mayor es" + a);
            } else {
                System.out.println("El numero mayor es" + b);
            }
        }
        teclado.close();
    }
}
