package LP.ordenacaoLp;

import java.util.Random;

public class Bubble {
  private static final int TAM = 50; //declarando o tamanho do vetor

  public static void main(String[] args) {
    int vetor[] = new int[TAM]; // criando um novo objeto do tipo vetor
    Random rand = new Random(); //Uma instância dessa classe é usada para gerar um fluxo de números pseudoaleatórios
      
      for (int i = 0; i < vetor.length; i++) { //laço para percorrer a lista
        vetor[i] = rand.nextInt(TAM * TAM - 1) + 1; 
        /* nextInt: Retorna um valor int pseudoaleatório, distribuído uniformemente entre 0 (inclusive)
        e o valor especificado (exclusivo), extraído da sequência desse gerador de números
        aleatórios*/
      }

      System.out.println("Vetor desordenado:"); 
      print(vetor);

    System.out.println("\n\nVetor ordenado");
    boolean troca = false;
    int numComparacao = 0;
    do {
      int x = 0;
      troca = false;
      for (int j = 0; j < vetor.length - 1; j++) {
        numComparacao++;
        if (vetor[j] > vetor[j + 1]) {
          troca = true;
          int aux = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = aux;
        }
      }
    } while (troca);

    print(vetor);
  }

  //----------------------------------------------------------------
  public static void print(int vetor[]) { //
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " \t ");
    }
  }
}