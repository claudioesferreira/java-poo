import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String caminhoArquivo = "aula21-ler-arquivos\\src\\usuarios.txtgdfg";

        try {
            Arquivo arquivo = new Arquivo();
            String resultado = arquivo.ler(caminhoArquivo);
            System.out.println(resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Houve um problema na leitura do arquivo");
        }

        /*try {
            FileReader leitorArquivo = new FileReader(caminhoArquivo);
            leitor = new BufferedReader(leitorArquivo);

            String linha = leitor.readLine();
            
            do {
                System.out.println(linha);
                linha = leitor.readLine();
            } while (linha != null);

        } catch (Exception e) {
            System.out.println("Deu ruim");
            System.out.println(e.getMessage());
        } finally {
            leitor.close();
        }*/
    }
}
