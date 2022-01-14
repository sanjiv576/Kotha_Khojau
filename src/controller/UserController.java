package controller;

import database.DbConnection;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
