package pack1;

import java.sql.*;

//CRUD - create, read, update and delete

public class main {

    public static void main(String args[]) {

        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;

        ConnectDB obj_ConnectDB = new ConnectDB();

        connection = obj_ConnectDB.get_connection();

        try {

            Statement stmt = connection.createStatement();

            //String sql = "CREATE DATABASE LIBRARY"; //Create Database
            //stmt.executeUpdate(sql);

            //Create authors Table
            //String SQL = "CREATE TABLE Authors " +
                    //"(author_id decimal(12) not NULL, " +
                   // " first_name VARCHAR(50) not NULL, " +
                    //" last_name VARCHAR (50) not NULL, " +
                    //" country VARCHAR (50) not NULL, " +
                    //" PRIMARY KEY (author_id))";

            //stmt.executeUpdate(SQL);

            //String SQL2 = "CREATE TABLE Category " +
            //"(category_id decimal(12) not NULL, " +
            //"category_name VARCHAR(50) not NULL, " +
            //" PRIMARY KEY (category_id))";
            //stmt.executeUpdate(SQL2);

            //String SQL3 = "CREATE TABLE Book_status " +
            //"(status_id decimal(12) not NULL, " +
            //"status_name VARCHAR(50) not NULL, " +
            //" PRIMARY KEY (status_id))";
            //stmt.executeUpdate(SQL3);

            //String SQL4 = "CREATE TABLE Book" +
            //"(book_id decimal(12) not NULL, " +
            //"title VARCHAR(255) not NULL, " +
            //"PRIMARY KEY (book_id))";
            //stmt.executeUpdate(SQL4);

            //String SQL5 = "ALTER TABLE Book" +
            //"ADD FOREIGN KEY (category_id) REFERENCES Category(category_id), ";
            //stmt.executeUpdate(SQL5);

            //String SQL6 = "CREATE TABLE WriteBook" +
            //"(writeBook_id decimal(12) not NULL, " +
                    //"(author_id decimal(12) not NULL, " +
                    //"(book_id decimal(12) not NULL, " +
            //"PRIMARY KEY (writeBook_id)"
                    //"FOREIGN KEY (author_id) REFERENCES Authors(author_id),"+
                    //"FOREIGN KEY (book_id) REFERENCES Book(book_id))";
            //stmt.executeUpdate(SQL6);

            //String SQL7 = "CREATE TABLE Borrowed_status" +
                    //"(status_id decimal(12) not NULL, " +
                    //"status_name VARCHAR(50) not NULL, " +
                    //"PRIMARY KEY (status_id))";
            //stmt.executeUpdate(SQL7);

            //String SQL8 = "CREATE TABLE User_privilege" +
            //"(privilege_id decimal(12) not NULL, " +
            //"privilege_name VARCHAR(50) not NULL, " +
            //"PRIMARY KEY (privilege_id))";
            //stmt.executeUpdate(SQL8);

            //String SQL9 = "CREATE TABLE Users" +
            //"(registration_no decimal(12) not NULL, " +
            //"first_name varchar (50) not NULL, " +
                    //"last_name varchar (50) not NULL, " +
                    //"address varchar (50) not NULL, " +
                    //"no_of_book decimal (12) not NULL, " +
                    //"privilege_id decimal (12) not NULL, " +
                    //"phone decimal (12) not NULL, " +
            //"PRIMARY KEY (registration_no)"
            //"FOREIGN KEY (privilege_id) REFERENCES User_privilege(privilege_id))";
            //stmt.executeUpdate(SQL9);

            //String SQL10 = "CREATE TABLE Student_User" +
                    //"(student_id decimal(12) not NULL, " +
                    //"registration_no decimal(12) not NULL, " +
                    //"year_of_entry decimal(12) not NULL, " +
                    //"duration_of_course decimal(12) not NULL, " +
                    //"PRIMARY KEY (student_id)"
            //"FOREIGN KEY (registration_no) REFERENCES Users(registration_no))";
            //stmt.executeUpdate(SQL10);

            String SQL11 = "CREATE TABLE Borrowed" +
                    "(borrowed_id decimal(12) not NULL, " +
                    "book_id decimal(12) not NULL, " +
                    "registration_no decimal(12) not NULL, " +
                    "issue_date decimal(12) not NULL, " +
                    "due_date decimal(12) not NULL, " +
                    "status_id decimal(12) not NULL, " +
                    "PRIMARY KEY (borrowed_id)"+
            "FOREIGN KEY (book_id) REFERENCES Book(book_id))";
            stmt.executeUpdate(SQL11);


















            while(rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }

            System.out.println("Finished");

            st.close();
            connection.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
