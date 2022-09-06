// Criar um sistema de biblioteca em java. 
// O sistema de biblioteca deve permitir o cadastro e a busca de livros. 
// O sistema deve permitir o cadastro de usuários. 
// O sistema deve permitir a empréstimo e a devolução de livros. 
// O sistema deve permitir a busca de livros por título ou autor.

package poo.TrabSistBiblio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import poo.TrabSistBiblio.heranca.LivroBiblio;
import poo.TrabSistBiblio.heranca.UsuarioBiblio;
import poo.ex_heranca.heranca.Emprestimo;

public class BiblioApp {
// 4. Crie uma classe Biblioteca com os seguintes atributos:
// - ArrayList<Livro> livros
// - ArrayList<Usuario> usuarios
// - ArrayList<Emprestimo> emprestimos

    private static List<LivroBiblio> livros = new ArrayList<LivroBiblio>();
    private static List<UsuarioBiblio> usuarios = new ArrayList<UsuarioBiblio>();
    private static List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public static List<LivroBiblio> getLivros() {
        return livros;
    }
    public static void setLivros(List<LivroBiblio> livros) {
        BiblioApp.livros = livros;
    }
    public static List<UsuarioBiblio> getUsuarios() {
        return usuarios;
    }
    public static void setUsuarios(List<UsuarioBiblio> usuarios) {
        BiblioApp.usuarios = usuarios;
    }
    public static List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    public static void setEmprestimos(List<Emprestimo> emprestimos) {
        BiblioApp.emprestimos = emprestimos;
    }

    // public class Main {

        
        public static void main(String[] args) throws Exception {    
        System.out.println("\n\n  Olá professor! Esse é o Sistema Bibliotecas");

        // 5. Implemente os métodos da classe Biblioteca para:
        // - Cadastrar um livro;
        // - Cadastrar um usuário;
        // - realizar um empréstimo;
        // - realizar uma devoluçao
        // - pesquisar um livro por tipo e autor

        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n-------------Menu de Opções-------------");
                System.out.println("1 - Cadastrar Livro");
                System.out.println("2 - Cadastras usuário");
                System.out.println("3 - relizar empréstimos");
                System.out.println("4 - Realizar devoluçao");
                System.out.println("5 - Pesquisar um livro por tipo e autor");
                System.out.println("6 - Sair");
                System.out.println("\n");
                System.out.print("Opção: ");
                opcao = sc.nextInt();

                /*Break – O comando break é usado em laços de repetição while, do/while, for e com os
                comandos switch/case. Quando usado em laço de repetição, causa uma interrupção imediata
                do mesmo, continuando a execução do programa na próxima linha após o laço. Isso ocorre
                caso a condição imposta seja atendida. */

                /*O switch case Java é uma estrutura muito importante para testar condições de uma forma
                simples e intuitiva, reduzindo a necessidade de criar blocos de código complexo usando vários
                if else encadeados */
                
                switch(opcao) {
                    case 1:
                        //Cadastrar Livro
                        System.out.println("Livro Cadastrado! ");
                        System.out.println("\n");
                        System.out.println("Agora cadastre o usuário");
                        break;
                    case 2:
                        //Cadastrar Usuario
                        System.out.println("Usuário Cadastrado! ");
                        System.out.println("\n");
                        System.out.println("Agora, Pesquise o livro por autor");
                        break;
                    case 3:
                        //Realizar Emprestimo
                        System.out.println("Empréstimo realizado! ");
                        System.out.println("\n");
                        System.out.println("Aguardamos devolução");
                        break;
                    case 4:
                        System.out.println("Devolução realizada! ");
                        System.out.println("\n");
                        System.out.println("Parabéns pela Leitura. Clique em Sair");
                        break;
                    case 5:
                        //Pesquisar um tipo de livro por autor
                        System.out.println("Livro Pesquisado! ");
                        System.out.println("\n");
                        System.out.println("Agora, realize o empréstimo");
                        break;
                    case 6:
                        //Sair
                        break;
                    default:
                    System.out.println("Opção Inválida!");
                }
            } while(opcao != 6);
        }catch (Exception e) {
            // TODO: handle exception
        }
        /* O conjunto de blocos Try-Catch-Finally é o recurso, à nivel de linguagem de programação,
        criado para tratar exceções. Este conjunto atua capturando as possíveis exceções em seu código
        e, com o objetivo de impedir fluxos inesperados, ele mesmo determina o que fazer na ocorrência
        de exceções.*/
    }
}

