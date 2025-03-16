import jogo.Arqueiro;
import jogo.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            🔵 Classe Object + toString + implicito e explicito
            🔵 Sobrescrita de métodos + exemplos
            🔵 Método super
            🔵 Modificadores sem acesso
        */

        Arqueiro arqueiro = new Arqueiro("Legolas");

        System.out.println(arqueiro);
        arqueiro.atacar();
        arqueiro.atacarSemArma();
        arqueiro.atacarComArma();
    }
}
