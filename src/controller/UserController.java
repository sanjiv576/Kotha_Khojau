package controller;

import database.DbConnection;
import model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    Connection connection;
    DbConnection db;

    // creating a method which is invoked after clicking Register button to insert data into database
    public int registerUser(User user) throws SQLException {

        String query;

        // user.getFirstName() calls getter method that in User class
        query = "insert into User_tbl(FirstName, MiddleName, LastName, MemberType, Gender, Contact, DOB, Occupation, PersonalEmail, Address," + "Username, Password) values('" +
                user.getFirstName() + "','" +
                user.getMiddleName() + "','" +
                user.getLastName() + "','" +
                user.getMemberType() + "','" +
                user.getGender() + "','" +
                user.getContact() + "','" +
                user.getDOB() + "','" +
                user.getOccupation() + "','" +
                user.getPersonalEmail() + "','" +
                user.getAddress() + "','" +
                user.getUsername() + "','" +
                user.getPassword() + "');";

       // PreparedStatement pst = connection.prepareStatement(DO)
        db = new DbConnection();

        return db.manipulate(query);

    }

    public List<User> getAllUser(){
        String query;
        query = "select * from User_tbl";
        db = new DbConnection();
        ResultSet resultSet = db.retrieveData(query);
        List<User> userList = new ArrayList<User>();

        // now, filling resultSet by each row
        try{

            while (resultSet.next()){
                User user = new User();

                user.setUserID(resultSet.getInt("UserID"));
                user.setFirstName(resultSet.getString("FirstName"));
                user.setMiddleName(resultSet.getString("MiddleName"));
                user.setLastName(resultSet.getString("LastName"));
                user.setMemberType(resultSet.getString("MemberType"));
                user.setGender(resultSet.getString("Gender"));
                user.setContact(resultSet.getString("Contact"));
                user.setDOB(resultSet.getString("DOB"));
                user.setOccupation(resultSet.getString("Occupation"));
                user.setPersonalEmail(resultSet.getString("PersonalEmail"));
                user.setAddress(resultSet.getString("Address"));
                user.setUsername(resultSet.getString("Username"));
                user.setPassword(resultSet.getString("Password"));

                userList.add(user);

            }
        }
        catch (Exception exp){
            exp.printStackTrace();

        }

        return userList;
    }


}
