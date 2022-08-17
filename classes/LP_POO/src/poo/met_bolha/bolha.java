package poo.met_bolha;

// import javax.print.event.PrintEvent;

public class bolha {
// private static final int TAM = 1000;

    public static void main(String[] args){
        int vetor[] = {3, 7, 1, 5, 4, 9, 2, 0, 8, 6};
        int aux;
        boolean troca = true;
        while (troca){
            troca = false;
            for (int i = 0; i < 10-1; i++) {
                if (vetor[i] > vetor[i+1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                }
            }
        
        }
        System.out.print("Vetor Ordenado: ");
        for (int i = 0; i < 10; i++) {
        System.out.print(vetor[i] + " ");
            }   
    }
}

