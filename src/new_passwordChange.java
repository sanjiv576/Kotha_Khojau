import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class new_passwordChange extends JFrame implements ActionListener {

    JPanel panel, panel1, panel2;
    JButton update_profile, password_change, delete_account;

    // Images Labeling
    JLabel House1, House2, House3, House4, House5, House6, title, logo, pagemark, vertical, horizontal, innerframe;
    JButton home, profile, settings, signout, next, filter;

    //for password change
    JLabel currentpassword, newpassword,conformpassword;
    JTextField currentpasswordfield, newpasswordfield, confirmpasswordfield;
    JLabel showImage1, showImage2, showImage3;
    JCheckBox showPassword1, showPassword2, showPassword3;



    public new_passwordChange() {


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

        //label for current , new and confirm password
        currentpassword=new JLabel();
        currentpassword.setBounds(180,250,320,60);
        currentpassword.setIcon(new ImageIcon(getClass().getResource("Images/Currentpassword.png")));
        add(currentpassword);

        currentpasswordfield = new JTextField();
        currentpasswordfield.setBounds(540,250,300,60);
        currentpasswordfield.setBackground(Color.decode("#C0C0C0"));
        currentpasswordfield.setFont(new Font("times", Font.BOLD,25));
        add(currentpasswordfield);

        newpassword=new JLabel();
        newpassword.setBounds(180,350,320,60);
        newpassword.setIcon(new ImageIcon(getClass().getResource("Images/newpassword.png")));
        add(newpassword);

        newpasswordfield = new JTextField();
        newpasswordfield .setBounds(540,350,300,60);
        newpasswordfield .setBackground(Color.decode("#C0C0C0"));
        newpasswordfield .setFont(new Font("times", Font.BOLD,25));
        add(newpasswordfield );

        conformpassword=new JLabel();
        conformpassword.setForeground(Color.BLACK);
        conformpassword.setBounds(180,450,320,60);
        conformpassword.setIcon(new ImageIcon(getClass().getResource("Images/confirmpassword.png")));
        add(conformpassword);

        confirmpasswordfield= new JTextField();
        confirmpasswordfield .setBounds(540,450,300,60);
        confirmpasswordfield.setBackground(Color.decode("#C0C0C0"));
        confirmpasswordfield .setFont(new Font("times", Font.BOLD,25));
        add(confirmpasswordfield);


      //  For show password
        showPassword1 = new JCheckBox();
        showPassword1.setBounds(840, 250, 30, 50);
        showPassword1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        showPassword1.setBackground(Color.decode("#9F9391"));
        showPassword1.setOpaque(true);
        add(showPassword1);

        showPassword2 = new JCheckBox();
        showPassword2.setBounds(840, 350, 30, 50);
        showPassword2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        showPassword2.setBackground(Color.decode("#9F9391"));
        showPassword2.setOpaque(true);
        add(showPassword2);

        showPassword3 = new JCheckBox();
        showPassword3.setBounds(840, 450, 30, 50);
        showPassword3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        showPassword3.setBackground(Color.decode("#9F9391"));
        showPassword3.setOpaque(true);
        add(showPassword3);
//images on eye
        showImage1 = new JLabel();
        showImage1.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/show.png"))));
        getContentPane().add(showImage1);
        showImage1.setBackground(Color.decode("#9F9391"));
        showImage1.setOpaque(true);
        showImage1.setBounds(860, 240, 91, 66);


        showImage2 = new JLabel();
        showImage2.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/show.png"))));
        getContentPane().add(showImage2);
        showImage2.setBackground(Color.decode("#9F9391"));
        showImage2.setOpaque(true);
        showImage2.setBounds(860, 340, 91, 66);

        showImage3 = new JLabel();
        showImage3.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("Images/show.png"))));
        getContentPane().add(showImage3);
        showImage3.setBackground(Color.decode("#9F9391"));
        showImage3.setOpaque(true);
        showImage3.setBounds(860, 440, 91, 66);


        add(panel1);
        add(panel2);



    }

    public static void main(String[] args) {
        new new_passwordChange().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String currentpasswordInserted;
        currentpasswordInserted = currentpasswordfield.getText();

//        if (e.getSource().equals(showPassword1)) {
//
//            if (showPassword1.isSelected()) {
//                currentpasswordfield.setEchoChar((char) 0);
//            } else {
//                currentpasswordfield.setEchoChar('*');
//            }
//        }
    }
}




