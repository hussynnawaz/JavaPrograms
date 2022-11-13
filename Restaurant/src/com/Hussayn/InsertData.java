package com.Hussayn;


import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;

public class InsertData {
    static Connection connection = null;
    static OraclePreparedStatement preparedStatement = null;
    static OracleResultSet resultSet = null;


    public void InsertRestaurant(int restaurant_id, String restaurant_name, String restaurant_address) {
        connection = JavaConnectionDB.ConnectDB();
        try {
            final String sql = "INSERT INTO RESTAURANT Values (?,?,?)";
            assert connection != null;
            preparedStatement = (OraclePreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, restaurant_id);
            preparedStatement.setString(2, restaurant_name);
            preparedStatement.setString(3, restaurant_address);

            Statement statement=connection.createStatement();
            resultSet = (OracleResultSet) preparedStatement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showConfirmDialog(null, "Recorded Inserted Sucessfullly");

            }

        } catch (Exception e) {
            System.out.println("Error");
        }

    }

    public void InsertCustomers(int customer_id, String customer_name, String customer_address) {
        connection = JavaConnectionDB.ConnectDB();
        try {
            String sql = "insert into CUSTOMERS values(?,?,?)";
            preparedStatement = (OraclePreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setInt(1, customer_id);
            preparedStatement.setString(2, customer_name);
            preparedStatement.setString(3, customer_address);

            resultSet = (OracleResultSet) preparedStatement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showConfirmDialog(null, "Recorded Inserted Sucessfullly");
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Recorded Not Inserted");
        }
    }
        public void InsertMeals(int MEAL_ID, String MEAL_NAME, int MEAL_PRICE )
        {
            connection = JavaConnectionDB.ConnectDB();
            try {
                String sql = "insert into MEALS values(?,?,?)";
                preparedStatement=(OraclePreparedStatement) connection.prepareStatement(sql);
                preparedStatement.setInt(1, MEAL_ID);
                preparedStatement.setString(2, MEAL_NAME);
                preparedStatement.setInt(3, MEAL_PRICE);

                resultSet = (OracleResultSet) preparedStatement.executeQuery();
                if (resultSet.next())
                {
                    JOptionPane.showConfirmDialog(null, "Recorded Inserted Sucessfullly");
                }
        }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Recorded Not Inserted");
            }
    }

}
