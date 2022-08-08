package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Connect {

    static Connection con;

    public static Connection createC(){

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://10.1.27.227:5432/iagdb",
                            "iaguser", "passw0rd");
        }

        catch (Exception e){

            e.printStackTrace();


        }

        System.out.println("Opened database successfully");

        return con;



    }
}
