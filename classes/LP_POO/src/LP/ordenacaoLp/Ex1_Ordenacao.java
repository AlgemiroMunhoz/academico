package LP.ordenacaoLp;


public class Ordenacao {

    public static void main(String[] args) {
       
        int[] lista = {5, 2, 4, 7, 1, 3, 2, 6};
       
        System.out.println("Lista desordenada:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
       
        System.out.println();
        System.out.println("Lista ordenada:");
        int aux;
       
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                aux = lista[j];
                lista[j] = lista[j + 1];
                lista[j + 1] = aux;
                }
            }
        }
       
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}