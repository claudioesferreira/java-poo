package classes;

public class Quadrado implements FiguraGeometrica {
    // Atributos
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Métodos especificos
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    // Getters and Setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
