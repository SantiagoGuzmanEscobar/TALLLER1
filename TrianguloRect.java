import java.util.Scanner;

public class TrianguloRect {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double cateto1, cateto2, hypo;

        System.out.println("Cateto 1: ");
        cateto1 = teclado.nextDouble();
        System.out.println("Cateto2: ");
        cateto2 = teclado.nextDouble();

        hypo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa de un triangulo de lados " + cateto1 + " y " + cateto2 + " es " + hypo);
    }
}
