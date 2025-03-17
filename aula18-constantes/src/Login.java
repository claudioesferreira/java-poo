public class Login {
    private static final int TAMANHO_MINIMO_SENHA = 8;

    public void verificarSenha(String senha) {
        if (senha.length() >= TAMANHO_MINIMO_SENHA) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
        }
    }
}
