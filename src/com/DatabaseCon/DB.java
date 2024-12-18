/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DatabaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kk
 */
public class DB {
    public static Connection con = null;

    public static void loadConnection() {
        String url = "jdbc:mysql://localhost:3306/student_enrollment_system";
        String user = "root";
        String pass = "1122";

        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connection successful!");
        } catch (SQLException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        }
    }
}
