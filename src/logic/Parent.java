package logic;

import controller.UserController;
import model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class Parent extends JFrame{

//    private static String[][] data;
    // data[<row>][<column>]

    static String data[][];

    Object[] columns = {"id", "firstNma", "midd", "lst", "mem", "gender", "cont", "dob",
            "occupation", "email", "address", "username", "password"};

    JTable table;
    DefaultTableModel model;

    public Parent(){

        fetchData();
        setTitle("Parentclass");
        setBounds(100, 80, 500, 600);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        table = new JTable(model);

        table.setFont(new Font("Serif", Font.ITALIC, 16));
        table.setSelectionBackground(Color.blue);
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setFont(new Font("Serif", Font.BOLD, 16));
        add(new JScrollPane(table), BorderLayout.CENTER);

        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(table);
        add(sp);



        setVisible(true);
    }


    public static void main(String[] args) {
        new Parent().setVisible(true);

//        System.out.println("UserID : " + allData[0][0]);
//        System.out.println("FullName : " + allData[0][1] + allData[0][2] + allData[0][3]);
//        System.out.println("UserID : " + allData[0][1]);
//        System.out.println("UserID : " + allData[0][1]);
//        System.out.println("UserID : " + allData[0][1]);
//        System.out.println("UserID : " + allData[0][1]);
    }


    public void fetchData(){

        UserController userController = new UserController();
        List<User> userList = userController.getAllUser();

        data = new String[userList.size()][13];

        // conversion from list to array  , select only need columns
        for (int i = 0; i < userList.size(); i++){
            data[i][0] = String.valueOf(userList.get(i).getUserID());  // converting int data into String data
            data[i][1] = userList.get(i).getFirstName();
            data[i][2] = userList.get(i).getMiddleName();
            data[i][3] = userList.get(i).getLastName();
            data[i][4] = userList.get(i).getMemberType();
            data[i][5] = userList.get(i).getGender();
            data[i][6] = userList.get(i).getContact();
            data[i][7] = userList.get(i).getDOB();
            data[i][8] = userList.get(i).getOccupation();
            data[i][9] = userList.get(i).getPersonalEmail();
            data[i][10] = userList.get(i).getAddress();
            data[i][11] = userList.get(i).getUsername();
            data[i][12] = userList.get(i).getPassword();


        }

        model = new DefaultTableModel(data, columns);

    }
}

