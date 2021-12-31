import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;


public class Registration extends JFrame {
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
    JLabel label3;;
    JLabel imgLbl;

    JTextField FirstName;
    JTextField MiddleName;
    JTextField LastName;
    JTextField Membertype;
    JTextField Gender;
    JTextField contact;
    JTextField dateofbirth;
    JTextField occupation;
    JTextField email;
    JTextField address;
    JTextField username;
    JTextField password;
    JTextField repassword;

    JButton Btn;
    private ImageIcon img;
    JComboBox comboBox;
    JComboBox comboBox1;
    JComboBox comboBox2;



    public Registration(){



        setTitle("Registration");
        setSize(930,700);
        setLocation(100,100);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // labels
//
//        frame = new JFrame("mm");
//        frame.setBounds(0,20,20,20);
//        add(frame);


        labelFirstName = new JLabel("*First Name");
        labelFirstName.setForeground(Color.BLACK);
        labelFirstName.setFont(new Font("Roboto", Font.BOLD,15));
        labelFirstName.setBounds(50,150,200,20);
        add(labelFirstName);

        labelmiddleName = new JLabel("*Middle Name");
        labelmiddleName.setForeground(Color.BLACK);
        labelmiddleName.setFont(new Font("Roboto", Font.BOLD,15));
        labelmiddleName.setBounds(230,150,200,20);
        add(labelmiddleName);

        labelLastName = new JLabel("*Last Name");
        labelLastName.setForeground(Color.BLACK);
        labelLastName.setFont(new Font("Roboto", Font.BOLD,15));
        labelLastName.setBounds(410,150,200,20);
        add(labelLastName);

        labelMemberType = new JLabel("*Member Type");
        labelMemberType.setForeground(Color.BLACK);
        labelMemberType.setFont(new Font("Roboto", Font.BOLD,15));
        labelMemberType.setBounds(590,150,200,20);
        add(labelMemberType);

        labelGender= new JLabel("*Gender");
        labelGender.setForeground(Color.BLACK);
        labelGender.setFont(new Font("Roboto", Font.BOLD,15));
        labelGender.setBounds(770,150,200,20);
        add(labelGender);

        labelContact = new JLabel("*Contact");
        labelContact.setForeground(Color.BLACK);
        labelContact.setFont(new Font("Roboto", Font.BOLD,15));
        labelContact.setBounds(50,230,200,20);
        add(labelContact);

        labelDateOfBirth=new JLabel("*DOB");
        labelDateOfBirth.setForeground(Color.BLACK);
        labelDateOfBirth.setFont(new Font("Roboto", Font.BOLD,15));
        labelDateOfBirth.setBounds(230,230,200,20);
        add(labelDateOfBirth);

        labelOccupation=new JLabel("*Occupation ");
        labelOccupation.setForeground(Color.BLACK);
        labelOccupation.setFont(new Font("Roboto", Font.BOLD,15));
        labelOccupation.setBounds(50,310,200,20);
        add(labelOccupation);

        labelemail=new JLabel("*Personal email");
        labelemail.setForeground(Color.BLACK);
        labelemail.setFont(new Font("Roboto", Font.BOLD,15));
        labelemail.setBounds(230,310,200,20);
        add(labelemail);

        labelAddress=new JLabel("*Address");
        labelAddress.setForeground(Color.BLACK);
        labelAddress.setFont(new Font("Roboto", Font.BOLD,15));
        labelAddress.setBounds(50,390,200,20);
        add(labelAddress);

        labelusername=new JLabel("*Username ");
        labelusername.setForeground(Color.BLACK);
        labelusername.setFont(new Font("Roboto", Font.BOLD,15));
        labelusername.setBounds(230,390,200,20);
        add(labelusername);

        labelpassword=new JLabel("*Password ");
        labelpassword.setForeground(Color.BLACK);
        labelpassword.setFont(new Font("Roboto", Font.BOLD,15));
        labelpassword.setBounds(50,475,200,20);
        add(labelpassword);

        labelrepassword=new JLabel("*Re-password");
        labelrepassword.setForeground(Color.BLACK);
        labelrepassword.setFont(new Font("Roboto", Font.BOLD,15));
        labelrepassword.setBounds(230,475,200,20);
        add( labelrepassword);

        label1= new JLabel("HURRY UP,");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Saira", Font.BOLD,38));
        label1.setBounds(230,50,220,80);
        add( label1);

        label2= new JLabel("SIGN UP");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Saira", Font.BOLD,38));
        label2.setBounds(450,50,220,80);
        label2.setForeground(Color.YELLOW);
        add( label2);

        label3= new JLabel("!!");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Saira", Font.BOLD,38));
        label3.setBounds(620,50,100,80);
        label3.setForeground(Color.YELLOW);
        add( label3);









        //textfields
        FirstName = new JTextField();
        FirstName.setBounds(50,175,100,20);
        FirstName.setBackground(Color.decode("#C0C0C0"));
        FirstName.setFont(new Font("chiller", Font.BOLD,22));
        add(FirstName);

        MiddleName = new JTextField();
        MiddleName.setBounds(230,175,100,20);
        MiddleName.setBackground(Color.decode("#C0C0C0"));
        MiddleName.setFont(new Font("chiller", Font.BOLD,22));
        add(MiddleName);

        LastName = new JTextField();
        LastName.setBounds(410,175,120,20);
        LastName.setBackground(Color.decode("#C0C0C0"));
        LastName.setFont(new Font("chiller", Font.BOLD,22));

        add(LastName);


        String[] Membertype= {"Admin", "owner", "Renter"};
        JComboBox comboBox=new JComboBox(Membertype);
        comboBox.setBounds(590,175,120,20);
        comboBox.setBackground(Color.decode("#C0C0C0"));
        comboBox.setFont(new Font("chiller", Font.BOLD,22));
        add(comboBox);

        //dropdown for membertype

//        Membertype= new JTextField();
//        Membertype.setBounds(590,175,120,20);
//        Membertype.setBackground(Color.decode("#C0C0C0"));
//        add(Membertype);


        String[] Gender= {"Male", "Female", "Others"};
        JComboBox comboBox1=new JComboBox(Gender);
        comboBox1.setBounds(770,175,120,20);
        comboBox1.setBackground(Color.decode("#C0C0C0"));
        comboBox1.setFont(new Font("chiller", Font.BOLD,22));
        add(comboBox1);


//        Gender = new JTextField();
//        Gender.setBounds(770,175,120,20);
//        Gender.setBackground(Color.decode("#C0C0C0"));
//        add(Gender);

        contact = new JTextField();
        contact.setBounds(50,255,120,20);
        contact.setBackground(Color.decode("#C0C0C0"));
        contact.setFont(new Font("chiller", Font.BOLD,22));
        add(contact);

        dateofbirth = new JTextField();
        dateofbirth.setBounds(230,255,120,20);
        dateofbirth.setBackground(Color.decode("#C0C0C0"));
        dateofbirth.setFont(new Font("chiller", Font.BOLD,22));
        add(dateofbirth);



        String[] occupation= {"", "Student", "Worker", "Professional"};
        JComboBox comboBox2=new JComboBox(occupation);
        comboBox2.setBounds(50,340,120,20);
        comboBox2.setBackground(Color.decode("#C0C0C0"));
        comboBox2.setFont(new Font("chiller", Font.BOLD,22));
        add(comboBox2);

//        occupation = new JTextField();
//        occupation.setBounds(50,340,120,20);
//        occupation.setBackground(Color.decode("#C0C0C0"));
//        add(occupation);

        email = new JTextField();
        email.setBounds(230,340,120,20);
        email.setBackground(Color.decode("#C0C0C0"));
        email.setFont(new Font("chiller", Font.BOLD,22));
        add(email);

        address = new JTextField();
        address.setBounds(50,425,120,20);
        address.setBackground(Color.decode("#C0C0C0"));
        address.setFont(new Font("chiller", Font.BOLD,22));
        add(address);

        username = new JTextField();
        username.setBounds(230,425,120,20);
        username.setBackground(Color.decode("#C0C0C0"));
        username.setFont(new Font("chiller", Font.BOLD,22));
        add(username);

        password = new JTextField();
        password.setBounds(50,510,120,20);
        password.setBackground(Color.decode("#C0C0C0"));
        password.setFont(new Font("chiller", Font.BOLD,22));
        add(password);

        repassword = new JTextField();
        repassword.setBounds(230,510,120,20);
        repassword.setBackground(Color.decode("#C0C0C0"));
        repassword.setFont(new Font("chiller", Font.BOLD,22));
        add(repassword);


//  imageicon
        ImageIcon icon = new ImageIcon("dele.png");

        Btn = new JButton("Register" );
        Btn.setBounds(130,590,130,30);
        Btn.setBackground(Color.decode("#228B22"));
        Btn.setIcon(icon);
        setVisible(true);
//        Btn.setHorizontalTextPosition(JButton.CENTER);
//        Btn.setVerticalTextPosition(JButton.VERTICAL);
//        Btn.setFont(new Font("Comic sans",Font.BOLD,25));
//        Btn.setIconTextGap(-15);
//        Btn.setBorder(BorderFactory.createEtchedBorder());
//        Btn.setEnabled(false);

        add(Btn);



        // background image insertion
        imgLbl = new JLabel();
        imgLbl.setIcon(new ImageIcon(getClass().getResource("Images/registration.png")));
        getContentPane().add(imgLbl);
        imgLbl.setBounds(350, 200, 700, 500);













    }


    public static void main(String[] args) {
        new Registration().setVisible(true);
    }



}
