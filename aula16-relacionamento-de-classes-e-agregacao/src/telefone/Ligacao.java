package telefone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ligacao {
    private String contatoOrigem;
    private String contatoDestino;
    private String horarioLigacao;

    public Ligacao(String numeroOrigem, String numeroDestino) {
        this.contatoOrigem = numeroOrigem;
        this.contatoDestino = numeroDestino;
    }

    public Ligacao(Contato contatoOrigem, Contato contatoDestino) {
        this.contatoOrigem = contatoOrigem.getNumero();
        this.contatoDestino = contatoDestino.getNumero();
    }


    public void ligar() {
        System.out.println("Ligando para " + contatoDestino);
        System.out.println("Chamando...");
        System.out.println("O número está ocupado.");
        DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        LocalDateTime horarioAgora = LocalDateTime.now();
        horarioLigacao = formatadorData.format(horarioAgora);
    }

    @Override
    public String toString() {
        String informacao = String.format("Origem: %s\tDestino: %s\tHorário: %s", contatoOrigem, contatoDestino, horarioLigacao);
        return informacao;
    }

    public String getContatoOrigem() {
        return contatoOrigem;
    }

    public void setContatoOrigem(String numeroOrigem) {
        this.contatoOrigem = numeroOrigem;
    }

    public String getContatoDestino() {
        return contatoDestino;
    }

    public void setContatoDestino(String numeroDestino) {
        this.contatoDestino = numeroDestino;
    }
}
