import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(88);
        numeros.add(57);
        numeros.add(40);
        numeros.add(78);
        numeros.add(22);
        numeros.add(59);
        numeros.add(67);
        numeros.add(26);

        // sort -> ordenar
        Collections.sort(numeros, Collections.reverseOrder());

        System.out.println("Números ordenados:");

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
        System.out.println();

        ArrayList<String> pessoas = new ArrayList<String>();
        pessoas.add("Valdeir");
        pessoas.add("Marisa");
        pessoas.add("Claudio");
        pessoas.add("Nicholas");
        pessoas.add("Nathália");

        Collections.sort(pessoas, Collections.reverseOrder());

        System.out.println("Nomes ordenados:");

        for (String nome : pessoas) {
            System.out.println(nome);
        }
    }
}
