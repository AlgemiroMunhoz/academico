package LP.Project_Alge.src;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRepository {
    // DAO = Data Access Object - Antigamente
    // DAO = CRUD
    // C --> create (insert into)
    // R --> read (select from)
    // U --> update (update set)
    // D --> delete (delete from)

    private Connection conn = null;

    public UserRepository () {
        this.conn   = ConnectionFactory.createConnection();
        //NullPointerException - erro de iniciante em programação
        //Não tratar excessões dentro de construtores


    public void save (User _user) {}
        String uSql = "INSERT INTO tb_user (usarname, password, status, token) VALUES (?,?,?,?)"; //segurnaça para não exc    
        try {
            PreparedStatement ps = conn.prepareStatement (uSql);
            ps.setString(1, _user.getUsername());
            ps.setString(2, _user.getPassword());
            ps.setint(3, _user.getStatus());
            ps.setDouble(4, get.token());

            ps.executeUpdate(); //Insert, Upadte e Delete

            System.out.println(uSql);;

        } catch (Exception e) {
            // TODO: handle exception
        }
    
        System.out.println ("Error: Não foi possivel inserir um usuário: ");
        

    public void selectAll () {}

    public void update (User _user) {}

    public void delete (User _user) {}

    
}
