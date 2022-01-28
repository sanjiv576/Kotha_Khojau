package database;

import model.LoginData;

import java.sql.*;
public class DbConnection {

    Statement statement;
    Connection connection;
    int val;
    ResultSet resultSet;

    public DbConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Kotha_Khojau_Db?characterEncoding=utf8&useSSL=true&autoReconnect=true",
                            "root", "root");
            statement = connection.createStatement();


            if (connection != null){
                System.out.println("Database is connected");
            }
            else {
                System.out.println("Database connection failed");
            }

            String tableCreate = "create table if not exists User_tbl(UserID int auto_increment, " +
                    "FirstName varchar(30) not null, " +
                    "MiddleName varchar(20), " +
                    "LastName varchar(30) not null," +
                    "MemberType varchar(20) not null, " +
                    "Gender varchar(10) not null," +
                    "Contact varchar(15) not null, " +
                    "DOB date not null, " +
                    "Occupation varchar(20) not null, " +
                    "PersonalEmail varchar(50) not null, " +
                    "Address varchar(50) not null, " +
                    "Username varchar(40) not null, " +
                    "Password varchar(40) not null," +
                    "constraint userId_pk primary key(UserID), " +
                    "constraint contact_uk unique(Contact), " +
                    "constraint email_uk unique(PersonalEmail), " +
                    "constraint username_uk unique(Username))";

           // PreparedStatement pst = connection.prepareStatement(tableCreate);
            statement.execute(tableCreate);
            System.out.println("Table has been created");



        }
        catch (ClassNotFoundException | SQLException exception){
            exception.printStackTrace();
        }
    }

    // this function of this method is to insert data into database
    public int manipulate(String query) throws SQLException {
        try{
            val = statement.executeUpdate(query);
        }
        catch (SQLException exp){
            exp.printStackTrace();
        }
        finally {
            connection.close();
        }
        return val;
    }

    // this functions checks whether provided username and passwords are in the database or not.

    public ResultSet matchValues(String query, String username, String password){

        try{
            // 1st try
//            PreparedStatement pst = (PreparedStatement) connection.prepareStatement(query);
//            pst.setString(1, username);
//            pst.setString(2, password);
//
//            resultSet = pst.executeQuery(query);

            // this does not work : memberType
            //System.out.println(statement.executeQuery(memberCategory));
            resultSet = statement.executeQuery(query);
        }
        catch (Exception exception){
            exception.getStackTrace();
            System.out.println(exception.getMessage());
        }

        return resultSet;
    }

    public static void main(String[] args) {
        new DbConnection();
    }
}
