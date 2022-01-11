import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class password_change extends JFrame{


    JLabel  imgLbl1, imgLbl2, imgLbl3;
    JPanel panel, panel1;

    JButton update_profile, password_change, delete_account;
    JButton btn1,btn2, btn3, btn4;

    JLabel currentpassword, newpassword,conformpassword;
    JButton backbtn, submitbtn, cancelbtn;
    JTextField currentpasswordfield, newpasswordfield, confirmpasswordfield;



    public password_change(){
        setTitle("User Setting");
        setSize(820,450);
        setLocation(100,50);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);




        imgLbl1 = new JLabel();
        imgLbl1.setIcon(new ImageIcon(getClass().getResource("Images/vertical_line.png")));
        getContentPane().add(imgLbl1);
        imgLbl1.setBounds(-5, -30, 400, 440);
        add(imgLbl1);


        imgLbl2 = new JLabel();
        imgLbl2.setIcon(new ImageIcon(getClass().getResource("Images/rectangle_line.jpg")));
        getContentPane().add(imgLbl2);
        imgLbl2.setBounds(10, 0, 1000, 70);
        imgLbl2.setOpaque(true);
        add(imgLbl2);

        imgLbl3 = new JLabel();
        imgLbl3.setIcon(new ImageIcon(getClass().getResource("Images/logooo.png")));
        getContentPane().add(imgLbl3);
        imgLbl3.setBounds(0, 0, 100, 80);
        add(imgLbl3);




        btn3= new JButton();
        btn3.setBounds(-7,70,70,70);
        btn3.setBackground(Color.decode("#808080"));
        btn3.setOpaque(true);
        btn3.setBorderPainted(false);
        btn3.setIcon(new ImageIcon(getClass().getResource("Images/home.png")));
        add(btn3);

        btn1= new JButton();
        btn1.setBounds(-7,150,70,70);
        btn1.setBackground(Color.decode("#808080"));
        btn1.setOpaque(true);
        btn1.setBorderPainted(false);
        btn1.setIcon(new ImageIcon(getClass().getResource("Images/profile.png")));
        add(btn1);

        btn2= new JButton();
        btn2.setBounds(-7,220,70,70);
        btn2.setBackground(Color.decode("#808080"));
        btn2.setOpaque(true);
        btn2.setBorderPainted(false);
        btn2.setIcon(new ImageIcon(getClass().getResource("Images/setting.png")));
        add(btn2);

        btn4= new JButton();
        btn4.setBounds(-7,320,70,70);
        btn4.setBackground(Color.decode("#808080"));
        btn4.setOpaque(true);
        btn4.setBorderPainted(false);
        btn4.setIcon(new ImageIcon(getClass().getResource("Images/signout.png")));
        add(btn4);




        panel = new JPanel();
        panel.setBorder(new EmptyBorder(10,10,10,10));
        panel.setBounds(90, 90, 690, 65);
        panel.setBackground(Color.decode("#9F9391"));
        panel.setOpaque(true);


        panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10,10,10,10));
        panel1.setBounds(90, 170, 690, 230);
        panel1.setBackground(Color.decode("#9F9391"));
        panel1.setOpaque(true);

        update_profile= new JButton("Update Profile" );
        update_profile.setBounds(90,95,220,50);
        update_profile.setBackground(Color.decode("#9F9391"));
        update_profile.setOpaque(true);
        update_profile.setBorderPainted(false);
        update_profile.setIcon(new ImageIcon(getClass().getResource("Images/update.png")));
        add(update_profile);

        password_change= new JButton();
        password_change.setBounds(320,95,230,50);
        password_change.setBackground(Color.decode("#9F9391"));
        password_change.setOpaque(true);
        password_change.setBorderPainted(false);
        password_change.setIcon(new ImageIcon(getClass().getResource("Images/passwordchange.png")));
        add(password_change);


        delete_account= new JButton();
        delete_account.setBounds(550,95,220,50);
        delete_account.setBackground(Color.decode("#9F9391"));
        delete_account.setOpaque(true);
        delete_account.setBorderPainted(false);
        delete_account.setIcon(new ImageIcon(getClass().getResource("Images/acdel.png")));
        add(delete_account);


        //label for current , new and confirm password
        currentpassword=new JLabel();
        currentpassword.setBounds(140,190,400,30);
        currentpassword.setIcon(new ImageIcon(getClass().getResource("Images/Currentpassword.png")));
        add(currentpassword);

        currentpasswordfield = new JTextField();
        currentpasswordfield.setBounds(380,190,160,30);
        currentpasswordfield.setBackground(Color.decode("#C0C0C0"));
        currentpasswordfield.setFont(new Font("times", Font.BOLD,15));
        add(currentpasswordfield);


        newpassword=new JLabel();
        newpassword.setBounds(140,240,400,30);
        newpassword.setIcon(new ImageIcon(getClass().getResource("Images/newpassword.png")));
        add(newpassword);

        newpasswordfield = new JTextField();
        newpasswordfield .setBounds(380,240,160,30);
        newpasswordfield .setBackground(Color.decode("#C0C0C0"));
        newpasswordfield .setFont(new Font("times", Font.BOLD,15));
        add(newpasswordfield );


        conformpassword=new JLabel();
        conformpassword.setForeground(Color.BLACK);
        conformpassword.setBounds(140,290,400,30);
        conformpassword.setIcon(new ImageIcon(getClass().getResource("Images/Confirmpassword.png")));
        add(conformpassword);

        confirmpasswordfield= new JTextField();
        confirmpasswordfield .setBounds(380,290,160,30);
        confirmpasswordfield.setBackground(Color.decode("#C0C0C0"));
        confirmpasswordfield .setFont(new Font("times", Font.BOLD,15));
        add(confirmpasswordfield);


        backbtn= new JButton();
        backbtn.setBounds(170,340,100,40);
        backbtn.setOpaque(true);
        backbtn.setBorderPainted(false);
        backbtn.setBackground(Color.decode("#9F9391"));
        backbtn.setIcon(new ImageIcon(getClass().getResource("Images/backbtn1.png")));
        add(backbtn);

        submitbtn= new JButton();
        submitbtn.setBounds(360,340,100,40);
        submitbtn.setBackground(Color.decode("#9F9391"));
        submitbtn.setOpaque(true);
        submitbtn.setBorderPainted(false);
        submitbtn.setIcon(new ImageIcon(getClass().getResource("Images/submitbtn.png")));
        add(submitbtn);

        cancelbtn= new JButton();
        cancelbtn.setBounds(580,340,100,40);
        cancelbtn.setBackground(Color.decode("#9F9391"));
        cancelbtn.setOpaque(true);
        cancelbtn.setBorderPainted(false);
        cancelbtn.setIcon(new ImageIcon(getClass().getResource("Images/cancelbtn.png")));
        add(cancelbtn);


        add(panel);
        add(panel1);


    }

    public static void main(String[] args) {
        new password_change().setVisible(true);
    }
}
