public class App {
    public static void main(String[] args) throws Exception {
        //Declarando um objeto do tipo celular = instanciando um objeto
        Celular celularA = new Celular();
        celularA.nome = "Iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.espacoArmazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy Note 20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.espacoArmazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC; //Declarando o objeto chamado celularC
        celularC = new Celular();
        celularC.nome = "Xiomi Mi 11 Pro";
        celularC.tamanhoTela = 6.81f;
        celularC.espacoArmazenamento = 256;
        celularC.sistemaOperacional = "Android";

        System.out.println("Celulares\n");

        System.out.format("Celular %s, com tela de %.1f\", com armazenamento de %dgb e SO %s\n", celularA.nome, celularA.tamanhoTela, celularA.espacoArmazenamento, celularA.sistemaOperacional);
        System.out.format("Celular %s, com tela de %.1f\", com armazenamento de %dgb e SO %s\n", celularB.nome, celularB.tamanhoTela, celularB.espacoArmazenamento, celularB.sistemaOperacional);
        System.out.format("Celular %s, com tela de %.2f\", com armazenamento de %dgb e SO %s\n\n", celularC.nome, celularC.tamanhoTela, celularC.espacoArmazenamento, celularC.sistemaOperacional);

        celularB.ligacao();
        celularA.enviarMensagem();

        Animal animalA = new Animal();
        animalA.especie = "Cachorro";
        animalA.raca = "Vira-lata";
        animalA.nome = "Lilica";
        animalA.idade = 3;
        animalA.peso = 9.8f;

        Animal animalB = new Animal();
        animalB.especie = "Cachorro";
        animalB.raca = "Vira-lata";
        animalB.nome = "Soneca";
        animalB.idade = 4;
        animalB.peso = 5.4f;

        Animal animalC = new Animal();
        animalC.especie = "Cachorro";
        animalC.raca = "Vira-lata";
        animalC.nome = "Mel";
        animalC.idade = 3;
        animalC.peso = 4.2f;

        Animal animalD = new Animal();
        animalD.especie = "Gato";
        animalD.raca = "Comum";
        animalD.nome = "Tom";
        animalD.idade = 4;
        animalD.peso = 4.8f;

        System.out.println("Animais\n");

        System.out.format("Especie: %s\nRaça: %s\nNome: %s\nIdade: %d anos\nPeso: %.1fkg\n\n", animalA.especie, animalA.raca, animalA.nome, animalA.idade,animalA.peso);
        System.out.format("Especie: %s\nRaça: %s\nNome: %s\nIdade: %d meses\nPeso: %.1fkg\n\n", animalB.especie, animalB.raca, animalB.nome, animalB.idade,animalB.peso);
        System.out.format("Especie: %s\nRaça: %s\nNome: %s\nIdade: %d meses\nPeso: %.1fkg\n\n", animalC.especie, animalC.raca, animalC.nome, animalC.idade,animalC.peso);
        System.out.format("Especie: %s\nRaça: %s\nNome: %s\nIdade: %d anos\nPeso: %.1fkg\n\n", animalD.especie, animalD.raca, animalD.nome, animalD.idade,animalD.peso);

        animalD.adotado();
    }
}
