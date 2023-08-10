import java.util.Scanner;

public class Circulo {
    private double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    public Circulo () {
        radio = 5.0;
    }
    public double area(){
        return Math.PI * radio * radio;
    }
    public double longitudCircunferencia(){
        return 2 * Math.PI * this.radio;
    }
    public static void main (String[] args){
        Scanner teclado = new Scanner((System.in));

        double r;
        Circulo circulo;

        System.out.println("Entre el radio del circulo: ");
        r = teclado.nextDouble();

        circulo = new Circulo (r);

        System.out.println("El area del circulo es" + circulo.area());
    }
}

