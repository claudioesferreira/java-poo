public class Celular {
    //características -> atributos
    String nome;
    String sistemaOperacional;
    int espacoArmazenamento;
    float tamanhoTela;

    void ligacao() {
        System.out.format("Recebi uma ligação de um %s\n\n", nome);
    }

    void enviarMensagem() {
        System.out.format("Enviei uma mensagem para um %s\n\n", nome);
    }
}