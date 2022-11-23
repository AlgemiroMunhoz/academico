package LP.ordenacaoLp;

public class Ex2_Ordenacao {
    
    public  static void main(String[] args){

        int vetor[] = {3,6,2,1,8,4}; //Vetor desordenado com números inteiros
        int aux; //Variável auxiliar para armazenar a troca dos vetores
        boolean controle; // Variável para controlar quando o nº de posições no vetor for maior que o indicado.

        for(int i=0; i<vetor.length; i=i+1) { //Laço para percorrer todo o vetor
            controle = true; // variavél controle igual a verdadeiro
            for(int j=0; j<vetor.length -1;j=j+1) { //Laço para verificar a posição no vetor.
                if(vetor[j] > vetor[j + 1]) { // se a posição 0 for maior que a posição 0 + 1, faça
                    aux = vetor[j]; //armazenar a posição 0 na variável auxiliar
                    vetor[j] = vetor[j + 1]; // a posição 0 recebe a posição 0+1
                    vetor[j+1] = aux; // a posição 0 + 1 recebe o que está na variável auxiliar
                    controle = false; // variável controle igual a falso. Enquanto o for for verdadeiro.
                }
            }
            if(controle) { //Quando o for for falso. Break para parar o laço.
                break;
            }
        }
        for(int i=0; i<vetor.length; i=i+1){
            System.out.println(vetor[i] + " "); // percorre e imprime o vetor
        }
    }
}
