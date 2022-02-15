package controller;

import database.DbConnection;
import logic.SaveData;
import model.Driver_Details;
import model.User;

import javax.swing.*;
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
        String aboutMe = "Empty";

        // user.getFirstName() calls getter method that in User class
        query = "insert into User_tbl(FirstName, MiddleName, LastName, MemberType, Gender, Contact, DOB, Occupation, PersonalEmail, Address," + "Username, Password, AboutMe) values('" +
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
                user.getPassword() + "','" + aboutMe + "');";

       // PreparedStatement pst = connection.prepareStatement(DO)
        db = new DbConnection();

        return db.manipulate(query);

    }

    // for inserting data in about me
    public void insertAboutMe(String about_Me) throws SQLException {

        String oldAboutMe = retrieveAboutMe(SaveData.myUsername, SaveData.myPassword);

        String query = "update User_tbl set AboutMe='"+about_Me+"' where AboutMe='"+oldAboutMe+"'";
        db.updateDetails(query);
    }

    // for changing password
    public void passwordChange(String oldPassword, String newPassword){

        DbConnection db = new DbConnection();
        String query = "update User_tbl set Password='"+newPassword+"' where Password='"+oldPassword+"'";
        db.updateDetails(query);
    }

    // for deleting account
    public void deleteMyAccount(String username, String password){

        String[] deleteData = profileDetails(username, password);
        DbConnection db = new DbConnection();
        String query = "delete from User_tbl where UserID='"+deleteData[0]+"'";
        db.updateDetails(query);
    }



    // for updating first, middle , last names, email, address, contact
    public void updateData(String newData, int i){
        // fetching old data

        String query;
        String[] oldData = personalData(SaveData.myUsername, SaveData.myPassword);

        // fetching userID (primary key) to identify the particular row to be deleted
        String[] userId = profileDetails(SaveData.myUsername, SaveData.myPassword);
        try {
            if (i == 0) {
                query = "update User_tbl set FirstName='" + newData + "' where FirstName='" + oldData[i] + "' and UserID='" + userId[0] + "'";
                db.updateDetails(query);
            }
            else if (i == 1) {
                query = "update User_tbl set MiddleName='" + newData + "' where MiddleName='" + oldData[i] + "' and UserID='" + userId[0] + "'";
                db.updateDetails(query);
            }
            else if (i == 2) {
                query = "update User_tbl set LastName='" + newData + "' where LastName='" + oldData[i] + "' and UserID='" + userId[0] + "'";
                db.updateDetails(query);
            }

            else if (i == 3) {
                query = "update User_tbl set Contact='" + newData + "' where Contact='" + oldData[i] + "' and UserID='" + userId[0] + "'";
                db.updateDetails(query);
            }

            else if (i == 4) {
                query = "update User_tbl set Address='" + newData + "' where Address='" + oldData[i] + "' and UserID='" + userId[0] + "'";
                db.updateDetails(query);
            }

            else if (i == 5) {
                query = "update User_tbl set PersonalEmail='" + newData + "' where PersonalEmail='" + oldData[i] + "' and UserID='" + userId[0] + "'";
                db.updateDetails(query);
            }
        }
        catch (Exception exception){
            JOptionPane.showMessageDialog(null, "Message : " + exception.getMessage(), "Something Went Wrong", JOptionPane.WARNING_MESSAGE);
        }

    }


    // for fetching entire details of a particular user, used by admin only
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

    public List<Driver_Details> getDriverDetails(){
        String query;
        query = "select * from driver_tbl";
        db = new DbConnection();
        ResultSet resultSet = db.retrieveData(query);
        List<Driver_Details> driverList = new ArrayList<>();

        try{

            while (resultSet.next()){
                Driver_Details driver_details = new Driver_Details();

                driver_details.setFullName(resultSet.getString("FullName"));
                driver_details.setContact(resultSet.getString("Contact"));
                driver_details.setAvailableLocation(resultSet.getString("AvailableLocations"));
                driver_details.setServiceChargeStatus(resultSet.getString("ServiceChargeStatus"));
                driver_details.setShortDistance(resultSet.getString("ShortDistance"));
                driver_details.setLongDistance(resultSet.getString("LongDistance"));
                driver_details.setLongDistance(resultSet.getString("LongDistance"));
                driver_details.setVehicleSize(resultSet.getString("VehicleSize"));

                driverList.add(driver_details);

            }
        }
        catch (Exception exp){
            exp.printStackTrace();

        }

        return driverList;

    }


    // for fetching entire details of a particular user to show in Profile
    public String[] profileDetails(String username, String password){
        String query;

        String userId = null;
        String userFirstName = null;
        String userMiddleName = null;
        String userLastName = null;
        String userContact = null;
        String userMemberType = null;
        String userGender = null;
        String userDOB = null;
        String userOccupation = null;
        String userEmail = null;

        query = "select * from User_tbl where Username='"+username+"' and Password='"+password+"'";
        db = new DbConnection();
        ResultSet resultSet = db.retrieveData(query);


        // now, filling resultSet by each row
        try{

            while (resultSet.next()){

                userId = resultSet.getString("UserID");
                userFirstName = resultSet.getString("FirstName");
                userMiddleName = resultSet.getString("MiddleName");
                userLastName = resultSet.getString("LastName");
                userMemberType = resultSet.getString("MemberType");
                userGender = resultSet.getString("Gender");
                userContact = resultSet.getString("Contact");
                userDOB = resultSet.getString("DOB");
                userOccupation = resultSet.getString("Occupation");
                userEmail = resultSet.getString("PersonalEmail");

            }

        }
        catch (Exception exp){
            exp.printStackTrace();

        }
        // placing all user's data in String array
        String[] userInformation = {userId, userFirstName +" "+ userMiddleName + " "+ userLastName, userMemberType, userGender, userContact, userDOB, userOccupation, userEmail};

        return userInformation;
    }

    // this method for fetching particular data from particular user
    public String[] personalData(String username, String password){
        String query;

        String userFirstName = null;
        String userMiddleName = null;
        String userLastName = null;
        String userContact = null;
        String userEmail = null;
        String userAddress = null;

        query = "select * from User_tbl where Username='"+username+"' and Password='"+password+"'";
        db = new DbConnection();
        ResultSet resultSet = db.retrieveData(query);


        // now, filling resultSet by each row
        try{

            while (resultSet.next()){

                userFirstName = resultSet.getString("FirstName");
                userMiddleName = resultSet.getString("MiddleName");
                userLastName = resultSet.getString("LastName");
                userContact = resultSet.getString("Contact");
                userAddress = resultSet.getString("Address");
                userEmail = resultSet.getString("PersonalEmail");

            }

        }
        catch (Exception exp){
            exp.printStackTrace();

        }
        // placing all user's data in String array
        String[] userInformation = {userFirstName, userMiddleName, userLastName, userContact, userAddress, userEmail};

        return userInformation;
    }

    public String retrieveAboutMe(String username, String password){

        String userAboutMe = null;
        String query = "select AboutMe from User_tbl where Username='"+username+"' and Password='"+password+"'";
        db = new DbConnection();
        ResultSet resultSet = db.retrieveData(query);

        try {

            while (resultSet.next()){

                userAboutMe = resultSet.getString("AboutMe");
            }
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }

        return userAboutMe;
    }
    public List<User> getRenterDetail(){
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
                user.setGender(resultSet.getString("Gender"));
                user.setContact(resultSet.getString("Contact"));
                user.setMemberType(resultSet.getString("MemberType"));
                user.setOccupation(resultSet.getString("Occupation"));
                user.setPersonalEmail(resultSet.getString("PersonalEmail"));
                user.setAddress(resultSet.getString("Address"));


                userList.add(user);

            }
        }
        catch (Exception exp){
            exp.printStackTrace();

        }

        return userList;
    }


}
