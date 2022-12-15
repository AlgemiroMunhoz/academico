public class ArvBinBusca { 
  
    /* Classe interna para criar nós. */
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Raiz da árvore 
    Node root; 
  
    // Construtor 
    ArvBinBusca() {  
        root = null;  
    } 
  
    // Método para inserir um nó
    void inserir(int key) { 
       root = inserirRec(root, key); 
    } 
      
    /* Método auxiliar para inserir um nó de forma recursiva*/
    Node inserirRec(Node root, int key) { 
  
        /* Se a árvore estiver vazia, retorne um novo nó */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Caso contrário, desça na árvore */
        if (key < root.key) 
            root.left = inserirRec(root.left, key); 
        else if (key > root.key) 
            root.right = inserirRec(root.right, key); 
  
        /* Retorne a raiz */
        return root; 
    } 
  
    // Método para imprimir a árvore 
    void inorder()  { 
       inorderRec(root); 
    } 
  
    // Método auxiliar para imprimir a árvore de forma recursiva
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
  
    // Método principal
    public static void main(String[] args) { 
        ArvBinBusca tree = new ArvBinBusca(); 
  
        /*insere os valores na árvore */
        tree.inserir(50); 
        tree.inserir(30); 
        tree.inserir(20); 
        tree.inserir(40); 
        tree.inserir(70); 
        tree.inserir(60); 
        tree.inserir(80); 
  
        // imprime a árvore
        System.out.println("Árvore Inorder"); 
        tree.inorder(); 
    } 
}