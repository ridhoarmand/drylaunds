/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import helper.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Armandho
 */
public class DB {
//    static Dotenv dotenv = new Dotenv(".env");
//    static String dbUrl = dotenv.get("DB_URL");
//    static String dbUser = dotenv.get("DB_USER");
//    static String dbPassword = dotenv.get("DB_PASSWORD");

    static String dbUrl = "jdbc:mysql://localhost:3306/dblaundry";
    static String dbUser = "root";
    static String dbPassword = "armansyah";
    private static Connection getConnection() throws SQLException {

        Connection cn = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            cn = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e);
        }
        return cn;
    }

    public static int eUpdate(String sql, Object... params) throws SQLException {
        try {
            Connection Cnn = getConnection();
            PreparedStatement pst = Cnn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i + 1, params[i]);
            }
            System.out.println(pst);
            return pst.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Error executing query: " + sql, e);
        } finally {
            getConnection().close();
        }
    }

    public static ResultSet eQuery(String sql, Object... params) throws SQLException {
        try {
            Connection Cnn = getConnection();
            PreparedStatement pst = Cnn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pst.setObject(i + 1, params[i]);
            }
            System.out.println(pst);
            return pst.executeQuery();
        } catch (SQLException e) {
            throw new SQLException("Error executing query: " + sql, e);
        } finally {
            getConnection().close();
        }
    }


}
