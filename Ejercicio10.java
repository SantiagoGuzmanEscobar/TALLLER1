import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String [] Args){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escribe dos numeros: ");
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double r;
        System.out.println("escribe el operador a usar: +,-,*,/,%,** ");
        char op = teclado.next().charAt(0);
        switch (op) {
            case '+' -> {
                r = n1 + n2;
                System.out.println("La suma de los numeros es" + r);
            }
            case '-' -> {
                r = n1 - n2;
                System.out.println("La resta de los numeros es" + r);
            }
            case '*' -> {
                r = n1 * n2;
                System.out.println("La multiplicacion de los numeros es" + r);
            }
            case '/' -> {
                r = n1 / n2;
                System.out.println("La division de los numeros es" + r);
            }
            case '%' -> {
                r = n1 % n2;
                System.out.println("El resto de los numeros es" + r);
            }
            default -> System.out.println("Operador no existe");
        }
    }
}
