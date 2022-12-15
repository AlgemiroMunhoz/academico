import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ArvoreBinariaDeBuscaMySQL {

// Classe Nó
    public static class No {
        int chave;
        No esquerda, direita;

        public No(int item){
            chave = item;
            esquerda = direita = null;
        }
    }

    // Classe Arvore Binária de Busca
    public static class ArvoreBinariaDeBusca{
        No raiz;

        public ArvoreBinariaDeBusca(){
            raiz = null;
        }

        // Método para inserir um nó na árvore
        public void inserir(int chave){
            raiz = inserirRecursivo(raiz, chave);
        }

        // Método que ajuda a inserir um nó na árvore
        public No inserirRecursivo(No atual, int chave){
            // Caso a árvore esteja vazia, cria um novo nó e o retorna
            if(atual == null){
                atual = new No(chave);
                return atual;
            }

            // Se a chave for menor que a chave do nó atual, então vai para a sub-árvore esquerda
            if(chave < atual.chave){
                atual.esquerda = inserirRecursivo(atual.esquerda, chave);
            }

            // Se a chave for maior que a chave do nó atual, então vai para a sub-arvore direita
            else if(chave > atual.chave){
                atual.direita = inserirRecursivo(atual.direita, chave);
            }

            // Retorna o nó atual
            return atual;
        }

        // Método que conecta a árvore binária de busca com o banco de dados MySQL
        public void conectarArvoreComMySQL(String driver, String url, String usuario, String senha) throws Exception{
            Connection conexaoBanco = null;

            try {
                // Carrega o driver JDBC
                Class.forName(driver);

                // Abre a conexão com o banco
                conexaoBanco = DriverManager.getConnection(url, usuario, senha);

                // Cria um objeto Statement para executar as instruções SQL
                Statement statement = conexaoBanco.createStatement();

                // Executa uma instrução SQL que retorna um conjunto de resultados
                ResultSet resultSet = statement.executeQuery("SELECT chave FROM arvore_binaria_de_busca");

                // Insere os dados no banco na árvore binária de busca
                while (resultSet.next()) {
                    int chave = resultSet.getInt("chave");
                    inserir(chave);
                }
            }
            finally {
                if (conexaoBanco != null) {
                    conexaoBanco.close();
                }
            }
        }
    }
}