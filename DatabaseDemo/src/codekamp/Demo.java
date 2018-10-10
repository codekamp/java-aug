package codekamp;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Class found.");
        } catch (ClassNotFoundException e) {
            System.out.println("Sorry class not found");
            System.out.println("we need to install JDBC. Allow/Deny");
            return;
        }

        try {
            Connection c = DriverManager.getConnection("jdbc:sqlite:src/codekamp/my_db.sqlite");
            Statement s = c.createStatement();
            ResultSet result = s.executeQuery("SELECT * FROM `students`");

            while (result.next()) {
                String name = result.getString("name");
                int age = result.getInt("age");

                System.out.println("name is: " + name + " and age is " + age);
                System.out.println("------------");
            }

//            Statement s2 = c.createStatement();
//            s2.execute("INSERT INTO `students` (`rollnumber`,`name`,`age`) VALUES (600,'Jignesh',25);");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("installation corrupt.");
            return;
        }
    }
}

// https://www.w3schools.com/sql/ From intro upto Delete