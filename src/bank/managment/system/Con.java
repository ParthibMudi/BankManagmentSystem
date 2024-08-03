package bank.managment.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try{
           // Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Parthib@01");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Database connection failed: " + e.getMessage());
        }
    }
}
