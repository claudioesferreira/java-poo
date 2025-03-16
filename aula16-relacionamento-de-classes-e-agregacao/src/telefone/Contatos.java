package telefone;
import java.util.ArrayList;

public class Contatos {
    private ArrayList<Contato> contatos;

    public Contatos() {
        this.contatos = new ArrayList<Contato>();
    }

    public void adicionar(String nome, String numero) {
        Contato novoContato = new Contato(nome, numero);
        contatos.add(novoContato);
    }

    public void adicionar(Contato novoContato) {
        contatos.add(novoContato);
    }

    public Contatos buscar(String palavraChave) {
        String palavraChaveMinusculo = palavraChave.toLowerCase();

        Contatos contatoFiltrados = new Contatos();
        for (Contato contato : contatos) {
            String nomeContatoMinusculo = contato.getNome().toLowerCase();
            if (nomeContatoMinusculo.startsWith(palavraChaveMinusculo)) {
                contatoFiltrados.adicionar(contato);
            }
        }
        return contatoFiltrados;
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }
    
    @Override
    public String toString() {
        String informacao = "Contatos:\n";
        for (Contato contato : contatos) {
            informacao += contato.toString() + "\n";
        }
        return informacao;        
    }
}
