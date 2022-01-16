package model;

import java.io.FileDescriptor;

// encapsulation part is done here
public class User {

    private int UserID;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String MemberType;
    private String Gender;
    private String Contact;
    private String DOB;
    private String Occupation;
    private String PersonalEmail;
    private String Address;
    private String Username;
    private String Password;

    public User(String FirstName, String MiddleName, String LastName, String MemberType, String Gender, String Contact,
                String DOB, String Occupation, String PersonalEmail, String Address,
                String Username, String Password){

        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName= LastName;
        this.MemberType = MemberType;
        this.Gender = Gender;
        this.Contact = Contact;
        this.DOB = DOB;
        this.Occupation = Occupation;
        this.PersonalEmail = PersonalEmail;
        this.Address = Address;
        this.Username = Username;
        this.Password = Password;
    }

    // method overloading

    public User(int UserID, String FirstName, String MiddleName, String LastName, String MemberType, String Gender,
                String Contact, String DOB, String Occupation, String PersonalEmail, String Address,
                String Username, String Password){

        this.UserID = UserID;
        this.FirstName = FirstName;
        this.MiddleName = MiddleName;
        this.LastName= LastName;
        this.MemberType = MemberType;
        this.Gender = Gender;
        this.Contact = Contact;
        this.DOB = DOB;
        this.Occupation = Occupation;
        this.PersonalEmail = PersonalEmail;
        this.Address = Address;
        this.Username = Username;
        this.Password = Password;
    }

    // getter method --> for read only
    public int getUserID(){
        return UserID;
    }

    // setter method --> for write only
    public void setUserID(int UserID){
        this.UserID = UserID;
    }

    public String getFirstName(){
        return FirstName;
    }

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public String getMiddleName(){
        return MiddleName;
    }

    public void setMiddleName(String MiddleName){
        this.MiddleName = MiddleName;
    }

    public String getLastName(){
        return LastName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public String getMemberType(){
        return MemberType;
    }

    public void setMemberType(String MemberType){
        this.MemberType = MemberType;
    }

    public String getGender(){
        return Gender;
    }

    public void setGender(String Gender){
        this.Gender = Gender;
    }

    public String getContact(){
        return Contact;
    }

    public void setContact(String Contact){
        this.Contact = Contact;
    }

    public String getDOB(){
        return DOB;
    }

    public void setDOB(String DOB){
        this.DOB = DOB;
    }

    public String getOccupation(){
        return Occupation;
    }

    public void setOccupation(String Occupation){
        this.Occupation = Occupation;
    }

    public String getPersonalEmail(){
        return PersonalEmail;
    }

    public void setPersonalEmail(String PersonalEmail){
        this.PersonalEmail = PersonalEmail;
    }

    public String getAddress(){
        return Address;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public String getUsername(){
        return Username;
    }

    public void setUsername(String Username){
        this.Username = Username;
    }

    public String getPassword(){
        return Password;
    }

    public void setPassword(String Password){
        this.Password = Password;
    }

}
