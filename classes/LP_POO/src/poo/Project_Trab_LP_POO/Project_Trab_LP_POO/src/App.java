//Metodo Main
public class App {   
    public static void main(String[] args) throws Exception {
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();

        // Parâmetros para conectar com o banco de dados MySQL
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/nome_do_banco";
        String usuario = "usuario";
        String senha = "senha";

        // Conecta a árvore binária de busca com o banco de dados MySQL
        arvore.conectarArvoreComMySQL(driver, url, usuario, senha);
    }

}