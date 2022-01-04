import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class User_setting extends JFrame{


    JLabel  imgLbl1, imgLbl2, imgLbl3,imgLbl4;
    JButton Btn1;
    JPanel panel, panel1;
    JLabel lbl1;
    JButton update_profile, password_change, delete_account;
    JButton btn1,btn2, btn3;



    public User_setting(){
        setTitle("User Setting");
        setSize(820,450);
        setLocation(100,50);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        lbl1=new JLabel("Kotha khojau ");
        lbl1.setForeground(Color.BLACK);
        lbl1.setFont(new Font("Island Moments", Font.BOLD,20));
        lbl1.setBounds(90,20,200,30);
        add(lbl1);

        imgLbl1 = new JLabel();
        imgLbl1.setIcon(new ImageIcon(getClass().getResource("Images/Rectangle 3.png")));
        getContentPane().add(imgLbl1);
        imgLbl1.setBounds(-5, -30, 400, 440);
        add(imgLbl1);


        imgLbl2 = new JLabel();
        imgLbl2.setIcon(new ImageIcon(getClass().getResource("Images/rectangle.png")));
        getContentPane().add(imgLbl2);
        imgLbl2.setBounds(10, 0, 1000, 70);
        add(imgLbl2);


//        imgLbl3 = new JLabel();
//        imgLbl3.setIcon(new ImageIcon(getClass().getResource("Images/kotha_khojau_logo2.png")));
//        getContentPane().add(imgLbl3);
//        imgLbl3.setBounds(300, 20, 50, 30);
//        add(imgLbl3);

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
        update_profile.setBounds(110,110,160,35);
        update_profile.setBackground(Color.decode("#FFFFFF"));
        update_profile.setFont(new Font("times", Font.BOLD,20));
        add(update_profile);

        password_change= new JButton("Password Change" );
        password_change.setBounds(300,110,200,35);
        password_change.setBackground(Color.decode("#FFFFFF"));
        password_change.setFont(new Font("times", Font.BOLD,20));
        add(password_change);


        delete_account= new JButton("Delete Account" );
        delete_account.setBounds(520,110,200,35);
        delete_account.setBackground(Color.decode("#FFFFFF"));
        delete_account.setFont(new Font("times", Font.BOLD,20));
        add(delete_account);

        add(panel);
        add(panel1);


    }

    public static void main(String[] args) {
        new User_setting().setVisible(true);
    }
}
