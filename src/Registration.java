import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;


public class Registration extends JFrame implements ActionListener{
    JLabel labelFirstName;
    JLabel labelmiddleName;
    JLabel labelLastName;
    JLabel labelMemberType;
    JLabel labelGender;
    JLabel labelContact;
    JLabel labelDateOfBirth;
    JLabel labelOccupation;
    JLabel labelemail;
    JLabel labelAddress;
    JLabel labelusername;
    JLabel labelpassword;
    JLabel labelrepassword;
    JLabel label1;
    JLabel label2;
    JLabel imgLbl;
    JPanel panel;
    JPanel panel1;

    JTextField FirstName;
    JTextField MiddleName;
    JTextField LastName;
    JTextField contact;
    JTextField dateofbirth;
    JTextField email;
    JTextField address;
    JTextField username;
    JPasswordField password;
    JPasswordField repassword;

    JButton Btn;
    JComboBox genderCombo, occupationCombo, memberCombo;



    public Registration(){



        setTitle("Registration");
        setSize(920,750);
        setLocation(100,50);
        setResizable(false);
        setLayout(null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10,10,10,10));
        panel1.setBounds(0, 0, 920, 750);
        panel1.setBackground(Color.decode("#FFFFFF"));
        panel1.setOpaque(true);

        // labels
        labelFirstName = new JLabel("*First Name");
        labelFirstName.setForeground(Color.BLACK);
        labelFirstName.setFont(new Font("times", Font.BOLD,19));
        labelFirstName.setBounds(50,120,200,20);
        add(labelFirstName);

        labelmiddleName = new JLabel("*Middle Name");
        labelmiddleName.setForeground(Color.BLACK);
        labelmiddleName.setFont(new Font("times", Font.BOLD,19));
        labelmiddleName.setBounds(210,120,200,20);
        add(labelmiddleName);

        labelLastName = new JLabel("*Last Name");
        labelLastName.setForeground(Color.BLACK);
        labelLastName.setFont(new Font("times", Font.BOLD,19));
        labelLastName.setBounds(370,120,200,20);
        add(labelLastName);

        labelMemberType = new JLabel("*Member Type");
        labelMemberType.setForeground(Color.BLACK);
        labelMemberType.setFont(new Font("times", Font.BOLD,19));
        labelMemberType.setBounds(530,120,200,20);
        add(labelMemberType);

        labelGender= new JLabel("*Gender");
        labelGender.setForeground(Color.BLACK);
        labelGender.setFont(new Font("times", Font.BOLD,19));
        labelGender.setBounds(690,120,200,20);
        add(labelGender);

        labelContact = new JLabel("*Contact");
        labelContact.setForeground(Color.BLACK);
        labelContact.setFont(new Font("times", Font.BOLD,19));
        labelContact.setBounds(50,210,200,20);
        add(labelContact);

        labelDateOfBirth=new JLabel("*DOB");
        labelDateOfBirth.setForeground(Color.BLACK);
        labelDateOfBirth.setFont(new Font("times", Font.BOLD,19));
        labelDateOfBirth.setBounds(210,210,200,20);
        add(labelDateOfBirth);

        labelOccupation=new JLabel("*Occupation ");
        labelOccupation.setForeground(Color.BLACK);
        labelOccupation.setFont(new Font("times", Font.BOLD,19));
        labelOccupation.setBounds(50,290,200,20);
        add(labelOccupation);

        labelemail=new JLabel("*Personal email");
        labelemail.setForeground(Color.BLACK);
        labelemail.setFont(new Font("times", Font.BOLD,19));
        labelemail.setBounds(210,290,200,20);
        add(labelemail);

        labelAddress=new JLabel("*Address");
        labelAddress.setForeground(Color.BLACK);
        labelAddress.setFont(new Font("times", Font.BOLD,19));
        labelAddress.setBounds(50,370,200,20);
        add(labelAddress);

        labelusername=new JLabel("*Username ");
        labelusername.setForeground(Color.BLACK);
        labelusername.setFont(new Font("times", Font.BOLD,19));
        labelusername.setBounds(210,370,200,20);
        add(labelusername);

        labelpassword=new JLabel("*Password ");
        labelpassword.setForeground(Color.BLACK);
        labelpassword.setFont(new Font("times", Font.BOLD,19));
        labelpassword.setBounds(50,465,200,20);
        add(labelpassword);

        labelrepassword=new JLabel("*Re-password");
        labelrepassword.setForeground(Color.BLACK);
        labelrepassword.setFont(new Font("times", Font.BOLD,19));
        labelrepassword.setBounds(210,465,200,20);
        add( labelrepassword);

        //for title
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(10,10,10,10));
        panel.setBounds(150, 20, 530, 70);
        panel.setBackground(Color.decode("#00994c"));
        panel.setOpaque(true);

        label1= new JLabel("HURRY UP,");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Saira", Font.BOLD,39));
        label1.setBounds(205,17,220,80);
        add( label1);

        label2= new JLabel("SIGN UP!!");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Saira", Font.BOLD,39));
        label2.setBounds(430,17,220,80);
        label2.setForeground(Color.YELLOW);
        add( label2);

        add(panel);



        //textfields
        FirstName = new JTextField();
        FirstName.setBounds(50,145,120,25);
        FirstName.setBackground(Color.decode("#C0C0C0"));
        FirstName.setFont(new Font("times", Font.BOLD,15));
        add(FirstName);

        MiddleName = new JTextField();
        MiddleName.setBounds(210,145,120,25);
        MiddleName.setBackground(Color.decode("#C0C0C0"));
        MiddleName.setFont(new Font("times", Font.BOLD,15));
        add(MiddleName);

        LastName = new JTextField();
        LastName.setBounds(370,145,120,25);
        LastName.setBackground(Color.decode("#C0C0C0"));
        LastName.setFont(new Font("times", Font.BOLD,15));

        add(LastName);


        String[] Membertype= {"Select", "Owner", "Renter"};
        memberCombo = new JComboBox(Membertype);
        memberCombo.setBounds(530,145,120,25);
        memberCombo.setBackground(Color.decode("#C0C0C0"));
        memberCombo.setFont(new Font("times", Font.BOLD,15));
        add(memberCombo);

        //dropdown for membertype

