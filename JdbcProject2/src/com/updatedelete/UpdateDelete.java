package com.updatedelete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDelete {
    public static void main(String args[]) throws Exception {
        String sportperson = "Rohit";
        int Goldmedal = 3;

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbc_db", "root", "sumeet123");

        // Prepare an SQL statement for updating the database
        PreparedStatement ps = con.prepareStatement("update list set name=? where Goldmedal=?");
        ps.setString(1, sportperson);
        ps.setInt(2, Goldmedal);

        // Execute the update statement
        int count = ps.executeUpdate();

        // Check if the update was successful
        if (count > 0) {
            System.out.println("Update successfully");
        } else {
            System.out.println("Update failed");
        }

        // Close the connection
        con.close();
    }
}
