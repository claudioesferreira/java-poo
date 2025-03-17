public class App {
    static int soma = 0;

    private static void imprimirMensagem() {
        System.out.println("Olá, mundo!");
    }
    public static void main(String[] args) throws Exception {
        int soma =80;
        System.out.println("Soma = "+ soma);
        imprimirMensagem();

        System.out.println(Matematica.calcularAreaCirculo(8));
        System.out.println(Jogo.areaJogador + "\n");

        Carro ferrari = new Carro("Ferrari", 2023);
        Carro fusca = new Carro("Fusca", 1999);

        ferrari.anoCompra = 2025;
        fusca.anoCompra = 2016;

        Carro.anoCompra = 2020;

        System.out.println(ferrari.getNome());
        System.out.println(ferrari.anoCompra);

        System.out.println(fusca.getNome());
        System.out.println(Carro.anoCompra);
    }
}