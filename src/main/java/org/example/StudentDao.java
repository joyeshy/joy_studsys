package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.*;

public class StudentDao {

    public static boolean  insertStudenttoDB(Student st) {

        boolean f = false;

        try {


            Connection con = Connect.createC();

            String q = "insert into joyesh_student5(id,name,phone,city)values(?,?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setInt(1, st.getStudentId());
            pstmt.setString(2, st.getStudentName());
            pstmt.setInt(3, st.getStudentPhone());
            pstmt.setString(4, st.getStudentCity());

            pstmt.executeUpdate();
            f = true;
        }
        catch (Exception e) {

            e.printStackTrace();
        }
        return f;

    }
}
