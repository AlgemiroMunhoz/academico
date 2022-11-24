public class App {
    public static void main(String[] args) throws Exception{
        //System.out.println("Hello, World!");

        //Abrir uma conexão com o banco de dados MySQL
        ConnectionFactory createConnection();
        
        User algemiro = new User();
        algemiro.setUsername("Algemiro");
        algemiro.setPassword("admin");
        algemiro.setStatus(1); //1 ativo
        algemiro.setToken(3.1415);

        // salvar o obj to tipo user no BD 
        UserRepository userRepository = new UserRepository ();
        UserRepository.save(algemiro);

        
    }
    
}
