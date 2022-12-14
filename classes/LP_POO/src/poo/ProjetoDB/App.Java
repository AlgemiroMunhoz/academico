import java.util.List;

// criar um um projeto no VS Code (Ctrl + Ship + p) Java Project ([ProjetoBD])

// No google mysql connector (www.mysql.com) JDBC - Plataforma

// copiar o arquivo mysql-connector para a pasta lib do projeto


public class App {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        // abrir uma conexao com o bd mysql
        // ConnectionFactory.createConnection();

        //----------------------------------------------------------------
        // SALVAR UM USUÁRIO 
        //----------------------------------------------------------------
        // User vitor = new User();

        // vitor.setUsername("Vitor");
        // vitor.setPassword("admin");
        // vitor.setStatus(0); // 1 = ativo
        // vitor.setToken(7.333);

        // salvar o obj to tipo user no BD
        // userRepository.save(vitor);
        //----------------------------------------------------------------



        //----------------------------------------------------------------
        // BUSCAR TODOS OS USUÁRIOS
        //----------------------------------------------------------------
        List<User> usuarios = userRepository.selectAll();
        for(User u : usuarios){
            System.out.println(u);
        }

        //----------------------------------------------------------------
        // BUSCAR UM ÚNICO USUÁRIO PELO ID
        //----------------------------------------------------------------
        User loc = userRepository.getOne(10);

        if(loc.getUsername() != null){
            System.out.println("Usuário encontrado!\n" + loc );
        } else {
            System.out.println("Usuário não encontrado!");
        }
        //----------------------------------------------------------------

        //----------------------------------------------------------------
        // DELETAR O USUÁRIO PELO ID / OBJ
        //----------------------------------------------------------------
        if(userRepository.delete(1)){
            System.out.println("Usuário deletado!");
        } else {
            System.out.println("Não foi possível deletar o usuário!");
        }



    }

    

    
}