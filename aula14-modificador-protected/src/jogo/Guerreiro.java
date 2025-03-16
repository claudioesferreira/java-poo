package jogo;

public class Guerreiro extends Personagem{

    @Override
    public void atacar() {
        int valorDado6Faces = rolarDado();

        System.out.printf("Você tirou um %d no dado\n", valorDado6Faces);
        if (valorDado6Faces < 3) {
            System.out.println("O guerreiro errou o ataque!");
        } else if (valorDado6Faces == 6) {
            System.out.println("O guerreiro acertou um golpe especial!");
        } else {
            System.out.println("O guerreiro acertou o inimigo!");
        }
    }

    public int rolarDado() {
        return super.rolarDado();
    }
    
}
