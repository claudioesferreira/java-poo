import devflix.Filme;
import devflix.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        // Polimorfismo -> qualidade ou estado de ser capaz de assumir diferentes formas
        // Polimorfismo -> um método se comporta de maneira diferente para cada uma das classes derivadas
        Filme filme = new Filme("Lagoa Azul");
        filme.play();
        filme.play("italiano");
        filme.play("francês", "inglês");

        Serie serie = new Serie("Friends", 2, 10);
        serie.play(2, 1);
    }
}
