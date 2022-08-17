package poo.coleccion;

public class MinhaColecao{
    
   
    public static <Livro> void main(String[] args) {
        // int vetor[] = new int[5];
    
        List <Livro> livros = new ArrayList<Livro>();
    
        Livro l1 = new Livro ("Minha colecao");
        Livro l2 = new Livro ("Minha Coleção parte II");
        Livro l3 = new Livro ("Minha Coleção parte III");
        Livro l4 = new Livro ("Minha Coleção parte IV");
    
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);
        livros.add(l4);
    
        // Primeira opção para imprimir lista
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i));
        }
    
        // Opção mais avancada para imprimir lista
        for(Livro l : livros) {
            System.out.println(l);
        }
    
        livros.remove(0);
    }
}
