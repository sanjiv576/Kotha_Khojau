package view;

import controller.UserController;
import logic.Logic_Registration;
import logic.Logic_Verification;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Registration extends JFrame implements ActionListener{
    String dob = "";

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

    JTextField firstName;
    JTextField middleName;
    JTextField lastName;
    JTextField contact;
    JTextField dateofbirth;
    JTextField email;
    JTextField address;
    JTextField username;
    JPasswordField password;
    JPasswordField repassword;

    JButton Btn;
    JComboBox genderCombo, occupationCombo, memberCombo;

    JSpinner yearSpinner, monthSpinner ,daySpinner;

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

        // labels are added by invoking the method
        try {
            addLabels();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Message "+ e.getMessage(), "Alert !", JOptionPane.INFORMATION_MESSAGE);
        }


        //text fields
        firstName = new JTextField();
        firstName.setBounds(50,145,120,25);
        firstName.setBackground(Color.decode("#C0C0C0"));
        firstName.setFont(new Font("times", Font.BOLD,15));
        add(firstName);

        middleName = new JTextField();
        middleName.setBounds(210,145,120,25);
        middleName.setBackground(Color.decode("#C0C0C0"));
        middleName.setFont(new Font("times", Font.BOLD,15));
        add(middleName);

        lastName = new JTextField();
        lastName.setBounds(370,145,120,25);
        lastName.setBackground(Color.decode("#C0C0C0"));
        lastName.setFont(new Font("times", Font.BOLD,15));

        add(lastName);


        String[] Membertype= {"Select", "Owner", "Renter"};
        memberCombo = new JComboBox(Membertype);
        memberCombo.setBounds(530,145,120,25);
        memberCombo.setBackground(Color.decode("#C0C0C0"));
        memberCombo.setFont(new Font("times", Font.BOLD,15));
        add(memberCombo);

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


        // JSpinner is added for date of birth by invoking method
        addSpinners();


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
        imgLbl.setIcon(new ImageIcon(getClass().getResource("Images/registration.png")));
        getContentPane().add(imgLbl);
        imgLbl.setBounds(330, 170, 700, 500);


        Btn = new JButton();
        Btn.setBounds(80,615,230,55);
        Btn.setBackground(Color.decode("#FFFFFF"));
        Btn.setOpaque(true);
        Btn.setBorderPainted(false);
        Btn.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/register.png"))));


        add(Btn);
        add(panel1);


        Btn.addActionListener(this);
        yearSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        monthSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });

        daySpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });

    }

    // -------------------------------------- main method ----------------------------------
    public static void main(String[] args) {
        new Registration().setVisible(true);
    }


    // --------------------------------- events handling -----------------------------------
    @Override
    public void actionPerformed(ActionEvent e) {

        String year = yearSpinner.getValue().toString();
        String month = "0" + monthSpinner.getValue().toString();
        String day = "0" + daySpinner.getValue().toString();
        dob = year + "/" + month + "/" + day;
        System.out.println("DOB : " + dob);

        // retrieving the data from textfields
        String FirstNameInserted, middleNameInserted,LastNameInserted, contactInserted,
                dobInserted, emailInserted, addressInserted, usernameInserted, passwordInserted, repassInserted;

        FirstNameInserted = firstName.getText();
        middleNameInserted = middleName.getText();
        LastNameInserted = lastName.getText();
        contactInserted = contact.getText();
        dobInserted = dob;
        emailInserted = email.getText();
        addressInserted = address.getText();
        usernameInserted = username.getText();
        passwordInserted = password.getText();
        repassInserted = repassword.getText();


        // for retrieving data from combo boxes
        String selectedOccupation, selectedGender, selectedMember;

        selectedOccupation = Objects.requireNonNull(occupationCombo.getSelectedItem()).toString();
        selectedGender = Objects.requireNonNull(genderCombo.getSelectedItem()).toString();
        selectedMember = Objects.requireNonNull(memberCombo.getSelectedItem()).toString();

        // close the registration window after successful registration
        boolean closeRegistrationWindow = false;
        boolean dataEntry = false;
        boolean OTP_Verified = false;

        if (e.getSource().equals(Btn)){

            // creating instance of a class
            Logic_Registration object = new Logic_Registration();

            object.registration(closeRegistrationWindow, dataEntry, OTP_Verified,
                    FirstNameInserted, middleNameInserted,LastNameInserted,
                    selectedMember, selectedGender, contactInserted, dobInserted, selectedOccupation, emailInserted,
                    addressInserted, usernameInserted, passwordInserted, repassInserted);



        }


    }

    // ------------------------------ User defined methods -------------------------------------

    public void addSpinners(){

        try {
            // setting current year
            LocalDate date = LocalDate.now();
            int currentYear = date.getYear();


            // 2022 initial value, 1920 minimum value, 2022 maximum value, 1 step value
            SpinnerModel yearValue = new SpinnerNumberModel(2000, 1920, currentYear, 1);

            yearSpinner = new JSpinner(yearValue);
            yearSpinner.setBounds(210, 235, 60, 25);
            yearSpinner.setBackground(Color.decode("#C0C0C0"));
            yearSpinner.setFont(new Font("times", Font.BOLD, 15));

            // removes comma in the date i.e 2,022 ---> 2022
            JSpinner.NumberEditor editor = new JSpinner.NumberEditor(yearSpinner, "#");
            yearSpinner.setEditor(editor);
            add(yearSpinner);

            // adding JSpinner for month
            SpinnerModel monthValue = new SpinnerNumberModel(1, 1, 12, 1);

            monthSpinner = new JSpinner(monthValue);
            monthSpinner.setBounds(270, 235, 50, 25);
            monthSpinner.setBackground(Color.decode("#C0C0C0"));
            monthSpinner.setFont(new Font("times", Font.BOLD, 15));

            add(monthSpinner);

            // adding JSpinner for day
            SpinnerModel dayValue = new SpinnerNumberModel(1, 1, 32, 1);

            daySpinner = new JSpinner(dayValue);
            daySpinner.setBounds(320, 235, 50, 25);
            daySpinner.setBackground(Color.decode("#C0C0C0"));
            daySpinner.setFont(new Font("times", Font.BOLD, 15));
            add(daySpinner);

        }
        catch(Exception exception){
            JOptionPane.showMessageDialog(null,"Message "+ exception.getMessage(), "Alert !", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void addLabels(){

        labelFirstName = new JLabel("First Name*");
        labelFirstName.setForeground(Color.BLACK);
        labelFirstName.setFont(new Font("times", Font.BOLD,19));
        labelFirstName.setBounds(50,120,200,20);
        add(labelFirstName);

        labelmiddleName = new JLabel("Middle Name");
        labelmiddleName.setForeground(Color.BLACK);
        labelmiddleName.setFont(new Font("times", Font.BOLD,19));
        labelmiddleName.setBounds(210,120,200,20);
        add(labelmiddleName);

        labelLastName = new JLabel("Last Name*");
        labelLastName.setForeground(Color.BLACK);
        labelLastName.setFont(new Font("times", Font.BOLD,19));
        labelLastName.setBounds(370,120,200,20);
        add(labelLastName);

        labelMemberType = new JLabel("Member Type*");
        labelMemberType.setForeground(Color.BLACK);
        labelMemberType.setFont(new Font("times", Font.BOLD,19));
        labelMemberType.setBounds(530,120,200,20);
        add(labelMemberType);

        labelGender= new JLabel("  Gender*");
        labelGender.setForeground(Color.BLACK);
        labelGender.setFont(new Font("times", Font.BOLD,19));
        labelGender.setBounds(690,120,200,20);
        add(labelGender);

        labelContact = new JLabel("Contact*");
        labelContact.setForeground(Color.BLACK);
        labelContact.setFont(new Font("times", Font.BOLD,19));
        labelContact.setBounds(55,210,200,20);
        add(labelContact);

        labelDateOfBirth=new JLabel("DOB*");
        labelDateOfBirth.setForeground(Color.BLACK);
        labelDateOfBirth.setFont(new Font("times", Font.BOLD,19));
        labelDateOfBirth.setBounds(238,210,200,20);
        add(labelDateOfBirth);

        labelOccupation=new JLabel("Occupation*");
        labelOccupation.setForeground(Color.BLACK);
        labelOccupation.setFont(new Font("times", Font.BOLD,19));
        labelOccupation.setBounds(50,290,200,20);
        add(labelOccupation);

        labelemail=new JLabel("Personal email*");
        labelemail.setForeground(Color.BLACK);
        labelemail.setFont(new Font("times", Font.BOLD,19));
        labelemail.setBounds(210,290,200,20);
        add(labelemail);

        labelAddress=new JLabel("Address*");
        labelAddress.setForeground(Color.BLACK);
        labelAddress.setFont(new Font("times", Font.BOLD,19));
        labelAddress.setBounds(55,370,200,20);
        add(labelAddress);

        labelusername=new JLabel("Username*");
        labelusername.setForeground(Color.BLACK);
        labelusername.setFont(new Font("times", Font.BOLD,19));
        labelusername.setBounds(215,370,200,20);
        add(labelusername);

        labelpassword=new JLabel("Password*");
        labelpassword.setForeground(Color.BLACK);
        labelpassword.setFont(new Font("times", Font.BOLD,19));
        labelpassword.setBounds(55,465,200,20);
        add(labelpassword);

        labelrepassword=new JLabel("Re-password*");
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
    }

}
