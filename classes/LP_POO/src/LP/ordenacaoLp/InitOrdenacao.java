package LP.ordenacaoLp;

import java.util.Random;
import java.util.Scanner;

public class InitOrdenacao {

    public static void main(String[] args){

        try (// Scanner in = new Scanner(System.in); // fazer a leitura pelo teclado
        Scanner in = new Scanner(System.in)) {
        }

        int vetor [] = new int[5];
        int vetor2[] = {1,2,3,4,5,6,7,8,9,10,11,12};

        int matriz[] [] = new int[3] [3];

        vetor[2] = 30;
        vetor2[0] = 10;
        matriz[0] [0] = 1;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(vetor[i]);
        }

    // for (int i = 0; i < 5; i++) {
    //   System.out.println("Digite o #" + (i + 1) + " número");
    //   vetor[i] = in.nextInt(); // ler um num e armazena no vetor na posicao i
    // }
    // ----------------------------------------------------------------
    // int num = 1 + ((int) (Math.random()) * 10);

        int min = (int) (Math.random()) * 10;
        Random rand = new Random();
        System.out.println(rand.nextInt(min));

        // int min = 2, max = 10;
        // Random rand = new Random();
        // System.out.println(rand.nextInt(max - min) + min);
    }
}