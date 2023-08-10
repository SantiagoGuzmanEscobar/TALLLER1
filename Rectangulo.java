import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Base: ");
        base = teclado.nextDouble();
        System.out.println("Altura: ");
        altura = teclado.nextDouble();

        area = base * altura;
        System.out.println("El area de un rectangulo de base " + base + " y altura " + altura + " es igual a " + area);
    }
}
