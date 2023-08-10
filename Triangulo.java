import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double area_triangulo,base,altura;

        System.out.println("Base: ");
        base = teclado.nextDouble();
        System.out.println("Altura: ");
        altura = teclado.nextDouble();

        area_triangulo = (float)base*altura/2;
        System.out.println("El area del triangulo es:" + area_triangulo);
    }
}
