
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArvoreBB {
    // Classe para criar a árvore binária de busca
    private Nodo raiz;

    // Método para adicionar um novo nó na árvore
    public void add(int valor) {
        // Verifica se a árvore está vazia
        if (raiz == null) {
            // Se sim, cria o nó raiz
            raiz = new Nodo(valor);
        } else {
            // Se não, adiciona um novo nó recursivamente
            addRecursive(valor, raiz);
        }
    }

    // Método para adicionar recursivamente um novo nó
    private void addRecursive(int valor, Nodo nodo) {
        if (valor < nodo.valor) {
            // Se o valor for menor, verifica se já existe um nó filho à esquerda
            if (nodo.esquerda == null) {
                // Se não, adiciona um novo nó à esquerda
                nodo.esquerda = new Nodo(valor);
            } else {
                // Se sim, chama recursivamente o método passando o nó à esquerda como raiz
                addRecursive(valor, nodo.esquerda);
            }
        } else {
            // Se o valor for maior ou igual, verifica se já existe um nó filho à direita
            if (nodo.direita == null) {
                // Se não, adiciona um novo nó à direita
                nodo.direita = new Nodo(valor);
            } else {
                // Se sim, chama recursivamente o método passando o nó à direita como raiz
                addRecursive(valor, nodo.direita);
            }
        }
    }

    // Método para deletar um nó da árvore
    public void delete(int valor) {
        // Verifica se a árvore está vazia
        if (raiz != null) {
            // Se não, deleta o nó recursivamente
            deleteRecursive(valor, raiz);
        }
    }

    // Método para deletar recursivamente um nó
    private Nodo deleteRecursive(int valor, Nodo nodo) {
        if (nodo == null) {
            // Se a árvore estiver vazia, retorna null
            return null;
        }
        if (valor < nodo.valor) {
            // Se o valor for menor, chama recursivamente o método passando o nó à esquerda como raiz
            nodo.esquerda = deleteRecursive(valor, nodo.esquerda);
        } else if (valor > nodo.valor) {
            // Se o valor for maior, chama recursivamente o método passando o nó à direita como raiz
            nodo.direita = deleteRecursive(valor, nodo.direita);
        } else {
            // Se o valor for igual, deleta o nó
            if (nodo.esquerda == null && nodo.direita == null) {
                // Se não houver nenhum nó filho, apenas deleta o nó
                return null;
            } else if (nodo.esquerda == null) {
                // Se houver apenas um nó filho à direita, deleta o nó e retorna o nó filho
                return nodo.direita;
            } else if (nodo.direita == null) {
                // Se houver apenas um nó filho à esquerda, deleta o nó e retorna o nó filho
                return nodo.esquerda;
            } else {
                // Se houver dois nós filhos, encontra o maior nó filho à esquerda
                Nodo maiorNodoAEsquerda = findMaiorNodoAEsquerda(nodo.esquerda);
                // Substitui o valor do nó pai pelo valor do maior nó filho à esquerda
                nodo.valor = maiorNodoAEsquerda.valor;
                // Deleta o maior nó filho à esquerda
                nodo.esquerda = deleteRecursive(maiorNodoAEsquerda.valor, nodo.esquerda);
            }
        }
        return nodo;
    }

    // Método para encontrar o maior nó filho à esquerda
    private Nodo findMaiorNodoAEsquerda(Nodo nodo) {
        if (nodo.direita == null) {
            // Se não houver nenhum nó filho à direita, retorna o nó atual
            return nodo;
        } else {
            // Se houver um nó filho à direita, chama recursivamente o método passando o nó à direita como raiz
            return findMaiorNodoAEsquerda(nodo.direita);
        }
    }

    // Método para imprimir a árvore em ordem simétrica
    public void printEmOrdemSimetrica() {
        // Verifica se a árvore está vazia
        if (raiz != null) {
            // Se não, imprime recursivamente
            printEmOrdemSimetricaRecursive(raiz);
        }
    }

    // Método para imprimir recursivamente a árvore em ordem simétrica
    private void printEmOrdemSimetricaRecursive(Nodo nodo) {
        if (nodo != null) {
            // Imprime primeiro o nó à esquerda
            printEmOrdemSimetricaRecursive(nodo.esquerda);
            // Depois imprime o nó atual
            System.out.println(nodo.valor);
            // Por fim, imprime o nó à direita
            printEmOrdemSimetricaRecursive(nodo.direita);
        }
    }

    // Método para conectar a árvore ao banco de dados
    public void conectarComBancoDeDados(String url, String usuario, String senha) throws SQLException {
        // Cria a conexão com o banco de dados
        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        // Cria o statement
        Statement statement = conexao.createStatement();

        // Executa a query para recuperar os valores
        ResultSet resultSet = statement.executeQuery("SELECT valor from tabela");

        // Percorre os resultados
        while (resultSet.next()) {
            // Pega o valor da coluna
            int valor = resultSet.getInt("valor");

            // Adiciona o valor na árvore
            add(valor);
        }
    }
}

// Classe para criar os nós da árvore
class Nodo {
    // Atributos do nó
    int valor;
    Nodo esquerda;
    Nodo direita;

    // Construtor
    public Nodo(int valor) {
        this.valor = valor;
    }
}