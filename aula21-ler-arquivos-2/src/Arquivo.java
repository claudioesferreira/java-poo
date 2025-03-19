import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {
    public String ler(String caminhoArquivo) throws Exception {
        String conteudo = "";

        // try with resources
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha = leitor.readLine();

            do {
                conteudo += linha;
                linha = leitor.readLine();
                if (linha != null) {
                    conteudo += "\n";
                }
            } while (linha != null);

        } catch (Exception e) {
            throw e;
        }

        return conteudo;
    }
}
