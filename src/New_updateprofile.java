import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

public class new_updateprofile extends JFrame {



    // Images Labeling
    JLabel House1, House2, House3, House4, House5, House6, title, logo, pagemark, vertical, horizontal, innerframe;
    JButton home, profile, settings, signout, next, filter;

    JPanel  panel1, panel2;
    JButton update_profile, password_change, delete_account;

    JLabel firstname, middlename, lastname, contact,address, email;
    JTextField First, Middle, Last, Contact, Address,Email;
    JButton backbtn, submitbtn, cancelbtn;

    public new_updateprofile() {

        setTitle("Dashboard");
        setBounds(3, 40, 1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.decode("#DFDFDF"));
        setLayout(null);
        setResizable(false);

        //Buttons



        vertical = new JLabel();
        //   vertical.setIcon(new ImageIcon((getClass().getResource("Images/Rectangle 20.png"))));
        vertical.setBounds(-1, 0, 104, 720);
        vertical.setForeground(Color.getColor("9E9B9B"));
        add(vertical);

        horizontal = new JLabel();
        //   horizontal.setIcon(new ImageIcon((getClass().getResource("Images/Rectangle 21.png"))));
        horizontal.setBounds(2, 0, 1275, 106);
        horizontal.setForeground(Color.getColor("9E9B9B"));
        add(horizontal);


        //   for user setting

        panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10,10,10,10));
        panel1.setBounds(103, 90, 1098, 99);
        panel1.setBackground(Color.decode("#9F9391"));
        panel1.setOpaque(true);


        panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(10,10,10,10));
        panel2.setBounds(103, 230, 1094, 405);
        panel2.setBackground(Color.decode("#9F9391"));
        panel2.setOpaque(true);

        update_profile= new JButton("Update Profile" );
        update_profile.setBounds(130,100,313,88);
        update_profile.setBackground(Color.decode("#9F9391"));
        update_profile.setOpaque(true);
        update_profile.setBorderPainted(false);
        update_profile.setIcon(new ImageIcon(getClass().getResource("Images/newupdate.png")));
        add(update_profile);

        password_change= new JButton();
        password_change.setBounds(470,100,352,76);
        password_change.setBackground(Color.decode("#9F9391"));
        password_change.setOpaque(true);
        password_change.setBorderPainted(false);
        password_change.setIcon(new ImageIcon(getClass().getResource("Images/newpassword_change.png")));
        add(password_change);


        delete_account= new JButton();
        delete_account.setBounds(850,100,309,76);
        delete_account.setBackground(Color.decode("#9F9391"));
        delete_account.setOpaque(true);
        delete_account.setBorderPainted(false);
        delete_account.setIcon(new ImageIcon(getClass().getResource("Images/newdelete.png")));
        add(delete_account);

//for update profile
        firstname= new JLabel("First Name");
        firstname.setForeground(Color.BLACK);
        firstname.setFont(new Font("Ropa Sans", Font.BOLD,19));
        firstname.setBounds(230,240,211,40);
        firstname.setBackground(Color.decode("#866262"));
        add(firstname);

        First = new JTextField();
        First.setBounds(150, 280,290,35);
        First.setFont(new Font("times", Font.BOLD,15));
        add(First);

        middlename= new JLabel("Middle Name");
        middlename.setForeground(Color.BLACK);
        middlename.setFont(new Font("Ropa Sans", Font.BOLD,19));
        middlename.setBounds(580,240,211,40);
        middlename.setBackground(Color.decode("#866262"));
        add(middlename);

        Middle = new JTextField();
        Middle.setBounds(500, 280,290,35);
        Middle.setFont(new Font("times", Font.BOLD,15));
        add(Middle);

        lastname= new JLabel("Last Name");
        lastname.setForeground(Color.BLACK);
        lastname.setFont(new Font("Ropa Sans", Font.BOLD,19));
        lastname.setBounds(930,240,211,40);
        lastname.setBackground(Color.decode("#866262"));
        add(lastname);

        Last = new JTextField();
        Last.setBounds(850, 280,290,35);
        Last.setFont(new Font("times", Font.BOLD,15));
        add(Last);

        contact= new JLabel("Contact");
        contact.setForeground(Color.BLACK);
        contact.setFont(new Font("Ropa Sans", Font.BOLD,19));
        contact.setBounds(430,330,211,40);
        contact.setBackground(Color.decode("#866262"));
        add(contact);

        Contact = new JTextField();
        Contact.setBounds(350, 370,290,35);
        Contact.setFont(new Font("times", Font.BOLD,15));
        add(Contact);

        address= new JLabel("Address");
        address.setForeground(Color.BLACK);
        address.setFont(new Font("Ropa Sans", Font.BOLD,19));
        address.setBounds(790,330,211,40);
        address.setBackground(Color.decode("#866262"));
        add(address);

        Address = new JTextField();
        Address.setBounds(700, 370,290,35);
        Address.setFont(new Font("times", Font.BOLD,15));
        add( Address);

        email= new JLabel("Email");
        email.setForeground(Color.BLACK);
        email.setFont(new Font("Ropa Sans", Font.BOLD,19));
        email.setBounds(620,430,211,40);
        email.setBackground(Color.decode("#866262"));
        add(email);

        Email = new JTextField();
        Email.setBounds(500, 470,290,35);
        Email.setFont(new Font("times", Font.BOLD,15));
        add(Email);

        backbtn= new JButton();
        backbtn.setBounds(200,550,187,55);
        backbtn.setOpaque(true);
        backbtn.setBorderPainted(false);
        backbtn.setBackground(Color.decode("#9F9391"));
        backbtn.setIcon(new ImageIcon(getClass().getResource("Images/backbtn1.png")));
        add(backbtn);

        submitbtn= new JButton();
        submitbtn.setBounds(540,550,205,55);
        submitbtn.setBackground(Color.decode("#9F9391"));
        submitbtn.setOpaque(true);
        submitbtn.setBorderPainted(false);
        submitbtn.setIcon(new ImageIcon(getClass().getResource("Images/submitbtn.png")));
        add(submitbtn);

        cancelbtn= new JButton();
        cancelbtn.setBounds(880,550,205,55);
        cancelbtn.setBackground(Color.decode("#9F9391"));
        cancelbtn.setOpaque(true);
        cancelbtn.setBorderPainted(false);
        cancelbtn.setIcon(new ImageIcon(getClass().getResource("Images/cancelbtn.png")));
        add(cancelbtn);










        add(panel1);
        add(panel2);






    }

    public static void main(String[] args) {
        new new_updateprofile().setVisible(true);
    }
}




