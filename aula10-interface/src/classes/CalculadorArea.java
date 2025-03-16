package classes;

public class CalculadorArea {
    
    public double calcularArea(FiguraGeometrica figura1, FiguraGeometrica figura2) {
        double areaTotal = figura1.calcularArea() + figura2.calcularArea();
        return areaTotal;
    }
}
