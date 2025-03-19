public class App {
    public static void main(String[] args) throws Exception {

        try {
            System.out.println("Mensagem antes da exceção");
            int resultado = 10 / 0;
            System.out.println("Mensagem após a exceção");
        } catch (Exception erro) {
            System.out.println("Erro: " + erro.getMessage());
        } finally {
            System.out.println("Vou ser executado independente se deu erro ou não");
        }
    }
}
