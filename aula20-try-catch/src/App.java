import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Matematica matematica = new Matematica();
        int[] numeros = new int[] {10, 20, 30, 40};
        int[] pesos = new int[] {2, 0, 4};

        for (int i = 0; i < 4; i++) {
            try {
                matematica.dividir(numeros[i], pesos[i]);
                System.out.println("Mensagem após a exceção");
            } catch (ArithmeticException erro) {
                JOptionPane.showMessageDialog(null, "Erro de cálculo: " + erro.getMessage());
            } catch (ArrayIndexOutOfBoundsException erro) {
                System.out.println("Erro de vetor: " + erro.getMessage());
            } catch (Exception erro) {
                System.out.println("Erro genérico: " + erro.getMessage());
            }
            System.out.println("Mensagem final");
        }
    }
}
