/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package function;

import connection.DB;
import helper.Helper;

import java.sql.SQLException;

/**
 *
 * @author Armandho
 */
public class SysRegister {
    public boolean verifyRegister(String username, String password, String name)  {
        String id = Helper.getNewCode("U","id", "users", 5);
        String sql = "INSERT INTO users (id, username, password, name) VALUES (?, ?, ?, ?)";
        try {
            int i = DB.eUpdate(sql, id, username, password, name);
            System.out.println(i);
            return i == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
