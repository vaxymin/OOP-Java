package pack1;

import java.sql.*;

public class ConnectDB {


    public Connection get_connection() {
        Connection connection = null;
        String host = "localhost";
        String port = "5432";
        String db_name = "library";
        String username = "postgres";
        String password = "aminachka1982";


        try {
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            //connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "0000");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name, username, password);

            if(connection!=null) {
                System.out.println("Database opened successfully \n");

            } else {
                System.out.println("Database failed to open \n");
            }

        }catch(Exception e) {
            System.out.println(e);
        }
        return connection;
    }}
