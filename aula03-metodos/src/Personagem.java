import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    // void significa que não está retornando
    void mostrarStatus() {
        System.out.format("Personagem: %s (lvl %d) com %d de força\n", nome, nivel, forca);
    }

    int calcularDano() {
        Random gerador = new Random();
        int dado20faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20faces;
        return dano;
    }

    // método que não retorna nada e recebe um parâmetro alvo que é do tipo string
    void atacar(String alvo, String habilidade) {
            int danoCausado = calcularDano();

        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano\n", nome, alvo, danoCausado);
        } else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano\n", nome, habilidade, alvo, danoCausado);
        }
    }
}
