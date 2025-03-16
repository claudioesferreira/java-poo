public class App {
    public static void main(String[] args) throws Exception {
        /*
            🔵 Classe Object + toString + implicito e explicito
            🔵 Sobrescrita de métodos + exemplos
            🔵 Método super
            🔵 Modificadores sem acesso
        */

        Serie serie = new Serie("The Last Of Us", 1, 2022);
        //System.out.println(serie.pegarInformacoes());

        //System.out.println(serie.toString()); // explicita
        System.out.println(serie); // implicita
    }
}
