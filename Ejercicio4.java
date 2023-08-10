import java.util.Scanner;

public class Ejercicio4 {

        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);

                double arriendo, comida, sueldo_sobrante, sueldo;

                System.out.println("Ingrese su sueldo total de Pedro: ");
                sueldo = teclado.nextInt();

                arriendo = (40*sueldo) / 100  ;
                comida = (15*sueldo) / 100  ;
                sueldo_sobrante = sueldo - (arriendo+comida);

                System.out.println("El Arriendo de Pedro es: " + arriendo);
                System.out.println("La Comida de Pedro es: " + comida);
                System.out.println("El sueldo sobrante de Pedro es: " + sueldo_sobrante);

        }
}

