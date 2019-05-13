
package br.com.fatecpg.parking.db;

import br.com.fatecpg.parking.web.Db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author a
 */
public class User {
    private long id;
    private String role;
    private String name;
    private String login;
    private long passwordhash;
    
    public static User getUser(String login,  String pass) throws Exception{
        Connection con = Db.getConnection();
        String SQL = "SELECT * FROM USER"
                + "WHERE LOGIN=? AND PASSWORDHASH=?";
        PreparedStatement st = con.prepareStatement(SQL);
        st.setString(1, login);
        st.setLong(2, pass.hashCode() );
        ResultSet rs = st.executeQuery();
        if(rs.next()){
            return new User (
            rs.getLong("ID"),
                    rs.getString("ROLE"),
                    rs.getString("NAME"),
                    rs.getString("LOGIN"),
                    rs.getLong("PASSWORDHASH")
            );
            
        }else{
            return null;
        }
    }

    public User(long id, String role, String name, String login, long passwordhash) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.login = login;
        this.passwordhash = passwordhash;
    }

    public long getPasswordhash() {
        return passwordhash;
    }

    public void setPasswordhash(long passwordhash) {
        this.passwordhash = passwordhash;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
}
