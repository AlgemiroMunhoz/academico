package poo.ProjetoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  
  // DAO = DATA ACCESS OBJECT => ANTIGAMENTE
  // DAO => CRUD =>
        // C -> create  (insert into)
        // R -> read    (select from)
        // U -> update  (update set) 
        // D -> delete  (delete from)
  private Connection conn = null;

  public UserRepository(){
      // abrir um conexao
      this.conn = ConnectionFactory.createConnection();
    
  }

  public void save(User _user){

    String uSql = "INSERT INTO tb_user (username, password, status, token) VALUES (?, ?, ?, ?)";
    try {
      
      PreparedStatement ps = conn.prepareStatement(uSql);
      ps.setString(1, _user.getUsername());
      ps.setString(2, _user.getPassword());
      ps.setInt(3, _user.getStatus());
      ps.setDouble(4, _user.getToken());

      ps.executeUpdate(); // INSERT, UPDATE E DELETE

      System.out.println("INFO: Usuário Cadastrado!");

    } catch (SQLException e) {
      System.out.println("Error: Não foi possível inserir o usuário " );
      e.printStackTrace();
    }


  }

  public List<User> getActiveUsers(){

    List<User> activeUsers = new ArrayList<User>();
    String sql = "SELECT * FROM tb_user WHERE status = 1";
    try {
      PreparedStatement ps = conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();

      while(rs.next()){
        User u = new User();
        u.setId(rs.getInt("id"));
        u.setUsername(rs.getString("username"));
        u.setPassword(rs.getString("password"));
        u.setStatus(rs.getInt("status"));
        u.setToken(rs.getDouble("token"));
        activeUsers.add(u);
      }

      return activeUsers;

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;

  }

  public User getOne(int id){

    String sql = "SELECT * FROM tb_user WHERE id = ?";

    User user = new User();

    try {
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setInt(1, id);

      ResultSet rs = ps.executeQuery();

      while(rs.next()){
        user.setId(rs.getInt("id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setStatus(rs.getInt("status"));
        user.setToken(rs.getDouble("token"));
      }

      return user;

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      System.out.println("Erro ao buscar o usuário com ID = " + id);
      e.printStackTrace();
    }


    return null;
  }
  
  public List<User> selectAll(){

    String sql = "SELECT * FROM tb_user";
    List<User> users = new ArrayList<User>();
    try {
      PreparedStatement ps = this.conn.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();

      while(rs.next()){
        User u = new User();
        u.setId(rs.getInt("id"));
        u.setUsername(rs.getString("username"));
        u.setPassword(rs.getString("password"));
        u.setStatus(rs.getInt("status"));
        u.setToken(rs.getDouble("token"));
        users.add(u); 
      }

    } catch (SQLException e) {
      System.out.println("Erro: Não foi possível buscar os usuários");
      e.printStackTrace();
    }

    return users;

  }
// MYSQL 
  // id = 1
  // username = beto 
  // password = beto 
  // status = 1 
  // token = 3.1415 
// OBJECT
  // id = 1 
  // username = beto 
  //  password = beto 
  // status = 0
  // token = 3.1415 


  public boolean update(User _user){

    String sql = "UPDATE tb_user SET username = ?, password = ?, status = ?, token = ? WHERE id = ?";

    try {
      PreparedStatement ps = this.conn.prepareStatement(sql);
      ps.setString(1, _user.getUsername());
      ps.setString(2, _user.getPassword());
      ps.setInt(3, _user.getStatus());
      ps.setDouble(4, _user.getToken());

      ps.setInt(5, _user.getId());

      ps.executeUpdate();
      return true;
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return false;

  }

  public boolean delete(int id){

    String sql = "DELETE FROM tb_user WHERE id = ?";

    try {
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setInt(1, id);

      ps.executeUpdate();
      return true;

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      System.out.println("Erro: Não foi possível deletar o usuário!");
      e.printStackTrace();
    }

    return false;
  }


}