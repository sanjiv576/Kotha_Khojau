package model;

public class LoginData {
    // values come form Login Windows;
    //private int UserID;
    private String username;
    private String password;

    public LoginData(String username, String password){

        this.username = username;
        this.password = password;
    }

    public LoginData() {

    }

    // getter method for username
    public String getUsername(){
        return username;
    }

    // setter method for username
    public void setUsername(String username){
        this.username = username;
    }

    // getter method for password
    public String getPassword(){
        return password;
    }

    // setter method for password
    public void setPassword(String password){
        this.password = password;
    }
}
