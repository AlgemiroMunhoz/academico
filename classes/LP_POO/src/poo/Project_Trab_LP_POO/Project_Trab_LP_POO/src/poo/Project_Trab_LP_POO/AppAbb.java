package poo.Project_Trab_LP_POO;
import poo.Project_Trab_LP_POO.ArvoreBinariaDeBuscaMySQL.ArvoreBinariaDeBusca;

//Metodo Main
public class AppAbb {

    public static void main(String[] args) throws Exception {
        
        //Cria uma nova árvore binária de busca
        ArvoreBinariaDeBusca arvoreBinariaDeBusca = new ArvoreBinariaDeBusca();

        // Dados de conexão com o banco
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/arvore_binaria_de_busca";
        String usuario = "root";
        String senha = "";

        try {
            // Chama o método que conecta a árvore binária de busca com o banco de dados MySQL
            arvoreBinariaDeBusca.conectarArvoreComMySQL(driver, url, usuario, senha);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
