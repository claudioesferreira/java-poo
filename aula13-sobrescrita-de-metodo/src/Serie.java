public class Serie extends Object {
    // Object é a superclasse de todas as classes em Java
    private String nome;
    private int temporadas;
    private int anoLancamento;

    public Serie(String nome, int temporadas, int anoLancamento) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.anoLancamento = anoLancamento;
    }

    public String pegarInformacoes() {
        String informacoes = String.format("Nome: %s (%d) - %d temporada(s)\n", nome, anoLancamento, temporadas);
        return informacoes;
    }

    @Override
    public String toString() {
        String informacoes = String.format("Nome: %s (%d) - %d temporada(s)\n", nome, anoLancamento, temporadas);
        return informacoes;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
