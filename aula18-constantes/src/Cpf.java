public class Cpf {
    private static final int INDICE_REGIAO_CPF = 8;
    private static final int INDICE_PRIMEIRO_VERIFICADOR = 9;
    private static final int INDICE_SEGUNDO_VERIFICADOR = 10;

    public void validarCpf(String cpf) {
        int regiao = cpf.charAt(INDICE_REGIAO_CPF);
        int primeiroDigitoVerificador = cpf.charAt(INDICE_PRIMEIRO_VERIFICADOR);
        int segundoDigitoVerificador = cpf.charAt(INDICE_SEGUNDO_VERIFICADOR);
    }
}
