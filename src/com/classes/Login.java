package com.classes;
import com.DatabaseCon.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Login {
    
   private String userName;
   private String password;

    public Login() {
    }
    public boolean validateUser(String username , String password){
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
           
            String query = "SELECT * FROM user WHERE user_name = ? AND password = ?";
            statement = DB.con.prepareStatement(query);
            statement.setString(1, username); 
            statement.setString(2, password);
            resultSet = statement.executeQuery();
            if(resultSet.next()){
                return true;
            }
            else{
                return false;
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (DB.con != null) DB.con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    }
 }

