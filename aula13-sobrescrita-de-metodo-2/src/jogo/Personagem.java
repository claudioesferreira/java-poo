package jogo;

/*
 * private, public, protected -> modificadores de acesso
 * final, abstract -> modificadores de sem acesso
 */

public abstract class Personagem {
    private String nome;
    private String classe; // Guerreiro, Mago, Arqueiro
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = classe = "Nenhuma";
        this.nivel = nivel = 1;
    }

    @Override
    public String toString() {
        String informacoes = String.format("%s (nível: %d) - Classe: %s", nome, nivel, classe);
        return informacoes;
    }

    public final void atacarSemArma() {
        System.out.println("O personagem atacou sem arma!");
    }

    public void atacar() {
        System.out.println("O personagem atacou!");
    }

    public abstract void atacarComArma();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
