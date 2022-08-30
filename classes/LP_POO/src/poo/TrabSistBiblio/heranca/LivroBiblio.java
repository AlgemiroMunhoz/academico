/*Professor desculpe os vários comentários, fui realizando as atividades e aproveitando para buscar
conceitos e enteder melhor o que estou fazendo.abstract
*/

// 1. Crie uma classe Livro com os seguintes atributos:
// - String titulo
// - String autor
// - String isbn

package poo.TrabSistBiblio.heranca;

import poo.ex_heranca.heranca.Livro;

public class LivroBiblio {
    private String titulo;
    private String autor;
    private String isbn;

  /*O ISBN (International Standard Book Number/ Padrão Internacional de Numeração de Livro) 
  é um padrão numérico criado com o objetivo de fornecer uma espécie de "RG" para publicações
  monográficas, como livros, artigos e apostilas
  */

  // ---------- Construtor ----------

  /*
  O Construtor é um método especial chamado quando o objeto é instanciado, que ajuda a criá-lo já 
  configurado, digamos assim. Usamos o construtor para garantir que todas as variáveis do objeto sejam
  definidas com os valores corretos   no momento em que o objeto é criado. Em Java e C#, você cria um
  construtor criando um método na classe com o mesmo nome que a própria classe   No entanto, 
  diferentemente de outros métodos, o construtor não tem um tipo de retorno, porque você nunca o chama 
  diretamente. Ele é chamado quando você usa a palavra-chave "new" para instanciar um novo objeto. Dentro
  do construtor, definimos o estado inicial das variáveis de instância, o nome vai ser " " e o nível pode
  ser definido. Com isso, o objeto será inicializado com os valores específicos que queremos, em vez dos
  valores padrão nulo e zero. Em um diagrama de classe UML, esse tipo de método construtor básico, que não
  aceita argumentos, é apresentado como método com o mesmo nome da classe.
   */

  public LivroBiblio(String titulo) {
    this.titulo = titulo;
  }

  
  // ---------- Métodos ----------

  /*
  Um método é um bloco de código, que pode ser chamado como "Parâmetros", para executar alguma ação e pode
  retornar um valor. Mas isso é bem parecido com a definição de uma função. Qual a diferença entre métodos
  e funções? Um método é uma função, mas pertence à classe. Ou seja, o método é uma função, em que todo 
  objeto criado com essa classe, terá. Então, vamos usar o exemplo da nossa classe Livro. Esse diagrama é
  muito usado para descrever uma classe. Temos o nome da classe no topo, os atributos no meio e os comportamentos
  embaixo. Repare que a classe diz que, cada livro vai ter um título, um autor e um códifo. Mas, não diz quais
  os valores de cada um desses atributos. A classe fornece apenas uma definição do objeto. Usando essa 
  definição da classe, crio objetos, através de um projeto, chamado "Instanciação", Instantiation".
  E é chamado assim, porque cada objeto que eu crio é uma instância, um objeto dessa classe específica.
  E eu posso criar uma, duas ou quantas instâncias ou quantos objetos, eu precisar. Agora, cada uma das
  instâncias, cada um desses objetos tem sua própria identidade, independente dos outros objetos, além dos
  seus próprios dados. Para criar objetos, precisamos primeiro de uma classe, que define como eles serão
  criados. O interessante é que eu posso usar classes, que outras pessoas criaram antes de mim.
  Felizmente, a maioria das linguagens orientadas a objetos vem com uma coleção de classes pré-definidas,
  que você pode usar imediatamente. Você vai encontrar classes para todas as funções básicas, como strings
  ou sequências de caracteres, datas, vetores, como exibir imagens, como tocar vídeos e muito mais.
  Essas classes são reunidas em estruturas, chamadas de "Bibliotecas" ou "Libraries" e são enormes.
  Em Java, a biblioteca se chama "Java Class Library" e tem cerca de seis mil classes disponíveis que podemos 
  usar, o.NetFrameWork, para C Sharp e VB.Net, tem ainda mais classes do que isso. O C++, o Ruby, Python, Swift, BitC, Dart e muitas outras linguagens também possuem bibliotecas padrão para você usar. */

  public String getTitulo() {
    return titulo;
  }
  
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  @Override
  public String toString() {
    return "Título: " + this.titulo;
  }

  /* 
  @Override - Indica que uma declaração de método destina-se a substituir uma declaração de método em um supertipo.
  Se um método for anotado com esse tipo de anotação, os compiladores serão obrigados a gerar uma mensagem
  de erro, a menos que pelo menos uma das seguintes condições seja válida: O método substitui ou implementa
  um método declarado em um supertipo. O método tem uma assinatura que é equivalente à de qualquer método
  público declarado em Object.
  */

  public static Livro cadastrarLivro() {
    return null;
  }
}

/*
Os métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos. 
Nesses métodos determinamos quando será alterado um atributo e o acesso ao mesmo, tornando o 
controle e modificações mais práticas e limpas, sem contudo precisar alterar assinatura do 
método usado para acesso ao atributo.
 */