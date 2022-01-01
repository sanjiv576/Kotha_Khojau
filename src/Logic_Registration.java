import javax.swing.*;
public class Logic_Registration {
    private String FirstName;
    private String middleName;
    private String LastName;
    private String MemberType;
    private String Gender;
    private String Contact;
    private String DateOfBirth;
    private String Occupation;
    private String Email;
    private String Address;
    private String Username;
    private String Password;
    private String Repassword;


    public  Logic_Registration(String FirstName,String middleName, String LastName, String MemberType,
                               String Gender, String Contact , String DateOfBirth, String Occupation, String Email,String Address,
                               String Username, String Password, String Repassword){

        this.FirstName = FirstName;
        this.middleName = middleName;
        this.LastName= LastName;
        this.MemberType = MemberType;
        this.Gender = Gender;
        this.Contact = Contact;
        this.DateOfBirth = DateOfBirth;
        this.Occupation = Occupation;
        this.Email = Email;
        this.Address = Address;
        this.Username = Username;
        this.Password = Password;
        this.Repassword = Repassword;
    }
    public  void registration(String FirstName,String middleName, String LastName, String MemberType, String Gender,
                              String Contact, String DateOfBirth, String Occupation, String Email, String Address,
                              String Username, String Password, String Repassword){
        if (FirstName.isEmpty() || LastName.isEmpty() || Contact.isEmpty() ||
                DateOfBirth.isEmpty() || Email.isEmpty() || Address.isEmpty() || Username.isEmpty() ||
                Password.isEmpty() || Repassword.isEmpty() || Gender.equals("Select") || Occupation.equals("Select")
                || MemberType.equals("Select")){

            JOptionPane.showMessageDialog(null, "Fields are empty",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (!(Password.equals(Repassword))){
            JOptionPane.showMessageDialog(null, "Password and Re-password do not match. Try Again",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {

            System.out.println("First name : " + FirstName);
            System.out.println("Middle name : " + middleName);
            System.out.println("Last name : " + LastName);
            System.out.println("Member type : " + MemberType);
            System.out.println("Gender : " + Gender);
            System.out.println("Contact : " + Contact);
            System.out.println("DOB : " + DateOfBirth);
            System.out.println("Occupation : " + Occupation);
            System.out.println("Email : " + Email);
            System.out.println("Address : " + Address);
            System.out.println("Username : " + Username);
            System.out.println("Password : " + Password);

            JOptionPane.showMessageDialog(null, "Registration successfully",
                    "Registration", JOptionPane.YES_OPTION);


        }

    }
}
