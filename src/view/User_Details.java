package view;

import controller.UserController;
import model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Objects;

public class User_Details extends JFrame implements ActionListener {

    boolean insertDriverInfo = true;

    JLabel title;

    JButton logoutIcon;

    JLabel userid, fName,  midName, lName,gender, contact, memberType, occuption,  email, address;




    Object[] columns =  {"RenterID", "FirstName", "MiddleName", "LastName", "Gender", "Contact", "DOB",
            "Occupation", "Email", "address"};
    JTable table;
    DefaultTableModel model;
    static String data[][];

    public User_Details() {

        fetchData();


        setTitle("user details");
        setBounds(100, 80, 1280, 745);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.darkGray);
        setLayout(null);
        setResizable(false);

        // invoking user-defined method to insert and manage icons for dashboard
        insertButtonIcons();


        title = new JLabel("USER DETAILS");
        title.setBounds(550, 30, 300, 30);
        title.setBackground(Color.getColor("9E9B9B"));
        title.setFont(new Font("cambria", Font.BOLD, 30));
        title.setOpaque(true);
        add(title);


        userid = new JLabel("User ID");
        userid.setBounds(30, 100, 95, 20);
        userid.setBackground(Color.getColor("9E9B9B"));
        userid.setFont(new Font("cambria", Font.BOLD, 20));
        userid.setOpaque(true);
        add(userid);

        fName = new JLabel("FirstName");
        fName.setBounds(125, 100, 104, 20);
        fName.setBackground(Color.getColor("9E9B9B"));
        fName.setFont(new Font("cambria", Font.BOLD, 20));
        fName.setOpaque(true);
        add(fName);

        midName = new JLabel("MidName");
        midName.setBounds(230, 100, 95, 20);
        midName.setBackground(Color.getColor("9E9B9B"));
        midName.setFont(new Font("cambria", Font.BOLD, 20));
        midName.setOpaque(true);
        add(midName);

        lName = new JLabel("LastName");
        lName.setBounds(325, 100, 100, 20);
        lName.setBackground(Color.getColor("9E9B9B"));
        lName.setFont(new Font("cambria", Font.BOLD, 20));
        lName.setOpaque(true);
        add(lName);

        gender = new JLabel("Gender");
        gender.setBounds(425, 100, 80, 20);
        gender.setBackground(Color.getColor("9E9B9B"));
        gender.setFont(new Font("cambria", Font.BOLD, 20));
        gender.setOpaque(true);
        add(gender);

        contact = new JLabel("contact");
        contact.setBounds(525, 100, 80, 20);
        contact.setBackground(Color.getColor("9E9B9B"));
        contact.setFont(new Font("cambria", Font.BOLD, 20));
        contact.setOpaque(true);
        add(contact);

        memberType= new JLabel("Member Type");
        memberType.setBounds(635, 100, 130, 20);
        memberType.setBackground(Color.getColor("9E9B9B"));
        memberType.setFont(new Font("cambria", Font.BOLD, 20));
        memberType.setOpaque(true);
        add(memberType);

        occuption= new JLabel("Occuption");
        occuption.setBounds(775, 100, 130, 20);
        occuption.setBackground(Color.getColor("9E9B9B"));
        occuption.setFont(new Font("cambria", Font.BOLD, 20));
        occuption.setOpaque(true);
        add(occuption);

        email= new JLabel("Email");
        email.setBounds(940, 100, 90, 20);
        email.setBackground(Color.getColor("9E9B9B"));
        email.setFont(new Font("cambria", Font.BOLD, 20));
        email.setOpaque(true);
        add(email);

        address= new JLabel("Address");
        address.setBounds(1130, 100, 100, 20);
        address.setBackground(Color.getColor("9E9B9B"));
        address.setFont(new Font("cambria", Font.BOLD, 20));
        address.setOpaque(true);
        add(address);





        table = new JTable(model);
        table.setFont(new Font("Serif", Font.BOLD, 20));
        table.setSelectionBackground(Color.YELLOW);
        table.setBackground(Color.decode("#F08080"));
        table.setBounds(20, 140, 1230, 475);
        table.getTableHeader().setBackground(Color.green);
        table.setRowHeight(30);

        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 2){
                table.getColumnModel().getColumn(i).setPreferredWidth(5);
            }
            else if (i == 5){

                table.getColumnModel().getColumn(i).setPreferredWidth(40);
            }
            else if (i == 6){

                table.getColumnModel().getColumn(i).setPreferredWidth(40);
            }


            else if (i == 8){

                table.getColumnModel().getColumn(i).setPreferredWidth(190);
            }


            else {
                table.getColumnModel().getColumn(i).setPreferredWidth(5);
            }

        }

        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 18));

        add(table);


        logoutIcon.addActionListener(this);

        setVisible(true);

    }

    // ---------------- main method ----------------

    public static void main(String[] args) {

        new User_Details().setVisible(true);
    }

    //  event handling
    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(logoutIcon)) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to log out ?",
                    "Log out", JOptionPane.YES_NO_CANCEL_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }



    }


    // this method inserts left button icons
    public void insertButtonIcons(){

        logoutIcon = new JButton();
        logoutIcon.setIcon(new ImageIcon((Objects.requireNonNull(getClass().getResource("Images/logout_64x64.png")))));
        logoutIcon.setBounds(15, 620, 64, 64);
     //   logoutIcon.setBackground(Color.decode("#9E9B9B"));
        logoutIcon.setOpaque(true);
        logoutIcon.setBorderPainted(false);
        logoutIcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(logoutIcon);


    }


    // ------------------- user-defined method -----------------------

    public void fetchData() {

        UserController userController = new UserController();
        List<User> userList = userController.getRenterDetail();

        data = new String[userList.size()][11];

        // conversion from list to array  , select only need columns
        for (int i = 0; i < userList.size(); i++) {
            data[i][0] = String.valueOf(userList.get(i).getUserID());  // converting int data into String data
            data[i][1] = userList.get(i).getFirstName();
            data[i][2] = userList.get(i).getMiddleName();
            data[i][3] = userList.get(i).getLastName();
            data[i][4] = userList.get(i).getGender();
            data[i][5] = userList.get(i).getContact();
            data[i][6] = userList.get(i).getMemberType();
            data[i][7] = userList.get(i).getOccupation();
            data[i][8] = userList.get(i).getPersonalEmail();
            data[i][9] = userList.get(i).getAddress();

        }

        model = new DefaultTableModel(data, columns);

    }

}






