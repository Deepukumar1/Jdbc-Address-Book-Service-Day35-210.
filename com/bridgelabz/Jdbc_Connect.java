package com.bridgelabz;

public class Jdbc_Connect {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/addressbook";
        String username = "root";
        String password = "Deepu765";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully");


            connection.close();
            System.out.println("Connection Closed");
        }catch(SQLException |ClassNotFoundException e){
            System.out.println(e);
        }
    }

}
