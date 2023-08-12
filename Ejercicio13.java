import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String h1;
        int salario, aumento, nuevo_salario;

        System.out.print("Introduzca nombre del empleado 1: ");
        h1 = teclado.next();
        System.out.print("Introduzca salario del empleado 1: ");
        salario = teclado.nextInt();

        if (salario <= 800) {
            aumento = (10 * salario) / 100;
            nuevo_salario = salario + aumento;
            System.out.println("El empleado: " + h1 + " recibe un total de " + nuevo_salario + " pesos");
        } else {
            aumento = (8 * salario) / 100;
            nuevo_salario = salario + aumento;
            System.out.println("El empleado: " + h1 + " recibe un total de " + nuevo_salario + " pesos");
        }if (salario > 1200) {
            aumento = (5 * salario) / 100;
            nuevo_salario = salario + aumento;
            System.out.println("El empleado: " + h1 + " recibe un total de " + nuevo_salario + " pesos");
        }
    }
}
