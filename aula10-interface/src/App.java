import classes.CalculadorArea;
import classes.Circulo;
import classes.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(2);
        Quadrado quadrado = new Quadrado(6);

        CalculadorArea calcular = new CalculadorArea(); 

        System.out.printf("A soma da área da 2 figuras é = %.2f\n", calcular.calcularArea(quadrado, circulo));
    }
}
