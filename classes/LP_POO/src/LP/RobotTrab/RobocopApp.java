package LP.RobotTrab;

import java.util.Scanner;

public class RobocopApp {
    
    public static void main(String[] args){
        Scanner leitorString = new Scanner(System.in);
        Scanner leitorInt = new Scanner(System.in);
        
        /*A classe Scanner tem como objetivo separar a entrada dos textos em blocos, gerando os conhecidos tokens,
        que são sequências de caracteres separados por delimitadores que por padrão correspondem aos espaços em
        branco, tabulações e mudança de linha. */

        /* Para ler Scanner em Java: basta utilizarmos os métodos next do tipo primitivo no formato nextTipoDado().
        Como no código abaixo. Scanner scanner = new Scanner(System.in); int numeroInteiro = scanner. nextInt();
        byte numeroByte = scanner.
        */

        //Criando um novo Robo

        Robocop algemiro = new Robocop(0,0);


        while (true) {
            //Entranda de dados do usuário
            System.out.println("Digite qual direção [Norte, Sul, Leste, Oeste]:");
            String direcao = leitorString.nextLine();
            System.out.println("Digite quantas casas devo mover [int]: ");
            int casas = leitorInt.nextInt();
            
            //Implementação do método
            algemiro.movimentar(direcao, casas);
            System.out.println("Configuração escolhida: " + casas + " casas ao " + direcao + "");
            

            //Encerrar o loop
            System.out.println("\n\n\n\n");
            System.out.println("Deseja continuar? [0-NÃO // 1-SIM]");
            
            int opcao = leitorInt.nextInt();
            if (opcao == 0) {
                break;
            }
        }
        
        //Encerrando Scanner 
        leitorString.close();
        leitorInt.close();
    }
}