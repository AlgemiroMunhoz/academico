package poo.Project_Alge.src;

public class App {
    public static void main(String[] args) throws Exception{
     
        //Abrir uma conexão com o banco de dados MySQL
        ConnectionFactory.createConnection();
        
        User algemiro = new User();
        algemiro.setUsername("algemiro");
        algemiro.setPassword("admin");
        algemiro.setStatus(0); //1 ativo 0. Inativo
        algemiro.setToken(7.333);

        // salvar o obj to tipo user no BD 
        UserRepository userRepository = new UserRepository ();
        UserRepository.save(algemiro);
        
        userRepository.selectAll();
        
    }
    
}
