package poo.Project_Alge.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Criamos uma classe connection factory
public class ConnectionFactory {
    
    public static Connection createConnection() { //retornar o banco de dados conectado

        //Variaveis criadas
        String url = "jdbc:mysql//localhost:3306/aulaDB";
        String _user = "root";
        String password = "";

        try{
            //carrega o driver de mysql.
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, _user, password); //retorna a conexão
            System.out.println("Conected:");
            return conn;

            } catch (ClassNotFoundException e){ // caso de erro 
                System.out.println("Erro: Driver not found");
            } catch (SQLException e){ // caso de erro
                System.out.println("Error: Connection failed");
                e.printStackTrace();
            }

    return null;
    }   
}
