import telefone.Contato;
import telefone.Contatos;
import telefone.Telefone;

public class App {
    public static void main(String[] args) throws Exception {
        Telefone telefone = new Telefone("4002 8922");      
        Contato contatoA = new Contato("Lucas", "40897456");
        Contato contatoB = new Contato("Luan", "12345678");
        Contato contatoC = new Contato("Maria", "78945612");
        Contato contatoD = new Contato("Lorraine", "78945612");

        Contatos telefoneContatos = telefone.getContatos();
        telefoneContatos.adicionar(contatoA);
        telefoneContatos.adicionar(contatoB);
        telefoneContatos.adicionar(contatoC);
        telefoneContatos.adicionar(contatoD);
        System.out.println(telefone.getContatos());

        System.out.println("Contatos filtrados:");
        System.out.println(telefoneContatos.buscar("l"));
    }
}
