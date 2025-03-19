import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame();

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setBounds(300, 100, 200, 50);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(300, 150, 200, 30);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(300, 180, 200, 50);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(300, 230, 200, 30);

        JButton botaoLogar = new JButton("Login");        
        botaoLogar.setBounds(300, 300, 200, 50);
        botaoLogar.addActionListener(e -> {
            String usuario = campoUsuario.getText();
            String senha = new String(campoSenha.getPassword());
            campoUsuario.setText("");
            campoSenha.setText("");
            if (usuario.equals("Claudio") && senha.equals("1234")) {
                System.out.println("Você realizou o login com sucesso!");
            } else {
                System.out.println("Usuário ou senha inválidos!");
            }
        });

        janela.add(botaoLogar);
        janela.add(labelUsuario);
        janela.add(campoUsuario);
        janela.add(labelSenha);
        janela.add(campoSenha);
        janela.setLayout(null);
        janela.setBounds(300, 75, 800, 600);
        janela.setTitle("Minha janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        janela.setVisible(true); 
    }
}
