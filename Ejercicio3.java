import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altura,grados,longitud;

        System.out.println("Ingrese Altura?: ");
        altura = teclado.nextInt();

        System.out.println("Ingrese grados: ");
        grados = teclado.nextInt();

        longitud = Math.abs(altura/ Math.sin(grados));

        System.out.println("La longitud es: " + longitud);
    }
}
