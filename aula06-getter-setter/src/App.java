import classes.Conta;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        // Modificar -> setNomeVariavel
        // Pegar -> getNomeVariavel

        pessoa.setNome("Claudio");
        pessoa.setIdade(19);
        pessoa.setAltura(1.75f);

        System.out.println(pessoa.getNome());       
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();

        System.out.println(conta.getSaldo());
        conta.depositar(-200);
        System.out.println(conta.getSaldo());
    }
}
