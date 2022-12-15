package poo.ProjetoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
  
  public static Connection createConnection () {

    String url = "jdbc:mysql://localhost:3306/aulaDB";
    String user = "root";
    String pwd = "admin";
    
    try {
        // carrega a driver do mysql
            Class.forName("com.mysql.cj.jdbc.Driver");                
            Connection conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("Conected!");
            return conn;

        } catch (ClassNotFoundException e){
          System.out.println("Erro: Driver not found");
        } catch (SQLException e){
          System.out.println("Erro: Connection failed!");
          e.printStackTrace();
        }
    return null;
  }

  public void closeConnection(Connection conn) {
    try {
      conn.close();
    } catch (SQLException e) {
      System.out.println("Erro: Connection failed!");
      e.printStackTrace();
    }
  }

}