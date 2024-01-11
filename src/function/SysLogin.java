/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import connection.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Armandho
 */
public class SysLogin {
    public boolean verifyLogin(String username, String password)  {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try {
            ResultSet result = DB.eQuery(sql, username, password);
            result.next();
            return result.getRow() == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
