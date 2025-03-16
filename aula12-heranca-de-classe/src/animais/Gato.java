package animais;

public class Gato extends Animal {
    public Gato(String nome) {
        super("Gato");
    }

    public void miar() {
        System.out.printf("%s miou\n", getNome());
    }
}
