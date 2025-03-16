import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Tipo Primitivo -> Wrapper Class
        int            ->  Integer
        float          ->  Float
        double         ->  Double
        char           ->  Character
        */

        Pessoa joao = new Pessoa("João", 20);
        Pessoa maria = new Pessoa("Maria", 22);
        Pessoa pedro = new Pessoa("Pedro", 75);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(joao);
        pessoas.add(maria);
        pessoas.add(pedro);

        for (Pessoa pessoa : pessoas) {
            System.out.printf("%s tem %d anos\n", pessoa.getNome(), pessoa.getIdade());
        }

    }
}
