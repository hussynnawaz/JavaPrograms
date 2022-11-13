package com.Hussayn;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JavaConnectionDB {
    public static Connection ConnectDB()
    {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb", "hussayn", "bcs");
            return con1;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

}