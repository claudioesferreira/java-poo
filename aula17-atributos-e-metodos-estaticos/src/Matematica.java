public class Matematica {
    private static double valorPI = 3.14;
    
    public static int soma(int numeroA, int numeroB) {
        return numeroA + numeroB;
    }

    public static int areaQuadrado(int lado) {
        return lado * lado;
    }

    public static double calcularAreaCirculo(double raio) {
        double area = valorPI * (raio * raio);
        return area;
    }

    public static double calcularDobroAreaCirculo(double raio) {
        double area = calcularAreaCirculo(raio) * 2;
        return area;
    }
}