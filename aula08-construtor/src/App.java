import javax.swing.JOptionPane;
import classes.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        String nome =JOptionPane.showInputDialog(null, "Nome do personagem: ", "Nome do Personagem", JOptionPane.QUESTION_MESSAGE);
        String classe = JOptionPane.showInputDialog(null, "Classe do personagem: ", "Classe do Personagem", JOptionPane.QUESTION_MESSAGE);

        Personagem personagem = new Personagem(nome, classe);

        personagem.mostrarStatus();
    }
}
