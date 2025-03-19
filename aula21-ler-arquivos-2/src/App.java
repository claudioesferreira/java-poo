import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String caminhoArquivo = "aula21-ler-arquivos-2\\src\\usuario.txt";

        /*
         * Files.readAllLines -> para ler todas as linhas; quando for um arquivo pequeno
         * BufferedReader -> complexo de escrever; ele é ótimo para ler arquivos grande; quando precisar ler linha por linha
         */
        
        try {
            Path caminho = Paths.get(caminhoArquivo);
            List<String> resultadoLista = Files.readAllLines(caminho);

            String conteudo = String.join("\n", resultadoLista);
            System.out.println(conteudo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um problema na leitura do arquivo");
        }
    }
}
