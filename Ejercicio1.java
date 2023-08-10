import java.util.Scanner;

public class Ejercicio1 {
    static int f (int x, int y) {
        return x * x + 2 * x * y + y * y;
    }

    public static void main(String[] args) {
        //1. Leer los datos de entrada.
        Scanner teclado = new Scanner(System.in);
        int x , y; //Datos de entrada

        System.out.println("Entre el valor de x: ");
        x=teclado.nextInt();
        System.out.println("Entre el valor de y: ");
        y=teclado.nextInt();

        //2.Encontrar el dato de salida
        int resultado = f(x,y);

        //3. Mostrar el dato de salida
        System.out.println("El resultado de la funcion es: " + resultado);
    }
}
