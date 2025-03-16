public class Animal {
    String especie;
    String raca;
    String nome;
    int idade;
    float peso;

    void adotado() {
        System.out.format("O %s chamado %s da raça %s foi adotado\n\n", especie, nome, raca);
    }
}
