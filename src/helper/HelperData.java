package helper;

import connection.DB;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Armandho
 */
public class Helper {

    public static void fillTable(JTable tb, ResultSet rs) {
        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();

            DefaultTableModel model = new DefaultTableModel();
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(rsmd.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = rs.getObject(i + 1);
                }
                model.addRow(rowData);
            }

            tb.setModel(model);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static String getNewCode(String code, String column, String table, int digit) {
        try {
            String sql = "SELECT IFNULL(CONCAT(?, LPAD(RIGHT(MAX(" + column + "), ?) + 1, ?, '0')), CONCAT(?, LPAD(1, ?, '0'))) AS no FROM " + table + " ORDER BY " + column + " DESC LIMIT 1;";
            ResultSet result = DB.eQuery(sql, code, digit, digit, code, digit);
            result.next();
            return result.getString("no");
        } catch (SQLException e) {
            e.printStackTrace(); // Ganti dengan penanganan yang sesuai
        }
        return null;
    }

};
