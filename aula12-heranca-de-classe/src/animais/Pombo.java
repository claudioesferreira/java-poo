package animais;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 10;
    }

    public void fazerPruh() {
        System.out.printf("%s fez pruuuuhh\n", getNome());
    }
    
    public void enviarCarta() {
        System.out.printf("%s enviou uma carta\n", getNome());
        cartasEnviadas++;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }
}
