package controller;

import database.DbConnection;
import model.LoginData;

import java.sql.ResultSet;

public class LoginDataController {
    DbConnection db;

    // creating a method which is invoked after clicking Register button to insert data into database
    public ResultSet checkValidation(String username, String password){
        String query;

        query = "select Username, Password from User_tbl where Username=? and Password=?";


        db = new DbConnection();
        return db.matchValues(query, username, password);
    }
}
