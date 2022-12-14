package poo.Project_Alge.src;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {
    // DAO = Data Access Object - Antigamente
    // DAO = CRUD
    // C --> create (insert into)
    // R --> read (select from)
    // U --> update (update set)
    // D --> delete (delete from)

    private static Connection conn = null;

    public UserRepository () {
        UserRepository.conn   = ConnectionFactory.createConnection();     
        //NullPointerException - erro de iniciante em programação
        //Não tratar excessões dentro de construtores
        }

    public static void save (User _user) { // Função para criar um novo usuário 
        String uSql = "INSERT INTO tb_user (usarname, password, status, token) VALUES (?,?,?,?)"; //segurnaça para não exc    
        try {
            PreparedStatement ps = conn.prepareStatement (uSql);
            ps.setString(1, _user.getUsername());
            ps.setString(2, _user.getPassword());
            ps.setFloat(3, _user.getStatus());
            ps.setDouble(4, _user.getToken());

            ps.executeUpdate(); //Insert, Upadte e Delete

            System.out.println(uSql);

        } catch (Exception e) {
            // TODO: handle exception
        }
    
        System.out.println ("Error: Não foi possivel inserir um usuário: ");
    }
   
    public User getOne (int id) {
        String sql  = "select * from tb_user where id = ?";
        return null;
    }

    public void selectAll () { // Função Select é para buscar o usuário. Buscar os usuários no no save.
        String sql = "select * from tb_user";
        
        try {
            PreparedStatement ps = this.conn.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt(1) + " - " +
                    rs.getInt(1) + " - " + 
                    rs.getString("username") + " - " +
                    rs.getString("password"));

            }

        } catch (Exception e) {
            System.out.println("Error: não foi possivel buscar os usuários");
            e.printStackTrace();
            // TODO: handle exception
        }
      

    // public void update (User _user) {} //função utilizada para alterar um usuário

    // public void delete (User _user) {} // Função para deletar um usuário
    
}
}

