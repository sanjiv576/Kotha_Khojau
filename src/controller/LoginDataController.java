package controller;

import database.DbConnection;
import model.LoginData;

import java.sql.ResultSet;

public class LoginDataController {
    DbConnection db;

    // creating a method which is invoked after clicking Register button to insert data into database
    public ResultSet checkValidation(String username, String password){
        String query;

        // 1st try
        //query = "select Username, Password from User_tbl where Username=? and Password=?";

        // 2nd try
        query = "select * from User_tbl where Username='"+username+"' and Password='"+password+"'";

        // Note: to select memberType is remaining for whom Dashboard
        //String memberCategory = "select MemberType from User_tbl";
        db = new DbConnection();
        return db.matchValues(query, username, password);
    }
}
