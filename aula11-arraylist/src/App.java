import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // Array (vetor) -> com um tamanho fixo de 5 posições
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Claudio";
        arrayEstatico[1] = "Valdeir";
        arrayEstatico[2] = "Marisa";
        arrayEstatico[3] = "Nicholas";
        arrayEstatico[4] = "Nathália";

        // ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Claudio"); // indice 0
        arrayDinamico.add("Valdeir"); // indice 1
        arrayDinamico.add("Marisa"); // indice 2
        arrayDinamico.add("Nicholas"); // indice 3
        arrayDinamico.add("Nathália"); // indice 4

    System.out.println("Imprimindo o ArrayEstatico");
    for (int i = 0; i < arrayEstatico.length; i++) {
        System.out.println(arrayEstatico[i]);
    }

    System.out.println();

    System.out.println("Imprimindo o ArrayDinamico");

    System.out.println("Claudio foi removido");
    arrayDinamico.remove(0); // remove -> remove um elemento por índice

    //arrayDinamico.clear(); // Limpa todo o ArrayList

    //System.out.printf("O ArrayDinamico tem %d elemento(s)\n", arrayDinamico.size());

    /*for (int i = 0; i < arrayDinamico.size(); i++) {
        String nome = arrayDinamico.get(i);
        System.out.println(nome);
    }*/

    for (String nome : arrayDinamico) {
        System.out.println(nome);
    }
    
    }
}
