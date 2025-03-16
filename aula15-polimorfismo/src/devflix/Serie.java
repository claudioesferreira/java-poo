package devflix;

public class Serie extends Filme {
    private int temporadas;
    private int episodiosPorTemporada;
    private int temporadaAtual;
    private int episodioAtual;

    public Serie(String nome, int temporada, int episodiosPorTemporada) {
        super(nome);
        this.temporadas = temporada;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.episodioAtual = 1;
    }

    public void play(int temporada, int episodio) {
        if (validarEpisodio(temporada, episodio)) {
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Episódio inválido");
        }
        
    }

    public boolean validarEpisodio(int temporada, int episodio) {
        if (temporada == 0 || episodio == 0) {
            return false;
        }
        if (temporada > temporadas || episodio > episodiosPorTemporada) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String informacao = String.format("Série %s %dx%02d (audio %s, legenda %s)", 
        getNome(), 
        temporadaAtual, 
        episodioAtual, 
        getAudio(), 
        getLegenda());
        return informacao;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporada) {
        this.temporadas = temporada;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }
}
