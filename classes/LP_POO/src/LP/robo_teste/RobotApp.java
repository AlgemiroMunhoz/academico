package LP.robo_teste;

import java.util.Scanner;

public class RobotApp {
    
    public static void main(String[] args) {
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorInt   = new Scanner(System.in);

                /*A classe Scanner tem como objetivo separar a entrada dos textos em blocos, gerando os conhecidos tokens,
        que são sequências de caracteres separados por delimitadores que por padrão correspondem aos espaços em
        branco, tabulações e mudança de linha. */

        /* Para ler Scanner em Java: basta utilizarmos os métodos next do tipo primitivo no formato nextTipoDado().
        Como no código abaixo. Scanner scanner = new Scanner(System.in); int numeroInteiro = scanner. nextInt();
        byte numeroByte = scanner.
        */

        //Criando um novo Robo

        Robot algemiro = new Robot(0,0);

        while (true) {

            //Entrada de dados do usuário
            System.out.println("Digite qual a direção [ N, S, L, O ]");
            String direcao = leitorString.nextLine();
            System.out.println("Digite quantas casas devo mover [int]");
            int casas = leitorInt.nextInt();

            //Implementação do Método
            algemiro.andarFrente(direcao, casas);
            System.out.println("Configuração escolhida: " + casas + " casas ao " + direcao + "");
            // algemiro.virarE();
            // System.out.println("RobotApp.main "+ casas +" casas devo mover [int]" + direcao + "");
            // algemiro.virarD();
            // System.out.println("RobotApp.main "+ casas +" casas devo mover [int]" + direcao + "");

            // Encerrar Lop
            System.out.println("\n\n\n\n");
            System.out.println("Deseja continuar? [0-NÃO // 1-SIM]");

            int opcao = leitorInt.nextInt();
            if (opcao == 0){
                break;
            }
        }
        //Ecerrando Scanner
        leitorString.close();
        leitorInt.close();
    }
}
