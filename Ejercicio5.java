import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double rp, rg;

        System.out.println("Radio del circulo pequeño: ");
        rp = teclado.nextDouble();

        System.out.println("Radio del circulo grande: ");
        rg = teclado.nextDouble();

        if (rp >= rg) {
            System.out.println("Error el radio pequeño es incorrecto");
            System.exit(0);
        }
    var circulo_pequeño = new Circulo (rp);
    Circulo circulo_grande = new Circulo(rg);

    var areacoronacircular = circulo_grande.area() - circulo_pequeño.area();
    System.out.printf("El area de la corona circular es %.2f/n", areacoronacircular);
    }
}