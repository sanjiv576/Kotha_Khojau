import javax.swing.*;
public class Logic_Registration {
    private String FirstName;
    private String middleName;
    private String LastName;
//    private String MemberType;
//    private String Gender;
//    private int Contact;
//    private int DateOfBirth;
//    private String Occupation;
//    private String email;
//    private String Address;
//    private String username;
//    private String password;
//    private String repassword;


    public  Logic_Registration(String FirstName,String middleName, String LastName){
//                               String MemberType, String Gender, int Contact), int DateOfBirth, String Occupation, String email,String Address,
//                                String username, String password, repassword){
        this.FirstName = FirstName;
        this.middleName = middleName;
        this.LastName= LastName;
//        this.MemberType = MemberType;
//        this.Gender = Gender;
//        this.Contact = Contact;
//        this.DateOfBirth = DateOfBirth;
//        this.Occupation = Occupation;
//        this.email =email;
//        this.Address = Address;
//        this.username = username;
//        this.password =password;
//        this.repassword = repassword;
    }
    public  void registration(String FirstName,String middleName, String LastName ){
        if (FirstName.isEmpty() || middleName.isEmpty() || LastName.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fields are empty",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Registration successfully",
                    "Registered ", JOptionPane.YES_OPTION);
        }
        //return 0;

    }
}