//        Membertype= new JTextField();
//        Membertype.setBounds(590,175,120,20);
//        Membertype.setBackground(Color.decode("#C0C0C0"));
//        add(Membertype);


        String[] Gender = {"Select", "Male", "Female", "Others"};
        genderCombo = new JComboBox(Gender);
        genderCombo.setBounds(690,145,120,25);
        genderCombo.setBackground(Color.decode("#C0C0C0"));
        genderCombo.setFont(new Font("times", Font.BOLD,15));
        //genderCombo.setSelectedItem("Others");
        add(genderCombo);

        contact = new JTextField();
        contact.setBounds(50,235,120,25);
        contact.setBackground(Color.decode("#C0C0C0"));
        contact.setFont(new Font("times", Font.BOLD,15));
        add(contact);

        dateofbirth = new JTextField();
        dateofbirth.setBounds(210,235,120,25);
        dateofbirth.setBackground(Color.decode("#C0C0C0"));
        dateofbirth.setFont(new Font("times", Font.BOLD,15));
        add(dateofbirth);



        String[] occupation = { "Select", "Student", "Laborer", "Teacher/Lecturer",
                "Government officer", "Hotelier", "Retailer", "Medical worker", "Businessman", "Salesman"};
        occupationCombo = new JComboBox(occupation);
        occupationCombo.setBounds(50,315,120,25);
        occupationCombo.setBackground(Color.decode("#C0C0C0"));
        occupationCombo.setFont(new Font("times", Font.BOLD,15));
        add(occupationCombo);

        email = new JTextField();
        email.setBounds(210,315,120,25);
        email.setBackground(Color.decode("#C0C0C0"));
        email.setFont(new Font("times", Font.BOLD,15));
        add(email);

        address = new JTextField();
        address.setBounds(50,395,120,25);
        address.setBackground(Color.decode("#C0C0C0"));
        address.setFont(new Font("times", Font.BOLD,15));
        add(address);

        username = new JTextField();
        username.setBounds(210,395,120,25);
        username.setBackground(Color.decode("#C0C0C0"));
        username.setFont(new Font("times", Font.BOLD,15));
        add(username);

        password = new JPasswordField();
        password.setBounds(50,490,120,25);
        password.setBackground(Color.decode("#C0C0C0"));
        password.setFont(new Font("times", Font.BOLD,15));
        add(password);

        repassword = new JPasswordField();
        repassword.setBounds(210,490,120,25);
        repassword.setBackground(Color.decode("#C0C0C0"));
        repassword.setFont(new Font("times", Font.BOLD,15));
        add(repassword);

        // background image insertion
        imgLbl = new JLabel();
        imgLbl.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/registration.png"))));
        getContentPane().add(imgLbl);
        imgLbl.setBounds(330, 170, 700, 500);


        Btn = new JButton();
        Btn.setBounds(80,570,230,55);
        Btn.setBackground(Color.decode("#FFFFFF"));
        Btn.setOpaque(true);
        Btn.setBorderPainted(false);
        Btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/register.png"))));


        add(Btn);
        add(panel1);

        Btn.addActionListener(this);
    }


    public static void main(String[] args) {
        new Registration().setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String FirstNameInserted, middleNameInserted,LastNameInserted, contactInserted,
                dobInserted, emailInserted, addressInserted, usernameInserted, passwordInserted, repassInserted;
        FirstNameInserted = FirstName.getText();
        middleNameInserted = MiddleName.getText();
        LastNameInserted = LastName.getText();
        contactInserted = contact.getText();
        dobInserted = dateofbirth.getText();
        emailInserted = email.getText();
        addressInserted = address.getText();
        usernameInserted = username.getText();
        passwordInserted = password.getText();
        repassInserted = repassword.getText();


        String selectedOccupation, selectedGender, selectedMember;
        selectedOccupation = Objects.requireNonNull(occupationCombo.getSelectedItem()).toString();
        selectedGender = Objects.requireNonNull(genderCombo.getSelectedItem()).toString();
        selectedMember = Objects.requireNonNull(memberCombo.getSelectedItem()).toString();



        if (e.getSource().equals(Btn)){

            // creating instance of a class
            Logic_Registration object = new Logic_Registration(FirstNameInserted, middleNameInserted,LastNameInserted,
                    selectedMember, selectedGender, contactInserted, dobInserted, selectedOccupation, emailInserted,
                    addressInserted, usernameInserted, passwordInserted, repassInserted);

            object.registration(FirstNameInserted, middleNameInserted,LastNameInserted,
                    selectedMember, selectedGender, contactInserted, dobInserted, selectedOccupation, emailInserted,
                    addressInserted, usernameInserted, passwordInserted, repassInserted);

            dispose();
            new Signin().setVisible(true);

        }


    }
}
