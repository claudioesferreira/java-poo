import animais.Cachorro;
import animais.Dragao;
import animais.Gato;
import animais.Pombo;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro("Soneca");
        cachorro.comer();
        cachorro.latir();

        Gato gato = new Gato("Soneca");
        gato.comer();
        gato.miar();

        Dragao dragao = new Dragao("Dragao branco de olhos azuis");
        dragao.voar();
        dragao.soltarFogo();

        Pombo pombo = new Pombo("Pombo correio Sedex");
        pombo.enviarCarta();
        pombo.fazerPruh();
        System.out.printf("%s já enviou %d cartas\n", pombo.getNome(), pombo.getCartasEnviadas());
    }
}
